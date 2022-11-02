package src.com.javatraining.tasks.week04.task_001710;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Ivan Ivanov", new Date()));  //born today    id=0
        allPeople.add(Person.createFemale("Ana Petrovic", new Date()));  //born today    id=1
    }

    public static void main(String[] args) {
        // your code here
    }
}
