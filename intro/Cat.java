public class Cat {

  String name;
  Integer age;

  public Cat(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public void eat(String food) {
    System.out.println(name + " eats " + food + "!");
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void getInfo() {
    if (this.getAge() != 1) {
      System.out.println(this.getName() + " is " + this.getAge() + " years old!");
    } else {
      System.out.println(this.getName() + " is " + this.getAge() + " year old!");
    }
  }

  public static void main(String []args) {
    Cat whiskers = new Cat("Whiskers", 1);
    whiskers.eat("tuna");
    whiskers.getInfo();

    Cat fluffy = new Cat("Fluffy", 4);
    fluffy.eat("salmon");
    fluffy.getInfo();
  }
}
