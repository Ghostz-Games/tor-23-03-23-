package TaskThree;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> canTeach1 = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        Student s1 = new Student("Nicklas", passedCourses1);
        Student s2 = new Student("Emilie", passedCourses2);
        Teacher t1 = new Teacher("Signe", canTeach1);
        Teacher t2 = new Teacher("Tess", canTeach2);
        passedCourses1.add("Java 1.0");
        passedCourses2.add("Mathematics");
        canTeach1.add("Java 1.0");
        canTeach1.add("Java 1.1");
        people.add(s1);
        people.add(t1);
        people.add(s2);
        people.add(t2);




        for(Person p : people){
            if(p.addCourse("Java 1.0") && p instanceof Student){
                System.out.println(p.getName() +" was added to the course: Java 1.0");
            }else if (p.addCourse("Java 1.0") && p instanceof Teacher){
                System.out.println(p.getName() + " was added to the course: Java 1.0");
            }else if (!p.addCourse("Java 1.0") && p instanceof Student){
                System.out.println(p.getName() + " has already passed this course!");
            }else if(!p.addCourse("Java 1.0") && p instanceof Teacher){
                System.out.println(p.getName() + " does not meet the required qualifications to teach this course");
            }
        }
        
    }

}
