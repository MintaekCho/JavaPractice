import java.util.*;

public class AddSum {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println(s1.sum(new int[] {12,3,4,5,6}));
    }
}

class Sum{

    public int sum(int[] arr){
        if(arr.length == 0) return 0;
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length-1);
        return head + sum(tail);
    }
}