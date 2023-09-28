public class productManager {
    public void Add(product urun) {
        // bu product u burada JDBC kodlari ile database yazacagiz ama ileride
        System.out.println("urun eklendi " + urun.getAd());
    }

    public void tanit(product urun) {
        System.out.println("urun id: " + urun.getId());
        System.out.println("urun adi: " + urun.getAd());
        System.out.println("urun fiyati: " + urun.getFiyat());
        System.out.println("urun aciklamasi: " + urun.getAciklama());
        System.out.println("urun stok adedi: " + urun.getStokAdedi());
    }
}