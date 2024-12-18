import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tumpukanGG tumpukan = new tumpukanGG();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Push Angka");
            System.out.println("2. Pop Ganjil");
            System.out.println("3. Pop Genap");
            System.out.println("4. Cetak Tumpukan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan angka-angka (ketik -1 untuk kembali ke menu):");
                    while (true) {
                        System.out.print("Angka: ");
                        int angka = input.nextInt();
                        if (angka == -1) break;
                        tumpukan.push(angka);
                    }
                    break;
                case 2:
                    tumpukan.popganjil();
                    break;
                case 3:
                    tumpukan.popgenap();
                    break;
                case 4:
                    System.out.println("\n== Isi Tumpukan ==");
                    tumpukan.cetakganjil();
                    tumpukan.cetakgenap();
                    break;
                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
