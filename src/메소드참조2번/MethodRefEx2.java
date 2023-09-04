package 메소드참조2번;

// ToIntBiFuction<String, String> : 두개의 문자열을 입력받고, int 값을 반환
// compareToIgnoreCase() : 두 문자열을 대소문자와 관계없이 동일한 알파벳으로 구성됐는지 비교

import java.util.function.ToIntBiFunction;

public class MethodRefEx2 {
    public static void main(String[] args) {
        ToIntBiFunction<String,String> function;

        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "Java8"));

        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Java8", "Java8"));
    }

    static void print(int order) {
        if(order < 0) System.out.println("사전순 입니다.");
        else if(order== 0) System.out.println("동일한 문자열 입니다.");
        else System.out.println("사전의 나중에 나옵니다.");
    }
}