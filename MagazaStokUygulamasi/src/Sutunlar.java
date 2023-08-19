
public class Sutunlar {
    private int urun_kodu;
    private int stok_miktari;
    private String urun_adi;
    private float urun_alis_fiyati;
    private String urun_alis_tarihi;

    public Sutunlar(int urun_kodu, int stok_miktari, String urun_adi, float urun_alis_fiyati, String urun_alis_tarihi) {
        this.urun_kodu = urun_kodu;
        this.stok_miktari = stok_miktari;
        this.urun_adi = urun_adi;
        this.urun_alis_fiyati = urun_alis_fiyati;
        this.urun_alis_tarihi = urun_alis_tarihi;
    }

    public int getUrun_kodu() {
        return urun_kodu;
    }

    public void setUrun_kodu(int urun_kodu) {
        this.urun_kodu = urun_kodu;
    }

    public int getStok_miktari() {
        return stok_miktari;
    }

    public void setStok_miktari(int stok_miktari) {
        this.stok_miktari = stok_miktari;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public float getUrun_alis_fiyati() {
        return urun_alis_fiyati;
    }

    public void setUrun_alis_fiyati(float urun_alis_fiyati) {
        this.urun_alis_fiyati = urun_alis_fiyati;
    }

    public String getUrun_alis_tarihi() {
        return urun_alis_tarihi;
    }

    public void setUrun_alis_tarihi(String urun_alis_tarihi) {
        this.urun_alis_tarihi = urun_alis_tarihi;
    }
}    