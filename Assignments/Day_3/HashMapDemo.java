package Day_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"harry");
        map.put(2,"ronald");
        map.put(3, "hermione");
        System.out.println(map);
    }
}
