import java.util.ArrayList;
import java.util.List;

public class IntroMain {

    public static void main(String[] args) {


        // DATA TYPES

        // Primitive Data Types
//        int age = 30124124 ;  //
        long token = 2643 ;
        double price = 19.99 ;

        float rate = 3.14f ;
        short year = 2021 ;

        byte someByte = 120;

        char alpha = 'a';
        boolean isRight = true;

        int a = 4;
        int b = 5;
        //System.out.println(a+ b);

        // Reference Data type
        String name = "Orget" ;
        List<String> someList = new ArrayList<>();
        AbcClass abc = new AbcClass();
        Color color = Color.GREEN;


        // OPERATORS
        // + - * /  %
        System.out.println(
                "5 + 5 --> " + (5 + 5)
        );  //10
        System.out.println(9-1);
        System.out.println(3*3);
        System.out.println(12/3);
        System.out.println(13/3);
        System.out.println(13%3);

        System.out.println(3+3 == 6);
        System.out.println(3+3 != 6);

        int age = 25;
        boolean hasDrivingLicense = false;
        System.out.println("Is able to drive ? --->" + (age>18 && hasDrivingLicense));

        boolean hasBooked = true;
        int amountToSpent = 750;
        System.out.println("Will get a table ? --->" + (amountToSpent>=700 || hasBooked));
        System.out.println("Will get a table ? --->" + (amountToSpent>=700 && hasBooked));

        System.out.println(age);
        age++;
        System.out.println(age);
        age = 24;
        age--;
        System.out.println(age);






    }

}
