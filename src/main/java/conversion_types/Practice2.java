package conversion_types;

public class Practice2 {
    public static void main(String[] args) {

        new Task1().run();
        new Task2().run();
        new Task3().run();
        new Task4().run();
    }
    }
    class Task1 {
    public  void run() {
        int q = 16;
        int w = 6;

        int result = q / w;
        int remainder = q % w;

        System.out.println("Result is " + result + " and remainder is " + remainder );
    }
        }

    class Task2 {
        public void run() {

            int n = 26;
            int result = n/10 + n%10;

            System.out.println("Result is " + result);
        }
    }

    class Task3 {
    public void run() {
        double n = 3.14;
        int result = (int) n;

        System.out.println("Result is " + result);
    }
    }

    class  Task4 {
        public void run() {
            int a = 3;
            int b = 5;
            int c = 7;

            int originalA = a;
            int originalB = b;
            int originalC = c;

            a = originalA + originalB;
            b = originalC - originalA;
            c = originalA + originalB + originalC;

            System.out.println("Result of a = " + a + ", result of b = " + b + ", result of c = " + c);

        }
        }
