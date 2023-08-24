package 싱글톤;

import java.security.Signature;

public class SingletonMain {
    public static void main(String[] args) {
        //Singleton test = new Singleton(); // 객체 생성 불가
//        Singleton obj1 = Singleton.getSingleton();
//        Singleton obj2 = Singleton.getSingleton();
//
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        System.out.println(obj2.id);
//        System.out.println(obj2.name);
//
//        obj1.id = 1004;
//        obj1.name = "병신";
//        System.out.println(obj2.id);
//        System.out.println(obj2.name);

        TestObject1 t1 = new TestObject1();
        TestObject2 t2 = new TestObject2();

        for(int i = 0; i<10000; i++) {
            t1.setInfo("장애인", 22);
            t2.setInfo("저능아", 30);
        }

        t2.viewInfo();
    }
}
