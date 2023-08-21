package 문자열다루기;

// 자바의 문자열(String)은 참조 형이다.
// equals : 두 개의 문자열이 동일한지 비교하여 결과값을 반환한다.
// 결과값은 true / false
// 연산자 == 는 문자열의 주소가 같은지를 물어보기 때문에 equals를 써야한다.

// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
// charAt : 문자열에서 특정 위치의 문자를 반환
// replace : 단순히 문자열만 을 대체
// replaceAll : 문자열에서 특정 문자열을 다른 문자열로 변경, replace에 추가적으로 정규식도 대체
// substring : 특정한 문자열을 추출할 때 사용
// toUpperCase / toLowerCase : 문자열 전부를 대/소문자로 바꿀 때 사용
// trim : 문자열 앞 뒤의 공백을 잘라낸다.
// split : 특정 구분자를 기준으로 문자열을 분할하여 문자열 배열로 반환한다.
// String.format() : 문자열 포맷팅
// toCharArray() : 문자열을 문자 배열로 변환한다.

public class StringMethod
{
    public static void main(String[] args) {
        String a = "Hello";
        String b = "java";
        String c = "Hello";
        String d = "hello";
        String e = new String("hello");

        // equals
        System.out.println(a.equals(b)); // 값을 비교
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
        System.out.println(a.equalsIgnoreCase(d)); // 대소문자 구분X
        System.out.println(d.equals(e));

        // indexOf
        System.out.println(a.indexOf("l")); // H(0) e(1) l(2), 문자가 시작되는 인덱스 반환
        System.out.println(a.indexOf("lo")); // 3
        System.out.println(a.indexOf("lt")); // -1 (없다)

        // contains
        String f= "Hello Java";
        System.out.println(f.contains("Java")); // 포함되어 있으니까 true 반환

        // charAt
        System.out.println(a.charAt(4));
        
        // replace / replaceAll
        String g= "Hello Java Java";
        System.out.println(g.replaceAll("Java", "Python"));
        System.out.println(g.replace("Java", "Python"));
        System.out.println(g.replace("Java", "")); // 삭제도 가능

        // substring
        System.out.println(g.substring(0,3)); // 0~3
        System.out.println(g.substring(3)); // 3~

        // toUpperCase / toLowerCase
        System.out.println(g.toUpperCase());
        System.out.println(g.toLowerCase());

        // trim
        String h = "       Ha~Ha~Ha     ";
        System.out.println(h);
        System.out.println(h.trim());

        // split
        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        for(String z : modifyTime) System.out.print(z +" ");

        System.out.println();

        // 문자열 포맷팅
        System.out.printf("I eat %d apples.\n", 3);
        //System.out.println(String.format("I eat %d apples",3));
        // 문자열 포맷팅을 출력을 위해서 사용
        String test = String.format("I eat %d apples", 3);
        System.out.println(test); // 변수에 담아서 계속 사용이 가능

        // toCharArray()
        String testName = "Andrew";
        char[] chName = testName.toCharArray();
        for(char ch : chName) System.out.print(ch + " ");
        // 문자열의 각 문자가 배열의 요소로 들어가게 된다.
    }
}
