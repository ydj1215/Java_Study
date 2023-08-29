package Math클래스;

// Math 클래스 : 수학에서 자주 사용하는 상수들과 함수를 미리 구현 해놓은 클라스
// Math 클래스 내의 모든 매서드는 static 이므로, 객체 생성 없이 바로 사용 가능
// java.lang 패키지에 포함되어 있어 import가 필요 없다.
// random() 메서드는 0.1~1 미만의 임의의 double형 값을 반환

public class MathClass {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 100)); // 10~1000
        System.out.println(Math.abs(-13)); // 절대값

        System.out.println(Math.ceil(10.1));// 올림
        System.out.println(Math.floor(10.1));// 버림
        System.out.println(Math.round(10.1));// 반올림

        System.out.println(Math.max(10,1));// 큰 수
        System.out.println(Math.min(10,1));// 작은 수
    }
}
