public class Test {
    public static void main(String[] args) {

        int sum = 0,num = 0;
        while (num < 100){
            if(num%3==0)  sum = sum + num;

            num++;
        }
        System.out.println(sum);
    }
}
