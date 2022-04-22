package Iterator;

import java.util.*;

public class p464_ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        // ArrayList : 향상된 배열
        // 첫 번째 add : 매개변수의 값이 내부 배열로 list[0] 저장
        // 두 번째 add : 매개변수의 값이 내부 배열로 list[1] 저장
        // 세 번째 add : 매개변수의 값이 내부 배열로 list[2] 저장
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("자바킹", 2, 1));

        // 자동 import, 향상된 배열을 Iterator로 변환
        Iterator<Student> it = list.iterator();

        // Iterator : 향상된 for문과 비슷함
        // hasNext() : 배열 같은 자료형에서 자료가 없을 때 까지 반복
        while (it.hasNext()) { // 자료가 있으면 true 없으면 false
            // Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요함
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    } 
}


