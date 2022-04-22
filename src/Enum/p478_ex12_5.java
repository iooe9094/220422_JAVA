package Enum;

// EAST : 0, SOUTH : 1, WEST : 2, NORTH : 3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class p478_ex12_5 {

    public static void main(String[] args) {
        Direction d1 = Direction.EAST; // 사용하기 가장 편리
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST"); // Direction의 클래스 중 "EAST"를 찾아라는 의미

        System.out.println("d1= " + d1);
        System.out.println("d2= " + d2);
        System.out.println("d3= " + d3);

        // 열거형은 ==과 equals 둘 다 비교 가능
        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));
        System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));
        // System.out.println("d2>d3 ? " + (d1>d3); // 에러 : 열거형은 부등호(<,>) 비교 X, compareTo는 가능
        System.out.println("d1.compareTo(d3) " + (d1.compareTo(d3))); // d1:0, d3:0
        // (열거형의 경우) d1(0) - d2(2) = -2 (연산처리)
        // (일반적인 비교) 크면 1, 같으면 0, 작으면 -1
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // d1:0, d2:2

        switch(d1) {
            case EAST : // Direction.EAST라고 쓸 수 없다.
                System.out.println("The direction is EAST.");
                break;
            case SOUTH : 
                System.out.println("The direction is SOUTH.");
                break;
            case WEST : 
                System.out.println("The direction is WEST.");
                break;
            case NORTH : 
                System.out.println("The direction is NORTH.");
                break;
            default:
                System.out.println("Invaild direction.");
                break;
        }
         // 열거형의 자료들을 배열로 반환(return)
        Direction[] dArr = Direction.values();
        for(Direction d : dArr) // for(Direction d : Direction.values())
            // name() : 열거형의 상수 이름을 반환(리턴)
            // ordinal() : 열거형의 상수 순서를 반환
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}
