import java.util.Scanner;

public class GradeNeIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("? ");
        int grade = in.nextInt();
        String score;

        if(grade >= 90) {
            if (grade >= 96)
                score = "A++";
            else score = "A";
        }else {
            if (grade >= 80)
                score = "B";
            else
                score = "C";
            System.out.println("Your grade is " + grade);
        }
    }
}

