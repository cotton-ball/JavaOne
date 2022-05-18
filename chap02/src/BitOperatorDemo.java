public class BitOperatorDemo {
    public static void main(String[] args) {
        System.out.printf("%x\n",~0b00000001);
        System.out.printf("%x\n",(byte)~0b00000001);
        int i1 = -10;
        int i2 = i1 >>1;
        int i3 = i1 >>> 1;
    }
}
