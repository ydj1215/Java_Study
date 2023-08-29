package 스트링다루기;

// StringBuffer(동기화지원), StringBulder(동기화 지원x) 둘 다 문자열을 추가하거나 변경할때 사용
// Stringer 자료형과 어떤 차이가 있는지만 이해하면 된다.
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder : 가변 문자열
        sb.append("hello"); // 문자열 뒤에 추가
        sb.append(" ");
        sb.append("java");
        System.out.println("sb : " + sb);

        String st = "";
        st += "Hello";
        st += "";
        st += "java";
        System.out.println("st : " + st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        // insert : 해당 offset에 문자열을 추가
        sb2.insert(1, "hello");
        System.out.println(sb2);
        sb2.delete(7,10);
        System.out.println(sb2);
    }

}

