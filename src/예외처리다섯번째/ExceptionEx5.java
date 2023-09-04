package 예외처리다섯번째;

// 예외처리 미루기

import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;

public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input(); // 예외 처리를 main에게 미루었다.
        } catch (IOException e) {
            System.out.println("입력 에러 발생!");
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

class IOSample {
    private int num;

    public void input() throws IOException {
        num = System.in.read(); // 예외처리가 필요한 저수준 입력
    } // throw를 사용하지 않고, try, catch(IOException)을 설정해주면 main 에서 예외처리를 할 필요가 없다.

    public void output() {
        System.out.println(num);
    }
}

