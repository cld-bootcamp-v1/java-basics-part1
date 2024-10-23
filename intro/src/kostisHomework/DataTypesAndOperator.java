package kostisHomework;

public class DataTypesAndOperator {
    public static void main(String[] args) {

        //1
        int first = 3;
        int scnd = 4;

        System.out.println( first + scnd);

        //2
        double radius = 5.14;
        double result = Math.PI * Math.pow(radius, 2);
        System.out.println("Area = " + result);

        //3
        int number = 4;
        String res = (number % 2 ==0) ? "Even" : "Odd";
        System.out.println(res);

        //4
        double lenght = 4.12;
        double width = 12.3;

        double area = lenght * width;

        System.out.println(area);

        //5
        double celcius = 24.5;

        double far = (celcius * 9/5) + 32;

        System.out.println(far);

        //6
        int age = 15;
        boolean citizen = true;
        int yearsOfRes = 5;

        if((age >= 18 && citizen) || yearsOfRes >= 6){
            System.out.println("You can vote!!");
        }else {
            System.out.println("Go away");
        }

        //7
        int num = 3;

        if(num < 5){
            num++;
            System.out.println("Num incr: "+ num);
        } else if (num > 5) {
            num--;
            System.out.println("Num decr: " +num);
        }

        //8
        int num1 = 2;
        int num2 = 2;
        int max;

        if(num1 > num2){
            max = num1;
            System.out.println("Max: " + max);
        } else if (num1 < num2) {
            max = num2;
            System.out.println("Max: " + max);
        } else if (num1 == num2) {
            System.out.println("Numbers are equal.");
        }

    }
}
