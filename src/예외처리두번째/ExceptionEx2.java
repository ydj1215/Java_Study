package 예외처리두번째;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx2 {
    public static void main(String[] args) throws IOException {
        try {
            // 파일 입출력
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            br.readLine();
            br.close();
        }
//        catch(FileNotFoundException e){ // 파일이 존재X
//            System.out.println(e);
//        }
        catch (IOException e){ // FileNotFoundException이 포함된다. 입출력 관련 예외 클래스
            System.out.println(e);
        }
    }
}
