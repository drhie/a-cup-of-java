public class FireMonster extends Monster {
  public FireMonster(String name) {
    super(name);
  }

  @Override public String attack() {
    return "Attack with fire!";
  }

  public String toString() {
    return "Fire: " + this.getName();
  }
}
