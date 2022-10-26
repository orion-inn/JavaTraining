package src.com.javatraining.tasks.week02.task_1123;

public class Task {
  public static void main(String[] args) {
    int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

    Pair result = getMinimumMaximumPair(data);

    System.out.println("The minimum is " + result.x);
    System.out.println("The maximum is " + result.y);
  }

  public static Pair getMinimumMaximumPair(int[] inputArray) {
    if (inputArray == null || inputArray.length == 0) {
      return new Pair(null, null);
    }

    Integer minimumValue = null;
    Integer maximumValue = null;

    for (int value : inputArray) {
      if (minimumValue == null || minimumValue > value) {
        minimumValue = value;
      }

      if (maximumValue == null || maximumValue < value) {
        maximumValue = value;
      }
    }

    return new Pair(minimumValue, maximumValue);
  }

  public static class Pair {
    public Integer x;
    public Integer y;

    public Pair(Integer x, Integer y) {
      this.x = x;
      this.y = y;
    }
  }
}
