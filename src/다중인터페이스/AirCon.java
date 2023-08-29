package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // 상수 값 = public final static
    int MIN_TEMP = 18;

    void airConON();

    void ariConOFF();

    void setAirConTemp(int tmp);
}
