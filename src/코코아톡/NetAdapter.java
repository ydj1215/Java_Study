package 코코아톡;

public interface NetAdapter {
    void connect();
    void send (String massage);
}

class WiFi implements NetAdapter{
    @Override
    public void connect() {
        System.out.println("와이파이에 연결되었습니다.");
    }

    @Override
    public void send(String massage) {
        System.out.println("WiFi >> " + massage);
    }
}

class FiveG implements NetAdapter{

    @Override
    public void connect() {
    }

    @Override
    public void send(String massage) {
        System.out.println("FiveG >> " + massage);
    }
}
