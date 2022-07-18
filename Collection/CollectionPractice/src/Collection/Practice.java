
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        ArrayList<Integer> list1 = arrayList;
        ArrayList<Integer> list = new ArrayList<>();
        if(list1.size() == 0) System.out.println(0);

        for (int i = 0; i < list1.size() - 1; i++) {
            list.add(list1.get(i));
        }

        System.out.println(list);


    }
}
