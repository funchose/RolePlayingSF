import java.util.Random;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int agility; // 1 - 100
    protected int strength; // 1 - 100

    public int attack() {
        Random random = new Random();
        int num = random.nextInt(100);
            if (agility * 3 >= num){
                if (num <= 10) {
                    return strength * 2;
                }
                else {
                    return strength;
                }
            }
            else {
                return 0;
            }
    }
    public void beingUnderAttack(int damage) {
        this.hp -= damage;
    }
}
