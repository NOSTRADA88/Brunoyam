package lesson.seven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Medium {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "k");
        map.put(2, "l");
        map.put(148, "k");
        System.out.println(counter(map));
    }
    public static int counter(Map<Integer, String> map) {
        map = new HashMap<>(map);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(map.values());
        return map.size() - hashSet.size();
    }
}
