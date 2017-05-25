class Person {
  String name;
  int age;
  int health;
  int intelligence;
  int money = 200;
  boolean alive = true;

  void hasBirthday() {
    this.age += 1;
    if (this.age > 100) {
      alive = false;
    }
  }

  Person(String name, Integer age, Integer intelligence) {
    this.name = name;
    this.age = age;
    this.health = 100;
    this.intelligence = intelligence;

    if (age >= 27) {
      this.health -= 10;
    }
    if (age >= 40) {
      this.health -= 12;
    }
    if (age >= 65) {
      this.health -= 14;
    }
    if (age >= 80) {
      this.health -= 16;
    }
    if (age >= 90) {
      this.health -= 20;
    }
  }

  void showStatus() {
    System.out.println("age: " + age + " health: " + health + " intelligence: " + intelligence + "% money:" + money);
  }
}

class Socialite extends Person {
  Socialite(String name, Integer age, Integer intelligence) {
    super(name, age, intelligence);
  }

  void daddyPaysForIt(int moneyIncrement) {
    this.money += moneyIncrement*2;
  }

  void speaks() {
    System.out.println("Life is tough now that daddy can only afford to pay two of my three cars.");
  }

  public static void main(String []args) {
    Socialite kim = new Socialite("Kim", 22, 50);
    kim.daddyPaysForIt(50);
    kim.hasBirthday();
    kim.showStatus();
    kim.speaks();
  }
}

class Worker extends Person {
  Worker(String name, Integer age, Integer intelligence) {
    super(name, age, intelligence);
  }

  void worksHardToMakeALiving(int moneyIncrement) {
    this.money += moneyIncrement/2;
  }

  void speaks() {
    System.out.println("Life is tough, although I'm just happy to make rent.");
  }

  public static void main(String []args) {
    Worker joe = new Worker("Joe", 30, 50);
    joe.worksHardToMakeALiving(50);
    joe.hasBirthday();
    joe.showStatus();
    joe.speaks();
  }
}
