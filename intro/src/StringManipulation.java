public class StringManipulation {
    public static void main(String[] args) {
        //1
        String name = "kalimera";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);

        //2
        String str = "KaLimerA";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        //3
        StringBuilder string1 = new StringBuilder("anna");
        StringBuilder stringRev = new StringBuilder(string1).reverse();

        String original = string1.toString();
        String reversed = stringRev.toString();



        if (original.equals(reversed)){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Is not palindrome");
        }


        //4
        String str1 = "kala esy";

        System.out.println(str1.replace(" ", "_"));

        //5
        char a = 'a';
        count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch == a){
                count++;
            }
        }
        System.out.println(count);

        //6
        String example = "xxxxxxxxxxxxabcxxxxxxxx";
        System.out.println(example.substring(12,15));


        //7
        if (name.indexOf("a") != 0) {
            System.out.println("The first occurrence of '" + a + "' is at index: " + name.indexOf("a"));
        } else {
            System.out.println("Character '" + a + "' not found in the string.");
        }

        //8
        String st1 = "Geia";
        String st2 = "Sou";

        StringBuilder sb = new StringBuilder();
        sb.append(st1);
        sb.append(st2);
        String finalString = sb.toString();
        System.out.println(finalString);

        //9
        sb.append(" Mike");
        System.out.println("After append: " + sb);

        // Insert operation: Insert a string at a specific index
        sb.insert(7, ",");
        System.out.println("After insert: " + sb);

        // Delete operation: Remove a substring between two indices
        sb.delete(7, 8);  // Removes the comma we just inserted
        System.out.println("After delete: " + sb);

        // Reverse operation: Reverse the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);

    }
}
