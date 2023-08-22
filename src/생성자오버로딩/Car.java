package 생성자오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;


    Car(){} // 기본 생성자, 굳이 만들지 않아도 자동으로 생성

    Car(String modelName){
        model = modelName;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public void carInfo() {
        System.out.print("회사명: " + company + ", ");
        System.out.print("모델명 : " + model + ", ");
        System.out.print("색상 : " + color + ", ");
        System.out.print("속력 : " + speed + ", ");
        System.out.print("마력 : " + horsePower + " ");
        System.out.println();
    }
}
