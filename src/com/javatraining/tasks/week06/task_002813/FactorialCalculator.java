package src.com.javatraining.tasks.week06.task_002813;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() {
        return 0L;
    }

    public long factorial(int number) throws InterruptedException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }
        long result = 1;
        while (number > 1) {
            Thread.sleep(1);
            result = result * number;
            number--;
        }
        return result;
    }
}
