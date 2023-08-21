package 중복없는로또번호;

// 1~45 사이의 임의의 수 6개를 생성해야 한다. (입력X)
// 단 중복 제거
// 배열을 6개
// 반복횟수는 정할 수 없다. 즉 무한반복의 형태일 것이다. (while문과 탈출조건)
// 탈출 조건은 중복되지 않는 번호가 여섯개가 저장된 경우이다.
// 생성된 랜덤 값을 배열에 담을 때, 배열 내에 해당하는 값이 있는지 확인이 필요하다.

import java.time.chrono.MinguoDate;

// 배열을 사용한 풀이

public class RandomLotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int tmp = 0, index = 0;
        boolean isExist = false;

        while (true) {
            tmp = (int) ((Math.random() * 45) + 1); // 1~45의 랜덤 숫자
            // Math.random()은 0~1사이의 랜덤 값을 생성
            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == tmp) {// 중복값이 존재
                    isExist = true;
                }
            }
                if (!isExist) lotto[index++] = tmp; // if(isExist = false), 중복값이 존재 X
                if (index == 6) break; // 다 찼다는 뜻
                isExist = false;
            }
        for (int e : lotto) System.out.print(e + " ");
    }
}
