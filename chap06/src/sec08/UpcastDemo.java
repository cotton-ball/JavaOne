package sec08;

public class UpcastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s; //자식 타입을 부모에 대입 하는 것은 아무런 문제가 없다.

        //p.number = 2;
        //p.work();

        p.whoami();
    }
}
