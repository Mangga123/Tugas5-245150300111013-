public class Jaket {
    // Final harga dasar
    public final int HARGA_A = 100000;
    public final int HARGA_B = 125000;
    public final int HARGA_C = 175000;

    private int totalHarga;

    public void beliJaketA(int jumlah) {
        int harga = (jumlah > 100) ? 95000 : HARGA_A;
        int total = harga * jumlah;
        System.out.println("Total harga jaket A: Rp " + total);
        totalHarga += total;
    }

    public void beliJaketB(int jumlah) {
        int harga = (jumlah > 100) ? 120000 : HARGA_B;
        int total = harga * jumlah;
        System.out.println("Total harga jaket B: Rp " + total);
        totalHarga += total;
    }

    public void beliJaketC(int jumlah) {
        int harga = (jumlah > 100) ? 160000 : HARGA_C;
        int total = harga * jumlah;
        System.out.println("Total harga jaket C: Rp " + total);
        totalHarga += total;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
