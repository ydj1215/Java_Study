package List예제1;

// 7개의 정수를 입력 받는다.
// 홀수와 짝수 배열로 나누어 담는 함수 만들기
// 홀수와 짝수를 출력하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        // 따로 클래스 만들고 각각 함수 정의하는 코드
        OddEvenFunc oddEvenFunc = new OddEvenFunc();
        oddEvenFunc.inputFuc();
        oddEvenFunc.oddEvenCalc();
        oddEvenFunc.oddEvenOutput();

        System.out.println();
        System.out.println("=".repeat(20));
        System.out.println();

        // 스트림 세번째 풀이 방법
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("홀수 : ");
        list.stream().filter(n->n%2!=0).forEach(e-> System.out.print(e+" "));
        System.out.print("짝수 : ");
        list.stream().filter(n->n%2==0).forEach(e-> System.out.print(e+" "));


        // main 함수 안에서 모든걸 다하는 코드 (배열 사용)
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {-1, -1, -1, -1, -1, -1, -1};
//        int[] even = {-1, -1, -1, -1, -1, -1, -1};
//        int[] odd = {-1, -1, -1, -1, -1, -1, -1};
//
//        System.out.print("정수 일곱개를 입력하세요 : ");
//        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) even[i] = arr[i];
//            else odd[i] = arr[i];
//        }
//
//        System.out.print("짝수 : ");
//        for (int i = 0; i < even.length; i++) {
//            if (even[i] != -1) System.out.print(even[i] + " ");
//        }
//        System.out.println();
//        System.out.print("홀수 : ");
//        for (int i = 0; i < odd.length; i++) {
//            if (odd[i] != -1) System.out.print(odd[i] + " ");
//        }
    }
}
