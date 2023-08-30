package System클래스;

import 시스템출력.SystemOut;

import static java.lang.Thread.sleep;

public class SystemClass {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        System.out.println(time);
        System.out.println(nanoTime);

        System.out.println("-".repeat(10));

        int[] data = new int[1000];
        int cnt = 0, i;
        int ranVal = (int) (Math.random() * 1000) + 1; // 1~1000
        for (i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        long startTime = System.currentTimeMillis(); // 시작 시간
        System.out.println("시작 시간 : " + startTime);
        for (i = 0; i < data.length; i++) {
            cnt++; // 몇번 만에 찾았는지 횟수 구하기
            sleep(1); // 1/1000초 동안 잠재우기
            if (ranVal == data[i]) {
                System.out.println("위치 : " + (i + 1));
                break;
            }
        }
        System.out.println("총 검색 횟수 : " + cnt);
        long endTime = System.currentTimeMillis();
        System.out.println("종료 시간 : " + endTime);
        System.out.println("소요 시간 : " + (endTime-startTime));

        System.out.println("---------------");

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));
    }
}
