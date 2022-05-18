import java.util.Scanner;

public class SniffleQuiz2 {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        Sniffle sniffle = new Sniffle(odd, even);
        int x = 1;

        // input() 메서드로 입력된 정수가
        // 양수일 동안만 반복
        //while((x = sniffle.input()) > 0 )
        while(x > 0) {
            x = sniffle.input();
            if(x > 0) System.out.print(x + " ");
        }
        
        System.out.println();

        sniffle.print();
    }
}

// 다음 클래스는 홀짝에 대한 빈도수를 파악하기 위한 클래스이다.
class Sniffle {
    int odd, even;  // 홀수, 짝수의 빈도수의 저장 변수
    Scanner in = new Scanner(System.in);

    public Sniffle(int odd, int even) {
        this.odd = odd;
        this.even = even;
    }
    // 생성자

    //함수 앞에 public 넣어도 되고 안 넣어도 됨
   int input() {
        int num = in.nextInt();
        if(num > 0){
            if( num%2 == 0) even++;
            else odd ++;
            return num;
        }
        else return -1;
        // 키보드에 의하여 입력된 정수가
        // 홀수인지 짝수인지 파악한 후
        // odd, even을 하나씩 증가하는 내용의 코드
    }

    void print() {
        System.out.print("홀수 : ");
        for(int i = odd; i > 0; i--) System.out.print("*");
        System.out.print("\n짝수 : ");
        for(int i = even; i > 0; i--) System.out.print("*");
        // odd, even 값을 이용하여
        // 히스토그램을 별표로 표현하는 코드
    }
}
