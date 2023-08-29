package 클론오브젝트;

// clone() 은 Cloneable 인터페이스를 상속 받은 경우에만 사용 가능

public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean adult;

    void viewInfo(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Password : " + this.password);
        System.out.println("Age : " + this.age);
        System.out.println("Adult : " + this.adult);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메서드는 Object 클래스 타입이므로 형 변환
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
