package sec02;

import java.util.Scanner;

public class ForEachDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;

        //특정 원소의 값을 가리켜서 넣는다 final 불가능 (상수가 아니기 때문에)
        for(int i = 0; i<scores.length; i++)
            scores[i]= in.nextInt();


        //e에 scores의 원소 하나하나를 대입해준다.  final 가능 (원래 final)
        for(int e : scores)
            sum += e;

        System.out.println((double)sum/scores.length);
    }
}
