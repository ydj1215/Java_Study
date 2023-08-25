package 추상클래스두번째;

// (인스턴스화) 객체화가 될수 없는 추상 클래스

public abstract class Phone {
    public String name;
    public boolean isPower;

    public Phone(String name) { //
        this.name = name;
    }

    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Powe OFF");
    }

    abstract void call(); // 추상 메서드
}
