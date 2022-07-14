package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet hash = new HashSet();

        hash.add("애벌레");
        hash.add("오리");
        hash.add("깨깨기");
        hash.add("곤도리");
        hash.add("애벌레");
        hash.add("파뿌리");

        Iterator it = hash.iterator();
        while (it.hasNext())
        System.out.println(it.next());
    }
}
