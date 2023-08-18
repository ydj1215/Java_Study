package 초급문제;

import javax.swing.*;
import java.util.Scanner;

public class AlarmQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시 : ");
        int hour = sc.nextInt();
        if(hour<0 || hour>23) {
            System.out.println("시 정보가 잘못됐습니다!");
            return;
        }

        System.out.print("분 : ");
        int minute = sc.nextInt();
        if(minute<0 || minute>59) {
            System.out.println("분 정보가 잘못됐습니다!");
            return;
        }

        if(minute>45) {
            System.out.println("알람을 맞춰야 할 시간은" + hour + "시 " + (minute-45) + "분 입니다!");
        }
        else if(minute == 45){
            System.out.println("알람을 맞춰야 할 시간은" + hour + "시 0분 입니다!");
        }
        else if(hour-1<0){
            System.out.println("알람을 맞춰야 할 시간은" + (hour+23) + "시 " + (minute+15) + "분 입니다!");
        }
        else {
            System.out.println("알람을 맞춰야 할 시간은" + (hour-1) + "시 " + (minute+15) + "분 입니다!");
        }
    }
}
