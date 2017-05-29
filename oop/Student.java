public class Student {
  private String name;
  private String address;
  private int numCourses = 0;
  private String[] courses = new String[30];
  private int[] grades = new int[30];

  public Student(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }
  public String getAddress() {
    return this.address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  public String toString() {
    return this.name + "(" + this.address + ")";
  }

  public void addCourseGrade(String course, int grade) {
    this.courses[numCourses] = course;
    this.grades[numCourses] = grade;
    numCourses ++;
  }

  public void printGrades() {
    for (int i = 0; i < numCourses; i++) {
      System.out.println(this.courses[i] + ": " + this.grades[i]);
    }
  }

  public double getAverageGrade() {
    int sum = 0;
    for (int i = 0; i < numCourses; i++) {
      sum += grades[i];
    }
    double average = (double)(sum/numCourses);
    return average;
  }
}
