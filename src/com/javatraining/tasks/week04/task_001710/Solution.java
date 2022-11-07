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

    public static void main(String[] args) throws IllegalArgumentException, ParseException {
        // your code here
        if (args.length < 1) {
            System.err.format("Usage:%n\t-c name sex bd%n\t-r id%n\t-u id name sex bd%n\t-d id%n");
            System.exit(1);
        }

        Person person = null;
        int id = -1;
        String name = null;
        Sex sex = null;
        Date bd = null;

        switch (args[0]) {
            case "-c": // create
                if (args.length < 4) {
                    System.err.format("Usage:%n\t-c name sex bd%n");
                    System.exit(1);
                }

                name = args[1];

                if ((sex = getSex(args[2])) == null) {
                    System.err.println("Person is either f or m");
                    System.exit(1);
                }

                if ((bd = getDate(args[3])) == null) {
                    System.err.println("The proper date format is DD/MM/YYYY");
                    System.exit(1);
                }

                person = sex.equals(Sex.FEMALE) ? Person.createFemale(name, bd)
                                                : Person.createMale(name, bd);

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-r": // read
                if (args.length < 2) {
                    System.err.format("Usage:%n\t-r id%n");
                    System.exit(1);
                }

                if ((id = getID(args[1])) == -1) {
                    System.err.println("id is an integer between 0 and " + allPeople.size());
                    System.exit(1);
                }

                person = allPeople.get(id);
                System.out.println(person.getName()
                          + " " + (person.getSex().equals(Sex.FEMALE) ? "f" : "m")
                          + " " + (new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate())));
                break;
            case "-u": // update
                if (args.length < 5) {
                    System.err.format("Usage:%n\t-u id name sex bd%n");
                    System.exit(1);
                }

                if ((id = getID(args[1])) == -1) {
                    System.err.println("id is an integer between 0 and " + allPeople.size());
                    System.exit(1);
                }

                name = args[2];

                if ((sex = getSex(args[3])) == null) {
                    System.err.println("Sex is either f or m");
                    System.exit(1);
                }

                if ((bd = getDate(args[4])) == null) {
                    System.err.println("The proper date format is DD/MM/YYYY");
                    System.exit(1);
                }

                person = allPeople.get(id);
                person.setName(name);
                person.setSex(sex);
                person.setBirthDate(bd);

                System.out.println("Person with id " + id + " updated");
                break;
            case "-d": // delete
                if (args.length < 2) {
                    System.err.format("Usage:%n\t-d id%n");
                    System.exit(1);
                }

                if ((id = getID(args[1])) == -1) {
                    System.err.println("id is an integer between 0 and " + allPeople.size());
                    System.exit(1);
                }

                person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);

                System.out.println("Person with id " + id + " deleted");
                break;
            default:
                System.err.println("Acceptable parameters are: -c, -r, -u, -d!");
                System.exit(1);
        }
    }

    private static int getID(String strID) {
        int id;

        try {
            id = Integer.parseInt(strID);
            if (id < 0 || id >= allPeople.size())
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException err) {
            id = -1;
        }

        return id;
    }

    private static Sex getSex(String strSex) {
        return switch (strSex) {
            case "f" -> Sex.FEMALE;
            case "m" -> Sex.MALE;
            default -> null;
        };
    }

    private static Date getDate(String strDate) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(strDate);
        } catch (ParseException err) {
            return null;
        }
    }
}
