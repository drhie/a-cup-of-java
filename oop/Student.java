public class Student extends Person {
  private int numCourses;
  private String[] courses;
  private int[] grades;
  private static final int MAX_COURSES = 30;

  public Student(String name, String address) {
    super(name, address);
    numCourses = 0;
    courses = new String[MAX_COURSES];
    grades = new int[MAX_COURSES];
  }

  public int getNumCourses() {
    return this.numCourses;
  }

  @Override
  public String toString() {
    return "Student: " + super.toString();
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
