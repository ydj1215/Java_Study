package 디폴트메서드;

import 추상클래스두번째.Phone;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnON() {
        System.out.println("Audio를 킵니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(vol<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = vol;
        }
    }

    void getInfo(){
        System.out.println("Audio 입니다.");
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute){ // 부모에서 정의된 기존 메서드보다 같거나 더 넓은 범위로 접근제어자 지정이 가능
        if(mute) System.out.println("Audio : 음소거");
    }
}
