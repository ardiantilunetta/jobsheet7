import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("(1)Mobil\n(2)Motor(0)Keluar\nMasukkan jenis kendaraan : ");
            jenis = sc.nextInt();

            System.out.print("Masukkan lama durasi parkir (menit) : ");
            durasi = sc.nextInt();

            
            
        } while (jenis != 0);


    }
}
