package Genetic_Class;

import java.util.ArrayList;

// 지네릭스 테스트용 부모 클래스
class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

// 지네릭스 테스트용 클래스 1
class Apple extends Fruit {

    // 조상 object 메소드 toString() 오버라이딩
    // 조상 object toString() 출력 : 주소값
    @Override
    public String toString() {
        return "Apple";
    }
}

// 지네릭스 테스트용 클래스 2
class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

// 지네릭스 테스트용 클래스 3
class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

// 지네릭스 테스트용 인터페이스
interface Eatable {}

// 지네릭스 클래스 정의 부분. 공통팀에서 만들 수 있음
// 일반 팀은 공동팀에서 만들어 진 클래스를 사용함
public class p467_ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치 (Grape != Apple)
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러. 상속관계 X

        // ArrayList에 자료 저장
        // add 메소드를 호출할 때 마다 내부적으로 배열 공간을 만들어 저장
        fruitBox.add(new Fruit()); // add[0]
        fruitBox.add(new Apple()); // add[1]
        fruitBox.add(new Grape()); // add[2]
        appleBox.add(new Apple()); // add[3]
        grapeBox.add(new Grape()); // add[4]
        // appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손이 아님

        // 출력
        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }
}

// 지네릭스 클래스 정의 부분
// 공통 팀에서 만들 수 있음. 일반 개발자는 사용만
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    // ArrayList의 기본 메소드 add 다시 정의 (오버라이딩 X)
    // ArrayList에 자료 저장
    void add(T item) {
        list.add(item);
    }

    // ArrayList 매개변수 index 번호에 해당하는 자료 가져오기
    T get(int i) {
        return list.get(i);
    }

    // 향상된 배열(ArrayList)의 크기 cf) Array의 length
    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}