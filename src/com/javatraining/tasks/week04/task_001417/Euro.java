package src.com.javatraining.tasks.week04.task_001417;

public class Euro extends Money {

    public Euro(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "EUR";
    }
}
