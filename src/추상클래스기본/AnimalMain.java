package 추상클래스기본;

import 생성자오버로딩.Car;

public class AnimalMain {
    public static void main(String[] args) {
//        AnimalClass animalClass = new AnimalClass() {
//            @Override
//            void cry() {
//
//            }

        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep();

        // 추상 클래스 참조 변수로 상속 객체를 접근, 자주 쓰이는 방법
        AnimalClass animal = new Cat(); // 가능
        animal.sleep();
    }
}
