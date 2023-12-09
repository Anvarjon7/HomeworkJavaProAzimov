package de.telran.javaProff.summary.simpleStackQueue;

import lombok.*;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SimplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<People> people = new PriorityQueue<>();

        people.add(new People("Anvar",22,1));
        people.add(new People("David",18,8));
        people.add(new People("Jakub",10,4));
        people.add(new People("Anna",61,5));

        System.out.println(people);
        people.poll();
        System.out.println(people);

        PriorityQueue<People> people1 = new PriorityQueue<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        people1.addAll(people);
        people1.add(new People("Hans",54,9));
        System.out.println(people1);

        PriorityQueue<People> people2 = new PriorityQueue<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1.getAge()>60) return -1;
                if (o2.getAge()>60) return 1;
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        people2.addAll(people1);
        System.out.println(people2);

    }



}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class People implements Comparable<People>{
    private String name;
    private int age;
    private int ticketName;

    @Override
    public int compareTo(People o) {
        return Integer.compare(this.ticketName,o.ticketName);
    }
}
