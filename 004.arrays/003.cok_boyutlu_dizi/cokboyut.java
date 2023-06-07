public class cokboyut
{
    public static void main(String[] args)
    {
        String[] isim = {"selo"};
        // yukaridaki ornek tek boyutlu bir dizidir
        String[][] isimler = new String[3][3];
        isimler[0][0] = "selo";
        isimler[0][1] = "evrim";
        isimler[0][2] = "onur";

        isimler[1][0] = "istanbul";
        isimler[1][1] = "42kocaeli";
        isimler[1][2] = "rize<3";

        isimler[2][0] = "rizespor";
        isimler[2][1] = "fenerbahce";
        isimler[2][2] = "galatasaray";
        // array olusturulurken verdigimiz new degeri o sayi kadar veri tuttugunu belirtirdi
        // ayni sekilde verilen sayilar iki boyutlu dizileri meydana getirir
        // 0. dizi 3 tane / 1. dizi 3 tane / 2. dizi 3 tane olmak uzere toplamda 9 dizi tutmus oluyoruz
        // her bir dizinin kendine gore cesidi olabilir
            // 0. dizi isim
            // 1. dizi sehirler
            // 2. dizi futbol takimlari gibi

        // 2 boyutlu diziler genel olarak harita isleme vb. islemlerde kullanilir

        for (int i = 0; i < isimler.length; i++)
        {
            System.out.println("----------");
            for (int j = 0; j < isimler[i].length; j++)
                System.out.println(isimler[i][j]);
        }
    }
}