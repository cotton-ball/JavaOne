package sec08;

public class ForeignStudent extends Student {
    @Override
    void whoami() {
        System.out.println("나는 외국 학생이다");
    }
}
