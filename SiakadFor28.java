
import java.util.Scanner;

public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jmllulus = 0, jmltdklulus =  0;
        double bataskelulusan = 60;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= bataskelulusan) {
                jmllulus++; 
            } else {
                jmltdklulus++;  
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jmllulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmltdklulus);
    }
}