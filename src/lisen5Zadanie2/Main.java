package lisen5Zadanie2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Skolko random cifr 1 massiva");
        int[] arr1 = new Random().ints(in.nextInt(), 1, 1000).toArray();
        System.out.println("Original array 1: " + Arrays.toString(arr1));
        Scanner in2 = new Scanner(System.in);
        System.out.println("Skolko random cifr 2 massiva");
        int[] arr2 = new Random().ints(in2.nextInt(), 1, 1000).toArray();
        System.out.println("Original array 2: " + Arrays.toString(arr2));

        int min = Math.min(arr1.length, arr2.length);
        int counter = 0;
        int combined[] = new int[min];

        for (int s = 0; s < arr1.length; s++) {
            for (int x = 0; x < arr2.length; x++) {
                if (arr1[s] == arr2[x]) {
                    combined[counter] = arr1[s];
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Prinimaet iz 2 v 1: " + Arrays.toString(combined));
        int[] result = Arrays.copyOf(combined, counter);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
