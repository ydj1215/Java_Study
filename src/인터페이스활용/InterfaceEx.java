package 인터페이스활용;

public class InterfaceEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // customer 참조 변수를 buyer 인터페이스에 대입
        // Customer 은 buy와 sell 인터페이스를 상속을 받았다.
        buyer.buy();
        // buyer.sell은 불가능, 제약 사항

        Sell seller = customer;
        seller.sell();

        Customer customer2 = (Customer) seller; // 다운 캐스팅, 부모형을 원래 형으로 변환c
        customer2.buy();
        customer2.sell();
    }
}
