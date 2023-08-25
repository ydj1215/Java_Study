package 인터페이스기본;

import java.util.Scanner;
import java.util.SortedMap;

public class InterfaceBasic {
    public static void main(String[] args) {
        NetworkAdapter networkAdapter; // 완전 추상화가 적용된 인터페이스, 구현된 내용 X
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크를 선택해주세요 : [1] LAN, [2] WiFi, [3] FiveG");
        int network = sc.nextInt();
        switch (network) {
            case 1:
                networkAdapter = new LAN("KT LAN CONNECTED");
                networkAdapter.connect();
                break;
            case 2:
                networkAdapter = new WiFi("LG WIFI CONNECTED");
                networkAdapter.connect();
                break;
            case 3:
                networkAdapter = new FiveG("SKT FIVEG CONNECTED");
                networkAdapter.connect();
                break;
            default:
                System.out.println("올바른 네트워크를 선택해주세요!");
                break;
        }
    }
}
