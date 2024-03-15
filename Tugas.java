public class Tugas implements Comparable<Tugas> {
    String mataKuliah;
    String namaTugas;
    String tanggalDeadline;
    
    public Tugas(String mataKuliah, String namaTugas, String tanggalDeadline) {
        this.mataKuliah = mataKuliah;
        this.namaTugas = namaTugas;
        this.tanggalDeadline = tanggalDeadline;
    }
    
    @Override
        public int compareTo(Tugas other) {
        // Implementasi untuk pengurutan berdasarkan deadline
        return this.tanggalDeadline.compareTo(other.tanggalDeadline);
    }
    
    @Override
        public String toString() {
        return "Mata Kuliah = " + this.mataKuliah + ", Tugas = " + this.namaTugas + ", Deadline = " + this.tanggalDeadline;
    }
}

