package Comparable;

// Comparable 과 Comparator 는 클래스에 대한 정렬을 구현할 수 있도록 해주는 인터페이스

import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComp> list = new TreeSet<>();
        list.add(new CarComp("Sonata", 2014, "white"));
        list.add(new CarComp("Benz", 2010, "red"));
        list.add(new CarComp("Avante", 2022, "silver"));
        list.add(new CarComp("Bmw", 2003, "black"));
        list.add(new CarComp("Sm5", 2003, "black"));

        for (CarComp e : list) System.out.println("이름 : " + e.modelName + " / 연식 : " + e.modelYear + " / 색상 : " + e.color);
    }
}
