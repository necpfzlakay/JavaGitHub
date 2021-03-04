package necipfazilakay;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is Animals Application
 * it is doing that creating animals and listing their informations and their behaviours.
 *
 * @author Necip Fazıl Akay
 * @since 2021-01-26
 * @version 1.0.0
 */
public class Main {

    /**
     * This is our main method.
     * it is using scanner and Arraylist libraries
     * in this part, application takes input from user, for animals' information
     * also it is using try catch Exception
     * and it is using foreach loop for printing animal's toString func
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Animal> Animals= new ArrayList<>();

        /**
         * here is our try catch func
         * it is taking information via scanner
         * creates animal objects and adding the Annimals ArrayList
         */
        try {
            System.out.println("Please enter Cow's informations (age, height,weight)");
            Animals.add( new Cow(scan.nextInt(), scan.nextInt(), scan.nextInt()));
            System.out.println("Please enter Lion's informations (age, height,weight)");
            Animals.add( new Lion(scan.nextInt(), scan.nextInt(), scan.nextInt()));
            System.out.println("Please enter second Lion's informations (age, height,weight)");
            Animals.add( new Lion(scan.nextInt(), scan.nextInt(), scan.nextInt()));


        }catch (InputMismatchException e){
            System.err.println("ERROR! information should be integer" + e);
        }

        /**
         * this foreach loop is printing objects
         */
        for (Object a: Animals ) {
            System.out.println(a);
        }


    }
}
