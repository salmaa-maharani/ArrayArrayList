package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(70);
        angka.add(95);
        angka.add(60);
        angka.add(88);
        angka.add(75);

        int max = angka.get(0);
        for (int n : angka) {
            if (n > max) max = n;
        }

        System.out.println("Data    : " + angka);
        System.out.println("Terbesar: " + max);
    }
}