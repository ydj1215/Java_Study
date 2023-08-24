package 상속TV;

// 이전에 만들었던 TV에서 상속 관계를 적용하고 오버라이딩 이점을 확인

public class InheritanceTV {
    public static void main(String[] args) {
        PrototypeTV prototypeTV = new PrototypeTV();
        
        // 추상화 : 클래스에서 구현 세부사항을 제거하고, 필요한 기능만을 정의하는 것
        // 만약 PrototypeTV가 추상 클래스일 경우, 해당 클래스를 객체화가 불가능하다.
        // 추상 클래스는 상속받아서 추상 메서드를 구현한 후에야 객체 생성이 가능하다.
        // 추상 클래스 내부에 정의된 추상 메서드는 자식 클래스에서 구현된다.
        // 추상화의 예를 들자면, animal 에서 모든 동물이 공통적으로 가지는 기능을 구현하고,
        // Dog, Cat등의 클래스에서 animal 클래스를 상속받고, 추상 메서드를 오버라이딩하여 구현한다.
        
        ProductTV productTV = new ProductTV("Smart TV");
        productTV.setPower(true);
        productTV.setChannel(44,true);
        productTV.setVolume(10);
        productTV.viewTV();
    }
}
