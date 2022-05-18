public class WhileDemo {
    public static void main(String[] args) {
        int row = 2;
        while(row<10){
            int col = 1;
            while(col<10)
                System.out.printf("%4d",row*col++);
            System.out.println();
            row++;

        }
    }
}
