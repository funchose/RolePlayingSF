import java.util.Random;
import java.util.Scanner;

public class Game {
    public Game() {
        Player player = new Player("Alex", 1000, 30, 20);
        Skeleton skeleton = new Skeleton("skeleton", 1200, 10, 5);
        Goblin goblin = new Goblin("goblin", 1500, 20, 50);


        System.out.println("Greetings! Your stats are:");
        System.out.println("HP: " + player.hp + ", EXP: " + player.experience);
        System.out.println("""
        Where would you like to go? Please, enter a number of an option.
        Your options are:
        1. To the deep forest
        2. To the merchant
        3. To the exit""");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        makeChoice(option);
        while (true) {
            System.out.println("""
            Choose your next move:
            1. Go back to the town
            2. Continue fight/trade""");
            String option2 = scanner.nextLine();
            switch (option2) {
                case "1":
                    System.out.println("""
                    Where would you like to go? Please, enter a number of an option.
                    Your options are:
                    1. To the deep forest
                    2. To the merchant
                    3. To the exit""");
                    option = scanner.nextLine();
                    makeChoice(option);
                    break;
                case "2":
                    makeChoice(option);
                    break;

            }

        }
    }

    private static void makeChoice(String option) {
        switch (option) {
            case "1":
                Random random = new Random();
                int num = random.nextInt(100);
                if (num <= 50) {
                    System.out.println("You are starting to fight with a skeleton!");
                    //fight logic
                } else {
                    System.out.println("You are starting to fight with a goblin!");
                    //fight logic
                }
                break;
            case "2":
                System.out.println("The merchant is not yet at work!");
                break;
            case "3":
                System.out.println("See you later!");
                System.exit(0);
        }
    }
}
