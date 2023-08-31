package Comparable;

public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 반환값이 1 이면 정렬해야 될 조건
    // 반환값이 -1 이면 정렬 조건 X
    // 반환값이 0 이면 정렬 조건은 아니지만 set을 사용하는 경우 중복 제거 조건이 된다.
   
   // 연식별로 정렬하고, 연식이 같다면 이름으로 정렬
    public int compareTo(CarComp o) {
        if(this.modelYear > o.modelYear) return 1; // 현재 연식이 새로 들어온 것보다 크다면 정렬 (연식별 오름차순)
        else{
            if(this.modelYear == o.modelYear) {// 연식이 같다면
                return this.modelName.compareTo(o.modelName); // 사전순 정렬
            }
            else return -1;
            // return 0 : 중복 제거
        }
    }
}
