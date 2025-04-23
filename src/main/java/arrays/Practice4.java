package arrays;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        int[] numbers = initializeArray();
    }

    public static int[] initializeArray() {

        int[] numbers = new int[20];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any numbers: ");

        for (int i =0; i<numbers.length; i++) {
            numbers[i] = s.nextInt();
        }

        for (int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        return numbers;



    }


//        int[] list = new int[20];
//
//        for(int i =0; i<list.length; i++) {
//            list[i] = i;
//            System.out.println(list[i]);
//        }


    }