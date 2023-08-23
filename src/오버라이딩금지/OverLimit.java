package 오버라이딩금지;

// final 키워드를 사용해 메서드 오버라이딩을 금지 시켜보자.

public class OverLimit {
    public static void main(String[] args) {
        SportsCar sCar = new SportsCar("페라리");
        sCar.infoCar();
    }
}
