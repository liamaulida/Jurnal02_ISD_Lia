import java.util.ArrayList;

public class ATK {
    private String KodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stokBarang;
    
    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        KodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }
    public String getKodeBarang() {
        return KodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        KodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getStokBarang() {
        return stokBarang;
    }
    public void setStok(int stokBarang) {
        this.stokBarang = stokBarang;
    }
    @Override
    public String toString() {
        return "Atk [KodeBarang=" + KodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stok=" + stokBarang + "]";
    }
    
}