import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket j = new Jaket();

        System.out.print("Jumlah jaket A yang dibeli: ");
        int jumlahA = input.nextInt();
        j.beliJaketA(jumlahA);

        System.out.print("Jumlah jaket B yang dibeli: ");
        int jumlahB = input.nextInt();
        j.beliJaketB(jumlahB);

        System.out.print("Jumlah jaket C yang dibeli: ");
        int jumlahC = input.nextInt();
        j.beliJaketC(jumlahC);

        System.out.println("Total keseluruhan pembayaran: Rp " + j.getTotalHarga());
    }
}
