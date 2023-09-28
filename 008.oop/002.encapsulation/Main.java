public class Main {
    /*
     * Encapsulation, bir sınıfın içindeki verileri
     * ve bu verilere erişimi kontrol altına alma işlemidir.
     * 
     * Erişim için public getter ve setter metotlarının
     * kullanılması, verilere kontrollü erişimi sağlar.
     * 
     * Bu kontrol, verilerin yanlış kullanımını önler
     * ve sınıfın iç mantığını korur.
     * 
     * Örnek: private ile tanımlanan bir değişkenin
     * public bir getter ile okunması ve public bir setter ile güncellenmesi.
     */
    public static void main(String[] av) {
        product urun;
        urun = new product();
        urun.setAd("Laptop");
        urun.setId(1);
        urun.setAciklama("Msi GL65 Leopard Laptop");
        urun.setFiyat(49999.99);
        urun.setStokAdedi(4);

        productManager veritabanim;
        veritabanim = new productManager();
        veritabanim.Add(urun);
        veritabanim.tanit(urun);
    }
}