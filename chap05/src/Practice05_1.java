
import java.util.Scanner;

public class Practice05_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //01  문자열s에 포함되는 문자 c의 개수 반환
        String s = "kongnoyeon";
        System.out.println(CountChar(s,'o'));

        //02 첫번째 매개변수 제외하고 전부 더하기
        System.out.println(sumExceptFirst(1,2,3,4));
        int arr[]={2,3};
        System.out.println(sumExceptFirst(1,arr));
        System.out.println(sumExceptFirst(1,2,3,4,5));

        //03 동서남북 열거타입
        for(Direction d : Direction.values())
            System.out.print(d+" ");

        //04 URL 조사
        String url;
        System.out.print("URL을 입력하세요 : ");
        while((url = in.next()).equals("bye")==false) {
            //String url = in.next();
            if (url.endsWith("com")) System.out.println(url + "은 'com'으로 끝납니다");
            if (url.contains("java")) System.out.println(url + "은 'java'를 포함합니다.");
            System.out.print("URL을 입력하세요 : ");
        }


        //05
        int[] freq = {0,0,0,0,0,0,0,0,0,0};
        int x = 0;

        for(int i = 0; i< freq.length; i++){
            x = in.nextInt();
            if(x > 0) freq[x/10]++; //freq[x/freq/length]++;
        }
        for(int i = 0; i < freq.length; i++){
            System.out.printf("%2d ~ %2d : ", i*10, (i + 1)*10-1);
            for(int k = 0; k <freq[i]; k++) System.out.print("*");
            System.out.println();
        }


        /*
        //08
        String d = in.next();
        DayofWeek day;
        if(d.equalsIgnoreCase(String.valueOf(DayofWeek.월요일))) day = DayofWeek.월요일;
        else day = DayofWeek.화요일;

        System.out.println(day.name() + "싫어");
*/


    }

    //01
    static int CountChar(String s,char c){
        int num = 0;
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) ==c) num++;
        }
        return num;
    }

    //02
    static int sumExceptFirst(int f,int...n){
        int sum = 0;
        for(int i:n)
            sum +=i;
        return sum;

    }
}

//03
enum Direction{동,서,남,북;}


