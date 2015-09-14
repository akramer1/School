/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class School {

    
    public static void main(String[] args) {
        
        
        Person joe = 
        Person.addPerson("joe", Person.Gender.male,120);
        joe.setName("joebob");
        
        Person andrew = 
        Person.addPerson("andrew", Person.Gender.male,115);
        
        Person jane = 
        Person.addPerson("jane", Person.Gender.female,144);
        
        Person joel = 
        Person.addPerson("joel", Person.Gender.male,178);
        
        Person boba = 
        Person.addPerson("boba", Person.Gender.female,300);
        
        Person jill = 
        Person.addPerson("jill", Person.Gender.female,101);
        
        Person mrsmooth = 
        Person.addPerson("mrsmooth", Person.Gender.male,129);
        
        Person jeb = 
        Person.addPerson("jeb", Person.Gender.male,174);
        
        Person.printNames();
        Person.printNames(Person.Gender.male);
        System.out.println(joe);
    }
}


