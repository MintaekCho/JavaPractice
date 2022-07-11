public class InheritanceEx {
    public static void main(String[] args) {
        Person person = new Person("애버리", "man" , 26);
        Student student = new Student("오리", "woman", 26, 100);
        Doctor doctor = new Doctor("거부기", "man", 150, "라바병원");

        System.out.println(doctor.getName());
        student.study();
        person.work();
        doctor.setName("huzun");
        System.out.println(doctor.getName());
        System.out.println(person.getName());
    }
}

class Person{

    private String name;
    private int age;
    private String sex;

    Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("Person 클래스 생성자");
    }

    public Person() {}

    void eat(){
        System.out.println("밥을 먹습니다.");
    }

    void sleep(){
        System.out.println("잠을 잡니다.");
    }
    void work(){
        System.out.println("운동을 합니다.");
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Student extends Person{
    private int studentID;

    Student(String name, String sex, int age, int studentID) {
        super();
        this.studentID = studentID;
        System.out.println("Student 클래스 생성자");
    }

    void study(){
        System.out.println("공부를 합니다.");
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}

class Doctor extends Person{
    private String hospitalName;

    Doctor(String name, String sex, int age, String hospitalName) {
        super(name, sex, age);
        this.hospitalName = hospitalName;
        System.out.println("Doctor 클래스 생성자");
    }

    void heal(){
        System.out.println("치료합니다.");
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
