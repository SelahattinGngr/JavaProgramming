public abstract class GameCalculator {
    /*
     * abstract ifadesinde inherit edilen bir hesapla var ama
     * extends eden class hesaplanin ne yapacagini belirlemek zorunda
     */
    public abstract void hesapla();

    /*
     * final ibaresi ile birlikte gamecalculator'u kim
     * extends edecek ise gameover i oldugu gibi kullanmak
     * zorundadir diyoruz
     */
    public final void GameOver() {
        System.out.println("oyun bitti gg wp");
    }

    // abstract classlarda her fonksiyon abstract olmak zorunda degildir
}
