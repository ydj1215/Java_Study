package 싱글톤;

public class TestObject1 {
    Singleton singleton = Singleton.getSingleton(); // 단 한번 만들어진 싱글톤 객체의 주소를 가져온다.
    void setInfo(String name, int id){
        singleton.name = name;
        singleton.id = id;
    }

    void viewInfo() {
        System.out.println("이름: " + singleton.name);
        System.out.println("아이디: " + singleton.id);
    }
}
