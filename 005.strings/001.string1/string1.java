public class string1
{
     public static void main(String[] argv)
    {
        /* stringler'de bir dizidir
           stringler birden fazla charin birlesiminden olusan dizilerdir
           string icerisinde bulunan her harfi index seklinde gezebiliriz */
        String mesaj = "bugun hava cok guzel";

        System.out.println(mesaj);
        System.out.println("eleman sayisi : " + mesaj.length()); // toplam char sayisi // ' ' da bir karakterdir
        System.out.println("5. elemani : " + mesaj.charAt(4)); // index sayma 0 dan baslanir o yuzden 5. eleman 4 dur
        /* daha acik anlatim:
            mesaj = {'b', 'u', 'g', 'u', 'n'};
            index =   0    1    2    3    4
         */
        System.out.println(mesaj.concat(" yasasin")); // concat 2 stringi birlestirir, birlestirilmis hali return edilir
                                                      /* birlestirilen dizi bir degiskene aktarilmazsa sadece cagirilan
                                                      bloga return eder, orjinal dizi bozulmaz. */
        System.out.println(mesaj.startsWith("B")); // startwith ne ile basladigini kontrol eder
                                                  // B ile basladi ise True baslamadi ise False dondurur
        System.out.println(mesaj.endsWith("l")); // endwith son harfi kontrol eder

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        /*
            getChars 4 parametre alir
            mesaj degiskeninin 0. indexinden 4. indexine kadar karakterler degiskenine kopyalar
         */
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); /* verilen stringde parametre olarak verilen char'in kacinci
                                                   index'de oldugunu dondurur */
        System.out.println(mesaj.lastIndexOf('a')); // aramaya sondan baslar ama baslangic indexinden sayarak sayi verir
    }
}