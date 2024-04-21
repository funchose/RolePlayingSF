public class Player extends Character{
    public int experience;
    public int gold;
    public int level = 1;

    public Player (String name, int hp, int agility, int strength) {
        this.name = name;
        this.hp = hp;
        this.agility = agility;
        this.strength = strength;
        experience = 0;
        gold = 0;
    }
    public void printStats() {
        System.out.println(this.name + ", your stats are:");
        System.out.println("HP: " + this.hp + ", EXP: " + this.experience + ", Level: " + this.level + ", Gold: " + this.gold);
    }
    public void levelUp() {
        /*
            1 - 0
            2 - 1 000
            3 - 2 000
            4 - 5 000
            5 - 10 000
            6 - 15 000
            7 - 20 000
            8 - 30 000
            9 - 40 000
            10 - 50 000
        */
        if (level == 1 && experience >= 1000 && experience < 2000) {
            level = 2;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 2 && experience >= 2000 && experience < 5000) {
            level = 3;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 3 && experience >= 5000 && experience < 10000) {
            level = 4;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 4 && experience >= 10000 && experience < 15000) {
            level = 5;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 5 && experience >= 15000 && experience < 20000) {
            level = 6;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 6 && experience >= 20000 && experience < 30000) {
            level = 7;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 7 && experience >= 30000 && experience < 40000) {
            level = 8;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 8 && experience >= 40000 && experience < 50000) {
            level = 9;
            System.out.println("Congratulations! Level's up! Now your level is " + level);
        }
        else if (level == 9 && experience >= 50000) {
            level = 10;
            System.out.println("Congratulations! Level's up! Now your level is " + level + "\nYou've reached the maximum level!");
        }
    }
}
