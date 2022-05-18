public class ContinueDemo {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            if(i %2 ==0)
                continue;
            System.out.println(i); //if 가 참이면 실행되지 않는다
        }
    }
}
