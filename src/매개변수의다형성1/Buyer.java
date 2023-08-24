package 매개변수의다형성1;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 구매에 대한 메서드
    // 부모 클래스의 참조 변수로 자식 클래스를 접근
    void buy(Product p) { // Product, Computer, Audio 전부 다 매개변수로 사용가능 (다형성)
        this.money -= p.price; // 소유금 감소
        this.bonusPoint += p.bonusPoint; // 포인트 증가
    }

    void viewBuyerInfo(){
        System.out.println("잔액 : " + this.money);
        System.out.println("포인트 : " + this.bonusPoint);
    }
}
