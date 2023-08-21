package 중복없는로또번호;

import java.util.ArrayList;
import java.util.List;

// ArrayList 사용한 풀이

public class RandomLottoAnotherSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int tmp;

        while(true) {
            tmp = (int) (Math.random() * 45 +1);
            if(!list.contains(tmp)){ // list안에 tmp 값이 존재하는지 중복확인
                list.add(tmp); // 존재하지 않으면 추가
            }
            if(list.size() == 6) break; // list의 요소의 개수 확인, 6개 되면 탈출
        }
        System.out.println(list);
    }
}
