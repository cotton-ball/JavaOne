public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hi, Java!";                    //새로운 객체
        String s2 = "Hi, Java!";                    //같은 객체
        String s3 = new String("Hi, Java!"); //새로운 객체
        String s4 = new String("Hi, Java!"); //새로운 객체
        String s5 = "Hi, Kotlin!";
        String s6 = "hi, java!";

        String s7 = new String("Hi,");
        String s8 = new String(" Java");

        System.out.println(s7.length());
        char c = s7.charAt(1);
        System.out.println(c);
        s7 = s7.concat(s8); // s7 = s7 + s8    두 문자열을 합친다

        String s9 = s7.toLowerCase(); // 전부 소문자로 바꿔줌
        String s10 = s7.substring(3,6); //s7의 3번째부터 6번째까지
        String s11 = s8.trim();         //앞의 blank를 지워준다

        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);
        System.out.println(s11);



        //연산기호 사용해서 비교
        System.out.println(s1 == s2); //같은 객체인지 확인
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        s1 = s3;
        System.out.println(s1 == s3);

        //equals() 메서드 사용
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equalsIgnoreCase(s6)); //대소문자를 구분하지 않기 때문에 같음

        //compareTo 사용
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s6));
        System.out.println(s1.compareToIgnoreCase(s6));


    }
}
