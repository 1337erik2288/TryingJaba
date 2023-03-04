package Prikol.data;

import Prikol.data.Person;
import Prikol.data.Student;
import Prikol.data.Teacher;

import java.util.ArrayList;

public class University {
    private ArrayList<Person> persons = new ArrayList<>();

    public University(){
        persons.add(new Student("Nay Gigger Fromass", "1000-7"));
        persons.add(new Student("Ivanov Ivan Eblan", "1337"));
        persons.add(new Student("Muck Dy Sick", "1000-7"));
        persons.add(new Student("Alexey Itter", "1337"));
        persons.add(new Teacher("Golovach Lena Poleno", "Ebat_mozgi"));
    }

    public int getCount(){
        return this.persons.size();
    }
    public Person getPerson(int index){
        return persons.get(index);
    }
}
