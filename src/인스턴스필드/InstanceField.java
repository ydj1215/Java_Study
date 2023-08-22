package 인스턴스필드;

import java.lang.reflect.Field;

public class InstanceField {
    public static void main(String[] args) {
        int val = 30; // 지역 변수
        FieldTest f1 = new FieldTest();
        f1.instanceVal = 200;
        FieldTest f2 = new FieldTest();
        f2.instanceVal = 300;

        FieldTest.classVal = 1000; // 클래스 변수 = 정적 변수
        // 프로그램 종료시 소멸
    }
}
