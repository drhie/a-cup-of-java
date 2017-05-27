public class LoopsBreaks {
  public static void main(String[] args) {
    cobb: for(int counter = 0; counter <= 10; counter++) {
      System.out.println("Entering loop at COBB: " + counter);
      ariadne: for(int level = 0; level <= 10; level++) {
        System.out.println("  Entering loop at ARIA: " + level);
        if (level % 3 == 0 && level != 0) {
          System.out.println("BREAK OUT OF ARIADNE!");
          break ariadne;
        }
        eames: for(int count = 0; count <= 10; count++) {
          System.out.println("    Entering loop at EAME: " + count);
          if (count % 2 == 0 && count != 0) {
            System.out.println("BREAK OUT OF EAMES!");
            break eames;
          }
          saito: for(int seq = 0; seq <= 10; seq ++) {
            System.out.println("      Entering loop at SAIT: " + seq);
            if (seq % 5 == 0 && seq != 0) {
              System.out.println("BREAK OUT OF SAITO!");
              break saito;
            } else {
              System.out.println("        Inception reached at COBB: " + counter + ", ARIA: " + level + ", EAME: " + count + ", SAIT: " + seq + ".");
            }
          }
        }
      }
    }
  }
}
