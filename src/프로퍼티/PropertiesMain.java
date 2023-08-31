package 프로퍼티;

// Map의 하나의 형태 : Map<String ,String>

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //String path = PropertiesMain.class.getResource("./database.properties").getPath();
        // 절대 경로 X, 상대 경로 O
        String path = PropertiesMain.class.getResource("../커피메뉴만들기/database.properties").getPath();
        path= URLDecoder.decode(path, "utf-8"); // 한글에 대한 처리를 위해
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username= properties.getProperty("username");
        String password= properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url  : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
