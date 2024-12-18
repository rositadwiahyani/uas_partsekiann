import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tumpukanGG tumpukan = new tumpukanGG();
        Scanner input = new Scanner(System.in);

        // Push angka ke stack
        System.out.println("Masukkan angka (ketik -1 untuk berhenti): ");
        while (true) {
            System.out.print("Angka: ");
            int angka = input.nextInt();
            if (angka == -1) break;
            tumpukan.push(angka);
        }

        // Cetak tumpukan awal
        System.out.println("\n== Tumpukan Awal ==");
        tumpukan.cetakganjil();
        tumpukan.cetakgenap();

        // Hapus elemen teratas dari stack
        System.out.println("\nPop dari Stack Ganjil & Genap...");
        tumpukan.popganjil();
        tumpukan.popgenap();

        // Cetak tumpukan setelah pop
        System.out.println("\n== Tumpukan Setelah Pop ==");
        tumpukan.cetakganjil();
        tumpukan.cetakgenap();

        input.close();
    }
}