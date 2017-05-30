import java.util.*;

public class TestTeacher {
  public void testStates(Teacher t) {
    System.out.println(t);
    System.out.println(t.getAddress());
    System.out.println(t.getName());
  }

  public static void main(String[] args) {
    TestTeacher test = new TestTeacher();
    Teacher fred = new Teacher("Fred N.", "201 Awesome Road");
    Teacher daniel = new Teacher("Daniel M.", "6 Lucky Drive");
    Teacher devon = new Teacher("Devon N.", "3 Toronto Crescent");

    String[] courseCodes = {"WDI100", "JPY100", "HIS300", "TLC202"};
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    teachers.add(fred);
    teachers.add(daniel);
    teachers.add(devon);

    fred.addCourse("ROR404");
    daniel.addCourse("RCT200");
    daniel.addCourse("RCT100");
    devon.addCourse("CSC200");
    fred.addCourse("ROR404");
    daniel.removeCourse("RCT200");
    for (Teacher teacher : teachers) {
      test.testStates(teacher);
      for (String courseName : courseCodes) {
        int courseIndex = (int)(Math.random()*3);
        teacher.addCourse(courseCodes[courseIndex]);
      }
      System.out.println();
      System.out.println(teacher.getName().toUpperCase());
      for (int i = 0; i < teacher.getNumCourses(); i ++) {
        System.out.println(teacher.getCourses()[i]);
      }
    }
  }
}
