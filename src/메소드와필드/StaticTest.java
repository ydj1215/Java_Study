package 메소드와필드;

public class StaticTest {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        StaticTest myObject = new StaticTest();
        myObject.staticMethod();
        // 자바에서 객체를 통해서도 정적 메서드 호출은 가능은 하게 해놓았으나, 이는 권장되지 않는 방식이다.
        // 위와 같은 목적으로의 사용은 정적으로 선언할 이유가 없다.

        StaticTest.staticMethod(); // 클래스 이름을 통한 정적 메서드 호출
    }

    // 메서드 오버로딩
    int sum(int a, int b){
        return a+b;
    }

    static int sum (int a, int b, int c){
        return a+ b;
    }
}
