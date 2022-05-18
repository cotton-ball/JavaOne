package sec02;

public class Ball extends Circle{
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public void findColor(){
        System.out.println(color+"공이다. ");
    }

    @Override
    public void findArea() {
        System.out.println("넓이는 4 * 3.14 * 10 * 10이다.");
    }

    public void findVolume(){
        super.findArea(); //부모 클래스의 메서드 호출
        System.out.println("부피는 4/3 * 3.14 * 10 * 10 * 10 이다. ");
    }

}
