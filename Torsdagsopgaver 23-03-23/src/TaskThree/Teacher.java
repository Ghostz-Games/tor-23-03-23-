package TaskThree;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    boolean addCourse(String course) {

        if (canTeach.contains(course)) {
            //System.out.println("Teacher " + this.name + " was added to the course: " + course);
            currentCourses.add(course);
            return true;
        } else {
            //System.out.println("Teacher " + this.name + " does not meet the qualifications to teach the course: " + course);
            return false;
        }
    }
}
