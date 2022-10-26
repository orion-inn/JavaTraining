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
    }

    public static void callSelectableMethods(Selectable selectable) {
        //call methods
    }

    interface Selectable {
        void onSelect();
    }

    static class Food {
        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
