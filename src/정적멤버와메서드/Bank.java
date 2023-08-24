package 정적멤버와메서드;

import 다형성기본.Parent;

public class Bank {
    private static int count = 0;
    // 정적 변수 : 클래시 레벨에서 공유, 클래스 내에서 동일한 값 공유
    // 클래스 내부에서 한개의 값을 가지는거지, 한번만 값을 지정가능 한것은 X
    // 이후에 값 변경은 가능
    private int account; // 계좌, 인스턴스 변수, 객체마다 다른 값
    private String bank; // 은행 이름

    Bank(String name, int account){
        count ++;
        this.bank = name;
        this.account = account;
        System.out.println(bank + "은행에 계좌를 개설합니다. 잔액은 " + this.account);
    }

    public static int getCount() {
        // 정적 메서드 : 클래스 레벨에서 호출, 객체로 만들어지지 않는다.
        // 객체 생성 없이 호출이 가능 (컴파일시에)
        // 객체는 new 라는 키워드를 쓸때, heap 영역에 올라간다. (동적할당)
        // 인스턴스 변수에 접근 불가
        // 오버라이딩을 불가, 오버로딩은 가능
        return count;
    }

    public void setDeposit(final int dep) { // 예금
        // final : dep의 값을 메서드 내에서 변경 불가
        // 안전성 확보, 오류 예방 목적
        this.account += dep;
        System.out.println(dep + "을 예금했습니다.");
    }

    public void setWithDraw(final int with) { // 출금
        if(with>account) { // 출금하려는 금액에 예금보다 클 때
            System.out.println("잔액이 부족합니다.");
        }
        else {
            account -= with;
        }
    }

    public void viewAccount() {
        System.out.println("현재 잔액 : " + this.account);
    }
}
