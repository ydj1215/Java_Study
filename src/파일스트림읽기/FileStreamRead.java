package 파일스트림읽기;

import 다중인터페이스.SportsCar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("D:\\dev\\work_java\\java_k_digital_0814\\src\\파일스트림읽기\\what.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("읽을 파일을 찾지 못했습니다!");
        }

        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) { // 읽을 내용이 있으면 true를 반환
            String line = sc.nextLine(); // 문자열을 줄바꿈 기준으로 읽기
            System.out.println(line);
        }
    }
}
