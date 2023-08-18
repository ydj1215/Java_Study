package 초급문제;

import java.util.Scanner;

public class AlarmQuestionAnotherSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간 분 입력: ");
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 시간과 분을 총 몇 분인지 환산
        int totalMin = hour * 60 + min;

        // 00시 ~ 00시 45분
       if(totalMin<45){
           totalMin = 24 * 60 + totalMin; //23시 이후에 00시가 되는것을, 00시 ~ 분을 24시 ~분으로 간주
       }

       // 계산된 시간에서 45를 빼줌
        totalMin -= 45;

       //결과를 시간과 분으로 환산해서 출력 (몫과 나머지 계산 이용)
        System.out.println((totalMin /60) + "시" + (totalMin%60) + "분");
    }
}
