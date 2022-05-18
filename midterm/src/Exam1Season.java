import java.util.Scanner;

public class Exam1Season {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>> ");
        int month = in.nextInt();
        Season season = new Season(month);
        System.out.println(season.show());
    }
}

class Season {
    // 필요한 변수 선언문 및 생성자
    int month;

    public Season(int month) {
        this.month = month;
    }

    String show(){
        String str = switch (month){
            case  3,4,5-> "봄 입니다";
            case  6,7,8 -> "여름 입니다";
            case  9,10,11 -> "가을 입니다";
            case  12,1,2 -> "겨울 입니다";
            default -> "잘못된 달 입니다";
        };
        return str;
    }


}