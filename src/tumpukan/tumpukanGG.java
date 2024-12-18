package tumpukan;

public class tumpukanGG {
    private node topGanjil;
    private node topGenap;

    public tumpukanGG() {
        topGanjil = null;
        topGenap = null;
    }

    public void push(int data) {
        if (data < 0) {
            System.out.println("Angka negatif tidak diperbolehkan!");
            return;
        }
        node newNode = new node(data, null);
        if (data % 2 == 0) {
            newNode.setPtg(topGenap);
            topGenap = newNode;
        } else {
            newNode.setPtg(topGanjil);
            topGanjil = newNode;
        }
    }

    public void popganjil() {
        if (topGanjil == null) {
            System.out.println("Stack ganjil kosong! Tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus " + topGanjil.getData() + " dari stack ganjil.");
            topGanjil = topGanjil.getPtr();
        }
    }

    public void popgenap() {
        if (topGenap == null) {
            System.out.println("Stack genap kosong! Tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus " + topGenap.getData() + " dari stack genap.");
            topGenap = topGenap.getPtr();
        }
    }

    public void cetakganjil() {
        System.out.print("Isi Tumpukan Ganjil: ");
        node current = topGanjil;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPtr();
        }
        System.out.println();
    }

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
