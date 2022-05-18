package sec02;

public class Circle {
    private void secret(){
        System.out.println("비밀이다.");
    }

    protected void findRadius(){
        System.out.println("반지름은 10센티이다.");
    }

    public void findArea(){
        System.out.println("넓이는 3.14 * 10 * 10이다.");
    }
}
