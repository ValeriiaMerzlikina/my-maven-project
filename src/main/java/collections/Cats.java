package collections;

import java.util.HashMap;
import java.util.Map;

public class Cats {


            static class Cat {
                private String name;

                public Cat(String name) {
                    this.name = name;
                }

                public String toString() {
                    return name;
                }
            }

            public static void main(String[] args) {
                Map<String, Cat> cats = new HashMap<>();


                cats.put("Cat1", new Cat("Петя"));

                cats.put("Cat2", new Cat("Сима"));

                cats.put("Cat3", new Cat("Кама"));

                cats.put("Cat4", new Cat("Карамелька"));

                cats.put("Cat5", new Cat("Дынька"));

                cats.put("Cat6", new Cat("Арбузик"));

                cats.put("Cat7", new Cat("Ванилька"));

                cats.put("Cat8", new Cat("Ника"));

                cats.put("Cat9", new Cat("Киса"));

                cats.put("Cat10", new Cat("Мышка"));


                for (Map.Entry<String, Cat> entry : cats.entrySet()) {
                    String key = entry.getKey();
                    Cat value = entry.getValue();
                    System.out.println(key + " " + value);

                }
            }
        }
