package reference_types_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        new Task1().run();
        new Task2().run();
        new Task3().run();
    }
}
    class Task1 {
        public void run() {

            String s = "This is a string. My first string";

            char firstSymbol = s.charAt(0);
            char lastSymbol = s.charAt(32);
            char mediumSymbol = s.charAt(16);

            String sParts = s.substring(0, s.length() - 16);

            int spaces = s.length() - s.replace(" ", "").length(); // "Также предусмотрите вывод количества пробелов." эта часть далась сложно

            System.out.println("First symbol is " + firstSymbol);
            System.out.println("Last symbol is " + lastSymbol);
            System.out.println("Medium symbol is " + mediumSymbol);
            System.out.println(sParts);
            System.out.println("Count of spaces is " + spaces);

        }
         }
        class Task2 {
            public void run() {

                Scanner s = new Scanner(System.in);

                System.out.print("Enter string: ");
                String originalString = s.nextLine();

                System.out.print("Enter substring to replace: ");
                String subString = s.nextLine();

                System.out.print("Add string: ");
                String addString = s.nextLine();

                String newString = originalString.replace(subString, addString);

                System.out.println(newString);
            }
            }

class Task3 {
    public void run() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter some words: ");
        String line = s.nextLine();

        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));

        String max = words[0]; // сделала эту часть после ознакомления с Массивами
        for (int i =1; i<words.length;i++) {
            if (words[i].length()>max.length())
                max = words[i];
        }
        System.out.println("The longest word is: " + max);
    }

        }

