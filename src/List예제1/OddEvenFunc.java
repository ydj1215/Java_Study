package List예제1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunc {
    // ArrayList 사용
    List<Integer> input = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    // 숫자 일곱개를 입력받는 함수
    public void inputFuc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        for(int i = 0; i<7; i++){
            input.add(sc.nextInt());
        }
    }

    // 짝수와 홀수 판별하는 함수
    public void oddEvenCalc() {
        for(Integer e : input){
            if(e%2 == 0) even.add(e);
            else odd.add(e);
        }
    }

    // 짝수와 홀수 각각 출력하는 함수
    public void oddEvenOutput() {
        System.out.print("홀수 : ");
        for(Integer e : odd) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even)System.out.print(e + " ");
    }
}
