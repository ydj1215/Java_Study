package 중첩인터페이스;

public class CallListener implements Button.OnClickListener { // 클래스 내부에 있는 인터페이스를 상속
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
