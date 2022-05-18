public class ShapeTst {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle2("수정이",10),
                new Box("길동이",20) ,
                new Circle2("성신이",30)
        };

        for(Shape s : shapes){
            //System.out.println(s);
            /*
            if(s instanceof Circle ){
                Circle s1 = (Circle) s;
                System.out.println(s1.show());}
            */
            if(s instanceof Circle2)
                System.out.println(((Circle2)s).show());
            else
                System.out.println(((Box)s).show());
            System.out.println(s.getName());
        }
    }
}
class Shape{
    String name ;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


class Circle2 extends Shape{
    int radius;

    public Circle2(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    String show(){
        return "빨간원";
    }

    public String toString(){
        return "원 ["+radius+']';
    }

}

class Box extends Shape{
    private int lenth;

    public Box(String name, int lenth) {
        super(name);
        this.lenth = lenth;
    }

    public int getLenth() {
        return lenth;
    }

    @Override
    public String toString() {
        return "박스[" + lenth +']';
    }

    String show(){
        return "빨간박스";
    }
}