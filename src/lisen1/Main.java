package lisen1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vedite razmer masiva");
        int size = in.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for(int i=0; i<size; i++)
        {
            arr[i]=random.nextInt();
        }
        System.out.println("Massiv arr :");
        System.out.println(Arrays.toString(arr));
        int[] arrResult = filterEvenMumbers(arr);
        System.out.println("Massiv arrResult : ");
        System.out.println(Arrays.toString(arrResult));

    }
    public static  int[] filterEvenMumbers (int[] arr)
    {
        return Arrays.stream(arr).filter(x->x%2==0).toArray();
    }
}


