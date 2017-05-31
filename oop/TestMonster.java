import java.util.*;
public class TestMonster {
  public void testStates(Monster m) {
    System.out.println(m);
    System.out.println(m.attack());
  }

  public static void main (String[] args) {
    TestMonster t = new TestMonster();

    FireMonster charmander = new FireMonster("Charmander");
    Monster squirtle = new WaterMonster("Squirtle"); //upcasting
    Monster geodude = new StoneMonster("Geodude");

    ArrayList<Monster> monsters = new ArrayList<Monster>();
    monsters.add(charmander);
    monsters.add(squirtle);
    monsters.add(geodude);

    for (Monster m : monsters) {
      t.testStates(m);
    }
  }
}
