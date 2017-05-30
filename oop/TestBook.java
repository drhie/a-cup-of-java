public class TestBook {
  public void testStates(Book b) {
    System.out.println(b);
    System.out.println(b.getName());
    System.out.println(b.getAuthor());
    System.out.println(b.getPrice());
    System.out.println(b.getQty());
  }

  public static void main(String[] args) {
    TestBook test = new TestBook();
    Author jkRowling = new Author("J.K. Rowling", "jk@rowling.com", 'f');
    Author king = new Author("Stephen King", "king@king.com", 'm');
    Book harryPotter = new Book("Harry Potter 1", jkRowling, 11.99, 2);
    Book shining = new Book("The Shining", king, 6.99, 3);

    System.out.println(harryPotter);
    harryPotter.setPrice(13.99);
    harryPotter.setQty(5);
    test.testStates(harryPotter);

    System.out.println(shining);
    shining.setPrice(16.99);
    test.testStates(shining);

    System.out.println(king);

  }
}
