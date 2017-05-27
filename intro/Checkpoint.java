import java.util.*;

public class Checkpoint {

  //CONDITIONAL EXERCISES
  public void checkPassFail() {
    double mark = Math.random()*100;
    System.out.printf("\nThe mark is %.1f%n", mark);
    if (mark >= 50) {
      System.out.printf("%.1f is a pass.%n", mark);
    } else {
      System.out.printf("%.1f is a fail.%n", mark);
    }
  }

  public void checkEvenUntilOdd() {
    boolean isEven = true;
    while (isEven) {
      int num = (int)(Math.random()*100);
      String result = num % 2 == 0 ? "even" : "odd";
      System.out.println("\n" + num + " is " + result + ".");
      isEven = result == "even" ? true : false;
    }
  }

  //LOOP EXERCISES
  public void sumAndAverage() {
    int upperbound = (int)(Math.random()*100);
    int sum = 0;
    double average;
    for (int counter = 1; counter <= upperbound; counter ++) {
      sum += counter;
    }
    average = sum/(float)upperbound;
    System.out.println("\nNumber: " + upperbound + "\nTotal Sum: " + sum + "\nAverage: " + average);
  }

  public void fizzBuzzWuzz() {
    System.out.println("\n");
    for (int num = 1; num <= 110; num ++) {
      String result = "";
      if (num % 3 == 0) result += "Fizz";
      if (num % 5 == 0) result += "Buzz";
      if (num % 7 == 0) result += "Wuzz";
      result = result == "" ? Integer.toString(num) : result;
      System.out.println(result);
    }
  }

  public void fibonacci(int index) {
    System.out.println("\n");
    int fib1 = 0;
    int fib2 = 1;
    ArrayList<Integer> fibList = new ArrayList<Integer>();
    fibList.add(fib1);
    fibList.add(fib2);
    do {
      fibList.add(fibList.get(fibList.size()-1) + fibList.get(fibList.size()-2));
    } while (fibList.size() < index);
    System.out.println("Fibonacci at index " + index + " is " + fibList.get(index-1));
  }

  public static void main(String []args) {
    Checkpoint exercise = new Checkpoint();
    exercise.checkPassFail();
    exercise.checkEvenUntilOdd();
    exercise.sumAndAverage();
    exercise.fizzBuzzWuzz();
    exercise.fibonacci(8);
  }
}
