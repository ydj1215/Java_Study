package ArrayList연습문제;

// https://www.acmicpc.net/problem/10871

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallthanXEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = sc.nextInt();
        List<Integer> input = new ArrayList<>();
        
        // for문 한번에 묶기
        for (int i = 0; i < n; i++){
            input.add(sc.nextInt());
            if(input.get(i) < mid) System.out.println(input.get(i) + " ");
        }

//        for (int e : input) {
//            if (e < mid) System.out.print(e + " ");
//        }


    }
}
