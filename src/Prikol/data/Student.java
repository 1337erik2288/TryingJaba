package Prikol.data;

import Prikol.data.Person;

public class Student extends Person {
    private String group;

    public Student(String fio, String group){
        super(fio);
        this.group = group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

}
