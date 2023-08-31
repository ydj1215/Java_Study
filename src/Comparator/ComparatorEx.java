package Comparator;

// 두개의 메서드를 비교하는 방법

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        // DescendComparator 정렬 조건에 값을 넣는다.
        // TreeSet<Fruit> set = new TreeSet<>(new DescendComparator());
        TreeSet<Fruit> set = new TreeSet<>(new DescendComparator().reversed());
        set.add(new Fruit("grape", 3000));
        set.add(new Fruit("melon", 10000));
        set.add(new Fruit("berry", 6000));

        for (Fruit e : set) System.out.println("과일 이름 : " + e.name + " / 가격 : " + e.price);

    }
}
