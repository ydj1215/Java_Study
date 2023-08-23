package 객체지향연습문제;

// Split("-") 사용한 풀이
// 추가적으로 toCharArray() 를 사용하는 풀이도 있다.
// 이는 문자열을 char 배열로 변환한다.
// 배열의 요소에는 한개씩 문자열의 문자가 들어간다.

import java.util.Scanner;

public class KmpAnotherSolution {
    public static void main(String[] args) {
        // Split
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //Apple-Banana-Grape

        String[] arr = input.split("-");
        for(String e : arr){
            //System.out.println(e); //"apple" "Banana" "Grape"
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i].charAt(0));
        }

        System.out.print("\n"+"-".repeat(100)+"\n");

        // toCharArray()
        char[] chArr = input.toCharArray(); // 문자열 -> 문자 배열
        for(char ch : chArr){
            if(ch >= 'A' && ch <= 'Z') System.out.print(ch); // 대문자만 출력
        }
    }
}
