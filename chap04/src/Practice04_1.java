public class Practice04_1 {
    public static void main(String[] args) {
        //01 삼각형을 나타내는 클래스
        Triangle2 t = new Triangle2(10.0,5.0);
        System.out.println(t.getArea());

        //02. 넓이 비교 메서드 구현
        Triangle2 t2 = new Triangle2(5.0,10.0);
        Triangle2 t3 = new Triangle2(8.0,8.0);
        System.out.println(t.isSameArea(t2));
        System.out.println(t.isSameArea(t3));


        // 04 빨간 자동차 갯수 출력 클래스
        Car2 c1 = new Car2("red");
        Car2 c2 = new Car2("black");
        Car2 c3 = new Car2("RED");

        System.out.println(Car2.getNumOfCar()+" "+Car2.getNumOfRedCar());


    }
}


//01,02
class Triangle2{
    private double height;
    private double base;

    public Triangle2(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    double getArea(){
        return base*height/2;
    }
    boolean isSameArea(Triangle2 t){
        if(this.getArea() == t.getArea()) return true;
        else return false;
    }
}

//03 회원 관리 Member 클래스
class Member{
    private String name;
    private int age;
    private  String id;
    private int passwd;

    public Member(String name, int age, String id, int passwd) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.passwd = passwd;
    }

}

//04
class Car2{
    private String color;
    static int numOfCar;
    static int numOfRedCar;

    public Car2(String color) {
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

