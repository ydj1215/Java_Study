package 정적메서드GPT;

public class InstanceVariableExample {
    private int instanceVariable = 42;
    // main 바깥에 존재하더라도, (코드 상에서 더 위에 있더라도)
    // 컴파일 이후에 가장 먼저 실행되는 것은 main 함수이다.
    // 이것 또한 인스턴스 필드이다.

    public static void main(String[] args) {
        InstanceVariableExample example = new InstanceVariableExample();
        example.instanceMethod(); // 호출 가능
        example.staticMethod();   // 호출 가능

    }

    public void instanceMethod() {
        System.out.println("Instance Method - Instance Variable: " + instanceVariable);
    }

    public static void staticMethod() {
        // 아래 주석 처리된 줄은 컴파일 오류 발생
        // System.out.println("Static Method - Instance Variable: " + instanceVariable);
        // 정적 메서드는 클래스가 컴파일 될 때, 함께 호출된다.
        // 고로 클래스 호출 이후에 호출되는 instanceVariable(인스턴스 필드 = 변수) 이 선언되기 전이라, 정적 메서드에서는 인스턴스 객체에 접근이 불가능하다.

        System.out.println("Static Method");
    }
}
