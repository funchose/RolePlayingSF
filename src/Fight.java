public class Fight implements Runnable {


    @Override
    public void run() {

    }
    public Fight(Player player, Monster monster) {
        int move = 0;
        int experienceWon = monster.hp;
        while (player.hp > 0 && monster.hp > 0) {
            move++;
            System.out.println("Move: " + move);
            monster.beingUnderAttack(player.attack());
            player.beingUnderAttack(monster.attack());
            System.out.println("Your HP: " + player.hp + "\n" + monster.name +"'s HP: " + monster.hp);
        }
        if (player.hp <= 0) {
            System.out.println("You died!");
            System.exit(0);
        }
        else {
            System.out.println(monster.name + " is defeated!");
            player.experience += experienceWon;
            player.gold += experienceWon / 100;
        }
    }
}
