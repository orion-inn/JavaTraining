package src.com.javatraining.tasks.week03.task_001405;

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        //call methods
        food.onSelect();
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
        //call methods
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected.");
        }
    }
}
