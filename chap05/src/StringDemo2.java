public class StringDemo2 {
    public static void main(String[] args) {
        int i = 8;
        System.out.println("Java "+ i +1);
        System.out.println(i + 1 +" Java");

        String version = String.format("%s %d\n","Java",14);
        System.out.print(version);

        String fruits = String.join("-","apple","banana","cherry");
        System.out.println(fruits);

        String pi = String.valueOf(3.14);
        System.out.println(pi);
    }
}
