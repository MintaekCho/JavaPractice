import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pratice {
    public static void main(String[] args) {
        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        System.out.println(findPeople(male, female, "김"));
    }



    public static List<String> findPeople(List<String> male, List<String> female, String lastName) {
        //TODO..
        // 남자 튺정성씨 거르기
        // 여자 특정성씨 거르기
        // concot으로 합치기
        // 중복제거
        // 정렬
        // 리스트로 반환

        Stream<String> stringStream = male.stream().filter(s -> s.startsWith(lastName));
        Stream<String> stringStream1 = female.stream().filter(s -> s.startsWith(lastName));
        return Stream.concat(stringStream, stringStream1).distinct().sorted().collect(Collectors.toList());

    }
}
