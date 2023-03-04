package Prikol.data;

public abstract class Person {
    protected String fio;

    public Person(String fio) {}

    public void setFio(String str) {
        this.fio = str;
    }

    public String getFio() {
        return fio;
    }

}
