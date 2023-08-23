package 오버로딩;

public class OverloadingEx {
    public static void main(String[] args) {
        System.out.println(sum(100, 200)); // 300
        System.out.println(sum("100", 200)); // 100200
        System.out.println(sum(100, 200, "300")); // 300300
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static String sum(String x, int y) { // 오직 매개변수 만을 변경
        return x + y;                      // 반환 타입은 오버로딩 조건에 포함 X
    }

    static String sum(int x, int y, String z){
        return x+y+z;
    }
}
