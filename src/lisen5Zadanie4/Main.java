package lisen5Zadanie4;

public class Main {
    public static void main(String[] args) {

        int i = 9;
        Oc counter = new Oc();
        System.out.println("Kol-vo deistvii: "
                + counter.occurrenceOfСount(0, 200, 0, 1000));
        System.out.println("Tak budet interesnei s min i max cem i*i="+ i*i +" ");
    }

    static class Oc {
        public int occurrenceOfСount(int first, int last, int lowLim, int upLim) {
            int numberOccurence = 0;
            for (int i = first; i <= last; i++) {
                if (lowLim <= i * i && i * i <= upLim) {
                    System.out.print("Chislo i= " + i + "^2 = " + i * i + "\n");
                    numberOccurence++;
                }
            }
            return numberOccurence;
        }
    }
}
