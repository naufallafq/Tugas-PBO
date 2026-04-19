/*NIM: 13020240243
    NAMA: MUH. NAUFAL AL AFIQ
    HARI/TANGGAL: 18 APRIL 2026
    WAKTU: 14.00
    */
package kalkulator;
import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Angka 1: ");
            double a1 = sc.nextDouble();

            System.out.print("Angka 2: ");
            double a2 = sc.nextDouble();

            System.out.print("Operator (+,-,*,/): ");
            char op = sc.next().charAt(0);

            Kalkulator k = new Kalkulator(a1, a2);
            double hasil = 0;

            switch (op) {
                case '+': hasil = k.tambah(); break;
                case '-': hasil = k.kurang(); break;
                case '*': hasil = k.kali(); break;
                case '/': hasil = k.bagi(); break;
                default: System.out.println("Operator salah");
            }

            System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", a1, op, a2, hasil);

            System.out.print("Ulangi? (y/n): ");
            lagi = sc.next().charAt(0);

        } while (lagi == 'y');
    }
}
