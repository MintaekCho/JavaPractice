package OOPEX;

public class CompositeEx {
    public static void main(String[] args) {
        Country p1 = new Country("서울", "한국");
        Person1 person = new Person1("애버리", 26, p1);

        person.showInfo();
    }
}

class Country{
    String city;
    String country;

    Country(String city, String country){
        this.city = city;
        this.country = country;
        System.out.println("지역 설정 완료");
    }
}

class Person1{
    String name;
    int age;
    Country p1;

    Person1(){}
    Person1(String name, int age, Country p1){
        this.name = name;
        this.age = age;
        this.p1 = p1;
    }

    void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + p1.country + "" + p1.city);
    }
}