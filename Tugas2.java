import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("(1)Mobil\n(2)Motor\n(0)Keluar\nMasukkan jenis kendaraan : ");
            jenis = sc.nextInt();

            if (jenis==0) {
                break;
            } if (jenis>2) {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.print("Masukkan lama durasi parkir (menit) : ");
            durasi = sc.nextInt();

            if (durasi>5) {
                total = 12500;
            } else if (jenis==1) {
                total = durasi*3000;
            } else if (jenis==2) {
                total = durasi*2000;
            } 

            System.out.println("Total biaya parkir : Rp."+total);
            System.out.println();
            
        }


    }
}
