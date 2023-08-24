package 정적멤버와메서드;

public class StaticMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 0);

        kakao.setDeposit(2300); // 예금, 인스턴스 메서드를 객체로 호출
        kakao.setWithDraw(1850); // 출금
        kakao.viewAccount();

        shinhan.setWithDraw(2000);

        System.out.println(Bank.getCount()); // 정적=클래스 메서드를 클래스 이름으로 접근
    }
}
