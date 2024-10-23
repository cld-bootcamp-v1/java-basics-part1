public class ConditionalStatements {
    public static void main(String[] args) {
        //1
        int a = 2;
        int b = 5;
        int c = 4;
        int max = a;

        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.println("largest number is: " + max);

        //2
        int score = 74;
        char grade;
        if (score <= 59){
            grade = 'F';
        } else if (score <= 69) {
            grade = 'D';
        } else if (score <= 79) {
        grade = 'C';
        } else if (score <= 89) {
            grade = 'B';
        }else  {
            grade = 'A';
        }
        System.out.println("Your grade is: " + grade);

        //3
        int num = 0;
        if (num >0) {
            System.out.println("Positive");
        } else if (num <0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

        //4
        String day = "Monday";

        switch (day){
            case "Sunday":
                System.out.println("1");
                break;
            case "Monday":
                System.out.println("2");
                break;
            case "Tuesday":
                System.out.println("3");
                break;
            case "Wednesday":
                System.out.println("4");
                break;
            case "Thursday":
                System.out.println("5");
                break;
            case "Friday":
                System.out.println("6");
                break;
            case "Saturday":
                System.out.println("7");
                break;
            default:
                System.out.println("Day is Invalid");
        }

        //5
        int number = 4;
        String result = (number % 2 ==0) ? "Even" : "Odd";
        System.out.println(result);

        //6
        String type = "Current";

        switch (type) {
            case "Savings":
                System.out.println("2%");
                break;
            case "Current":
                System.out.println("3%");
                break;
            case "Fixed Deposit":
                System.out.println("4%");
                break;
            default:
                System.out.println("Type is Invalid");
        }

        //7
        int age = 17;

        if (age >= 18) {
            System.out.println("You can vote!! ");
        }else {
            System.out.println("You are too young!! ");
        }

        //8
        int number1 = 4;
        int number2 = 6;
        String res = (number1 > number2) ? String.valueOf(number1) : String.valueOf(number2);
        System.out.println(res);

        //9
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If none of the above, just print the number
            else {
                System.out.println(i);
            }
        }

        //10
        String color = "Yellow";

        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Caution");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Color is Invalid");
        }

    }
}
