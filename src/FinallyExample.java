import java.util.*;
public class FinallyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        try{
            int result = 100/num;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Number should not be 0");
        }
        finally {
            System.out.println("Division operation is complete.");
        }
    }
}
