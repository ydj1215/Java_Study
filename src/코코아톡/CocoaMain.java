package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk  = new CocoaTalk("유동재");
        cocoaTalk.writeMassage("안녕");
        NetAdapter netAdapter;
        Scanner sc = new Scanner(System.in);

        System.out.println("네트워크 [1] WiFi, [2] 5G");
        int sel = sc.nextInt();
        if(sel == 1){
            netAdapter = new WiFi();
        }
        else {
            netAdapter = new FiveG();
        }
        cocoaTalk.send(netAdapter);
    }
}
