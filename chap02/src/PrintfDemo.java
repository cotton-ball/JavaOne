public class PrintfDemo {
    public static void main(String[] args) {
        int i = 97;
        String s = "Java";
        double dd = 3.14;

        System.out.printf("i = %d\n",i);
        System.out.printf("%5s\n",s);
        System.out.printf("%-5s---\n",s);
        System.out.printf("%.3f\n",dd);
    }
}
