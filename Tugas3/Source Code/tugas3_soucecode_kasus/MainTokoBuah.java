package tokobuah;
import java.util.Scanner;

public class MainTokoBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Buah[] b = {
            new Buah("Apel",15000,10),
            new Buah("Jeruk",12000,8),
            new Buah("Mangga",20000,5)
        };

        int pilih, qty;
        int total = 0;

        while (true) {
            System.out.println("\n=== KATALOG ===");
            for (int i = 0; i < b.length; i++) {
                System.out.println((i+1) + ". " + b[i].info());
            }

            System.out.print("Pilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            System.out.print("Jumlah: ");
            qty = sc.nextInt();

            if (b[pilih-1].tersedia(qty)) {
                int harga = b[pilih-1].total(qty);
                total += harga;
                System.out.println("OK +Rp" + harga);
            } else {
                System.out.println("Stok kurang!");
            }
        }

        System.out.println("Total: Rp" + total);
    }
}