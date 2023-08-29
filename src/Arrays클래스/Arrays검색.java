package Arrays클래스;

// 검색을 위해서는 사전에 정렬이 되어있어야 한다.

import java.util.Arrays;
import java.util.Scanner;

public class Arrays검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 : ");
        int num = sc.nextInt();
        int[ ] arr = new int[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * num) +1;
        }

        // 정렬
        Arrays.sort(arr);
        for(int e: arr) System.out.print(e + " ");
        System.out.println();

        int result = Arrays.binarySearch(arr, key); // 정렬된 배열을 이분 검색 (arr에서 key 값을 검색)
        if(result >= 0) System.out.println(result); // 인덱스가 넘어온다.
        else System.out.println("찾는 값이 없습니다!"); // key값이 존재하지 않을때
    }
}
