package PolicyApplicationProcess;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

class PoorDrivingRecordException extends Exception{
    PoorDrivingRecordException(String message){
        super(message);
    }
}

class HealthIssueException extends Exception{
    HealthIssueException(String message){
        super(message);
    }
}

public class PolicyApplication {

    public static boolean isValidAge(int age) throws InvalidAgeException{

        if(age>18)
            return true;
        throw new InvalidAgeException("Invalid Age!!");
    }

    public static boolean isValidDrivingHistory(boolean poorDrivingHistory) throws PoorDrivingRecordException{
        if(poorDrivingHistory)
            throw new PoorDrivingRecordException("Poor Driving History!!");

        return false;
    }

    public static boolean isAnyHealthIssue(boolean is_health_issue) throws HealthIssueException{
        if(is_health_issue)
            throw new HealthIssueException("Poor Driving History!!");

        return false;
    }

    public static void main(String[] args) {
        try {
            System.out.println(isValidAge(20));
            System.out.println(isAnyHealthIssue(false));
            System.out.println(isValidDrivingHistory(true));
        }catch(InvalidAgeException e){
            System.out.println(e);
        }
        catch(PoorDrivingRecordException e){
            System.out.println(e);
        }
        catch(HealthIssueException e){
            System.out.println(e);
        }
    }
}
