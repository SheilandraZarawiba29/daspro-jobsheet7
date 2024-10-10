
import java.util.Scanner;

public class Tugas2Parkir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jnsKendaraan, durasiParkir;
        int ttlParkkir = 0;

        do{
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jnsKendaraan = sc.nextInt();

            if (jnsKendaraan == 1 || jnsKendaraan == 2){
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasiParkir = sc.nextInt();
                if (durasiParkir > 5){
                    ttlParkkir += 12500;
                } else {
                    if (jnsKendaraan == 1){
                        ttlParkkir += durasiParkir * 3000;
                    } else if (durasiParkir == 2){
                        ttlParkkir += durasiParkir * 2000;
                    }
                }
            } System.out.println("Total biaya parkir: " + ttlParkkir);
            
        } while (jnsKendaraan != 0);

    }
}