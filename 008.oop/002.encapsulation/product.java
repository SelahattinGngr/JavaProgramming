public class product {
    private int id;
    private String ad;
    private String aciklama;
    private double fiyat;
    private int stokAdedi;

    // Getter
    public int getId() {
        return id;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String getAd() {
        return ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    // this ibaresi bu class'da bulunan anlamindadir
    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}