package src.com.javatraining.tasks.week05.task_001421;

public final class Singleton {

    private static volatile Singleton instance;             // 4. Prevents partially created object from being used

    public static Singleton getInstance() {
        Singleton result = instance;                        // 5. Cache the instance to not fetch it out of RAM every time

        if (result == null) {                               // 3. Don't wait, just return the instance if it's created
            synchronized (Singleton.class) {                // 2. Makes the singleton thread-safe
                result = instance;
                if (result == null) {                       // 1. This block is enough for a not thread-safe singleton
                    instance = result = new Singleton();
                }
            }
        }

        return result;
    }

    private Singleton () {}
}
