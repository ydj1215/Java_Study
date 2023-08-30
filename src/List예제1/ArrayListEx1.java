package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // List 인터페이스의 참조변수로 ArrayList 객체를 참조
        List<MenuInfo> menuInfoList = new ArrayList<>();
        MenuInfo menuInfo1 = new MenuInfo("Americano", 2500, "Coffee", true);
        menuInfoList.add(menuInfo1); // 참조변수로 만들어서 집어넣기
        menuInfoList.add(new MenuInfo("Latte", 4000, "Coffee", true));
        menuInfoList.add(new MenuInfo("BlackTea", 4000, "tea", true));

        // 향상된 for 문 사용
        // 향상된 for 문: 배열이나 Collection 클래스 자식들
        for (MenuInfo menu : menuInfoList) {
            System.out.println(menu.getMenuInfo());
        }

        // 일반적인 for 문 사용
        for (int i = 0; i < menuInfoList.size(); i++) {
            System.out.println(menuInfoList.get(i).getMenuInfo());
        }
    }
}

class MenuInfo {
    String name;
    int price;
    String category;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }

    public String getMenuInfo() {
        return "{" + "\"name\":" + name + "," + "\"price\":" + price + "," + "\"isTax\":" + isTax + "}";
    }
}
