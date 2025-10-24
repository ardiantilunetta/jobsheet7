import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargatiket = 50000, pelanggan;
        double harga, totalpenjualan = 0, totaltiket = 0;
        String ulang = "";
        
        do {
            System.out.print("Masukkan jumlah tiket : ");
            pelanggan = sc.nextInt();
            sc.nextLine();

            if (pelanggan < 0) {
                System.out.println("Input tidak valid! Masukkan ulang jumlah tiket.\n");
                continue;
            }

            if (pelanggan>10) {
                harga = pelanggan*hargatiket*0.85;
            } else if (pelanggan>4  ) {
                harga = pelanggan*hargatiket*0.90;
            } else {
                harga = pelanggan*hargatiket;
            }

            totaltiket += pelanggan;
            totalpenjualan +=harga;

            System.out.println("Total harga pelanggan : "+harga);
            System.out.print("\n'ya' untuk input pelanggan berikutnya\n'tidak' untuk lihat rekap penjualan\nInput pelanggan berikutnya? : ");
            ulang = sc.nextLine();
            System.out.println();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("----- REKAP PENJUALAN HARI INI----");
        System.out.println("Total tiket terjual hari ini : "+totaltiket);
        System.out.println("Total pendapatan hari ini : "+totalpenjualan);
    }
}
