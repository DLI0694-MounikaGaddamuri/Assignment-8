import java.util.*;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String str){
        super(str);
    }
}
public class ThrowingException {

    public static void withDraw(int amount,int balance) throws InsufficientFundsException{
         if(amount>balance)
             throw new InsufficientFundsException("Insufficient balance!");
        System.out.println(balance-amount);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance=1000;
        System.out.println("Enter amount to withdraw:");
        int amount=input.nextInt();
        try{
            withDraw(amount,balance);
        }catch(InsufficientFundsException e){
            System.out.println(e);
        }
    }
}
