package lisen2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vedite razmer masiva");
        int size = in.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        Random random = new Random();
        for(int i=0; i<size; i++)
        {
            arr[i]=random.nextInt(200);
            arr1[i]=random.nextInt(200);
        }
        System.out.println("Massiv arr :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Massiv arr1 :");
        System.out.println(Arrays.toString(arr1));
        int[] arrResult = filterEvenMumbers(arr, arr1);
        System.out.println("Massiv arrResult : ");
        System.out.println(Arrays.toString(arrResult));

    }
    public static  int[] filterEvenMumbers (int[] arr,int[] arr1)
    {
        return Arrays.stream(arr).filter(x->Arrays.stream(arr1).anyMatch(y->y==x)).toArray();

    }
}


