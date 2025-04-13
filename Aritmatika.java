public class Aritmatika {

    // Static method
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    // Non-static method
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak valid!");
            return 0;
        }
        return a / b;
    }

    // Non-static method untuk menyederhanakan pecahan
    public void sederhana(int pembilang, int penyebut) {
        int fpb = hitungFPB(pembilang, penyebut);
        pembilang /= fpb;
        penyebut /= fpb;
        System.out.println("Pecahan disederhanakan: " + pembilang + "/" + penyebut);
    }

    private int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
