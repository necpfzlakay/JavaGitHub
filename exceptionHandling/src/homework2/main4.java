package homework2;

public class main4 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        try {
            //block of code to monitor for errors
            System.out.println("In try 1");
            nums[10] = 25;

            System.out.println("In try2");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("In catch 1");
        }
        catch (Exception ex){
            //handler for Exception
            System.out.println("In catch 2");

        }

        System.out.println("Rest of program.");

    }
}
