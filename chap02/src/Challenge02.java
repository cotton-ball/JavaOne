import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        // 도전과제 01 (직사각형의 넓이)
        double w,h,area;
        Scanner in = new Scanner(System.in); //main 메서드에 Scanner 객체 생성

        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        w = in.nextDouble();

        System.out.print("직사각형의 세로 길이를 입력하세요 : ");
        h = in.nextDouble();

        area = h*w;
        System.out.println("직사각형의 넓이 : "+area);

        //도전과제 02 (홀수 짝수)

        System.out.print("정수를 입력하세요 : ");
        int number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("짝수 입니다.");
        else
            System.out.println("홀수 입니다.");



    }
}
