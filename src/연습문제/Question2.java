package 연습문제;

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        System.out.print("세자리의 정수를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 256
        int num1 = num /100;
        int num2 = (num % 100)/10;
        int num3 = num % 10;

//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);

//        if(num1>=num2 && num1 >= num3)
//        {
//            System.out.println("가장 큰 정수는 " + num1 + "입니다!");
//        }
//        else if(num2>=num1 && num2 >= num3)
//        {
//            System.out.println("가장 큰 정수는 " + num2 + "입니다!");
//        }
//        else
//        {
//            System.out.println("가장 큰 정수는 " + num3 + "입니다!");
//        }

        int result = Math.max(num1, Math.max(num2, num3));
        System.out.println("가장 큰 정수는" + result + "입니다.");
    }
}