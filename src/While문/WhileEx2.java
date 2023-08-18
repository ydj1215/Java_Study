package While문;

// 반복횟수를 알 수 없는 경우

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
//        while (true) {
//            System.out.println("나이를 입력하세요 : ");
//            age = sc.nextInt();
//            if (age > 0 && age < 200) break;
//            System.out.println("나이를 잘못 입력했습니다.");
//        }

        do{
            System.out.println("나이를 입력하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) break;
        } while(age<=0 || age>200);

        if(age<20) System.out.println(age + "살은 미성년자 입니다.");
        else System.out.println(age + "살은 성인 입니다.");
    }
}
