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

            if (pelanggan>4) {
                harga = pelanggan*hargatiket-(pelanggan*hargatiket*0.1);
            } else if (pelanggan>10) {
                harga = pelanggan*hargatiket-(pelanggan*hargatiket*0.15);
            } else {
                harga = pelanggan*hargatiket;
            }

            System.out.println("Total harga pelanggan : "+harga);
            
        } while (true);
    }
}
