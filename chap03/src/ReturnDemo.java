public class ReturnDemo {
    public static void main(String[] args) {
        PrintScore(99);
        PrintScore(120);

    }

    public static void PrintScore(int score) {
        if( score < 0 || score > 100){
            System.out.println("잘못된 점수 : "+ score);
            return;
        }
        System.out.println("점수 : "+score);
    }
}
