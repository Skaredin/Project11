package lisen3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collector;


public class Main {
    public static void main(String[] args) {
        String text="d aw d ad w da d wf wafw f";
        List<String> strings = List.of(text.split(" "+"\n"));
        System.out.println("\n"+"lenivo");
for (String e:strings)
{
    System.out.println(e);
}
        //List<String> str = filterEvenMumbers(strings);





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

    }
    //public static  List<String> filterEvenMumbers (List<String> arr) // не понял что нужно после (s->[???
    //{
       // return List.stream().filter(s->[naracter.isUpperCose()]);

    //}
}