public class TestDate {

  public void testStates(Date d) {
    System.out.println(d);
    System.out.println("Year is: " + d.getYear());
    System.out.println("Month is: " + d.getMonth());
    System.out.println("Day is: " + d.getDay());
  }

  public static void main (String[] args) {
    TestDate test = new TestDate();
    Date d1 = new Date(1999, 12, 3);
    d1.setYear(2001);
    d1.setMonth(11);
    d1.setDay(30);
    test.testStates(d1);

    Date d2 = new Date(2000, 1, 1);
    d2.setDate(2017, 5, 28);
    System.out.println(d2);
    test.testStates(d2);
  }
}
