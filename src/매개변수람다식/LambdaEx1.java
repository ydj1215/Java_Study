package 매개변수람다식;

@FunctionalInterface // 함수형 프로그래밍이라는 것을 알리기 위한 어노테이션, 내부에 한개만 존재
interface MyFuncInterface {
    void method(int x); // 오직 함수형 프로그래밍을 위해 사용하는 인터페이스
    // 메서드는 인터페이스 내에서가 아니라면 구현부가 필수적이기 때문에, 불가피하게 인터페이스 내에 선언
}

interface MyFuncInterface2 { // 리턴값이 존재하는 람다식
    int min(int x, int y);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        // 매개변수 -> { 구현부 }
        MyFuncInterface fi = x -> { // 구현부가 한줄인 경우에는 중괄호 생략 가능
            int result = x * 5;
            System.out.println(result);
        }; // 일회용 인터페이스
        fi.method(10);

        //MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y;
        MyFuncInterface2 fi2 = Math::min;
        System.out.println(fi2.min(10,20));
    }
}
