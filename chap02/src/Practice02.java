import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        // 01 (별찍기)
        int k = 1;
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < 11; j++) {
                if (i == j) {
                    for (int x = 0; x < k; x++)
                        System.out.print("*");
                } else if (i > j) System.out.print(" ");
            }
            System.out.println();
            k += 2;
        }

        // 02 정수의 제곱값 출력
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = in.nextInt();
        int square = number * number;
        System.out.println(number + "의 제곱은 " + square);

        //03 원기둥의 부피

        System.out.print("원기둥의 밑면 반지름은 ?  : ");
        int radius = in.nextInt();
        System.out.print("원기둥의 높이는 ? : ");
        int height = in.nextInt();
        double cyVolume = radius * radius * 3.14 * height;
        System.out.println("원기둥의 부피는 "+cyVolume);

        //04 초를 시분으로 환산
        System.out.print("초 단위 정수를 입력하세요 : ");
        int sec = in.nextInt();
        int min = sec/60;
        int hour = min/60;
        sec = sec%60;
        min = min%60;

        System.out.println(hour+"시간 "+min+"분 "+sec+"초");

        //05 소문자를 대문자로
        char c = 'a';
        int a = (int)'a'-(int)'A';
        System.out.println((char)(c-a));

        //06 화씨온도 -> 섭씨온도
        System.out.print("화씨 온도를 입력하세요 : ");
        int fah = in.nextInt();
        double cel = (5.0/9.0)*((double)fah-32);
        System.out.printf("섭씨온도는 %2f\n",cel);

        //07 4,5 약수 확인

        boolean one = false,two=false,three=false;
        System.out.print("정수를 입력하세요 : ");
        int integer = in.nextInt();
        if(integer % 4 == 0 || integer % 5 == 0 ){
            if(integer % 4 == 0 && integer % 5 == 0 )
                one = true;
            else if (integer % 4 != 0 || integer % 5 != 0)
                three = true;
            else two = true;
        }
        System.out.println(integer+" : "+one+" , "+two+" , "+three);


        //08 정수를 입력받아 자리수 더하기
        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();
        int sum = (num%100)+(num%10)+(num%1);


        //09 학점 이수 계산기
    }


}
