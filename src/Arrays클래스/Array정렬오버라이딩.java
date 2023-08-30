package Arrays클래스;

import java.util.Arrays;
import java.util.Comparator;

// compare(String a, String b) : length 비교
// a.compareTo(b) : 사전순 정렬

public class Array정렬오버라이딩 {
    public static void main(String[] args) {
//        // 정렬 오버라이딩(재정의)
//        // 정렬 조건을 직접 기입
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) return 1; // 오름차순, 두개의 값이 들어왔을 때, 앞의 값이 크다면 순서를 뒤집어달라.
//                // if (o1 < o2) return 1; // 내림차순, return 1 = 정렬해라! 라는뜻!
//            }
//        }
//    }

        // 길이순 정렬하고, 길이가 같으면 사전순 정렬
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon", "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() { // 익명 객체
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 길이 순 정렬 (앞에 놈이 더 길면 자리 바꿔라)
                else {
                    if (o1.length() == o2.length()) { // 길이가 같으면
                        return o1.compareTo(o2); // 사전순 정렬
                        // compareTo() : 비교 대상의 객체가 작으면 음수 반환, 크면 양수 반환
                        // 즉 o2가 크면 양수 반환
                        // 같으면 0 반환
                    }
                    else return -1; // 현상태 유지
                }
            }
        });

        // 출력
        System.out.println(Arrays.toString(fruit));

        for (String item : fruit) {
            System.out.println(item);
        }

    }
}
