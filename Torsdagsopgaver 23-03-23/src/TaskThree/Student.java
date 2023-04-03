package TaskThree;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }



    @Override
    boolean addCourse(String course) {

        if(passedCourses.contains(course)){
            //System.out.println("Student "+this.name+" has already passed the course: "+course);
            return false;
        }else {
            //System.out.println("Student "+this.name+ " was added to the course: "+ course);
            currentCourses.add(course);
            return true;
        }
    }
}
