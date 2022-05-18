import java.util.Scanner;

public class Practice05_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //06  배열 역순으로 반환
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = reverse(arr);
        for (int i : arr2) {
            System.out.print(i);
        }

        //07 배열 비교
        int[] a = {3,2,4,1,5};
        int[] b = {3,2,4,1};
        int[] c = {3,2,4,1,5};
        int[] d = {3,2,4,1,1};
        System.out.println( arrayEqual(a,b) +" "+ arrayEqual(a,c)+" "+arrayEqual(a,d));

        //08 열거타입
        String s = in.next();
        Week w = null;
        for(Week i: Week.values()){
            if(s.equalsIgnoreCase(i.toString())){
                w = i;
            }
        }
        printWeek(w);

        //09 지뢰






    }
    //06 거꾸로 반환
    public static int[] reverse(int[] org){
        int leng = org.length;
        int[] orgrev = new int[leng];
        for(int i = 0; i<org.length; i++){
            orgrev[i] = org[leng-1];
            leng--;
        }
        return orgrev;
    }

    //07 배열 비교
    public static boolean arrayEqual(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length) return false;
        for(int i = 0; i <arr1.length; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }

    //08
    public static void printWeek(Week w){
        String str = switch (w){
            case 월요일 -> "은 싫다";
            case 금요일 -> "은 좋다";
            case 토요일,일요일 -> "은 최고";
            default -> "은 그저 그렇다";
        };
        System.out.println(w.name()+str);
    }
}

enum Week{
    월요일("MONDAY"), 화요일("TUESDAY"), 수요일("WEDNESDAY"),목요일("THURSDAY"),금요일("FRIDAY"),토요일("SATURDAY"),일요일("SUNDAY");


    Week(String s) {
        this.s = s;
    }

    private String s;


    @Override
    public String toString() {
        return s;
    }
}
