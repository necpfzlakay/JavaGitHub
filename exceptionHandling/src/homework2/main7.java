package homework2;

public class main7 {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw");
           throw new ArithmeticException();
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
    }
}
