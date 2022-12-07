public class Paimon {
  private int health;
  private int healthCap;
  private int strength;
  private int level;
  private boolean dead;
  private int xp;
  private int xpCap;
  private boolean levelUp;
  

  public Paimon() {
    health = 100;
    strength = 1;
    level = 1;
    dead = false;
    xpCap = 2;
    levelUp = false;
    xp = 0;
  }

  public int getStrength3() {
    return strength;
  }

  public int getHealth3() {
    return health;
  }

  public int getLevel3() {
    return level;
  }

  public boolean isDead3() {
    return dead;
  }

  public void slapped(int amount) {
    health -= amount;
    if (health <= 0) {
      health = 0;
    }
    if (dead != true) {
      System.out.println("Paimon takes " + amount + " damage and now has " + (health) + " health");
      if (health <= 0) {
        health = 0;
        System.out.println("Paimon has been slayed!");
        dead = true;
      }
    }
  }

  public int attack3() {
    int dmg = strength * level;
    return dmg;
  }

  public void LevelUp3(int xp) {
    if (xp >= xpCap) {
      level++;
      System.out.println("The Paimon has reached level + " + level);
      health += 10;
      strength++;
      xp -= xpCap;
      xpCap *= 2;
    }
  }

  public String state() {
    return ("Paimon: \nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level
        + "\nDead = " + dead + "\nXP = " + xp + "/" + xpCap);
  }
}