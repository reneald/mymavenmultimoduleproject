package be.reneald.api;

import be.reneald.domain.Person;
import com.google.common.collect.Lists;

import java.util.ArrayList;

public class MyAPI {
    public static void main(String[] args) {
        Person tiberius = new Person("Tiberius", 5);
        Person pruts = new Person("Pruts", 25);
        ArrayList<Person> personList = Lists.newArrayList(tiberius, pruts);

        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
