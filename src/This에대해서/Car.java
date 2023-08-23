package This에대해서;

public class Car {
    private String model; // 이름
    private int year; // 출고 연도
    private String color; // 색상
    private int maxSpeed; // 최고 속력

    // 생성자
    public Car() {
    }

    public Car(String model) {
        //this.model = model;
        this(model, 2002, "Black", 200); // 다른 생성자 호출
        // model 만 인자를 받고, 나머지 값은 위와 같은 값으로 자동으로 생성되게 설계
    }

    public Car(String model, int year, String color, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        // maxSpeed = maxSpeed 라고 작성해도 무방하지만,
        // 두 변수의 이름이 같기 때문에 명시적으로 this. 을 붙여줘야 한다.
    }

    void CarInfo(){
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(this.color);
        System.out.println(this.maxSpeed);
    }
}
