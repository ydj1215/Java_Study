package Hash셋;

// HashSet : 중복 허용X, 순서 보장X, 수학의 집합과 유사

import java.util.Arrays;
import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);

        String[] arr = {"H", "e", "l", "l", "o"};
        HashSet<String> set2 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set2);

        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java"); // add disable

        for (String e : set) {
            System.out.print(e + " ");
        }
    }
}
