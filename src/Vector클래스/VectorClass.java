package Vector클래스;

// Vector : ArrayList 구조와 메소드가 동일
// 차이점으로는, 동기화가 지원되어서 멀티 스레드 환경에서 안전
// 그러나 ArrayList에 비해서 성능이 떨어진다.

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>(); // Vector -> ArrayList 로 바꿔도 동일하게 작동한다.
        list.add(new NameCard("우영우", "yyy@gmail.com", "010-1234-5678", "변호사"));
        list.add(new NameCard("동글이", "yyy@gmail.com", "010-1234-5678", "백수"));
        list.add(new NameCard("이준호", "yyy@gmail.com", "010-1234-5678", "건축가"));

        for(NameCard e : list){
            System.out.println("이름 : " + e.name + "\n이메일 : " + e.mail + "\n연락처 : " +e.phone+"\n직업 : " + e.jobs+"\n");
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    // 생성자가 아무것도 생성되어 있지 않을 때만, 기본 생성자가 자동으로 생성된다.
    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}