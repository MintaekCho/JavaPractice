package OOPEX;

public class OverrideEx {
    public static void main(String[] args) {
        Sport s1 = new Sport();
        Basketball s2 = new Basketball();
        Baseball s3 = new Baseball();

        s1.sports();
        s2.sports();
        s3.sports();

        Sport s4 = new Basketball();
        Sport s5 = new Baseball();

        s4.sports();
        s5.sports();

        Sport[] s6 = new Sport[]{new Basketball(),new Baseball()}; // 배열로 관리 가능
        for (Sport sport : s6){
            sport.sports();
        }

    }



}

class Sport{

    void sports(){
        System.out.println("운동을 합니다.");
    }
}

class Basketball extends Sport{
    void sports(){
        System.out.println("농구를 합니다.");
    }
}

class Baseball extends Sport{
    void sports(){
        System.out.println("야구를 합니다.");
    }
}
