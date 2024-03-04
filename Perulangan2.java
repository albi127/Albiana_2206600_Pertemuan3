package perulangan1;
import java.util.Scanner;

public class Perulangan2 {

  public static void main(String[] args) {
     // Deklarasi variabel
    int batasAwal, batasAkhir;

    // Membaca nilai batasAwal dan batasAkhir
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan batas awal: ");
    batasAwal = scanner.nextInt();
    System.out.print("Masukkan batas akhir: ");
    batasAkhir = scanner.nextInt();

    // Tampilkan bilangan genap
    System.out.println("Deret bilangan genap: ");
    for (int i = batasAwal; i <= batasAkhir; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

    // Tutup Scanner
    scanner.close();
  }
}