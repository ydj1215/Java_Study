package 오버라이딩금지;

public class Car {
    int speed;
    String color;
    String name;

    // 메서드
    final void accelerator() { // final 키워드로 오버라이딩 금지
        System.out.println("차의 속도를 증가시킵니다.");
    }

    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }
}

// 상속
class SportsCar extends Car {
    boolean isTurbo;

    //생성자
    public SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }

//    @Override // 가시적, 새로 만든 메서드인지, 오버라이딩된 메서드인지 확인 가능하게 해준다. 붙이는게 좋다.
//    void accelerator() {
//        super.accelerator(); // super : 상위 클래스의 생성자, 필드, 메서드 참조 가능
//        System.out.println("차의 속도를 200% 증가시킵니다.");
//    }
//
//    @Override
//    void breakPanel() {
//        super.breakPanel(); // 이 코드에서는 없어도 무방
//        System.out.println("차의 속도를 감소시킵니다.");
//    }

    int getSpeed() {
        if (isTurbo) return speed *= 1.2;

        return speed;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        this.isTurbo = turbo;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보 모드 : " + isTurbo);
    }
}
