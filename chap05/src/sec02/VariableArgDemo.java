package sec02;

public class VariableArgDemo {
    public static void main(String[] args) {
        printSum(1,2,3);
        printSum(10,20,30,40,50);
        printSum(10,20,30,40,50,60,70);
    }
    static void printSum(int ...v){ //인수가 몇 개 들어올지 모름
        int sum = 0;
        for(int i :v)
            sum += i;
        System.out.println(sum);
    }
}
