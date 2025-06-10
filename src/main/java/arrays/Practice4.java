package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        new Task1().run();
        new Task2().run();
        new Task3().run();
        new Task4().run();
        new Task5().run();
    }
}

 class Task1 {
    public void run() {
        int[] numbers = initializeArray();
    }

    public static int[] initializeArray() {
        int[] numbers = new int[20];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("The max number is: " + max);
        return numbers;
    }
}

 class Task2 {
    public void run() {
        String[] line = new String[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 10 lines: ");
        for (int i = 0; i < line.length; i++) {
            line[i] = s.nextLine();
        }

        System.out.println("Строки");
        for (int i = line.length - 1; i >= 0; i--) {
            System.out.println(line[i]);
        }
    }
}
 class Task3 {
    public void run() {
        String[] lines = new String[10];
        int[] numbers = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 10 lines: ");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = s.nextLine();
        }

        for (int i = 0; i < lines.length; i++) {
            numbers[i] = lines[i].length();
        }

        System.out.println(String.join(",", lines));

        for (int i = 0; i < numbers.length; i++) { // вывела длину строк из массива, не получилось вывести индекс каждой строки
            System.out.println(numbers[i]);
        }

    }
}

 class Task4 {
    public void run() {
        int[] numbers = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.println("Reversed:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

 class Task5 {
    public void run() {
        int[] big = new int[20];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 20 numbers: ");
        for (int i = 0; i < big.length; i++) {
            big[i] = s.nextInt();
        }

        int[] small1 = Arrays.copyOfRange(big, 0, 10);
        int[] small2 = Arrays.copyOfRange(big, 10, 20);

        System.out.println("Second small array: ");
        for (int number : small2) {
            System.out.println(number);
        }
    }
}
