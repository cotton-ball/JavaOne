package practice06;

public class Number01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        ColoredCircle ccircle = new ColoredCircle(10,"빨강");
        circle.show();
        ccircle.show();
    }
}

class Circle{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void show(){
        System.out.println("반지름이 "+radius+"인 원이다.");
    }
}

class ColoredCircle extends Circle{
    String color;

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    void show(){
        System.out.println("반지름이 "+radius+"인 "+color+"색 원이다.");
    }
}