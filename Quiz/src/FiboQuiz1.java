import java.util.Scanner;

public class FiboQuiz1 {
    public static void main(String[] args) {
        System.out.println("양의 정수를 입력하세요");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fibonacci f= new Fibonacci();
        //피보나치 수얄은 0,1,1,2,3,5,8 등이지만 여기서는 0,1,1은 제외

        System.out.println(n+"이하의 모든 피보나치 수는");
        for (int i = 1; i <= n; i++){
            if(f.isFibonacci(i,n) == 1) System.out.print(i+" , ");
        }
    }
}

class Fibonacci{
    int x;
    public Fibonacci() {
        this.x = 0;
    }
    //생성자 추가
    //x가 피보나치 수열인지 판단하는 메서드
    public int isFibonacci(int num, int n){
        int num1 = 1,num2 = 1 , check = 0;
        if(n > 1){
            for(int i = 1; i <n; i++){
                x = num1+num2;
                num1 = num2;
                num2 = x;
                if(num == x) {
                    check = 1;
                    break;
                }
            }
        }
        return check;

    }
}
