public class TestAuthor {

  public void testStates(Author a) {
    System.out.println(a);
    System.out.println(a.getName() + ": (" + a.getGender() + ") " + a.getEmail());
  }

  public static void main (String[] args) {
    TestAuthor test = new TestAuthor();
    Author king = new Author("Stephen King", "king@king.com", 'm'); //different syntax for char
    king.setEmail("stephen@king.com");
    test.testStates(king);


  }
}
