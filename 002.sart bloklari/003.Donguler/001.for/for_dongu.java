public class for_dongu
{
        // belirli bir işi bir çok kez tekrarlamaktansa dögü yardimi ile tek bir dongu komutu ile bu islem kisaltilir
            // bir string uzunlugu sayilacaksa
            // ekrana birden cok yazi basilacaksa
            // map okuma, dizi okuma/yazdirma yapilacaksa
        public static void main(String[] args)
        {
                for (int i = 0; i < 10; i++)
                        System.out.println(i);
                // for dongusunun 3 sarti vardir
                        // deger atamasi; ister degiskeni icerde olustur ister disarida bir deger atamasi sart
                        // dongu sarti; dongunun sinirinin belirtilecegi sart
                        // deger arttirma/azaltma

                // yukaridaki ornekte i degiskeni olusturulup 0 degeri verildi
                // i 10 dan kucuk olmasi sarti ile dongu devam etti
                // her donguye girdiginde i'ye +1 eklenerek yazdirma islemi verildi.
                System.out.println("------------------------------------"); // ayirma cizgisi
                int j;
                for (j = 0; j < 15; j+=2)
                        System.out.println(j);
                // globalde/fonksiyonda olusturulan degiskene deger atamasi yapilipda kullanilabilir
                        // illa iceride degisken olusturcan diye bir kaide yok
                // j += 2 ile 2 arttirilarak isleme devam ettik
        }
}