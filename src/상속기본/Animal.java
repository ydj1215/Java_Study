package 상속기본;

public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

// 또 다른 클래스
// public 클래스는 하나여야 한다.
// (defalut) 접근제한자는 같은 패키지 내에서만 사용 가능
class Dog extends Animal { // Animal을 상속받아 Dog 클래스를 생성
    void sleep() {
        System.out.println((name) + "Zzz");
    }
}

class HouseDog extends Dog { // 오버라이딩
    void sleep() {
        System.out.println(this.name + "Zzz in house");
    }

    void sleep(int hour) { // 오버로딩
        System.out.println(this.name + "Zzz in House for " + hour + "~");
    }
}

// 오버라이딩은 상위 클래스 (혹은 인터페이스) -> 하위 클래스
// 오버로딩은 같은 클래스 내에서 발생
