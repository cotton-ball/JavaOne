public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0,5.0);
        Triangle t2 = new Triangle(5.0,10.0);
        Triangle t3 = new Triangle(8.0,8.0);

        System.out.println(t1.findArea());
        System.out.println(t2.findArea());
        System.out.println(t3.findArea());

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}

class Triangle{
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    double findArea(){
        return (height*base)/2;
    }

    boolean isSameArea(Triangle t){
        if(this.findArea() == t.findArea()) return true;
        else return false;
    }

}
