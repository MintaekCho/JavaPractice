public class ClassEx {
    public static void main(String[] args) {
        OutClass bongbong = new OutClass("봉봉", "회색", 1);
        OutClass ori = new OutClass("오리" , "흰색" , 1);

        bongbong.catInfo();
        ori.catInfo();

        bongbong.move();
        bongbong.sleep();
        ori.move();
        ori.sleep();
    }
}

class OutClass{
    String name;
    String color;
    int age;

    OutClass(String name, String color, int age){ //constructer 생성시 이름, 색깔, 나이를 매개변수로 받음.
        this.name = name;
        this.color = color;
        this.age = age;
    }

    OutClass(){} //defoult constructer 생성

    public void catInfo(){
        System.out.println("야옹이의 이름은 " + name + "이고 색깔은 " + color + " 나이는 " + age + "살입니다.");
    }

    public void move(){
        System.out.println(name + "이가 뛰어다닙니다.");
    }

    public void sleep(){
        System.out.println(name + "이가 꿈을 꿉니당.");
    }
}
