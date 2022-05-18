public class Practice04_2 {
    public static void main(String[] args) {

        //05 line 클래스 길이 비교
        Line1 a = new Line1(1);
        Line1 b = new Line1(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a==b);

        //06 복소수 클래스
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5,2.5);
        c2.print();

        //08 주사위
        Dice d = new Dice();
        System.out.println(d.roll());

    }
}
//05
class Line1{
    private int length;

    public Line1(int length) {
        this.length = length;
    }

    boolean isSameLine(Line1 line){
        if(this.length == line.length) return true;
        else return false;
    }
}
//06
class Complex{
    double r,i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public Complex(double r) {
        this.r = r;
    }

    void print(){
        System.out.printf("%.1f + %.1fi\n",r,i);
    }
}

//08
class Dice{
    int face;
    int roll(){
        return face = (int)(Math.random()*6+1);
    }
}