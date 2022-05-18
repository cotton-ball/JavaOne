package sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo { //동적배열 (array)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int data;

        while((data = in.nextInt()) >= 0)
            list.add(data);

        for(int i = 0; i <list.size(); i++)
            sum += list.get(i);

        System.out.println((double)sum/ list.size());
    }
}
