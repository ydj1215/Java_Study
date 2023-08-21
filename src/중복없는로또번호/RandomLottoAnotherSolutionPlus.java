package 중복없는로또번호;

// 집합을 ( Set : 자바에서 사용하는 집합 개념) 사용한 풀이
// 집합은 원래 중복값을 허용하지 않는다.
// 고로 중복을 확인할 필요도 없다.
import java.util.HashSet;

public class RandomLottoAnotherSolutionPlus {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size()==6) break;
        }
        System.out.println(set);
    }
}
