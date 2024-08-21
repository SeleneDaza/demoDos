package co.edu.uptc;

import co.edu.uptc.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Selene");
        System.out.println(person.getName());
    }
}