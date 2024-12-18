public class tumpukanGG {
    private node topGanjil; // Stack untuk angka ganjil
    private node topGenap;  // Stack untuk angka genap

    // Constructor
    public tumpukanGG() {
        topGanjil = null;
        topGenap = null;
    }

    // Method push() untuk memisahkan angka ke stack ganjil atau genap
    public void push(int data) {
        if (data < 0) {
            System.out.println("Angka negatif tidak diperbolehkan!");
            return;
        }
        node newNode = new node(data, null); // Buat node baru
        if (data % 2 == 0) { // Jika angka genap
            newNode.setPtg(topGenap);
            topGenap = newNode;
        } else { // Jika angka ganjil
            newNode.setPtg(topGanjil);
            topGanjil = newNode;
        }
    }

    // Method popganjil() untuk menghapus angka teratas dari stack ganjil
    public void popganjil() {
        if (topGanjil == null) {
            System.out.println("Stack ganjil kosong! Tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus " + topGanjil.getData() + " dari stack ganjil.");
            topGanjil = topGanjil.getPtr();
        }
    }

    // Method popgenap() untuk menghapus angka teratas dari stack genap
    public void popgenap() {
        if (topGenap == null) {
            System.out.println("Stack genap kosong! Tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus " + topGenap.getData() + " dari stack genap.");
            topGenap = topGenap.getPtr();
        }
    }

    // Method cetakganjil() untuk mencetak isi stack ganjil
    public void cetakganjil() {
        System.out.print("Isi Tumpukan Ganjil: ");
        node current = topGanjil;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPtr();
        }
        System.out.println();
    }

    // Method cetakgenap() untuk mencetak isi stack genap
    public void cetakgenap() {
        System.out.print("Isi Tumpukan Genap: ");
        node current = topGenap;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPtr();
        }
        System.out.println();
    }
}
