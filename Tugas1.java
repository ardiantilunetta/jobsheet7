import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargatiket=50000, pelanggan, totaltiket;
        double harga, totalpenjualan;
        String ulang;
        
        do {
            System.out.print("Masukkan jumlah tiket : ");
            pelanggan = sc.nextInt();

            if (pelanggan < 0) {
                System.out.println("Input tidak valid! Masukkan ulang jumlah tiket.\n");
                continue;
            }

        } while (true);
    }
}
