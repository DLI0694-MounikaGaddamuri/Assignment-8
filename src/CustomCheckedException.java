import java.util.*;
class InvalidAgeException extends Exception{

    public InvalidAgeException (String str)
    {
        super(str);
    }
}
public class CustomCheckedException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        try {
            if (age < 18)
                throw new InvalidAgeException("Not Eligible. Under 18");
            System.out.println("Eligible");
        }catch(InvalidAgeException e){
            System.out.println(e);
        }

    }
}
