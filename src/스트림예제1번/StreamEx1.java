package 스트림예제1번;

// 스트림이란 ? 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
// 자료의 대상에 상관없이 동일한 연산을 수행
// 내부 반복자 사용 (반복문을 배제하기 위해)
// 원본 데이터를 변경X
// 지원 연산과 병렬 처리 지원 (성능 향상을 위한 방법)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림 생성 (1화용), 중간 연산, 최종 연산
        //list.stream().filter(s->s.intValue()>=5)
        //list.stream().filter(s->s>5).forEach(e-> System.out.print(e+" "));
        //int sumVal = list.stream().mapToInt(e -> e + 1).sum();
        int sumVal = list.stream().reduce(0, (e1, e2) -> e1 + e2);
        int count = list.size();
        System.out.println(sumVal); // 합계
        System.out.println(count); // 횟수
    }
}
