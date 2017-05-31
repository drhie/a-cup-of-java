public class Monster {
  private String name;

  public Monster(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String attack() {
    return "I don't know how to attack!";
  }
}
