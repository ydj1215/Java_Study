package 객체타입확인;

// instanceof : 상속 관계가 성립하는지 확인하는 용도
// 왼쪽 피연산자가 오른쪽 피연산자의 인스턴스인지를 검사
// 결과는 boolean 값으로 반환

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Child);
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
        // Parent 클래스에 기본 생성자 이외의 생성자가 존재하기 때문에,
        // 자식 클래스에서 부모 클래스의 생성자를 초기화해주는 작업이 필요하다.
        // 이를 위하여 사용하는게 super() 이다.
        // 만약 Parent 클래스에 Parent(String name) 생성자가 존재하지 않는다면,
        // super 키워드는 불필요 했을 것이다.
        this.name = name;
    }
}
