public class string2
{
    public static void main(String[] av)
    {
        String mesaj = "bugun hava cok guzel";

        String yenimesaj = mesaj.replace(' ', '-');
        // mesaj dizimizdeki ' ' karakterleri yerine '-' karakteri yerlestirecek
        // return olarak yeni hali doner, orjinal degiskende degisiklik olmaz
        // yeni degiskene atama yapilarak yeni hali kaydedilebilir
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2));
        // bir metnin icerisinden verilen indexinden sonrasini yazdirir
        System.out.println(mesaj.substring(2,4));
        // ayni fonksiyona 2. parametre girilirse iki index arasini yazdirir.

        for (String kelime:mesaj.split(" "))
            System.out.println(kelime);
        /*
        split fonksiyonu bir metnin verilen karakter gordukce ayirip dondurmesini saglar
        "bugun hava cok guzel" metnine " " karakteri gordukce ayir dedigimizde
        bugun
        hava
        cok
        guzel       seklinde cikti beklemekte bizi
         */
    }
}