import java.util.*;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            int num1=input.nextInt();
            System.out.println("Enter second number: ");
            int num2=input.nextInt();
            while(num1>0){
                if(!(num1%10 >=0 && num1%10<=9))
                    throw new InputMismatchException("Not an integer!");
                num1/=10;
            }
            while(num2>0){
                if(!(num2%10 >=0 && num2%10<=9))
                    throw new InputMismatchException("Not an integer!");
                num1/=10;
            }
            try{
                if(num2==0)
                    throw new ArithmeticException("Number should not be 0");
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }



    }
}
