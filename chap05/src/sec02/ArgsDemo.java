package sec02;

public class ArgsDemo {
    public static void main(String[] args) {
        if(args.length == 2){ //args 배열의 길이가 2 라면
            int i = Integer.parseInt(args[1]); //i변수에 args[1]의 값을 정수로 변환해서 대입해준다
            nPrint(args[0],i);
        }
        else
            System.out.println("Opps!");
    }
    static void nPrint(String s, int i){
        for(int n = 0; n < i; n++)
            System.out.println(s); //i 만큼 s를 반복하겠다
    }
}
