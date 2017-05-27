import java.util.*;

public class Marks {
  public static void main(String []args) {
    int[] marks = {74, 43, 58, 60, 90, 64, 70, 24};
    ArrayList<Integer> passes = new ArrayList<Integer>();
    ArrayList<Integer> fails = new ArrayList<Integer>();
    int sum = 0;
    int sumSq = 0;
    int count = marks.length;
    double mean, stdDev;
    for (int i=0; i<count; i++) {
      sum += marks[i];
      sumSq += marks[i]*marks[i];
      if (marks[i] > 49) {
        passes.add(marks[i]);
      } else {
        fails.add(marks[i]);
      }
    }
    mean = (double)sum/count;
    System.out.printf("Mean is %.2f%n", mean); //floating point format and newline
    stdDev = Math.sqrt((double)sumSq/count - mean*mean);
    System.out.printf("Std dev is %.2f%n", stdDev);
    System.out.println(passes.size() + " marks are a pass. " + fails.size() + " marks are a fail.");
  }
}
