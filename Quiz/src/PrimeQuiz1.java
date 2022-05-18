import java.util.Scanner;

public class PrimeQuiz1 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Prime p;
       // p = new Prime();

        System.out.print(n + "이하의 모든 소수는 ");
        for (int i = 2; i <= n; i++) {
            p = new Prime(i);
            if(p.isPrime())  System.out.print(i+" ");
            if(p.isPrimeMe(i)==1)  System.out.print(i+" ");
        }
    }

}

// 소수(prime number)에 관련된 클래스
class Prime {
    int x;
    // 생성자 추가
    public Prime(int x){
        this.x = x;
    }

    // x가 소수인지 아닌지를 판단하는 메서드
    public int isPrimeMe(int i) {
        int checkPrime = 0;
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) checkPrime++;
        }
        return checkPrime;
    }

    boolean isPrime(){
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }


}