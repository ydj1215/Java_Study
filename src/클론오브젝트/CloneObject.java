package 클론오브젝트;

// Clone : 얕은 복사

public class CloneObject implements Cloneable{
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이", "5555", 22, true);
        Member mem2 = mem1; // 얕은 복사
        mem1.viewInfo();
        mem2.name = "눈사람";
        mem2.password = "1234";
        mem1.viewInfo();
        mem2.viewInfo();
    }
}
