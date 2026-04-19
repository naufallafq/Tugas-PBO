package kalkulator;

public class Kalkulator {
    private double a1, a2;

    public Kalkulator(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public double tambah() { return a1 + a2; }
    public double kurang() { return a1 - a2; }
    public double kali() { return a1 * a2; }

    public double bagi() {
        if (a2 == 0) {
            System.out.println("Error: pembagian nol!");
            return 0;
        }
        return a1 / a2;
    }
}