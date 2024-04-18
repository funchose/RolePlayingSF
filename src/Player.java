public class Player extends Character{
    public int experience;
    public int gold;

    public Player (String name, int hp, int agility, int strength) {
        this.name = name;
        this.hp = hp;
        this.agility = agility;
        this.strength = strength;
        experience = 0;
        gold = 0;
    }
}
