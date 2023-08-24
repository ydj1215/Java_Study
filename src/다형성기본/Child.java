package 다형성기본;

public class Child extends Parent {
    private int x= 100;
    public Child() { } // 생성자도 메서드의 일종이기 때문에, 접근 제한자가 존재
    // private Child()는 생성이 불가능한 생성자가 된다.
    // 싱글톤 패턴에서 사용한다.

    public void out(){
        System.out.println("(Parent) protected int num = "  + num);
        System.out.println("자식 클래스 메서드");
    }
    
    @Override
    public void display() {
        System.out.println("상속받아 재정의한 메서드");
    }
}
