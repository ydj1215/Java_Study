package 추상클래스두번째;

public class SmartPhone extends Phone {
    public SmartPhone(String name) {
        super(name); // 부모의 생성자 호출 키워드, 상속 과정에서 필수적
    }

    @Override
    void call() { //추상 메서드 오버라이딩
        System.out.println("부모 클래스의 call() 메서드를 구체화, 통화 기능 완성");
    }

    public void internet() {
        System.out.println("인터넷을 검색합니다.");
    }
}
