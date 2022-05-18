public class HelloTest {
    public static void main(String[] args) {
        int num = 5, num2 = --num%2;
        System.out.println(num+","+num2);

        int sum = 0,num3 = 0;
        while (num3++<100){
            if(num3 / 3 !=0){ continue; }
            else sum += num3;
        }
        System.out.println(sum);

        System.out.println("Hello!");
        System.out.println(6/2.0);
        int a = 3;
        a *= a+1;
        System.out.println(a);
        System.out.println(a++);

        final int ONE = 1;
        char c1 = 'a';
        System.out.println((int)c1+ONE);
        System.out.printf("%c",c1+ONE);

        while(c1<='z')
            System.out.print(c1++);

        for(int i = 0; i<3; i++) System.out.println(i);

        int x =1;
        switch (x){
            case 0:
                System.out.println(x);
            case 1:
                System.out.println(x+1);
            case 2:
                System.out.println(x+2);
            default:
                System.out.println(x+3);
        }

        int sum1 = 0, i = 0;
        do{
            sum1+=i++;
        }while(i<10);
        System.out.println(sum1);

        a = 1;
        int b = 2;
        switch (a++){
            case 1: b+=2;
            case 2: b+=5;
        }
        System.out.println(b);

        a=1;
        b=2;
        switch (a++){
            case 1-> b+=a;
            case  2 -> b+=5;
        }
        System.out.println(b);

        System.out.println(new String("자바 프로그래밍 기초").substring(2,9).trim());

        boolean d = 1 ==2 ;
        System.out.println(d);

    }
}
