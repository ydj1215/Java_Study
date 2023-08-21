package 배열의복사;

// 배열의 복사가 왜 필요한가?
// 자바의 배열은 한번 선언하면 크기를 변경할 수 없기 때문이다.
// 배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고 기존의 배열의 데이터를 옮겨 담아야 한다.
// arraycopy()
// copyof()

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //arraycopy
        int [] arr1 = {1,2,3,4,5};
        int newLen = 10;
        int [] arr2= new int[newLen];
        System.arraycopy(arr1,0,arr2,4,arr1.length);
        for(int e : arr2) System.out.print(e+ " ");

        System.out.println();

        //copyof()
        int[] arr3 = new int[] {1,2,3,4,5};
        int[] arr4 = Arrays.copyOf(arr1,10);
        for(int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 얕은 복사 : 주소를 복사 -> 문제점 :  값이 같이 바뀐다.
        // 깊은 복사 : 값을 복사
    }
}
