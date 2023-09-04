package 스트림예제3번;

// Files 의 정적 메소드인 lines() 와 BufferedReader의
// - Line() 메소드를 이용하며 문자 파일의 내용을 스트림을
// - 통해 행 단위로 읽고 콘솔에 출력

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) throws IOException {
    // 파일 내용을 소스로 하는 스트림 생성
        Path path = Paths.get("D:\\dev\\work_java\\java_k_digital_0814\\src\\스트림예제3번\\test.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();
        
    // BufferedReader의 Line() 메서드 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
