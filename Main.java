import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static LinkedList<Tugas> daftarTugas = new LinkedList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine(); // Consume newline

            switch (menu) {
                case 1:
                    masukkanTugas(input);
                    break;
                case 2:
                    hapusTugas(input);
                    break;
                case 3:
                    lihatListTugas(input);
                    break;
                case 4:
                    input.close();
                    return;
                default:
                    System.out.println("Menu tidak valid");
            }
        }
    }

    private static void masukkanTugas(Scanner input) {
        System.out.println("\nInput Data Tugas");
        System.out.print("Mata Kuliah: ");
        String mataKuliah = input.nextLine();
        System.out.print("Tugas: ");
        String namaTugas = input.nextLine();
        System.out.print("Deadline: ");
        String deadline = input.nextLine();

        Tugas tugasBaru = new Tugas(mataKuliah, namaTugas, deadline);
        daftarTugas.addFirst(tugasBaru);
    }

    private static void hapusTugas(Scanner input) {
        System.out.println("\nDelete Data Tugas");
        System.out.println("1. Berdasarkan Mata Kuliah");
        System.out.println("2. Berdasarkan Nama Tugas");
        System.out.println("3. Data Terakhir");
        System.out.print("Pilih kriteria penghapusan: ");
        int kriteria = input.nextInt();
        input.nextLine(); // Consume newline

        switch (kriteria) {
            case 1:
                System.out.print("Masukkan Mata Kuliah: ");
                String mataKuliah = input.nextLine();
                daftarTugas.removeIf(tugas -> tugas.mataKuliah.equals(mataKuliah));
                break;
            case 2:
                System.out.print("Masukkan Nama Tugas: ");
                String namaTugas = input.nextLine();
                daftarTugas.removeIf(tugas -> tugas.namaTugas.equals(namaTugas));
                break;
            case 3:
                daftarTugas.removeLast();
                break;
            default:
                System.out.println("Kriteria penghapusan tidak valid");
        }
    }

    private static void lihatListTugas(Scanner input) {
        System.out.println("\nLihat List Tugas");
        System.out.println("1. Print Depan");
        System.out.println("2. Print Belakang");
        System.out.print("Pilih cara pencetakan: ");
        int pilihan = input.nextInt();
        input.nextLine(); // Consume newline

        if (pilihan == 1) {
            ListIterator<Tugas> iterator = daftarTugas.listIterator();
            while (iterator.hasNext()) {
                Tugas tugas = iterator.next();
                System.out.println("Mata Kuliah = " + tugas.mataKuliah + ", Tugas = " + tugas.namaTugas + ", Deadline = " + tugas.tanggalDeadline);
            }
        } else if (pilihan == 2) {
            ListIterator<Tugas> iterator = daftarTugas.listIterator(daftarTugas.size());
            while (iterator.hasPrevious()) {
                Tugas tugas = iterator.previous();
                System.out.println("Mata Kuliah = " + tugas.mataKuliah + ", Tugas = " + tugas.namaTugas + ", Deadline = " + tugas.tanggalDeadline);
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
