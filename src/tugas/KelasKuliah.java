package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) lulus++;
        }
        return lulus;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println(m.getNama() + " | NPM: " + m.getNpm() + 
                             " | Nilai: " + m.getNilai() + " | " + status);
        }
        System.out.println("Jumlah data: " + daftarMahasiswa.size());
    }
}