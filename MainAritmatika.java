import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aritmatika arit = new Aritmatika();

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Penjumlahan (static): " + Aritmatika.penjumlahan(a, b));
        System.out.println("Pengurangan (static): " + Aritmatika.pengurangan(a, b));
        System.out.println("Perkalian (non-static): " + arit.perkalian(a, b));
        System.out.println("Pembagian (non-static): " + arit.pembagian(a, b));

        // Penyederhanaan pecahan
        System.out.print("\nMasukkan pembilang: ");
        int pembilang = input.nextInt();
        System.out.print("Masukkan penyebut: ");
        int penyebut = input.nextInt();

        arit.sederhana(pembilang, penyebut);
    }
}
