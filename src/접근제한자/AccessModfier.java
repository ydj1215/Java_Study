package 접근제한자;

// protected : 같은 패키지 / 자식 클래스에서 사용 가능.
// 패키지를 import 한 경우에도 사용이 가능.

// getter/ setter 메소드는 private 필드를 읽기/쓰기를 하기 위해 존재.

public class AccessModfier {
    public static void main(String[] args) {
        Child child = new Child("엔지니어");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());
    }
}

class Child extends Parent {
    String jobs;

    public Child(String jobs) {
        this.jobs = jobs;
    }

    // 상속받은 protected 멤버에 접근 가능
    public String getName() {
        return name;
    }

    // 상속받은 protected 멤버에 접근 가능
    public String getMoney() {
        return money;
    }

    // 상속받은 protected 멤버에 접근 가능
    public String getAddr() {
        return addr;
    }
}