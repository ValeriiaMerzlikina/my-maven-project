package collections;

import java.util.HashSet;
import java.util.Set;


public class Plant {
    public static <Iterator> void main(String[] args) {

        HashSet<String> plants = new HashSet<>();

        Set<String> set = new HashSet<String>();

        plants.add("Арбуз");

        plants.add("Банан");

        plants.add("Вишня");

        plants.add("Груша");

        plants.add("Дыня");

        plants.add("Ежевика");

        plants.add("Жень-шень");

        plants.add("Земляника");

        plants.add("Ирис");

        plants.add("Картофель");

        for (String plant : plants) {
            System.out.println(plant);
        }
    }

    }
