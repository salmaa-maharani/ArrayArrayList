package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Telur");
        belanja.add("Minyak");
        belanja.add("Gula");

        System.out.println("Awal  : " + belanja);

        belanja.remove(1);

        System.out.println("Akhir : " + belanja);
        System.out.println("Jumlah: " + belanja.size());
    }
}