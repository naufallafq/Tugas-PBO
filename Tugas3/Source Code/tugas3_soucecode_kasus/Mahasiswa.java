/*NIM: 13020240243
    NAMA: MUH. NAUFAL AL AFIQ
    HARI/TANGGAL: 18 APRIL 2026
    WAKTU: 14.00
    */
package mahasiswa;
import java.util.Scanner;

public class Mahasiswa {
    private String nama, nim;
    private int[] nilai;

    public Mahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        nilai = new int[jumlahMK];
    }

    public void inputNilai(Scanner sc) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai MK-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public double rata() {
        int total = 0;
        for (int n : nilai) total += n;
        return (double) total / nilai.length;
    }

    public char grade() {
        double r = rata();
        if (r >= 85) return 'A';
        else if (r >= 75) return 'B';
        else if (r >= 60) return 'C';
        else return 'D';
    }

    public void tampil() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("MK-" + (i+1) + ": " + nilai[i]);
        }

        System.out.printf("Rata: %.2f\n", rata());
        System.out.println("Grade: " + grade());
        System.out.println("Lulus: " + (rata() >= 60));
    }
}
