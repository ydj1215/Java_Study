package 상속TV;

// PrototypeTV 로 부터 상속을 받는 ProductTV 클래스

public class ProductTV extends PrototypeTV {
    String name;
    boolean isInternet;

    ProductTV() {
        name = "Smart TV";
    }

    // 생성자 오버로딩
    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("소리 설정 범위를 벗어났습니다.");
    }

    // 오버라이딩 : 부모에게서 물려받은 기능을 재정의해서 사용하는 것
    @Override // @ = 어노테이션 : 가시적 도우미
    public void setChannel(int channel) {
        if (channel > 1 && channel < 2000) {
            this.channel = channel;
            System.out.println("채널을" + channel + "로 변경했습니다.");
        }
    }

    // 메서드 오버로딩 : 동일 이름의 메서드를 매개 변수의 타입이나 개수로 구분하는 것
    public void setChannel(int chaneel, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if (chaneel > 1 && chaneel < 2000) {
                this.channel = chaneel;
                System.out.println("채널을 " + channel + "로 변경했습니다.");
            } else System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }

    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("소리 : " + volume);
        System.out.println("인터넷 : " + isInternet);
    }
}