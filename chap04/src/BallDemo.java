public class BallDemo {
    public static void main(String[] args) {
        Ball ball = new Ball(3.0,"빨강"); //ball 은 heap 메모리에 있는 참조 변수
        ball.show();


    }
}

class Ball{
   private double radius;
   private String color;
    // public  Ball(){} //아무것도 하지 않으면 생성자 자동으로 생성해준다.

    public  Ball(){
        this(1.0,"검정");
        //this(1.0);
        //color = "검정";
    }

    public Ball(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Ball(double radius){ //생성자 오버로딩
        this(radius,"검정");
    }

    public  Ball(String color){
        this(1.0,color);
    }

    void show(){
        System.out.println("반지름이 "+radius+" 인 " +color +"색 공입니다.");
    }
}