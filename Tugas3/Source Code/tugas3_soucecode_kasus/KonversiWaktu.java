/*NIM: 13020240243
    NAMA: MUH. NAUFAL AL AFIQ
    HARI/TANGGAL: 18 APRIL 2026
    WAKTU: 14.00
    */
package konversiwaktu;

public class KonversiWaktu {
    private long detik;

    public KonversiWaktu(long detik) {
        this.detik = detik;
    }

    public long jam() {
        return (detik / 3600) % 24;
    }

    public long menit() {
        return (detik / 60) % 60;
    }

    public long detik() {
        return detik % 60;
    }
}
