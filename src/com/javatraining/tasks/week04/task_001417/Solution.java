package src.com.javatraining.tasks.week04.task_001417;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " has " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            // your code here
            this.allMoney.add(new Euro(Math.random() * 1000));
            this.allMoney.add(new Dinar(Math.random() * 1000));
            this.allMoney.add(new USD(Math.random() * 1000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
