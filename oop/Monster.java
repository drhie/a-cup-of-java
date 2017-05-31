abstract public class Monster {
  private String name;

  public Monster(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  abstract public String attack();
}
