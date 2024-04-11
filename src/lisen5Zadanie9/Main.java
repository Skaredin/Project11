package lisen5Zadanie9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        String[] elements = new String[]{"Bread", "Milk", "Cereal", "Coffee", "321", "421", "444", "@#@#", "!!!!", "@@#$", "!3$!",
                "%#%%rw3","Картошка", "Свекла", "Трактор", "Терапефт", "51251вфц", "5765вфа",
                "3344", "?!%:(!%:", "(№%?%(№)", "!);*;?%", ")(%№_%", "И тод"};

        for (int i = 0; i < 15; i++) {
            final String[] array = generateRandomArrayFromElements(elements);
            System.out.println(Arrays.toString(array));
        }
    }

    private static String[] generateRandomArrayFromElements(String[] elements) {
        int size = ThreadLocalRandom.current().nextInt(0, elements.length) + 1;
        String[] array = new String[size];
        ArrayList<Integer> usedIndices = new ArrayList<>(size);
        String ad = "";
        for (int i = 0; i < array.length; i++) {
            int randomIndex = getUniqueRandomIndex(usedIndices, size);
            usedIndices.add(randomIndex);
            array[i] = elements[randomIndex];
            array[i] = Arrays.toString(new String[]{array[i]}).replaceAll("[^A-Za-zА-Яа-я]", "");

        }
        return  array;
    }

    private static int getUniqueRandomIndex(ArrayList<Integer> usedIndices, int max) {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, max);
        final boolean contains = usedIndices.contains(randomIndex);
        if (contains)
            randomIndex = getUniqueRandomIndex(usedIndices, max);
        return randomIndex;
    }
}