package homework2;

public class main3 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        try {
            //block of code to monitor for errors
            System.out.println("In try 1");
            errorMethod(nums);
            nums[10] = 25;

            System.out.println("In try2");
        }
        catch (Exception ex){
            //handler for Exception
            System.out.println("In catch");

        }
        System.out.println("Rest of program.");

    }
    public static void errorMethod(int[] nums){
        nums[10] = 25;
    }
}
