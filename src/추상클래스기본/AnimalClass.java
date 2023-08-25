package 추상클래스기본;

// 추상 클래스는 클래스 앞에 abstract 라는 키워드를 붙여서 생성
// 추상 클래스는 객체화 불가능
// 내부에 0개 이상의 추상 메서드가 포함되어져 있다. (없을 수도 있다.)
// 추상 메서드는 반드시 상속받는 자식 클래스들에서 오버라이딩을 해줘야한다. (해당 메서드의 기능을 구체화)
//

public abstract class AnimalClass {
    // void cry(){} // 기능 구현을 안했을 뿐이지, 실체가 있는것
    // void cry; // 실체가 없다. 오류 발생
    abstract void cry(); // 추상 메서드 :상속 받은 클래스에서 구체화 필수 (오버라이딩)
    void sleep(){ // 일반 메서드, 상속을 해도 되고 안해도 된다.
        System.out.println("쿨쿨..");
    }
}

class Cat extends AnimalClass{
    @Override
    void cry() {
        System.out.println("냐옹냐옹!!!");
    }

    @Override
    void sleep(){
        System.out.println(("Zzzzzz..."));
    }
}

class Dog extends AnimalClass{
    @Override
    void cry() {
        System.out.println("왈왈!!");
    }
}

