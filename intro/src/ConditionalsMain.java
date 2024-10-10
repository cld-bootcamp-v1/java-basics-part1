public class ConditionalsMain {

    public static void main(String[] args) {

        int age = 45;
        boolean isGreek = true;
        int amount;

        // less tha 20  -> 800
        // more than 20 nad less 35 --> 1500
        // older than 35 ->2000

        // if else statement
        if (isGreek) {
            if (age < 20 ) {
                amount = 800;
            } else if (age >= 20 && age < 35) {
                amount = 1500;
            } else {
                amount = 2000;
            }
        } else {
            amount = 500;
        }
        //System.out.println(amount);


        // switch statement

        // editor -> edit_only
        // admin  -  full
        // viewer -> view_only
        // guest ->  view_only
        String userRole = "asfdasf";

        switch (userRole){
            case "admin":
                System.out.println("Full access");
                break;
            case "editor":
                System.out.println("Edit Only access");
                break;
            case "viewer":
            case "guest":
                System.out.println("View_only access");
                break;
            default:
                System.out.println("Role is Invalid");
        }


        // ternary operator;
        int number = 6;
        // result = (expression) ? resultIfTrue : resultIfFalse
        String result = (number % 2 ==0) ? "Even" : "Odd";
        System.out.println(result);






    }
}
