public class Exam1Car {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        // Car 클래스의 2개 메서드를 이용하여 출력하는 코드
        System.out.printf("자동차 수 : %d\n",  Car.getNumOfCar());
        System.out.printf("빨간 자동차 수 : %d", Car.getNumOfRedCar() );
    }
}



class Car{
    private String color;
    static int numOfCar;
    static int numOfRedCar;

    public Car(String color) {
        this.color = color;
        numOfCar++;
        if(this.color.equalsIgnoreCase("red")) numOfRedCar++;
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
}
