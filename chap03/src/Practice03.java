import java.util.Scanner;

public class Practice03 {
    static int fact(int n){
        if (n<=1)
            return 1;
        return (n*fact(n-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(fact(5));

        //02. 등수 입력받아 결과 출력하기
        int grade = in.nextInt();
        switch (grade) {
            case 1 -> System.out.println("아주 잘했습니다");
            case 2,3 -> System.out.println("잘했습니다");
            case 4,5,6 -> System.out.println("보통입니다");
            default -> System.out.println("노력해야겠습니다");
        }


        //03. 키보드로 입력된 양의 정수 중 짝수만 더하여 출력, 양수가 아니라면 입력을 종료한다
        int num=0,sum=0;
        do{
            System.out.printf("양의 정수를 입력하세요 : ");
            num = in.nextInt();
            if(num%2 == 0)
                sum += num;

        }while(num>=0);

        System.out.println("입력한 양의 정수 중에서 짝수의 합은 : "+sum);

        //04.for 문을 사용한 별찍기
        for(int i = 0; i<6; i++){
            for(int j = 0 ; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        //05. 피타고라스의 정리 (직각 삼각형의 변 구하기) (a^2 + b^2 = c^2)
        for (int a = 1; a<20; a++){
            for(int b = 1; b < 20; b ++){
                for(int c = 1; c <20; c++){
                    if(a * a + b* b == c* c)
                        System.out.printf("%2d, %2d, %2d\n", a,b,c);
                }
            }
        }

        //06. 가위바위보
        String c,y;
         c = in.next();
         y = in.next();

        if(c.equals("r")){
            if(y.equals("s")) System.out.println("철수, 승!");
            else if (y.equals("p")) System.out.println("영희 승!");
            else System.out.println("비김");
        }
        else if(c.equals("s")){
            if(y.equals("r")) System.out.println("영희, 승!");
            else if(y.equals("p")) System.out.println("철수 승!");
            else System.out.println("비김");
        }
        else if(c.equals("p")){
            if(y.equals("s")) System.out.println("영희 승");
            else if(y.equals("r")) System.out.println("철수 승");
            else System.out.println("비김");
        }

        //07 08
        c = input("철수");
        y =input("영희");


        //09 factorial

        //10 foo

        //11 isPrime



    }

    public static void foo(String s,int i){
        // 작성.. 오버로딩도 다 작성,,,
    }

    public static String input(String name){
        Scanner in = new Scanner(System.in);
        String guess = in.next();
        return guess;
    }

    public static void whosWin(String name1, String name2){
        if(name1.equals("r")){
            if(name2.equals("s")) System.out.println("철수, 승!");
            else if (name2.equals("p")) System.out.println("영희 승!");
            else System.out.println("비김");
        }
        else if(name1.equals("s")){
            if(name2.equals("r")) System.out.println("영희, 승!");
            else if(name2.equals("p")) System.out.println("철수 승!");
            else System.out.println("비김");
        }
        else if(name1.equals("p")){
            if(name2.equals("s")) System.out.println("영희 승");
            else if(name2.equals("r")) System.out.println("철수 승");
            else System.out.println("비김");
        }
    }
}
