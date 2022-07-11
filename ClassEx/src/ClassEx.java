public class ClassEx {
    public static void main(String[] args) {


        Cat bongbong = new Cat();
        Cat ori = new Cat();
        bongbong.setAge(1);
        bongbong.setColor("회색");
        bongbong.setName("봉봉");
        ori.setName("오리");
        ori.setAge(1);
        ori.setColor("하얀색");

        bongbong.catInfo();
        bongbong.move();
        ori.catInfo();
        ori.move();


    }

}

class Cat{
    String name;
    int age;
    String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void move(){
        System.out.println(getName() + "이가 뛰댕깁니다.");
    }

    void catInfo(){
        System.out.println("이름: " + getName() + ", 색깔: " + getColor() + ", 나이: " + age);
    }
}
