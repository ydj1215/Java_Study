package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {

        // 옛날 방식 (리스트에 값을 일단 집어넣고, 빼낼때 형변환)
        List list = new ArrayList();
        list.add("Hello!");
        String str  = (String) list.get(0);
        System.out.println(str);

        // 제네릭 타입으로 변환 (집어넣을때 타입변수를 지정해서 해당 형만 입력받는다.)
        List<String> list2= new ArrayList<>();
        list2.add("java");
        String str2 = list2.get(0);
        System.out.println(str2);
    }
}
