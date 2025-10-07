package collections;

import java.util.HashMap;
import java.util.Map;

public class Couple {
    public static void main(String[] args) {

        Map<String, String> couple = new HashMap<>();


        couple.put("Арбуз", " - ягода");

        couple.put("Банан", " - трава");

        couple.put("Вишня", " - ягода");

        couple.put("Груша", " - фрукт");

        couple.put("Дыня", " - овощ");

        couple.put("Ежевика", " - куст");

        couple.put("Жень-шень", " - корень");

        couple.put("Земляника", " - ягода");

        couple.put("Ирис", " - цветок");

        couple.put("Картофель", " - клубень");


        for (Map.Entry<String, String> pair : couple.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + value);
        }
    }
}
