package Loops;
import arrays.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) throws InterruptedException {
       new Task1().run();
        new Task2().run();
        new Task3().run();
         new Task4().run();
         new Task5().run();
         new Task6().run();
         new Task7().run();
       new Task8().run();
        new Task9().run();
         new Task10().run();
        new Task11().run();
        new Task12().run();
        new Task13().run();
        new Task14().run();
          new Task15().run();
        // new Task16().run(); СПРОСИТЬ КАК ДОДЕЛАТЬ
        new Task17().run();
        new Task18().run();

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

class Task8{ // Вывести на экран числа от 1 до 10, используя цикл while.
    public void run(){
        int i = 0;
        while (i<=10) {
            System.out.println(i);
            i++;
        }

    }
}
class Task9{ // Вывести на экран числа от 10 до 1, используя цикл while.
    public void run(){
        int i =10;
        while (i>=1) {
            System.out.println(i);
            i--;
        }}
}
class Task10{ // Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
    // Пример ввода: абв 2 Пример вывода: абв абв
    public void run(){

  int number;
  String line ;
  Scanner s = new Scanner(System.in);

  System.out.println("Enter any line:");
      line = s.nextLine();

  System.out.println("Enter number:");
        number = s.nextInt();

        int i=0;
        while (i<number) {
      System.out.println(line);
      i++;
  }}
}

class Task11{  // Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
    public void run(){

        char letter = 'S';
        int length =10;
        int height =10;

        int i=0;
        while (i<height){
            int a=0;
                while (a<length){
                    System.out.print(letter);
                    a++;
                }
                System.out.println();
                i++;
            }}
    }
class Task12{ // Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
    public void run(){

        int i =1;
        while (i<=10) {
            int a =1;

            while (a<=10) {

                System.out.print(i * a + " ");
                a++;
            }
            System.out.println();
            i++;
            }
        }
    }
 class Task13{
    public void run() {
        for (int i = 2; i<=100; i+=2) {
            System.out.println(i);
        }}
 }

class Task14{ // Ввести с клавиатуры два числа m и n.
    // Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

    public void run() {

        int m = 3; // высота
        int n = 5; // длина строки

        for (int i=0; i<m;i++) {
        for (int a=0; a<n; a++){
            System.out.print(8);
        }
        System.out.println();
        }}
}

class Task15{ //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    public void run() {

   // i - высота, a - длина строки
        for (int i=1; i<=10;i++) {
            for (int a=1; a<i+1; a++){
                System.out.print(8);
    }
            System.out.println();
        }}
}

class Task16{ //Используя цикл for вывести на экран:  горизонтальную линию из 10 восьмёрок
    //вертикальную линию из 10 восьмёрок.
    public void run() {
// i - высота, a - длина строки
        for (int i=1; i<=10;i++) {
            System.out.print(8);}
        System.out.println();
            for (int a=1; a<=10; a++) {
                System.out.print(8);
            }}
} // Не получилось

class Task17{ //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    public void run() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name;
        name = s.nextLine();

            for (int a =0; a<=10;a++) {
           System.out.println(name + " любит меня");
            }
        }}

class Task18{ // Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
    // Программа должна уменьшать число 10 раз в секунду.
    // Для того чтобы вставить в программу задержку, воспользуйся функцией: Thread.sleep(100); //задержка на одну десятую секунды.
    public void run() throws InterruptedException {

        for (int i=30; i>=0;i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Бум!");

    }
}


