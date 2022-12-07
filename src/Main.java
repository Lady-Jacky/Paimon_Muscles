import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int choice;
    int paiFist = 0;
    int slimeLick = 0;
    int defense = 0;
    int dragonAtk = 0;
    Dragon Dvalin = new Dragon();
    Slime slime = new Slime();
    Paimon Paimon = new Paimon();
    System.out.println("Welcome to Paimon's training to rule the world!");
    System.out.println("------------------------------------------");
      while (Dvalin.isDead() == false && !Paimon.isDead3()) {
        System.out.print("Will Paimon fight slimes (Insert 1) OR Dvalin (Insert 2): ");
        choice = scan.nextInt();
        if (choice == 1) {
          slime = new Slime();
          System.out.println("A level " + slime.getLevel2() + " slime has appeared! Surely Paimon can beat it right?");
          while (slime.isDead2() == false) {
            System.out.print("Will Paimon attack (1), defend (2), check the slime's stats (3), or check Paimon's stats (4)?: ");
            choice = scan.nextInt();
            System.out.println("------------------------------------------");
            if (choice == 1) {
              paiFist = Paimon.attack3();
              if(paiFist == Paimon.getDmg()*10) {
                System.out.println("Paimon crits for " + paiFist + " health points!");
              } else {
                System.out.println("Paimon attacks for " + paiFist + " health points");
              }
              Slime.getSlap(paiFist);
              if(slime.isDead2() == false) {
                System.out.println();
                Paimon.slapped(Slime.attack2());
              }
              System.out.println("------------------------------------------");
            } else if (choice == 2) {
              slimeLick = Slime.attack2();
              defense = Paimon.defend(slimeLick);
              if (defense == 0) {
                System.out.println("Paimon successfully defended against the attack with her muscles and fat!");
                Paimon.slapped(defense);
              } else {
                System.out.println("Paimon failed to defend against the attack!");
                Paimon.slapped(defense);
              }
              System.out.println("------------------------------------------");
            } else if (choice == 3) {
              System.out.println(Slime.state2());
              System.out.println("------------------------------------------");
            } else if (choice == 4) {
              System.out.println(Paimon.state3());
              System.out.println("------------------------------------------");
            }
          }
          Paimon.LevelUp3(slime.xpGive());
          Paimon.fullHeal();
        } else if (choice == 2) {
          System.out.println("Dvalin has appeared!");
          while (Dvalin.isDead() == false && !Paimon.isDead3()) {
            System.out.print("Will Paimon attack (1), defend (2), check Dvalin's stats (3), or check Paimon's stats (4)?: ");
            choice = scan.nextInt();
            System.out.println("------------------------------------------");
            if (choice == 1) {
              paiFist = Paimon.attack3();
              System.out.println("Paimon attacks for " + paiFist + " health points!");
              Dvalin.takeDamage(paiFist);
              if(Dvalin.isDead() == false) {
                System.out.println();
                Paimon.slapped(Dvalin.attack());
              }
              System.out.println("------------------------------------------");
            } else if (choice == 2) {
              dragonAtk = Dvalin.attack();
              defense = Paimon.defend(dragonAtk);
              if (defense == 0) {
                System.out.println("Paimon successfully defended against the attack with her muscles and fat!");
                Paimon.slapped(defense);
              } else {
                System.out.println("Paimon failed to defend against the attack!");
                Paimon.slapped(defense);
              }
              System.out.println("------------------------------------------");
            } else if (choice == 3) {
              System.out.println(Dvalin.state());
              System.out.println("------------------------------------------");
            } else if (choice == 4) {
              System.out.println(Paimon.state3());
              System.out.println("------------------------------------------");
            }
          }
        } else {
          System.out.println("Input not recongnized. Paimon's brain too smol to comprehend");
        }
      }
      if(Paimon.isDead3() == true) {
        System.out.println("------------------------------------------");
        System.out.println("GAME OVER. PAIMON HAS DIED TO DVALIN THEREFORE ENDING HER BLOODLINE.");
      } else {
        System.out.println("VICTORY! PAIMON SHALL NOW GO ON TO RULE THE WORLD!");
      }
    }
  }

