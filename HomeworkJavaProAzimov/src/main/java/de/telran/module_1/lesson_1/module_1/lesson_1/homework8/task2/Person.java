package de.telran.module_1.lesson_1.module_1.lesson_1.homework8.task2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
@Getter
public class Person {

    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
class PersonDemo{
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Anvar",21,"Uzbekistan"));
        arrayList.add(new Person("Abror",15,"Poland"));
        arrayList.add(new Person("Davud",25,"England"));
        System.out.println(arrayList);

        Iterator<Person> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = String.valueOf(iterator.next());
            System.out.println(str);
        }
        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        arrayList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).thenComparing(Person::getCity));
        System.out.println(arrayList);
    }
}
