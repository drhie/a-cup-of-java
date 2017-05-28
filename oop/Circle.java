public class Circle {
  //Private instance variables
  private double radius;
  private String colour;

  //Constructors (overloaded) *observe identical name.
  public Circle() { //1st
    radius = 1.0;
    colour = "red";
  }

  public Circle(double r) { //2nd
    radius = r;
    colour = "red";
  }

  public Circle(double r, String c) { //3rd
    radius = r;
    colour = c;
  }

  //Public methods
  public double getRadius() {
    return radius;
  }

  public String getColour() {
    return colour;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }
}

//This is not a standalone program. Meant to be a building block, used in other programs.
