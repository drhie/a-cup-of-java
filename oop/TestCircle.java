import java.util.*;

public class TestCircle {

  public void testStates(Circle object) {
    System.out.println("Radius: " + object.getRadius());
    System.out.println("Colour: " + object.getColour());
    System.out.printf("Area: %.2f%n", object.getArea());
    System.out.println(object);
  }

  public static void main (String[] args) {
    TestCircle test = new TestCircle();
    Circle c1 = new Circle(2.0, "blue");
    Circle c2 = new Circle(2.0);
    Circle c3 = new Circle();
    c3.setColour("green");
    c2.setRadius(2.8);
    test.testStates(c1);
    ArrayList<Circle> circles = new ArrayList<Circle>();
    circles.add(c1);
    circles.add(c2);
    circles.add(c3);
    for(Circle circle : circles) {
      test.testStates(circle);
    }
  }
}
