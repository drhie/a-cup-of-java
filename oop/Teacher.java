public class Teacher extends Person {
  private int numCourses = 0;
  private String[] courses;
  private static final int MAX_COURSES = 5;

  public Teacher(String name, String address) {
    super(name, address);
    courses = new String[MAX_COURSES];
  }

  public int getNumCourses() {
    return this.numCourses;
  }

  @Override
  public String toString() {
    return "Teacher: " + this.getName() + "(" + this.getAddress() + ")";
  }

  public boolean addCourse(String course) {
    for (int i = 0; i < numCourses; i++) {
      if (this.courses[i].equals(course)) return false;
    }
    courses[numCourses] = course;
    numCourses ++;
    return true;
  }

  public String[] getCourses() {
    return this.courses;
  }

  //observe two iterations to remove
  public boolean removeCourse(String course) {
    boolean found = false;
    int courseIndex = -1; //requires initialization
    for (int i = 0; i < this.courses.length; i++) {
      if (this.courses[i].equals(course)) {
        courseIndex = i;
        found = true;
        break;
      }
    }
    if (found) {
      for (int i = courseIndex; i < numCourses-1; i ++) {
        courses[i] = courses[i+1];
      }
      numCourses--;
      return true;
    } else {
      return false;
    }
  }
}
