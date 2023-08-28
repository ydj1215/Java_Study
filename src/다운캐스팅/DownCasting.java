package 다운캐스팅;

// 다운 캐스팅 : 상위 클래스 형으로 변환 되었던 하위 클래스들 다시 원래 자료형으로 변환하는 것

import 자동차만들기.PassengerCar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>(); // ArrayList<> 에는 기본 타입은 올 수 없고, 객체 타입이 와야 한다.

    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        downCasting.testCasting();
    }

        public void addAnimal () {
            aniList.add(new Animal()); // Animal 객체가 인스턴스화
            aniList.add(new Human());
            aniList.add(new Tiger());
            aniList.add(new Eagle());
            for (Animal ani : aniList) {
                ani.move();
            }
        }

        public void testCasting () {
            for (int i = 0; i < aniList.size(); i++) {
                Animal ani = aniList.get(i); // 해당하는 인덱스의 값을 추출, 업 캐스팅
                if (ani instanceof Human) { // ani 와 휴먼이 다운 캐스팅 관계인지?
                    //= human 형으로 다운캐스팅이 가능한지
                    Human h = (Human) ani;
                    h.readBook(); //

                } else if (ani instanceof Tiger) {
                    Tiger t = (Tiger) ani;
                    t.hunting();
                } else if (ani instanceof Eagle) {
                    Eagle e = (Eagle) ani;
                    e.flying();
                } else {
                    System.out.println("지원되지 않는 형입니다.");
                }
            }
        }
    }
