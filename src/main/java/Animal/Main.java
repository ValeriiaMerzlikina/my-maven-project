package Animal;

import figur.Circle;
import figur.Shape;
import figur.Square;
import figur.Triangle;
import java.util.Comparator;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Animals [] types = new Animals[10];
        Random random = new Random();

        for (int i = 0; i < types.length; i++) {
            int type = random.nextInt(3);

            int age = random.nextInt(100);
            double weight = random.nextInt(50);


            switch (type) {
                case 0:

                    types[i] = new Cat(age, weight);

                    break;
                case 1:
                    types[i] = new Dog(age, weight);
                    break;

                case 2:
                    types[i] = new Bird(age, weight);
                    break;
            }
        }
        Arrays.sort(types);
        for (Animals a : types)  {
            System.out.println( "Name: " + a.getName() + ", " + " Age:" + a.getAge() + ", " + "Weight:" + a.getWeight() + ", " + " Food need:  " + a.getFoodCalculation() );

        }
        }}

