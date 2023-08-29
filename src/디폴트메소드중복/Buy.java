package 디폴트메소드중복;

public interface Buy {
    void buy(); // public abstract 자동으로 추가 된다.

    default void order() { // 예외적으로 구현부를 가지는 디폴트 메소드
        System.out.println("구매 주뮨");
    }
}

interface Sell {
    void sell();

    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {

    }

    @Override
    public void order() { // 누구거를 쓰는걸까?
        Buy.super.order(); // Buy 것을 쓰겠다.
        Sell.super.order();
    }

    @Override
    public void sell() {

    }
}
