package 커피메뉴만들기;

// HashMap으로 커피 메뉴 List 만들기

import 추상클래스두번째.Phone;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenuList {
    static Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        makeMenu();
        selectMenu();
    }

    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "Basic Coffee"));
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "Deep Coffee"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "Sweet Milky Coffee"));
    }

    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = ""; // 키를 받기 위한 문자열 변수
        while (true) {
            System.out.println("=".repeat(10) + " Menu List " + "=".repeat(10));
            System.out.print("[1] Look Menu, [2] Find Menu, [3] Insert Menu, [4] Remove Menu, [5] Update Menu, [6] Quit : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("===== Menu Look =====");
                    for (String e : map.keySet()) {
                        System.out.println("Menu : " + map.get(e).getName());
                        System.out.println("Price : " + map.get(e).getPrice());
                        System.out.println("Category : " + map.get(e).getCategory());
                        System.out.println("Description : " + map.get(e).getDescription());
                        System.out.println("-".repeat(29));
                    }
                    break;
                case 2:
                    System.out.println("===== Find Menu =====");
                    System.out.print("Enter Menu : ");
                    key = sc.next();
                    // 포함여부 확인하는 메서드 : containsKey(key) : Map 내에 해당 key가 존재하는지 확인하여 결과 반환
                    if (map.containsKey(key)) {
                        System.out.println("Menu : " + map.get(key).getName());
                        System.out.println("Price : " + map.get(key).getPrice());
                        System.out.println("Category : " + map.get(key).getCategory());
                        System.out.println("Description : " + map.get(key).getDescription());
                    } else System.out.println("Selected menu does not exist!");
                    break;
                case 3:
                    System.out.println("===== Insert Menu =====");
                    System.out.print("Enter new Menu : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("Already Exist Menu!");
                    } else {
                        System.out.print("Enter Price : ");
                        int price = sc.nextInt();
                        System.out.print("Enter Category : ");
                        String category = sc.next();
                        sc.nextLine(); // 버퍼비우기
                        System.out.print("Enter Description : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, description));
                        System.out.println("Menu insert success!");
                    }
                    break;
                case 4:
                    System.out.println("===== Remove Menu =====");
                    System.out.print("Entry Remove Menu : ");
                    key = sc.next();
                    sc.nextLine();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("Menu removed Successfully");
                    }
                    else System.out.println("Menu already does not exist!");
                    break;
                case 5:
                    System.out.println("===== Update Look =====");
                    System.out.print("Entry Menu : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("Enter Price : ");
                        int price = sc.nextInt();
                        System.out.print("Enter Category : ");
                        String category = sc.next();
                        sc.nextLine(); // 버퍼비우기
                        System.out.print("Enter Description : ");
                        String description = sc.nextLine();
                        // 키 값이 동일하고 값이 변경되는 경우에 replace() 사용
                        map.replace(key, new MenuInfo(key, price, category, description));
                        System.out.println("Menu update success!");
                    }
                    else System.out.println("No menu to update!");
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    FileOutputStream fos = new FileOutputStream("D:\\dev\\work_java\\java_k_digital_0814\\src\\커피메뉴만들기\\coffee.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    fos.close();
                    return;
                default:
                    System.out.println("Undefined menu selected!");
            }
        }
    }
}