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

public class AnotherSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word= new String[n];
        for(int i =0; i<word.length; i++){
            word[i] = sc.next();
        }

        // 입력 받은 문자열 배열에 중복제거
        HashSet<String> set = new HashSet<>(Arrays.asList(word));

        // 다시 배열로 되돌리기
        word = set.toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){ // 길이가 같다면
                    return o1.compareTo(o2); // 사전 순 정렬
                }
                else{
                    return o1.length() - o2.length(); // 만약 앞이 길면 양수 반환 (양수 = 정렬)
                }
            }
        });

        for(String e: word) System.out.println(e);
    }
}
