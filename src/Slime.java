public class Slime {
    private int health;
    private int strength;
    private int level;
    private boolean dead;

    public Slime() {
        health = 25;
        strength = 1;
        level = 1;
        dead = false;
    }

    public int getStrength2() {
        return strength;
    }

    public int getHealth2() {
        return health;
    }

    public int getLevel2() {
        return level;
    }

    public boolean isDead2() {
        return dead;
    }

    public void getSlap(int amount) {
        health -= amount;
    }

    public int attack2() {
        int dmg = strength * level;
        System.out.println("The slime attacks for " + dmg + " health points!");
        return dmg;
    }

    public String state2() {
        return ("Slime: \nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level    + "\nDead = " + dead);
    }
}