import java.util.Random;
import java.util.Scanner;
public class Game {
    Player player;
    public Game() {
        System.out.println("Welcome to the Role Playing Game!\nPlease, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Player player = new Player(name, 1000, 30, 50);
        this.player = player;
        player.printStats();
        System.out.println("""
        What would you like to do? Please, enter a number of an option.
        Your options are:
        1. Go the deep forest
        2. Go to the merchant
        3. View stats
        4. Go to the exit""");

        String option = scanner.nextLine();
        makeChoice(option);
        while (true) {
            System.out.println("""
            Choose your next move:
            1. Continue fight/trade
            2. Go back to the town
            3. View stats""");
            String option2 = scanner.nextLine();
            switch (option2) {
                case "1":
                    makeChoice(option);
                    break;
                case "2":
                    System.out.println("""
                    Where would you like to go? Please, enter a number of an option.
                    Your options are:
                    1. To the deep forest
                    2. To the merchant
                    3. To the exit""");
                    option = scanner.nextLine();
                    makeChoice(option);
                    break;
                case "3":
                    player.printStats();
                    break;
            }

        }
    }
    public void makeChoice(String option) {
        try {
            switch (option) {
                case "1":
                    Random random = new Random();
                    int num = random.nextInt(100);
                    if (num <= 50) {
                        System.out.println("You are starting to fight with a skeleton!");
                        Skeleton skeleton = new Skeleton("skeleton", random.nextInt(1500), random.nextInt(20), random.nextInt(10));
                        Fight fight = new Fight(this.player, skeleton);
                        fight.start();
                        fight.join();
                    } else {
                        System.out.println("You are starting to fight with a goblin!");
                        Goblin goblin = new Goblin("goblin", random.nextInt(1500), random.nextInt(25), random.nextInt(15));
                        Fight fight = new Fight(this.player, goblin);
                        fight.start();
                        fight.join();
                    }
                    break;
                case "2":
                    System.out.println("What would you like to buy?");
                    System.out.println("1. Small potion (Price: " + Merchant.smallPotionPrice + ", HP restored: " + Merchant.smallPotionHP + ")");
                    System.out.println("2. Medium potion (Price: " + Merchant.mediumPotionPrice + ", HP restored: " + Merchant.mediumPotionHP + ")");
                    System.out.println("3. Large potion (Price: " + Merchant.largePotionPrice + ", HP restored: " + Merchant.largePotionHP + ")");
                    Scanner scanner = new Scanner(System.in);
                    String tradeOption = scanner.nextLine();
                    switch (tradeOption) {
                        case "1":
                            if (player.gold >= Merchant.smallPotionPrice) {
                                player.gold -= Merchant.smallPotionPrice;
                                player.hp += Merchant.smallPotionHP;
                            }
                            else {
                                System.out.println("You don't have enough gold!");
                            }
                            break;
                        case "2":
                            if (player.gold >= Merchant.mediumPotionPrice) {
                                player.gold -= Merchant.mediumPotionPrice;
                                player.hp += Merchant.mediumPotionHP;
                            }
                            else {
                                System.out.println("You don't have enough gold!");
                            }
                            break;
                        case "3":
                            if (player.gold >= Merchant.largePotionPrice) {
                                player.gold -= Merchant.largePotionPrice;
                                player.hp += Merchant.largePotionHP;
                            }
                            else {
                                System.out.println("You don't have enough gold!");
                            }
                            break;
                    }
                    break;
                          case "4":
                            System.out.println("See you later, " + player.name + "!");
                            System.exit(0);

            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
