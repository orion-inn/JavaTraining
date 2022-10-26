package src.com.javatraining.tasks.week02.task_1328;

public class Solution {
    public static void main(String[] args) {
        Robot bender = new Robot("Bender-02");
        Robot enemy = new Robot("T-1000");

        doMove(bender, enemy);
        doMove(bender, enemy);
        doMove(enemy, bender);
        doMove(bender, enemy);
        doMove(enemy, bender);
        doMove(bender, enemy);
        doMove(enemy, bender);
        doMove(bender, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s attacked %s in the %s, defended %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
