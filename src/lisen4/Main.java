package lisen4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n Spisok do: \n");
    for (int i = 0; i<10; i++)
    {
        integers.add(random.nextInt(1000));
        System.out.println(integers.get(i));
    }
    List<Integer> integers1 = sq(integers);
        System.out.println("\n posle kvadrata: \n");
        for (Integer i: integers1)
        {
            System.out.println(i);
        }

    }
    public static List<Integer>sq(List<Integer> list)
    {
        return list.stream().map(x->x*x).collect(Collectors.toList());
    }
}