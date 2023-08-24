package 싱글톤;

// 객체가 한번만 생성되는 것.
// 메모리 관리 용이와, 어디서든지 하나의 객체에 접근 가능하다는 장점
// 멀티스레드 환경에서 동시에 객체를 생성하려고 시도 할때,
// 두개 이상의 객체의 객체가 생성되는 동시성 문제가 존재
// 이를 해결하기 위해, 싱크로나이즈(C++ 에서는 뮤텍스) 기법이 존재
// 화장실 문을 잠궈, 다른 사람이 못들어오게 하는 개념과 비슷
public class Singleton {
    String name;
    int id;

    // 클래스 내에서 단 한 번의 객체를 생성, static이 없어도 상관은 없으나, 가시적인 의미
    // JVM 이 메모리 관리를 위해 힙 영역을 비울때, static은 비워지지 않는다는 장점이 존재는 한다.
    private static Singleton singleton = new Singleton();

    // private 접근 제어자의 생성자 생성, 외부에서 객체 생성이 불가능하게 정의
    private Singleton() {
        name = "test";
        id = 100;
    }

    // 정적 메서드로 정의하여, 딱 한번만 만들게 정의
    // 한번 만들어진 객체에 대한 주소를 반환,
    // 한개의 객체를 생성하므로, 항상 같은 객체가 반환된다.
    static Singleton getSingleton() {
        return singleton;
    }
}
