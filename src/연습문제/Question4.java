package 연습문제;

// 공백없이 연속적으로 입력된 숫자의 합을 출력하는 문제

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // 주석 처리된 부분은 n을 입력하지 않고, 바로 연속된 숫자를 입력하는 경우
        Scanner sc = new Scanner(System.in);
        System.out.println("1~100까지 중에 하나의 숫자를 입력해주세요: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("방금 입력하신 숫자만큼 연속으로 숫자를 나열해주세요: ");
        String str = sc.nextLine();

        //if(str.length() > 100 || str.length()==2) return;
        //f(n > 100 || n==2) return;
        //else System.out.println("good");

        int result = 0;

        //for(int i=0; i<str.length(); i++)
        for(int i=0; i<n; i++)
        {
            //System.out.println("길이는? :" + str.length());
            result += Integer.parseInt(str.substring(i, i + 1));
        }

        System.out.println("숫자의 합은 " + result + "입니다!");
    }
}
