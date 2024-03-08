public class Book {
    String judulBuku;
    String penerbit;
    int tahunTerbit;

    public Book(String judulBuku, String penerbit, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public void display() {
        System.out.println("Judul Buku: " + judulBuku + ", Penerbit: " + penerbit+ ", Tahun Terbit: " +tahunTerbit);
    }
}
