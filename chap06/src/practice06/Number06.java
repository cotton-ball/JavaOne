package practice06;

public class Number06 {
    public static void main(String[] args) {
        Car c = new Car("파랑",200,1000,5);
        c.show();
        System.out.println();
        Vehicle v = c;
        v.show();
    }
}

class Vehicle{
    String color;
    int speed;

    void show(){
        System.out.println("자동차의 색상은 "+color+" , 속도는 "+speed);
    }

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
}

class Car extends Vehicle{
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    void show(){
        System.out.println("자동차의 색상은 "+color+" , 속도는 "+speed+" 배기량은 "+displacement+" 기어 단수는 "+gears);
    }
}