package collections;

import java.util.HashMap;
import java.util.Map;

public class Values {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Арбуз", "ягода");
        map.put("Банан", "трава");
        map.put("Вишня", " ягода");
        map.put("Груша", "фрукт");
        map.put("Дыня", " - овощ");
        map.put("Ежевика", "куст");
        map.put("Жень-шень", "корень");
        map.put("Земляника", "ягода");
        map.put("Ирис", "цветок");
        map.put("Картофель", "клубень");


        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
