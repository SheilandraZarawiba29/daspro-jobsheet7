
import java.util.Scanner;

public class Tugas1Bioskop{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jmltiket, totaltiket= 0;
        int totalpjln = 0;
        int hargatiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jmltiket = sc.nextInt();

            if (jmltiket < 0){
                System.out.println("Inputan tidak valid!");
                continue;
            }

            double ttlharga = jmltiket * hargatiket;

            if (jmltiket > 10) {
                ttlharga -= (ttlharga * 0.15);
            } else if (jmltiket > 4) {
                ttlharga -= (ttlharga * 0.10);
            } 
            
    
            totaltiket += jmltiket;
            totalpjln += ttlharga;

            System.out.print("Apakah anda ingin berhenti (y/n)?: ");
            String stop = sc.next();
            if (stop.equalsIgnoreCase("y")) {
                break;
            }

        } 
        System.out.println("---Rangkuman Penjualan Hari Ini---");
        System.out.println("Total tiket yang terjual: " + totaltiket);
        System.out.println("Total harga penjualan tiket: " + totalpjln);

        

    }
}