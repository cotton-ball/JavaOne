import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStudents = 0;
        int[] scores;
        Grade grade;

        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents+"명의 학생 성적을 입력하세요");
        for(int i = 0; i<numOfStudents; i++)
            scores[i] = in.nextInt();

        System.out.println(numOfStudents+"명의 학생 성적은 다음과 같습니다.");
        for(int i : scores)
            System.out.println(i);

        for(int i = 0; i<scores.length; i++){
            if(scores[i]>=90) {
                grade = Grade.A;
                System.out.println((i+1)+"번 학생의 등급은 "+ grade + " 입니다.");
            }
            else if(scores[i]<90 && scores[i]>=80) System.out.println((i+1)+"번 학생의 등급은 B 입니다.");
            else if(scores[i]<80&&scores[i]>=70) System.out.println((i+1)+"번 학생의 등급은 C 입니다.");
            else if(scores[i]<70 && scores[i]>=60) System.out.println((i+1)+"번 학생의 등급은 D 입니다.");
            else System.out.println((i+1)+"번 학생의 등급은 F 입니다.");
        }


    }
}


enum Grade {
    A("최우수"),B("우수"),C("보통"),D("미흡"),F("탈락");

    String s;

    Grade(String s) {
        this.s = s;
    }
    @Override
    public String toString() {
        return s;
    }
}