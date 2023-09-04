package 스트림예제2번;

// 반복자 스트림( forEach() ) : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당한다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));
//        for(String e : list) System.out.print(e+ " ");
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String name = iterator.next();
//            System.out.print(name + " ");
//        }
//
//        list.forEach(e-> System.out.println(e+" "));
//        list.forEach(e-> System.out.println(e+" "));

        List<Student> list = Arrays.asList(
                new Student("유동재", 80),
                new Student("무동재", 60),
                new Student("이동재", 50),
                new Student("삼동재", 55),
                new Student("사동재", 100)
        );
        double average = list.stream() // 스트림생성
                .mapToInt(Student::getScore) // 메소드 참조, 중간 연산
                .average() // 중간 연산
                .orElse(0.0); // 만약 스트림이 비어 있으면 0.0 반환

        System.out.println("평균 점수 : " + average);

        IntStream stream = IntStream.rangeClosed(1,100);
        System.out.println("합계 : " + stream.sum());


//        list.stream().forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//
//        list.parallelStream().forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
    }
}

class Student {
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
