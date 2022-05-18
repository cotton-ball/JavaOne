public class Exam1Array {
    public static void main(String[] args) {
        double[] myList = { 1.0, 7.0, 6.0, 4.0 };
        Array arr = new Array(myList);
        arr.show();

        double[] yourList = { 3.0, 5.0, 4.0, 6.0, 8.0 };
        arr = new Array(yourList);
        arr.show();
    }
}

// 임의의 double 타입 배열의 원소 중에서 최댓값을 출력
class Array {

    private double[] array;

    public Array(double[] array) {
        this.array =  array;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    // 필요한 변수 선언문 및 생성자

    void show() {
        int i = 1;
        double max = array[0];

        while (true) {
            for(i = 1; i<array.length; i++ ){
                max = (max > array[i])? max:array[i];
            }
            break;
        }

        System.out.println("max = " + max);
    }
}
