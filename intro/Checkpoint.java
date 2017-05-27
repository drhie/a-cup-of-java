import java.util.*;

public class Checkpoint {

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

  public void reverseString() {
    String inStr;
    int inStrLen;

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word to reverse: ");
    inStr = in.nextLine(); //.next reads the string.
    inStrLen = inStr.length();
    System.out.print("Reversed string: ");
    for (int i = inStrLen-1; i >= 0; i--) {
      System.out.print(inStr.charAt(i));
    } System.out.println();
  }

  public void phoneKeyPad() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word to convert to number: ");
    String word = in.nextLine().toLowerCase();
    int wordLen = word.length();
    String keypad = "";
    char letter;
    for (int i = 0; i < wordLen; i++) {
      letter = word.charAt(i);
      switch (letter) {
        case 'a': case 'b': case 'c':
          keypad += "2"; break;
        case 'd': case 'e': case 'f':
          keypad += "3"; break;
        case 'g': case 'h': case 'i':
          keypad += "4"; break;
        case 'j': case 'k': case 'l':
          keypad += "5"; break;
        case 'm': case 'n': case 'o':
          keypad += "6"; break;
        case 'p': case 'q': case 'r': case 's':
          keypad += "7"; break;
        case 't': case 'u': case 'v':
          keypad += "8"; break;
        case 'w': case 'x': case 'y': case 'z':
          keypad += "9"; break;
      }
    }
    System.out.println("Converted word: " + keypad);
  }

  public void testPalindromicWord() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word to verify if palindromic: ");
    String word = in.next().toLowerCase();
    int wordLen = word.length();
    String reverseWord = "";
    for(int num = wordLen-1; num >= 0; num --) {
      reverseWord += word.charAt(num);
    }
    boolean palindromic = word.equals(reverseWord) ? true : false; //CAREFUL! ".equals" verifies content. "==" verifies reference.
    System.out.println("Is " + word.toUpperCase() + " a palindromic word?: " + palindromic);
  }

  public static void main(String []args) {
    Checkpoint exercise = new Checkpoint();

    //conditional exercises
    exercise.checkPassFail();
    exercise.checkEvenUntilOdd();

    //loop exercises
    exercise.sumAndAverage();
    exercise.fizzBuzzWuzz();
    exercise.fibonacci(8);

    //string char exercises
    exercise.reverseString();
    exercise.phoneKeyPad();
    exercise.testPalindromicWord();
  }
}
