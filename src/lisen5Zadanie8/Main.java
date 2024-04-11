package lisen5Zadanie8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int C ;
    static int count = 0;
    public static int Delitel;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vedite chislo kotoroe budet sodergaca");
        int size = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Насколько будет делится");
        Delitel = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("после какого числа вывисти");
        C = in2.nextInt();



        List<String> list = new ArrayList<String>();
        for (int i = 101; i < 501; i++) {
            list.add(i + "");
        }
        boolean matchedSuffix = false;
        String prefix = String.valueOf(size);
        System.out.println("Stroka sodergasaa : " + list + "\nЗаданное число: " + prefix);
        System.out.println("Содержащая строка \"Заданное число\": " + lisen5Zadanie5.Main.binarySerchOverList(list, prefix));
        String result = Arrays.toString(new List[]{lisen5Zadanie5.Main.binarySerchOverList(list, prefix)}).replace("[", "").replace("]", "").replace(",", "");

        String[] strArr = result.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int[] res = getDivisibleNumbers(intArr, Delitel);
        System.out.println("Числа делящийся на "+Delitel+"->"+Arrays.toString(res));


        System.out.print("Значение больше заданного = "+C+" --> ");
        boolean ok = false;
        for (int k= 0; k < res.length ; k++) {
            if (res[k] >= C) {
                System.out.print(res[k]+" ");
                ok = true;
            } else {
                ok = false;
            }
        }

    }

    public static List<String> binarySerchOverList(List<String> list, String prefix) {
        List<String> result = new ArrayList<>();
        for (String s : list)
            if (s.startsWith(prefix))
                result.add(s);

        return result;
    }
    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(numb -> numb % divider == 0 && numb > 0)
                .toArray();
    }
}