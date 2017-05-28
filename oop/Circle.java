public class Circle {
  //Private instance variables
  private double radius;
  private String colour;

  //Constructors (overloaded) *observe identical name.
  public Circle() { //1st
    this.radius = 1.0;
    this.colour = "red";
  }

  public Circle(double radius) { //2nd
    this.radius = radius;
    this.colour = "red";
  }

  public Circle(double radius, String colour) { //3rd
    this.radius = radius;
    this.colour = colour;
  }

  //Public methods : Getters
  public double getRadius() {
    return radius;
  }

  public String getColour() {
    return colour;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  //Setters
  public void setColour(String colour) {
    this.colour = colour;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  //Public method toString()
  public String toString() {
    return "Circle[radius=" + this.radius + ",colour=" + this.colour +"]";
  }
}

//This is not a standalone program. Meant to be a building block, used in other programs.
