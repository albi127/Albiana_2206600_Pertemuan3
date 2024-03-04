package perulangan1;

import java.util.Scanner;

/**
 *
 * @author albi
 */
public class Perulangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int n, i;

        // Membaca nilai N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        n = scanner.nextInt();

        // Perulangan for dengan kondisi berhenti yang dimodifikasi
        for (i = 1; i <= n; i++) {
            // Cetak pesan dengan sedikit perubahan pada kalimat
            System.out.println("Saya senang belajar bahasa Java!");
        }

        // Tutup Scanner
        scanner.close();
    }
}
