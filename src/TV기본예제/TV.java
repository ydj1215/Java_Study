package TV기본예제;

public class TV {
    private boolean isOn; // TV 전원
    private int chanenl; // 채널
    private int volume;

    // 생성자 오버로딩
    TV() {
        isOn = false;
        chanenl = 11;
        volume = 10;
        //System.out.println("전원 : " + isOn + ", 채널" + chanenl + ", 볼륨 : " + volume);
    }

    public TV(boolean isOn, int chanenl, int volume) {
        this.isOn = isOn;
        this.chanenl = chanenl;
        this.volume = volume;
        //System.out.println("전원 : " + this.isOn + ", 채널" + this.chanenl + ", 볼륨 : " + this.volume);
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
        String onOffStr = isOn ? "ON" : "OFF";
        System.out.println("TV 전원이 " + onOffStr + "가 되었습니다!");
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 990) {
            this.chanenl = channel;
            System.out.println("채널을 " + this.chanenl + "로 이동하였습니다!");
        } else {
            System.out.println("채널 값이 잘못 입력됐습니다!");
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("볼륨을 " + this.volume + "로 변경하였습니다!");
        }
    }

    public void getInfoTV() {
        String onOffStr = isOn? "ON" : "OFF";
        System.out.println("=".repeat(5)+" TV 정보 " + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + chanenl);
        System.out.println();
    }
}
