public class helloworld // buradaki isim dosya adidir
{                       // dosya adi ile farklilik mevcut ise derlemez
    public static void main(String[] args)
    {
        // yorum satirinin programsal bir karsiligi mevcut degildir
        /* kodlarda betimlemek istedigimiz, ozelligini belirtmek istedigimiz durumlarda ya da
           bir kodu devre disi birakmak icin kullanilir */

        // java case sensitive (buyuk kucuk harfe duyarli) bir dildir
        System.out.println("Merhaba Java1");
        System.out.print("Merhaba Java2");  // ; anlam ve onemi kodun / satirin bittigini belirtir
        System.out.print("Merhaba Java3");
                // println stringi yazdirir alt satira iner print sadece stringi yazdirir
    }
        /* system.out.print harflerinden biri olmasi gerekenden farkli olursa (System seklinde yazilmaliydi)
           hata veriyor (denendi onaylandi) */
}
