import java.sql.SQLOutput;

public class StringsMain {

    public static void main(String[] args) {
        // STRINGS
        String name = "Orget";

        String hw = "Hello, world";
        System.out.println(hw.toLowerCase());
        System.out.println(hw.toUpperCase());
        System.out.println(hw.length());
        System.out.println(hw.charAt(0));
        System.out.println(hw.charAt(hw.length()-1));
        System.out.println(hw == new String("Hello, world"));
        System.out.println(hw.equals(new String("Hello, world")));
        System.out.println(hw.equals("Hello, world"));
        System.out.println(hw.substring(2,9)); //llo, wo
        System.out.println(hw.substring(2)); //llo, world
        System.out.println(hw.indexOf(","));
        System.out.println(hw.indexOf("world"));
        System.out.println(hw.replace("world", "java"));
        String newString = "abc    ";
        System.out.println(newString + hw);
        System.out.println(newString.trim() + hw);
        System.out.println("abc" + hw + "de".concat("fgh").concat("ij"));


        StringBuilder sb = new StringBuilder();
        sb.append("ab");
        sb.append("cd");
        String finalString = sb.toString();

//        String finalString = "ab";
//        finalString = finalString + "cd";
        System.out.println(finalString);
    }
}
