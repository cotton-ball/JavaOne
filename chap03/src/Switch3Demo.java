import java.util.Scanner;

public class Switch3Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("? ");
        int i = in.nextInt();

        String s = switch (i){
            case 3 -> "Three";
            case 2 -> "Two";
            case 1,0 -> "One";
            default -> {
                System.out.println("wrong input");
                yield "oops!";
            }

        };
        System.out.println(s);
    }
}