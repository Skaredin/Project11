package lisen5Zadanie3;



public class Main {

    public static void main(String[] args) {
        String[] strings = {"Напишите", "Функцию", "Принимает", " содержащий", "Большие", " буквы"};
        for (int i = 0; i < strings.length; i++){
            if ((strings[i].charAt(0) > 'А') && (strings[i].charAt(0) < 'Я')){
                strings[i] = " \n " + strings[i];
            }
        }
        for (String string : strings) System.out.print(string);
    }

}
