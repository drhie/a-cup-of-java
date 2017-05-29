public class TestPoint {
  public void testStates(Point p) {
    System.out.println(p);
    System.out.println("x: " + p.getXY()[0] + ", y: " + p.getXY()[1]);
  }

  public static void main (String[] args) {
    TestPoint test = new TestPoint();
    Point p1 = new Point();
    Point p2 = new Point(1, 2);

    test.testStates(p1);
    test.testStates(p2);

    p1.setX(3);
    p1.setY(4);
    p2.setXY(5, 6);
    test.testStates(p1);
    test.testStates(p2);

    System.out.println(p1.distance());
    System.out.println(p1.distance(p2));
    System.out.println(p1.distance(1, 2));
  }
}
