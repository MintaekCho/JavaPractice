package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("애벌레");
        array.add("오리");

        //저장된 총 개체수 얻기
        int size = array.size();

        //0번 인덱스의 객체 얻기
        String zero = array.get(0);

        //저장된 총 객체 수 만큼 조회
        for(int i=0; i<size; i++){
            String str = array.get(i);
            System.out.println(i + " : " + str);
        }

        System.out.println("===================================");

        // for-each 문으로 순회
        for(String str : array){
            System.out.println(str);
        }

        //인덱스 0번 객체 삭제
        array.remove(0);

        System.out.println(array.get(0));

        array.add("애벌레");
        array.add("파뿌리");

        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()) { //객체가 있는지 확인
            String str1 = iterator.next(); //다음에 올 객체 읽어오기
            if (str1.equals("파뿌리")) iterator.remove(); // 읽어온 객체가 "애벌레" 라면 삭제
        }
        System.out.println("=====================================");

        array.add("곤도리");
        array.add("깨깨기");

        for(String str2 : array){
            System.out.println(str2);
        }
    }
}
