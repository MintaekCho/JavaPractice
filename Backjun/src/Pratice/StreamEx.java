package Pratice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) throws Exception {
        List<Student> list = Arrays.asList(
                new Student("애벌레", 26),
                new Student("오리", 26)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int age = s.getAge();
            System.out.println( "이름: " + name + " 나이 : " + age );
        });
    }
}

class Student{

    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
