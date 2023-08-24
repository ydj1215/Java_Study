package 슈퍼메서드;

//this 가 자기자신을 말하는 것처럼,
// super은 부모의 필드나 메서드를 접근할때 사용

public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
        //child.childMethod();
    }
}

class Parent {
    int x = 10;
    int y;

//    Parent(){ // 이 생성자가 존재하지 않으면 child에서 super가 필요하다.
//        y = 10;
//    }

    Parent(int n) {
        y = n;
    }
}

class Child extends Parent {
    int z;
    Child(){
        super(100); // 부모의 생성자를 호출 
        z=20;
    }
    void display(){
        System.out.println(y);
        System.out.println(z);
    }

 //   int x = 20;
 //
//    void childMethod() {
//        System.out.println("x : " + x); // 자식 필드 접근
//        System.out.println("this.x : " + this.x); // 원래 this. 는 숨어있었다.
//        System.out.println("x : " + super.x); // 부모의 필드 접근
//    }
}