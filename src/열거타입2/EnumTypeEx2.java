package 열거타입2;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이", DevType.FRONTEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
    }
}
