package src.com.javatraining.tasks.week02.task_1328;

public abstract class AbstractRobot implements Attackable, Defensable {

    // private static int hitCount;
    private int hitCount;

    public int getHitCount() {
        return hitCount;
    }

    public void increaseHitCount () {
        hitCount++;
    }

    public abstract String getName();

    public BodyPart attack() {
        switch ((int)(Math.random() * 4)) {
            case 0: return BodyPart.HEAD;
            case 1: return BodyPart.CHEST;
            case 2: return BodyPart.ARM;
            default: return BodyPart.LEG;
        }
        /*
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
        */
    }

    public BodyPart defense() {
        switch ((int)(Math.random() * 4)) {
            case 0: return BodyPart.HEAD;
            case 1: return BodyPart.CHEST;
            case 2: return BodyPart.ARM;
            default: return BodyPart.LEG;
        }
        /*
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
        */
    }
}
