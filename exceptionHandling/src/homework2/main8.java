package homework2;

public class main8 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        try {
            // block of code to monitor for errors
            nums[10] = 25;
        }catch (ArithmeticException ex){
            // handler for Exception
            System.out.println("In exception");
            return;
        }
        //..

        finally {
            //  finally code
            System.out.println("Finally block");
        }


    }


}
