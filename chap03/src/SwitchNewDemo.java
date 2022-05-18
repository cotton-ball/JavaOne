import java.util.Scanner;

public class SwitchNewDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("? ");
        int i = in.nextInt();

        switch (i){
            case 3 -> System.out.print("***");
            case 2 -> System.out.println("**");
            case 1 -> System.out.println("*");
            default -> System.out.println("-");
        }
    }
}
