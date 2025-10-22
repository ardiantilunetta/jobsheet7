import java.util.Scanner;

public class SiakadFor18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, terendah=100, tertinggi=0;
        int mhslulus=0, mhstidaklulus=0;
        for (int i=1 ; i<=10 ; i++){
            System.out.print("Masukkan nilai mahasiswa ke "+i+" : ");
            nilai = sc.nextInt();
            if (nilai>tertinggi) {
                tertinggi=nilai;
            }
            if (nilai<terendah) {
                terendah=nilai;
            }

            if (nilai>=60) {
                mhslulus++;
            } else {
                mhstidaklulus++;
            }
        }

        System.out.println("Nilai tertinggi : "+tertinggi);
        System.out.println("Nilai terendah  : "+terendah);
        System.out.println("Jumlah mahasiswa lulus       = "+mhslulus);
        System.out.println("Jumlah mahasiswa tidak lulus = "+mhstidaklulus);
    }
}
