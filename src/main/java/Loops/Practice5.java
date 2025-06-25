package Loops;
import arrays.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
       new Task1().run();
        new Task2().run();
        new Task3().run();
         new Task4().run();
         new Task5().run();
         new Task6().run();
         new Task7().run();

    }
}
class Task1 {
    public void run() {

        int[] numbers = new int [2];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        for (int i = 0; i <numbers.length; i++){
           numbers[i] = s.nextInt();
        }

        int min = numbers[0];
        for (int i = 0; i <numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        System.out.println("Minimum is: " + min);
    }}

    class Task2 { //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        public void run() {

            int[] numbers = new int[4];
            Scanner s = new Scanner(System.in);

            System.out.println("Enter 4 numbers:");
            for (int i = 0; i <numbers.length; i++){
                numbers[i] = s.nextInt();
            }

            int max = numbers[0];

            for (int i =0; i<numbers.length; i++){
                max =Math.max(max,numbers[i]);
            }
            System.out.println("Maimum number is: " + max);
        }
        }
    class Task3 { // Ввести с клавиатуры три числа, и вывести их в порядке убывания.
           public void run() {

               int[] numbers = new int[3];
               Scanner s = new Scanner(System.in);

               System.out.println("Enter 3 numbers: ");
               for (int i=0; i<numbers.length;i++){
                   numbers[i] =s.nextInt();
               }

               for (int i=numbers.length-1; i>=0; i--){
                   System.out.println(numbers[i]);
               }
    }
    }

    class Task4 { // Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    // Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».

    public void run() {
        String[] name1 = new String[1];
        String[] name2 = new String[1];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first name: ");
        for (int i = 0; i < name1.length; i++) {
            name1[i] = s.nextLine();
        }

        System.out.println("Enter second name: ");
        for (int i = 0; i < name2.length; i++) {
            name2[i] = s.nextLine();
        }

        if (name1[0].equals(name2[0])) {
            System.out.println("Имена идентичны");
        } else if (name1[0].length() == name2[0].length()) {
            System.out.println("Длины имен равны");
        }
    }
    }

    class Task5{ // Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public void run(){

        int[] age = new int[1];
        String[] name = new String[1];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name: ");
        for (int i = 0; i < name.length; i++) {
            name[i] = s.nextLine();
        }
        System.out.println("Enter age: ");
        for (int i = 0; i < age.length; i++) {
            age[i] = s.nextInt();
        }

        if (age[0]<18) {
            System.out.println("Подрасти еще");
        }
    }
    }

class Task6{ //Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public void run(){
        int[] age = new int[1];
        String[] name = new String[1];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name:");
        for (int i=0; i<name.length; i++){
            name[i] = s.nextLine();
        }

        System.out.println("Enter age:");
        for (int i=0; i<age.length; i++){
            age[i] = s.nextInt();
        }
        if (age[0]>20){
            System.out.println("И 18-ти достаточно");
        }
    }
}

class Task7{ // За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    // Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
    // Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
    public void run(){


        Random random = new Random();
        int secret = random.nextInt(20 + 1);  // что значит 20 +1, почему не 21

        Scanner s = new Scanner(System.in);

        boolean success = false; // не сразу поняла что нужно создать переменную для "Не угадал"

        for (int i=1; i<=7; i++){
            System.out.println("Enter number. Its your " + i +" try:");
            int guess = s.nextInt();


        if (guess == secret){
            System.out.println("Угадал");
            break;
        } else if (guess<secret) {
            System.out.println("Мало");
        } else if (guess >secret) {
            System.out.println("Много");
        }
    }
        if (success!= true){
            System.out.println("Не угадал");
        }

    }}



