package 다형성기본;

// Build - Rebuild Project : 프로젝트 다시 실행

public class Parent {
    protected int num  = 100;
    // public : 어떤 클래스에서도 접근 가능
    // private : 해당 클래스에서만 접근 가능 / 혹은 getter, setter 메서드를 통해서 접근 가능
    // protected : 클래스 내부와, 상속관계에 있는 클래스에서 접근 가능한 멤버를 지정
    // : 상속관계에 있는 하위 클래스에서 접근 가능
    // : 같은 패키지 내의 다른 클래스에서 접근 가능
    // : 다른 패키지의 클래스에서는 상속 관계일때만 접근 가능

    public void display() {
        System.out.println("부모 클래스 메서드");
    }
}
