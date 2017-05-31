public class WaterMonster extends Monster {
  public WaterMonster(String name) {
    super(name);
  }

  @Override public String attack() {
    return "Attack with water!";
  }

  public String toString() {
    return "Water: " + this.getName();
  }
}
