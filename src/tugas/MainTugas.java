// Nama: Salmaa Dzakirah Maharani
// NPM: 2410010104
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array nama mata kuliah (ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Struktur Data", "Basis Data"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambah 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2301001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2301002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2301003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "2301004", 45));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2301005", 70));

        // Tampilkan semua mahasiswa
        kelas.tampilkanSemua();
        System.out.println();

        // Tampilkan rata-rata dan jumlah lulus
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println();

        // Tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2301006", 78));
        System.out.println("Setelah tambah 1 mahasiswa baru:");
        kelas.tampilkanSemua();
    }
}