package OOPEX;

public class PolymorphismEx {
    public static void main(String[] args) {
        Person student = new Student("오리", 26, 100);
        Person teacher = new Teacher();
        Person person = new Person("애버리", 26);
        student.drinking();
        System.out.println(student.name);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(){}

    void move(Person person){
        System.out.println("사람이 걷습니다.");
    }

    void drinking(){
        System.out.println("물을 마십니다.");
    }
}

class Student extends Person {
    int studentID;

    void study() {
        System.out.println("공부를 합니다.");
    }
    Student(String name, int age, int studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

}

class Teacher extends Person {
    int teacherID;

    void teaching() {
        System.out.println("학생들을 가르칩니다.");
    }
}

