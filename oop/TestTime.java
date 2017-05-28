public class TestTime {

  public void testStates(Time t) {
    System.out.println(t);
    System.out.println("Second: " + t.getSecond());
    System.out.println("Minute: " + t.getMinute());
    System.out.println("Hour: " + t.getHour());
  }

  public static void main (String[] args) {
    TestTime test = new TestTime();
    Time t1 = new Time();
    Time t2 = new Time(59, 32, 5);

    test.testStates(t2);
    test.testStates(t1);
    t1.setSecond(58);
    t1.setMinute(59);
    t1.setHour(20);
    test.testStates(t1);
    t1.nextSecond().nextSecond();
    test.testStates(t1);
  }

}
