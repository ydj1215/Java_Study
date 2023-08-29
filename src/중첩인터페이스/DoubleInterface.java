package 중첩인터페이스;

// 중첩 인터페이스는 쿨래스 내부에 선언한 인터페이스다.
// 중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트 처리 할 때사용

public class DoubleInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListen(new CallListener());
        button.touch();
        button.setOnClickListen(new MessageListener());
        button.touch();


        Car car = new Car();
        // car.
    }
}

class Car extends Object{ // Object( 기본 클래스) 상속이 항상 생략되어져있다.

}
