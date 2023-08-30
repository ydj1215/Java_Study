package 스트링토커나이저;

// 문자열이 특정 문자열로 연결되어 있는 경우,
// 구분 문자열을 기준으로 부분 문자열로 만든다.
// split() 과 용도가 같다.
// countTokens() : 꺼내지 않고 남아있는 토큰의 개수
// hasMoreTokens() : 남아있는 토큰이 있는지 여부 확인
// nextTokens() : 토큰을 하나씩 꺼내 온다.

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력하세요 : ");
        String names = sc.nextLine();
        
        // StringTokenizer 사용
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()];
//        int index = 0;
//        while (st.hasMoreTokens()) { // 토큰이 남아있다면
//            nameStr[index++] = st.nextToken();
//        }


        // Split 사용
        String[] nameStr = names.split("/");
        
        // 출력
        for(String e: nameStr) System.out.println(e + " ");

        // Class 클래스
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);
    }
}
