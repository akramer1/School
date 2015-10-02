package school;
public class Student extends Person{
    private int gradeLevel;
//    private Course theCourse;
    protected Course courses[] = new Course[Course.numPeriods];
    private double gradescore[] = new double[Course.numPeriods];
    
    
    public static Student addStudent(String _name,
    Gender _gender, int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        addPerson(temp);
        return(temp);
    }    
    Student (String _name,Gender _gender,int _weight,
    int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    }
    
    public boolean addCourse(Course _course, double _gradescore)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course,_gradescore);
        return(true);
    }  
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);
        if (courses[_course.getPeriod()-1] != null)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course, double _gradescore)
    {
        gradescore[_course.getPeriod()-1]=_gradescore;
        courses[_course.getPeriod()-1]=_course;
    }
    
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    } 
    public Teacher getLowMLevel()
    {   
        Teacher niceteacher = null;
        double lowestmeanlvl = 10;
        for(Person temp : people)
        {
            if(temp instanceof Teacher)
            {
                Teacher teacher = (Teacher)temp;
                if(teacher.getMeanLevel() < lowestmeanlvl)
                {
                    lowestmeanlvl = teacher.getMeanLevel();
                    niceteacher = teacher;
                }
            }
        }
        return(niceteacher);
    }
    public double getGPA()
    {
        double total =0;
        int numCourses = 0;
        
        for(int i=0; i<Course.numPeriods;i++)
        {
            if(courses[i] !=null)
            {
                total += gradescore[i];
                numCourses++;                
            }    
        }
        if(numCourses == 0)
            return(0.0);
        
        return(total/numCourses);
    }
    public static Student getHighestGPA()
    {
        double highestgpa = 0.0;
        Student highGPAstudent = null;
        for(Person temp : people)
        {
            if (temp instanceof Student)
            {
                if(((Student)temp).getGPA() > highestgpa)
                {
                    highestgpa = ((Student)temp).getGPA();
                    highGPAstudent = ((Student)temp);
                }                
            }
        }
        return(highGPAstudent);
    }
    public static void printNames()
    {
        System.out.println(
        "===printNamesOf=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    } 
    public static void printStudentsGPAGreaterThan(double _gpa)
    {
        System.out.println(
        "===printStudentsGPAGreaterThan=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
            {
                if(((Student)temp).getGPA() > _gpa)
                {
                    System.out.println(temp.getName());                   
                }                
            }    
        }
    }
    public static void printHonorsStudents()
    {
        System.out.println("----ARE HONORS STUDENTS----");
        for(Person temp : people)
        {
            if(temp instanceof Student)
            {   
                Student student = (Student)temp;
                for(Course temp2 : student.courses)
                {
                    if(temp2 != null && temp2.getHonors())
                    {
                        System.out.println(student.getName() + " is honors");
                    }
                }
            }
        }
    }
    public void printTeachersNames()
    {
        System.out.println(getName() + " taught by");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if(temp.getTeacher() != null)
                {
                    System.out.println(temp.getTeacher().getName());
                }
            }
        }
    }
}
