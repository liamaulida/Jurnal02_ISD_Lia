import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data Buku di Awal");
            System.out.println("2. Input Data Buku di Akhir");
            System.out.println("3. Hapus Data Buku dari Awal");
            System.out.println("4. Hapus Data Buku dari Akhir");
            System.out.println("5. Cetak Seluruh Data Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = input.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    int tahun = input.nextInt();
                    input.nextLine(); // Consume newline
                    linkedList.addFirst(new Book(judul, penulis, tahun));
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    judul = input.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    penulis = input.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    tahun = input.nextInt();
                    input.nextLine(); // Consume newline
                    linkedList.addLast(new Book(judul, penulis, tahun));
                    break;
                case 3:
                    linkedList.deleteFirst();
                    break;
                case 4:
                    linkedList.deleteLast();
                    break;
                case 5:
                    linkedList.printList();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

