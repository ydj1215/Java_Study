package 디폴트메서드;

import java.util.SortedMap;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 인터페이스 내의 필드들은,
    int MIN_VOLUME = 0; // 자동적으로 final static (생략 가능)
    // 목적 : 인터페이스의 구현체들 간의 일관성 유지를 위해

    void turnON(); // 추상 메서드들로, public abstract (생략가능)
    void turnOFF();
    void setVolume(int vol);

    // default 메서드, default는 접근제어자의 목적으로 붙인다기보단,
    // 추상 클래스에서 메서드의 구현을 하겠다는 의미로 붙이는 것
    default void setMute(boolean mute) {
        if(mute) System.out.println("음소거 : ON");
        else System.out.println("음소거 : OFF");
    }

    static void changeBattery(){ // 인터페이스 생성과 무관하게 호출되는 static 메서드 != default 메서드
        System.out.println("건전지를 교환해야 합니다.");
    }
}
