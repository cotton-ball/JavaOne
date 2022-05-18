public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n){
        if (n<=1)
            return 1;
        return (n*fact(n-1));
    }


}
    //static : 기원전
    //int 기원 후
    //static 을 안 붙이고 사용하는 방법 : 클래스의 객체를 만듦면 된다
/*
    static int fact(int num){
        int x;
        return switch (x){
            case 0:
            case 1:
                x = 1;
            case 2 :
                x = 2;
            defalt:
                x = x* fact(num-1) ;
        };
*/


