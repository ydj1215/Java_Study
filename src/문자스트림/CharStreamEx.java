package 문자스트림;

import java.io.*;

// 읽기 가능
// Writer : 문자열 기반의 출력 스트림의 최상위 클래스로 추상 클래스
// Reader : 문자열 기반의 입력 스트림의 최상위 클래스로 추상 클래스

public class CharStreamEx {
    public static void main(String[] args) throws IOException {
//        // 쓰기
//        Writer writer = new FileWriter("test.txt");
//        char[] data = "유동재".toCharArray(); // 각각의 글자가 하나하나의 문자로 (문자열 -> 문자 배열)
////        for (int i = 0; i < data.length; i++) {
////            writer.write(data[i]);
////        }
//        writer.write(data);
//        writer.flush(); // 버퍼 비우기
//        writer.close();
    
        // 읽기
        Reader reader = new FileReader("test.txt");
        while(true){
            int readData = reader.read();
            if(readData == -1) break;
            System.out.println((char)readData);
        }
        reader.close();
    }
}
