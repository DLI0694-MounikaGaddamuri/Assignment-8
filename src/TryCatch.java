import java.util.*;
public class TryCatch {
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

    }
}