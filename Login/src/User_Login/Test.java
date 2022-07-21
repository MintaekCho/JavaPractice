package User_Login;

import java.util.Hashtable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        User user;
       Hashtable<String, String> userSignUp = new Hashtable<>();

        while (true){
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("---------------------");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원정보 보기");
            System.out.println("4. 뒤로가기");
            System.out.println("=====================");
            System.out.println("번호를 입력하세요 :");
            num = scanner.nextInt();
            if(num == 1){  // 회원가입 구현

            } else if (num == 2) {  //로그인 구현

            } else if (num == 3) {  //회원정보 보기

            } else if (num == 4) { // 뒤로가기

            }else System.out.println("올바른 번호를 입력하세요");
        }
    }
}
