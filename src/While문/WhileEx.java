package While문;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n  = sc.nextInt();
        int sum = 0;

//        while(n > 0){
//            sum += n;
//            n--;
//        }

        for(int i = 0; i<=n; i++){
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}
