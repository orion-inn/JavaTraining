package src.com.javatraining.tasks.week04.task_001411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //key reading cycle here (1)
        while ((key = reader.readLine()) != null && Key.has(key))
        {
            // create an object (2)
            person = switch (key.toLowerCase()) {
                case "user" -> new Person.User();
                case "loser" -> new Person.Loser();
                case "coder" -> new Person.Coder();
                case "proger" -> new Person.Proger();
                default -> throw new IllegalArgumentException("Allowed keys are: user, loser, coder, proger"); // never going to happen
            };

            doWork(person); // call doWork

        }
    }

    public static void doWork(Person person) {
        // (3)
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

enum Key {
    USER,
    LOSER,
    CODER,
    PROGER;

    public static boolean has (String key) {
        for (Key value : Key.values()) {
            if (value.name().equals(key.toUpperCase())) {
                return true;
            }
        }

        return false;
    }
}
