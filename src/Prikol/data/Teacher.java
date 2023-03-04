package Prikol.data;

import Prikol.data.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher(String fio, String subject){
        super(fio);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

}
