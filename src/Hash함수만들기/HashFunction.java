package Hash함수만들기;

// 컬렉션 프레임 워크:자바에서 데이터를 저장하고 관리하기 위한 클래스와 인터페이스의 집합
// ArrayList,LinkedList,Map,HashMap 모두 컬렉션 프레임워크이다.
// 자바에서 List는 index 값으로 값을 알 수 있다..
// Map은 key와 value 값을 가진다.Map(key,value)
// key를 알아야 value의 값을 알 수 있다.
// Map에는 Hash Map이라는 것이 존재한다.ArrayList 는 검색은 빠르지만,데이터 추가/삭제 시 많은 시간이 소모되고,
// LinkedList같은 경우네는 추가/삭제는 빠르지만 검색에 많은 시간이 소요된다.
// 이러한 한계를 극복하기 위한 방법이 Hash이다.
// Hash가 내부적으로 사용하는 배열을 Hash Table이라고 한다.


import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String in = sc.next();
        int sum = 0;

        // Simple Hash Function
        for (int i = 0; i < in.length(); i++) {
            sum += in.charAt(i); // 문자열의 각 문자에 문자의 ASCII 코드 값을 더해준다.
        }
        System.out.println("배열의 index : " + (sum % 100));
    }
    // 값의 충돌이 일어난다는 문제가 존재한다.
}
