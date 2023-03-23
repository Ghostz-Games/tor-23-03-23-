package TaskThree;

public abstract class Person {

    protected String name;

    protected Person(String name){
        this.name = name;
    }


    public void setName(String name){
        this.name =  name;
    }

    public String getName(){
        return this.name;
    }

    abstract boolean addCourse(String course);


}
