package Pratice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Subject subject = Subject.과학;

        switch (subject){
            case 사회:
                System.out.println("사회");
                break;
            case 수학:
                System.out.println("수학은 어려웡");
                break;
            case 영어:
                System.out.println("영어");
                break;
            case 과학:
                System.out.println("과학");
                break;
        }
        System.out.println(subject.values());
        Object obj = new Object() {

        };
    }
}


    enum Subject {수학, 과학, 영어, 사회}
    enum Cook {짜장면, 짬뽕, 탕수육, 양장}

