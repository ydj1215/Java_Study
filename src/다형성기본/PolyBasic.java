package 다형성기본;

//import 다차원배열.Parent;

public class PolyBasic {
    public static void main(String[] args) {
        // 자바에서는 클래스와 파일이름이 꼭 같아야 한다.
        // 객체 지향 문법은 아닌, 자바에서만의 문법이다.

        Parent parent = new Parent();
        Child child = new Child();

        child.out();
        child.display();
        parent.display();
        
        Parent p = new Child(); // 부모 클래스의 참조 변수로 자식 객체를 접근 가능
        //Child c = new Parent(); // 오류 발생
        p.display(); // 부모의 display와 자식의 display중 어느게 불려질까?

        // 부모로 자식을 참조가 가능하다.
        // 자식으로 부모 참조는 불가능
        // 부모의 메서드만 사용이 가능
        // 자식이 부모의 메서드를 오버라이딩 했을 경우에는 오버라이딩된 메서드가 불러와지나.
        // 자식에만 있는 메서드는 참조 불가능
    }
}
