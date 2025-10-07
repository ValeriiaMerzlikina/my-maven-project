package collections;

import java.util.HashMap;
import java.util.Map;

public class ObjectMap {



    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();


        map.put("Number", 7);

        map.put("Cat", "Sima");

        map.put("Dot", 11.2 );

        map.put("Name", "Liza");

        map.put("Value",0.1 );

        map.put("Dog", "Tusik");

        map.put("Bird", "Lisa");

        map.put("Age", 99);

        map.put("Pair",4);

        map.put("Floor", "First");


        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " - " + value);

        }
    }
}
