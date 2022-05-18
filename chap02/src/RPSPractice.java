import java.util.Scanner;

public class RPSPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("가위 바위 보 : ");
        String rps = in.next();

        if(rps.equals("r"))
            System.out.println(true);
        if(rps.equals("p"))
            System.out.println(true);

    }
}
