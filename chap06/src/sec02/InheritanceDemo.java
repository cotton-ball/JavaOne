package sec02;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle(); //디폴트 생성자 사용
        Ball b = new Ball("빨간색");

        System.out.println("원 : ");
        c.findRadius();
        c.findArea();

        System.out.println("\n공: ");
        b.findRadius();
        b.findArea();
        b.findColor();
        b.findVolume();
    }
}
