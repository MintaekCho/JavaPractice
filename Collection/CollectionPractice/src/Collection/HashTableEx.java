package Collection;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();

        map.put("애벌레", "애벌애벌");
        map.put("오리", "꽥꽥");
        map.put("곤도리", "곤돌곤돌");

        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("아이디를 입력해주세요");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            String password = scanner.nextLine();

            if (map.containsKey(id)){
                if(map.get(id).equals(password)){
                    System.out.println("로그인이 되었습니다");
                    break;
                }
                else System.out.println("비밀번호가 일치하지 않습니다.");
            }
            else System.out.println("입력하신 아이디가 존재하지 않습니다.");
        }
    }
}
