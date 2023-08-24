package 상속TV;

public class PrototypeTV {
    boolean isPower;
    int channel;
    int volume;

    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }

    // 생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int channel) {
        if (channel > 0 && channel < 1000) {
            this.channel = channel;
        }
        else {
            System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }

}
