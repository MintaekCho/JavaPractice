package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("애벌레", 26);
        hashMap.put("오리", 45);
        hashMap.put("곤도리", 5);
        hashMap.put("파뿌리", 8);

        System.out.println(hashMap.size());

        System.out.println("애벌레 :" + hashMap.get("애벌레"));

        Set<String> keySet = hashMap.keySet();

        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = hashMap.get(key);
            System.out.println(key + " : " + value);
        }

        hashMap.remove("파뿌리");
        System.out.println(hashMap.size());

        System.out.println("=============================");

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
