package primitive_types;

import java.util.Scanner;


public class Practice1 {
    public static void main (String[] args) {
        System.out.println("Hello World!");
        printHelloName();
    }

    public static void printHelloName() {
    Scanner scanner = new Scanner(System.in);
       System.out.println("Input your name ");
       String name = scanner.nextLine();

       System.out.println("Hello " + name);
    }
}
