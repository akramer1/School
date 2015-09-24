
package school;

public class Student extends Person{
 
    private int gradelevel;
    private Course thecourse;
    public static Student addStudent(String _name, Gender _gender, double _weight, int _gradelevel)
    {
        Student temp = new Student(_name, _gender,_weight,_gradelevel);
        //people[currentpeopleindex++] = temp;
        addPerson(temp);
        
        return(temp);
    }
    Student(String _name, Gender _gender, double _weight, int _gradelevel)
    {
        super(_name, _gender,_weight);
        gradelevel = _gradelevel;
    }
    public void addCourse(Course _course)
    {
        if(thecourse != null)
        {
            thecourse = _course;
            _course.addStudent(this);            
        }
    }
    public void setGradelevel(int _gradelevel)
    {
        gradelevel = _gradelevel;
    }
    public int getGradelevel()
    {
        return gradelevel;
    }
    public static void printNames()
    {
        System.out.println("====PrintNames====");
        for(Person temp: people)
        {
            if(temp instanceof Student)
                System.out.println(temp.getName());            
        }
    }
    
    //  \0/
     //  |
    //  / \
    
}
