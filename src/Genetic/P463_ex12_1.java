package Genetic;

import java.util.ArrayList;

// 지네릭스 테스트용 클래스 3개 정의
class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class P463_ex12_1 {
    public static void main(String[] args) {
       
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        // ArrayList<Product tvList = new ArrayList<Tv>(); // 에러
        // List<Tv> tvList = new ArrayList<Tv>(); // OK. 다형성
    
        // 향상된 배열 : ArrayList 자료 넣기
        productList.add(new Tv());
        productList.add(new Audio());
    
        // ArrayList 자료 넣기
        tvList.add(new Tv());
        tvList.add(new Tv());
    
        printAll(productList);
        // tvList (자료형) : Tv
        // printAll(매개변수 자료형) : Product
        // printAll(tvList); // 컴파일 에러 발생
    }

    // 전역메소드 : static
    public static void printAll(ArrayList<Product> list) {
        // 향상된 for문
        // list 자료가 없을 때 까지 반복문이 실행
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
