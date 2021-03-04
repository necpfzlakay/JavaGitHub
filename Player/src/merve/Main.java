package merve;
import java.util.Random;
import java.util.Scanner;

/**
 * Singleton Player guess application
 * this application takes an integer from user and if estimated number match the random created number
 * player earns 100 point
 * @author Merve Cilengir
 */
public class Main {
    /**
     * this is Main
     * it calls random, scanner and player classes and sets player's information
     * if else conditions maintains the game
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        /**
         * in here singleton object is calling
         */
        Player player = Player.getInstance();



        /**
         * this while contidion uses if else blocks
         * at first takes a random integer from random class
         * then takes an integer too via player,
         * than checks both of them and if they are same integer
         * player's score increases 100 point
         * if player writes -999 while loop breaks so game overs.
         */
        while (true){
            // in here, program is checking that is random number between 1-20
            int randomInt = random.nextInt(21);
            while(true){
                if (randomInt != 0)
                    break;
                randomInt = random.nextInt(21);
            }


            System.out.print("please guess the correct intager - range(1-20) for quit write -999");
            int guess = scanner.nextInt();
            // if player types -999 this condition works and game ends
            if (guess == -999){
                System.out.println( player.toString());
                break;
            }

            // this condition checking is the number between 1-20
            if (guess <= 0 || 20 < guess){
                System.out.println("estimated number must be between 1 and 20!");
                continue;

            }
            // if random integer and estimated integer is same, this condition works and player earns 100 point
            if (guess == randomInt){
                player.setScore( player.getScore()+100  );
                System.out.println("correct!\n");
            }
            else {
                System.out.println("Incorrect!");
            }

        }

    }
}
