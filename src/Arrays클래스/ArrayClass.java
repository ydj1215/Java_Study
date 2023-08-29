package Arrays클래스;

// Arrays클래스는 배열을 다루기 위한 다양한 메서드가 포함되어 있다.
// ArrayList와 혼동X

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 2, 1};

        // 정렬
        Arrays.sort(arr); // 오름차순
        for (int e : arr) System.out.print(e + " ");

        System.out.println();

        // 내림차순
        Arrays.sort(arr, Collections.reverseOrder()); // int(기본형 배열X), Integer(참조형) 사용해야 한다.
        for (int e : arr) System.out.print(e + " ");
    }
}
