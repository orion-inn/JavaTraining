package src.com.javatraining.tasks.week02.task_1328;

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("leg");
    final static BodyPart HEAD = new BodyPart("head");
    final static BodyPart ARM = new BodyPart("arm");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
