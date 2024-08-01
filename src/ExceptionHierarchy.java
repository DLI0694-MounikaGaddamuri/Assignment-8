import java.util.*;
public class ExceptionHierarchy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            int num1=input.nextInt();
            int result = 50/num1;
            System.out.println(result);
            //input.nextLine();
            String str=null;
            System.out.println(str.length());

        }
        catch(ArithmeticException e){
            System.out.println("Number should not be 0.");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
