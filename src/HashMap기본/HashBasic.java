package HashMap기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        // Map<Key, Value>
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("apple", 10);
        map.put("grape", 20);
        map.put("banana", 30);
        map.put("banana", 40); // key가 중복 → 나중에 저장된 값으로 대체
        // key : 중복X / value : 중복O → key가 내부적으로 집합(set)으로 동작
        System.out.println("총 Entry (Key와 Value를 묶어서 부르는 호칭) 수 : " + map.size());

        // 객체 찾기 get(key) : 지정된 키에 대한 값을 반환
        System.out.println(map.get("apple"));

        // 향상된 for문으로 map 순회
        for (String key : map.keySet()) System.out.println(key + "\t" + map.get(key));
        // map은 key와 value 두가지의 값을 가지기 때문에, key(집합) 부분만을 순회해야 한다.
        // ketSet() : key가 포함된 내용들 Set Collection (자료구조) 으로 반환

        // 객체 삭제 map.remove(key) : key값으로 해당 Entry(key, value 둘을 모두)를 삭제
        map.remove("grape");

        System.out.println("=".repeat(10));

        // 향상된 for문 대신 iterator(반복자)를 사용하는 방법 (어렵다!)
        Set<String> keySet = map.keySet(); // key값만 추출되서 Set 자료 구조에 삽입
        Iterator<String> iterator = keySet.iterator(); // keySet내에 있는 반복자를 탐색
        while (iterator.hasNext()) { // 반복할 것이 존재한다면,
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }
    }
}

