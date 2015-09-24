
package school;
import java.util.ArrayList;


public class Course {
    
    public enum Type{
        Math, Science, English, History, Language, Elective, PE
    }
    private Type type;
    private String name;
    private int period;
    
    private Student thestudent;
    
    private static int currentcourseindex =0;
    //private static Person people[] = new Person[numpeople];
    private static ArrayList<Course>courses = new ArrayList<Course>();
       
    public static Course addCourse(String _name, Type _type, int _period)
    {
        Course temp = new Course(_name, _type, _period);
        //people[currentpeopleindex++] = temp;
        courses.add(temp); 
        
        return(temp);
    }
            
    
    Course()
    {
        name = "No name";
        type = Type.Elective;
        period = 1;
    }
    Course(String _name, Type _type, int _period)
    {
        name = _name;
        type = _type;
        period = _period;
    }
    
    public static void printCourses()
    {
        System.out.println("====PrintCourses====");
        for(Course temp: courses)
        {
            System.out.println(temp.getName());            
        }
    }
    public static void printCourses(Type _type)
    {
        System.out.println("====PrintNamesTYpe====" + _type);
        for(Course temp: courses)
        {
            if(_type == temp.type)
            System.out.println(temp.getName());            
        }
    }
    public void addStudent(Student _student)
    {
        if(thestudent != null)
        {
            thestudent = _student;
            _student.addCourse(this);
            
        }
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type getType()
    {
        return(type);
    }
    public void setPeriod(int _period)
    {
        period = _period;
    }
    public double getPeriod()
    {
        return(period);
    }
    public String toString()
    {
        return(name + " " + type + " " + period);
    }
    
}
