package lisen5Zadanie1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Vedite razmer masiva");
        int[] arr = new Random().ints(in.nextInt(), 1, 1000).toArray();
        System.out.println("Original array: " + Arrays.toString(arr));



        int[] evens = numEven(arr);
        System.out.print("Delimoe na 2: ");
        System.out.print("[");
        for(Integer i : evens) {

            System.out.print(" "+ i+ ",");
        }
        System.out.print(" ]");

    }
    public static int[] numEven(int list[]){
        return IntStream.of(list).filter(i -> i % 2 == 0).toArray();
    }
}