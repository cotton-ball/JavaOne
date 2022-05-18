package sec08;

public class Student extends Person{
    String name = "학생";
    int number = 1;

    static void work(){
        System.out.println("나는 공부한다.");
    }

    @Override
    void whoami() {
        System.out.println("나는 학생이다");
    }
}
