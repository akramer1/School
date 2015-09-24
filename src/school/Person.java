/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;
import java.util.Calendar;

public class Person {

    
    enum Gender{
        male,female
    }
    //private static int numpeople = 10;
    private static int currentpeopleindex =0;
    //private static Person people[] = new Person[numpeople];
    protected static ArrayList<Person>people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private double weight;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private Course thecourse;
    
    public static Person addPerson(String _name, Gender _gender, double _weight)
    {
        Person temp = new Person(_name, _gender,_weight);
        //people[currentpeopleindex++] = temp;
        people.add(temp);
        
        return(temp);
    }
            
    public static void addPerson(Person _person)
    {
        people.add(_person);
        
    }
    Person()
    {
        name = "No name";
        gender = Gender.male;
        weight = 100;
    }
    Person(String _name, Gender _gender, double _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }
    public static void printNames()
    {
        System.out.println("====PrintNames====");
        for(Person temp: people)
        {
            System.out.println(temp.getName());            
        }
    }
    public static void printNames(Gender _gender)
    {
        System.out.println("====PrintNamesGender====" + _gender);
        for(Person temp: people)
        {
            if(_gender == temp.gender)
            System.out.println(temp.getName());            
        }
    }
    public void setBirthDate(int _day, int _month, int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH)+1;
        int year = now.get(Calendar.YEAR);
        return year;
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public String getName()
    {
        return(name);
    }
    public Gender getGender()
    {
        return(gender);
    }
    public void setWeight(double _weight)
    {
        weight = _weight;
    }
    public double getWeight()
    {
        return(weight);
    }
    public String toString()
    {
        return(name + "" + gender + "" + weight);
    }
}
