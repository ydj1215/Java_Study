package 제네릭연습2;

public class GenericPrinter<T> {
    private T material; // T 자료형으로 변수 선언
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString(){
        return material.toString();
    }
}

class Powder{
    public void doPrinting(){
        System.out.println("파우더 재료로 출력합니다.");
    }
    public String toString(){
        return "재료는 파우더입니다.";
    }
}

class Plastic{
    public void doPrinting(){
        System.out.println("플라스틱 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 플라스틱입니다.";
    }
}
