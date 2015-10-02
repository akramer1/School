package school;
public class School {
    public static void main(String[] args) {
        
        Student andrew =  Student.addStudent("Andrew",Person.Gender.Male,120,10);
        Student jill =  Student.addStudent("Jill",Person.Gender.Female,105,9);
        Student billyJoe =  Student.addStudent("BillyJoe",Person.Gender.Male,210,12);
        Student bobby =  Student.addStudent("Bobby",Person.Gender.Male,168,11);        
        Student ann =  Student.addStudent("Annie",Person.Gender.Female,98,9);        
        Student sean =  Student.addStudent("Sean",Person.Gender.Male,138,11);        
                
        Teacher price = Teacher.addTeacher("Price", Person.Gender.Male, 206,4.7);
        Teacher hudson = Teacher.addTeacher("Hudson", Person.Gender.Female, 106,7.2);
        Teacher anderson = Teacher.addTeacher("Anderson", Person.Gender.Female, 112,3.2);
        Teacher smith = Teacher.addTeacher("Smith", Person.Gender.Male, 152,8.2);
        Teacher jones = Teacher.addTeacher("Jones", Person.Gender.Female, 102,1.2);
        
        Course geom = Course.addCourse("Geometry", Course.Type.Math, 1,true);
        Course photo = Course.addCourse("Photography", Course.Type.Elective, 3,false);       
        Course biology = Course.addCourse("Biology", Course.Type.Science, 2,true);       
        Course worldHistory = Course.addCourse("WorldHistory", Course.Type.History, 2,false);       
        Course yoga = Course.addCourse("Yoga", Course.Type.Elective, 2, true);
        
        geom.addStudent(bobby,3.5);
        photo.addStudent(bobby, 3.4);
        biology.addStudent(bobby, 3.6);
        worldHistory.addStudent(bobby, 3.8);
        yoga.addStudent(andrew, 4.5);
        
        photo.addStudent(jill,3.9);
        biology.addStudent(ann,4.2);        
        sean.addCourse(worldHistory,4.0);
        
        geom.addTeacher(price);
        photo.addTeacher(smith);
        yoga.addTeacher(smith);
        biology.addTeacher(smith);
        worldHistory.addTeacher(hudson);
        
        
        Course.printNames();
        Person.printNames();
        Student.printNames();
        Teacher.printNames();
        
        hudson.printStudentsNames();
        sean.printTeachersNames();
        System.out.println("Bobby's GPA = " + bobby.getGPA());
        
        Student.printStudentsGPAGreaterThan(3.0);
//        bobby.printTeachersNamesMeanerThan(7.2);
        Student.printStudentsGPAGreaterThan(3.5);
        Student studentHighGPA = Student.getHighestGPA();
        System.out.println("Highest gpa = " + studentHighGPA.getName());
    
        
        Teacher teachermostElective = Teacher.getMostElectiveCourses();
        System.out.println("Teacher with most electives =" + teachermostElective.getName());
                        
        smith.printStudentsGradelevel(11);
        
        Student.printHonorsStudents();
        
        andrew.getLowMLevel();
    }
}
