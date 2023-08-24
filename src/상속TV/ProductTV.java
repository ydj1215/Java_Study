package 상속TV;

// PrototypeTV 로 부터 상속을 받는 ProductTV 클래스

public class ProductTV extends PrototypeTV {
    String name;
    boolean isInternet;

    ProductTV(){
        name = "Smart TV";
    }
    
    // 생성자 오버로딩
    ProductTV(String name){
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower (boolean isPower) {
        this.isPower = isPower;
    }

    void  setVolume(int volume) {
        if(volume>= 0 && volume<=100){
            this.volume = volume;
        }
        else System.out.println("소리 설정 범위를 벗어났습니다.");
    }

    // 오버라이딩 : 부모에게서 물려받은 기능을 재정의해서 사용하는 것

}
