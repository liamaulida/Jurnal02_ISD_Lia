import java.util.ArrayList;

public class Bag {
    private String KodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stokBarang;
    
    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.KodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }
    public String getKodeBarang() {
        return this.KodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.KodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return this.jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getStokBarang() {
        return this.stokBarang;
    }
    public void setStok(int stokBarang) {
        this.stokBarang = stokBarang;
    }
    @Override
    public String toString() {
        return "Bag [KodeBarang=" + this.KodeBarang + ", jenisBarang=" + this.jenisBarang + ", namaBarang=" + this.namaBarang
                + ", stok=" + this.stokBarang + "]";
        
    }
}