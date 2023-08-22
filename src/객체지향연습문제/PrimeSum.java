package 객체지향연습문제;

import java.util.Scanner;

// 소수의 합 구하기
// 예) 입력 : 12 / 출력 : 2 + 3 + 5 + 7 + 11 = 28
// 1과 자기 자신 이외의 자연수로는 나누어지지 않는 수가 소수이다.

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        // 2가 입력 되었을 때
        if (num == 2) {
            System.out.println("0 = 0");
            return;
        }

        int[] arr = new int[100];
        for (int k = 0; k < 100; k++) {
            arr[k] = 0;
        }

        PrimeSum primeSum = new PrimeSum(); // isPrime 을 static으로 선언했으면 바로 함수 사용이 가능했다.

        // 소수 판별
//        if (primeSum.isPrime(num) == 1) {
        //System.out.println(num + "는 소수입니다!");

        // num보다 작은 소수의 합 구하기
        for (int i = 1; i < num - 1; i++) {
            if (primeSum.isPrime(num - i) == 1) {
                arr[i - 1] = num - i;
            }
        }
//
//        } else { // 소수가 아닐 경우
//            System.out.println(num + "는 소수가 아닙니다!");
//            return;
//        }

        // 출력
        int sum = 0;
        for (int j = 0; j < 100; j++) {
            sum += arr[j];
        }

        // 입력된 숫자보다 작은 소수의 합도 함수화 시켰으면 더 깔끔한 코드가 됐을 것 같다.
        System.out.print(num + " 보다 작은 소수의 합은 : ");
        for (int n = 0; n < 100; n++) {
            if (arr[n] != 0 && arr[n] != 2) System.out.print(arr[n] + " + ");
        }
        System.out.println("2 = " + sum);
    }

    // 소수 판별 함수
    int isPrime(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) count++; // 나누어 떨어지면 나머지가 0이 나온다.
        }
        return count;
    }

//    // 다른 풀이
//    static int prime(int n) {
//        boolean isPrime = true; // 여기서는 isPrime의 반환형이 boolean
//        for(int i =2; i<n; i++){
//            if(n%i == 0) isPrime = false;
//        }
//        if(isPrime) return n;
//        else return 0; // 소수가 아니면 0을 반환, 소수면 그 숫자(n)을 반환
//    }
}
