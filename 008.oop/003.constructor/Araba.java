public class Araba {
    private int model;
    private int km;
    private String marka;

    void setModel(int model) {
        this.model = model;
    }

    void setKm(int km) {
        this.km = km;
    }

    void setMarka(String marka) {
        this.marka = marka;
    }

    int getModel() {
        return model;
    }

    int getKm() {
        return km;
    }

    String getMarka() {
        return marka;
    }

    // constructor'a nesne tanimlandigi an girer iceride yapilmasi gerekeni yapar
    Araba() {
        this.km = 0;
        this.model = 1961;
        this.marka = "devrim";
        System.out.println("nesne basari ile calisti bremin");
    }
    /* java'da c++ gibi dillerde bulunan destructor yoktur */
    // destructor ornegi
    /*
     * ~araba()
     * {
     * System.out.println("destructor calisti UwU");
     * }
     */
}