package 생성자오버로딩;

public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car(); // 기본 생성자
        car.carInfo();

        Car car2 = new Car("아반떼", "흰색", 100);
        car2.carInfo();

        Car car3 = new Car("소나타", "빨강", 75,50);
        car3.carInfo();
    }
}
