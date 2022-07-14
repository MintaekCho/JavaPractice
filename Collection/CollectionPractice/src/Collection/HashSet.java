package Collection;

import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("애버리");
        treeSet.add("오리");
        treeSet.add("곤도리");
        treeSet.add("파뿌리");

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher("리"));


    }
}
