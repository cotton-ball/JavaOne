public class CircleDemo {//static 의 의미 : 공간을 공유한다, 객체가 만들어지기 이전에 사용할 수 있다.(공간, 시간적으로 활용)
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0,"빨강");

        System.out.println("원의 개수(inum): "+circle1.inum);
        System.out.println("원의 개수(snum): "+Circle.snum);

        Circle circle2 = new Circle(2.0,"검정");

        System.out.println("원의 개수(inum c2): "+circle2.inum);
        System.out.println("원의 개수(snum c2): "+Circle.snum);

        circle1.show();

        //sayhello(); //메인 메서드가 static이기 때문에 이 안에서 static이 아닌 메서드를 사용할 수 없다.
        //메서드에 static을 붙여서 static 메서드로 만들어 주던지, 객체를 만든 후에 호출해야 한다.

        CircleDemo h = new CircleDemo();
        h.sayhello();


    }

    void sayhello(){ //객체가 만들어져야 사용 가능.
        System.out.println("안녕");
    }
}

class Circle{
    private double radius;
    private String color;
    int inum; // 각 개체마다 따로 가지고 있다
    static int snum; //공통으로 하나만 가지고 있다

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        inum++;
        snum++;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double r){
        if (r <0.0) this.radius = 0.0;
        this.radius = r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double findArea(){
        return 3.14 * this.radius*radius;
    }
    void show(){
        System.out.println("반지름이 "+ radius +" 인 "+color+"색 입니다.");
    }
}