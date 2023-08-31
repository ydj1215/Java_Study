package 단어정렬;

// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래의 조건에 따라 정렬하는 프로그램
// 0. 먼저 n의 개수를 입력 받는다.
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전순으로
// 3. 중복 제거

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] result = new String[n];

        for(int i =0; i<n; i++){
            System.out.print("알파벳 입력 : ");
            arr[i] = sc.next();
            sc.nextLine();
        }

        // 중복 제거
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(arr[i]);
        }

        int i =0;
        for(String e : set){
            if(e != null) result[i++] = e;
        }

        for(int j = 0; j<n; j++){
            if(result[i] == null) result[i] =" ";
        }

        // for(String e : result) if(e==null) e=" "; // 향상된 for문은 값을 바꿀 수는 없다. 오직 순회만 가능하다.

        // 길이가 짧은 것부터 정렬
        Arrays.sort(result, new Comparator<String>() { // 익명 객체
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else {
                    if (o1.length() == o2.length()) { // 길이가 같으면
                        return o1.compareTo(o2); // 사전순 정렬
                    }
                    else return -1;
                }
            }
        });

        // 출력
        for(String e : result) System.out.println(e);

    }
}
