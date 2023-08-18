package 브루마블;

// 두 개의 주사위를 던져 12가 나오면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;

        while(true) {
            rand1 = (int) ((Math.random() * 6) + 1);
            // Math.random() 은 0~1 사이의 랜덤한 값을 생성
            rand2 = (int) ((Math.random() * 6) + 1);

            cnt ++;

            System.out.print(rand1);
            System.out.print(" " + rand2);
            System.out.println();
            if(rand1 == 6 && rand2 == 6) { // rand1 + rand2 = 12 로도 가능
                System.out.println("축하합니다! " + cnt + "번 만에 잭팟이 터졌습니다!");
                break;
            }
        }
    }
}
