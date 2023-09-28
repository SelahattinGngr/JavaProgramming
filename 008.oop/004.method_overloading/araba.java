public class araba {
    private int model;
    private int uzunluk;

    void setModel(int model) {
        this.model = model;
    }

    // burada girilen girdinin turune gore otomatik olarak fonksiyona girecektir
    void setUzunluk(double uzunluk) {
        this.uzunluk = (int) (uzunluk * 100); // double ile int carpimi hata dondurdugu icin cast islemi yaptim
    }

    void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    int getModel() {
        return model;
    }

    int getUzunluk() {
        return uzunluk;
    }
}