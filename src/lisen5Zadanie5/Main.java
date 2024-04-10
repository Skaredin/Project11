package lisen5Zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static int count=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vedite chislo kotoroe budet sodergaca");
        int size = in.nextInt();

        List<String> list = new ArrayList<String>();
        for (int i = 101; i < 501; i++) {
            list.add(i + "");
        }
        boolean matchedSuffix = false;
        String prefix = String.valueOf(size) ;
        System.out.println("Stroka sodergasaa : "+list+"\nЗаданное число: "+ prefix);
        System.out.println("Содержащая строка \"Заданное число\": "+Main.binarySerchOverList(list, prefix));
    }
        public static List<String> binarySerchOverList(List<String> list, String prefix) {
        List<String> result = new ArrayList<>();
        for(String s : list)
            if(s.startsWith(prefix))
                result.add(s);
        return result;
    }
}
