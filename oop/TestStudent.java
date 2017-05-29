import java.util.*;

public class TestStudent {

  public void testStates(Student s) {
    System.out.println(s);
    System.out.println(s.getAddress());
    System.out.println(s.getName());
  }

  public static void main (String[] args) {
    TestStudent test = new TestStudent();
    Student dave = new Student("David R.", "200 Awesome Road");
    Student will = new Student("Will H.", "7 Lucky Drive");
    Student satomi = new Student("Satomi N.", "2 Yokohama Crescent");

    String[] courseCodes = {"WDI100", "JPY100", "HIS300", "TLC202"};
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(dave);
    students.add(will);
    students.add(satomi);

    for (Student student : students) {
      test.testStates(student);
      for (String courseName : courseCodes) {
        int mark = (int)(Math.random()*100);
        student.addCourseGrade(courseName, mark);
      }
      System.out.println();
      System.out.println(student.getName().toUpperCase());
      student.printGrades();
      System.out.println(student.getAverageGrade() + "%\n");
    }

  }

}
