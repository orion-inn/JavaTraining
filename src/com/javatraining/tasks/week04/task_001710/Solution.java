package src.com.javatraining.tasks.week04.task_001710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Ivan Ivanov", new Date()));  //born today    id=0
        allPeople.add(Person.createFemale("Ana Petrovic", new Date()));  //born today    id=1
    }

    public static void main(String[] args) {
        // your code here
        try {
            if (args.length < 1) {
                throw new IllegalArgumentException(String.format(
                        "Usage:%n\t-c name sex bd%n\t-r id%n\t-u id name sex bd%n\t-d id%n"));
            }

            switch (args[0]) {
                case "-c" -> create(args);
                case "-r" -> read(args);
                case "-u" -> update(args);
                case "-d" -> delete(args);
                default -> throw new IllegalArgumentException("Acceptable arguments are: -c, -r, -u, -d!");
            }
        } catch (IllegalArgumentException err) {
            System.err.println(err.getMessage());
        }
    }

    private static void create (String[] args) throws IllegalArgumentException {
        if (args.length < 4) {
            throw new IllegalArgumentException(String.format("Usage:%n\t-c name sex bd%n"));
        }

        String name = args[1];
        Sex sex = getSex(args[2]);
        Date bd = getDate(args[3]);

        Person person = sex.equals(Sex.FEMALE) ? Person.createFemale(name, bd) : Person.createMale(name, bd);
        allPeople.add(person);

        System.out.println(allPeople.size() - 1);
    }

    private static void read (String[] args) throws IllegalArgumentException {
        if (args.length < 2) {
            throw new IllegalArgumentException(String.format("Usage:%n\t-r id%n"));
        }

        int id = getID(args[1]);

        Person person = allPeople.get(id);

        System.out.println(person.getName()
                  + " " + (person.getSex().equals(Sex.FEMALE) ? "f" : "m")
                  + " " + (new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate())));
    }

    private static void update (String[] args) throws IllegalArgumentException {
        if (args.length < 5) {
            throw new IllegalArgumentException(String.format("Usage:%n\t-u id name sex bd%n"));
        }

        int id = getID(args[1]);
        String name = args[2];
        Sex sex = getSex(args[3]);
        Date bd = getDate(args[4]);

        Person person = allPeople.get(id);
        person.setName(name);
        person.setSex(sex);
        person.setBirthDate(bd);

        System.out.println("Person with id " + id + " updated");
    }

    private static void delete (String[] args) throws IllegalArgumentException {
        if (args.length < 2) {
            throw new IllegalArgumentException(String.format("Usage:%n\t-d id%n"));
        }

        int id = getID(args[1]);

        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);

        System.out.println("Person with id " + id + " deleted");
    }

    private static int getID(String strID) throws IllegalArgumentException {
        try {
            int id = Integer.parseInt(strID);
            if (id < 0 || id >= allPeople.size()) {
                throw new IllegalArgumentException();
            }
            return id;
        } catch (IllegalArgumentException err) {
            throw new IllegalArgumentException("ID is na integer between 0 and " + allPeople.size(), err);
        }
    }

    private static Sex getSex(String strSex) throws IllegalArgumentException {
        return switch (strSex) {
            case "f" -> Sex.FEMALE;
            case "m" -> Sex.MALE;
            default -> throw new IllegalArgumentException("Person is either m or f");
        };
    }

    private static Date getDate(String strDate) throws IllegalArgumentException {
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(strDate);
        } catch (ParseException err) {
            throw new IllegalArgumentException("The proper date format is DD/MM/YYYY", err);
        }
    }
}
