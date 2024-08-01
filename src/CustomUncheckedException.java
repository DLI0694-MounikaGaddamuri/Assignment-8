import java.util.*;
class NegativeNumberException extends Exception{
    public NegativeNumberException(String str){
        super(str);
    }
}
public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        try{
            if(number<0)
                throw new NegativeNumberException("Enter positive number.");
            System.out.println("Done!");
        }catch(NegativeNumberException e){
            System.out.println(e);
        }
    }
}
