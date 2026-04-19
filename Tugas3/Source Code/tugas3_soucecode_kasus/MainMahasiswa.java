/*NIM: 13020240243
    NAMA: MUH. NAUFAL AL AFIQ
    HARI/TANGGAL: 18 APRIL 2026
    WAKTU: 14.00
    */
package mahasiswa;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Jumlah MK: ");
        int jml = sc.nextInt();

        Mahasiswa m = new Mahasiswa(nama, nim, jml);
        m.inputNilai(sc);
        m.tampil();
    }
}
