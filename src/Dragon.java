public class Dragon {
    private int health;
    private int strength;
    private int level;
    private boolean dead;
    private int attackDamage;


    public Dragon() {
        health = 100;
        strength = 10;
        level = 1;
        dead = false;
        attackDamage = 0;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public String takeDamage(int amount) {
        health -= amount;
        if (health <= 0){
            health = 0;
        }
        if (dead != true) {
            System.out.println("The dragon takes " + amount + " damage and now has " + (health) + " health");
            if (health <= 0) {
                health = 0;
                dead = true;
                return "The dragon has been slayed!";
            }
        }
        else{
           return "The dragon is already dead!";
        }
      return "";
    }

    public int attack() {
        int dmg = strength * level;
        attackDamage += dmg;
        System.out.println("The dragon attacks for " + dmg + " health points!");
        if (attackDamage > 50) {
            level++;
            System.out.println("The dragon has reached level " + level + "!");
            attackDamage = 0;
        }
        return dmg;
    }

    public void powerUp(int increase) {
        if (increase == 1) {
            System.out.println("The dragon’s health has increased to " + (health + 25));
            health += 25;
        } else {
            System.out.println("The dragon’s strength has increased to " + strength * 2);
            strength *= 2;
        }
    }

    public String state() {
        return ("Dragon: \nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level
                + "\nDead = " + dead + "\nAttack Damage = " + attackDamage);
    }
}