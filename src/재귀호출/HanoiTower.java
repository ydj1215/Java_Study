package 재귀호출;

import java.util.Scanner;

public class HanoiTower {
    // 원판 실습 가능 사이트 : https://vidkidz.tistory.com/649
    // n개의 원판을 시작 기둥에서 목표 기둥으로 이동

    // n개의 원판을 시작 기둥에서 목표 기둥으로 옮기는 것은,
    // n-1개의 원판을 시작 기둥에서 가운데 기둥으로 옮겨놓고,
    // 가장 큰 원판을 시작 기둥에서 목표 기둥으로 옮기고,
    // 가운데 기둥에 옮겨두었던 n-1개의 원판을 목표 기둥으로 옮기는 것과 같다.

    static void solveHanoi(int n, char source, char middle, char target) {
        // 원판이 하나인 경우
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        // n-1개의 원판을 middle를 이용해 source에서 target으로 이동
        solveHanoi(n - 1, source, target, middle);

        // 가장 큰 원판을 source에서 target으로 이동
        System.out.println("Move disk " + n + " from " + source + " to " + target);

        // middle에 있는 n-1개의 원판을 target으로 이동
        solveHanoi(n - 1, middle, source, target); // 재귀호출 : 메서드 자신이 자기자신을 호출하는 것
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원판의 개수를 입력하세요 : ");
        int numberOfDisks = sc.nextInt(); // 원판의 개수

        char source = 'A';  // 시작 기둥
        char middle = 'B'; // 보조 기둥
        char target = 'C';  // 목표 기둥

        System.out.println("Solving Hanoi Tower with " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, source, middle, target);
    }
}
