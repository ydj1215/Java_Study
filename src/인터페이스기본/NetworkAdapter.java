package 인터페이스기본;

public interface NetworkAdapter {
    // 문법
    void connect(); // 자동으로 public abstract가 포함된다. (생략 가능)
}

class LAN implements NetworkAdapter{
    String company;
    LAN(String company) {
        this.company = company;
    }

    // 문법
    @Override
    public void connect() { // Abstract 가 붙으면 안된다. 추상 메소드가 아니라 실체화가 되었기 때문이다.
        System.out.println(company + " LAN에 연결되었습니다.");
    }
}

class WiFi implements NetworkAdapter{
    String company;
    WiFi(String company) {
        this.company = company;
    }

    // 문법
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
}

class FiveG implements NetworkAdapter{
    String company;
    FiveG(String company) {
        this.company = company;
    }

    // 문법
    @Override
    public void connect() {
        System.out.println(company + " FiveG 연결되었습니다.");
    }
}

