package 다중인터페이스;

// 자바는 다중 상속 지원 X
// 대신 인터페이스를 통해 다중 상속의 효과 구현 가능

public class MultiInterface {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar(false, 20, false, 250, "Red", "2020", true);
        ferrari.viewInfo();
    }
}
