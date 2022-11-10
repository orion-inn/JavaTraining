package src.com.javatraining.tasks.week04.task_001417;

public class Dinar extends Money {

    public Dinar(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RSD";
    }
}
