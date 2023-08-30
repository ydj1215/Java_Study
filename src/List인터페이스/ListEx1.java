package List인터페이스;

// List 인터페이스는 ArrayList, Linked List, Vector 의 부모로 인터페이스로 구현되어져 있다.
// List 구조는 배열과 유사하고, 차이점으로는 동적으로 크기가 변한다는 것이다.
// ArrayList, Linked List, Vector은 거의 동일한 메소드를 가지고 있어, 코드 변환이 자유롭다.
// ArrayList : 리스트 타입의 대표적인 자료구조 (특별한 경우가 아니면 ArrayList를 사용)
// 검색이 빈번한 경우에 효율적이며, 맨 뒤에 입력이 일어나는 경우에 효과적이다.
// 큐 자료구조와의 차이점으로는 중간 삽입/삭제가 가능하다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // ArrayList<String>도 가능은 하나, 일반적으로 이렇게 사용.
        list.add("100"); // List에 값을 추가
        list.add("200");
        list.add("300");
        System.out.println(list.toString());
        System.out.println(list);
        System.out.println(list.get(0)); // 특정한 위치의 값을 출력
        System.out.println(list.size());// List의 크기를 가져올 때
        System.out.println(list.contains("200"));// List내의 해당하는 값이 존재하는지 판별
        System.out.println(list.remove(2)); // List에서 객체에 해당하는 항목을 삭제 후, 결과를 반환
        System.out.println(list);
        System.out.println(list.remove("100")); // 삭제 성공 여부 확인 (true/false)

        // 이미 만들어진 문자열 배열을 삽입
        String[] arr = {"2000", "3000", "1000"};
        List<String> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        // 오름차순 정렬
        list2.sort(Comparator.naturalOrder());
        System.out.println(list2);

        // 내림차순 정렬
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2);
    }
}
