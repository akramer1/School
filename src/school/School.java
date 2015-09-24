/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class School {

    
    public static void main(String[] args) {
        
        Course weights = Course.addCourse("weights", Course.Type.PE ,1);
        Course calculus = Course.addCourse("calc AB", Course.Type.Math, 2);
        Course cscience = Course.addCourse("cscience", Course.Type.Math, 4);
        
        Student joe = 
        Student.addStudent("joe", Person.Gender.male,120,11);
        joe.setName("joebob");
        
        Student andrew = 
        Student.addStudent("andrew", Person.Gender.male,120,12);        
        weights.addStudent(andrew);
     
        Student.printNames();
       
        Person.printNames();
        Course.printCourses();
        
    }
}


