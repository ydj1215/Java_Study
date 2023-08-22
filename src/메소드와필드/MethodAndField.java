package 메소드와필드;

// 메소드 : 클래스 내의 동작에 대한 구현
// 필드 : 클래스의 속성에 대한 구현

public class MethodAndField {
    public static void main(String[] args) {
        MethodAndField m = new MethodAndField();
        int num =m.sum(10,20,30);
        int result = sum(100, 200, 300, 400);

        System.out.println(result);
    }

    int sum(int a, int b) { // 자바스크립트는 매개변수의 개수를 맞추지 않아도 되나, 자바는 맞춰야 한다.
        return a + b;
    }

    int sum(int a, int b, int c) { // 메서드 오버로딩 (매개변수의 개수를 변경)
        return a + b + c;
    }
    // 메서드 오버로딩과 오버라이딩은 다른 개념이다.
    // 오버로딩은 같은 클래스 내, 같은 이름의 메서드를 정의 하는 것
    // 오버라이딩은 상위(부모) 클래스의 메서드를 하위(자식) 클래스에서 재정의 하는것
    // 오버라이딩을 할때에도 메서드의 이름은 바뀌지 않는다.

    static int sum(int ... val){ // 전개 연산자 (...) : 매개 변수의 개수를 알 수 없을때 사용
        // 배열
        int sum = 0;
        for(int e : val) sum += e;
        return sum;
    }

    // 정적 메서드
    static int sumTest(int a, int b) { //
        return a + b;
    }
    // static 메서드는 객체를 통한 호출은 일반적으로는 불가능하다.
    // static 메서드는 클래스 소속이다.
    // 고로 static 메서드는 클래스의 이름을 통해 호출해야 한다.

    // static 변수는 메서드(static)영역에 메모리가 할당된다.
    // Math.random() 같은 함수가 static 메서드 이다.

    // Stack 메모리는 가장 나중에 들어온 항목이 가장 먼저 제가 된다. (LIFO)
    // 자료구조 스택도 LIFO 방식이다.
}
