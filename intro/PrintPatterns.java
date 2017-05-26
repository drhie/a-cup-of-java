public class PrintPatterns {
  public void checkeredPattern(int size) {
    System.out.println("Checkered");
    for(int row = 1; row <= size; ++row) {
      for (int col = 1; col <= size; ++col) {
        if (row % 2 == 0) {
          System.out.print("# ");
        } else {
          System.out.print(" #");
        }
      }
      System.out.println();
    }
  }

  public void checkerStarPattern(int size) {
    System.out.println("Checkers and Stars");
    for(int row = 0; row <= size; row++) {
      for(int col = 0; col <= size; col++) {
        String symbol = col % 2 == 0 ? "#" : "*";
        if (row % 2 == 0) {
          System.out.print(" " + symbol);
        } else {
          System.out.print(symbol + " ");
        }
      }
      System.out.println();
    }
  }

  public void leftTriangle(int size) {
    System.out.println("Left Triangle");
    for(int row = size; row >= 0; row --) {
      for(int line = row; line >= 0; line--) {
        System.out.print("# ");
      }
      System.out.println();
    }
  }

  public void rightTriangle(int size) {
    System.out.println("Right Triangle");
    for(int row = 0; row <= size; row ++) {
      for (int whtspc = 0; whtspc <= size; whtspc ++) {
        String printVal = whtspc < row ? "  " : " #";
        System.out.print(printVal);
      }
      System.out.println();
    }
  }

  public void numberedLeftTriangle(int size) {
    System.out.println("Numbered Left Triangle");
    int counter = 0;
    for(int row = 0; row < size; row++) {
      counter += 1;
      for(int num = counter; num >= 1; num--) {
        System.out.print(num + " ");
      }
      if (counter != 0) System.out.println();
    }
  }

  public void numberedRightTriangle(int size) {
    System.out.println("Numbered Right Triangle");
    int counter = 0;
    String whtspc = " ";
    for (int row = 1; row <= size; row++) {
      counter += 1;
      for (int col = size; col >= 1; col--) {
        String printVal = col <= row ? String.valueOf(col) : whtspc;
        System.out.print(printVal + " ");
      }
      System.out.println();
    }
  }

  public void timetableUpTo(int size) {
    System.out.println("Timetable");
    for(int row = 1; row <= size; row++) {
      for(int col = 1; col <= size; col++) {
        int val = col * row;
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    PrintPatterns print = new PrintPatterns();
    int example = 8;
    print.checkeredPattern(example);
    print.checkerStarPattern(example);
    print.leftTriangle(example);
    print.rightTriangle(example);
    print.numberedLeftTriangle(example);
    print.numberedRightTriangle(example);
    print.timetableUpTo(example);
  }
}
