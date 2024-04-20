public class Fight extends Thread {
    Player player;
    Monster monster;
    int move = 0;
    int experienceWon;

    @Override
    public void run() {
        while (player.hp > 0 && monster.hp > 0 && (!interrupted())) {
            move++;
            System.out.println("--- Move: " + move + " ---");
            monster.beingUnderAttack(player.attack());
            player.beingUnderAttack(monster.attack());
            System.out.println("Your HP: " + player.hp + "\n" + monster.name +"'s HP: " + monster.hp);
        }
        if (player.hp <= 0) {
            System.out.println("You died!");
            interrupt();
            System.exit(0);
        }
        else {
            System.out.println(monster.name + " is defeated!");
            player.experience += experienceWon;
            player.gold += experienceWon / 10;
            player.levelUp();
            interrupt();
        }
    }
    public Fight(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
        this.experienceWon = monster.hp;
    }
}
