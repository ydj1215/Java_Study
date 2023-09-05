package 직렬화연습;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerializeEx {
    public static void main(String[] args) {
        // 객체 리스트를 생성하고 파일에 저장한 뒤, 다시 읽어온다.

        // 객체 리스트 생성
        writeList();

        // 파일에서 객체 리스트를 읽어옴
        List<Board> list = readList();

        // 날짜를 원하는 형식으로 출력하기 위한 SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 읽어온 객체 리스트를 출력
        for (Board b : list) {
            System.out.printf("%d %s %s %s %s\n", b.getBno(), b.getTitle(), b.getContent(), b.getWriter(), sdf.format(b.getDate()));
        }
    }

    public static void writeList() {
        // 직렬화를 사용하여 객체 리스트를 파일에 저장

        // 객체 리스트 생성
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "C++", "고성능 언어", "우영우", new Date()));
        list.add(new Board(2, "Java", "객체지향 언어", "동그라미", new Date()));
        list.add(new Board(3, "Python", "간결한 언어", "이준호", new Date()));

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            // 파일 출력 스트림 생성
            fos = new FileOutputStream("board.db");
            // 객체 출력 스트림 생성
            oos = new ObjectOutputStream(fos);

            // 객체 리스트를 파일에 쓰기
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Board> readList() {
        // 파일에서 객체 리스트를 읽어옴

        try {
            // 파일 입력 스트림 생성
            FileInputStream fis = new FileInputStream("board.db");
            // 객체 입력 스트림 생성
            ObjectInputStream ois = new ObjectInputStream(fis);

            // 파일에서 객체 리스트를 읽어와서 형변환
            List<Board> list = (List<Board>) ois.readObject();
            return list;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
