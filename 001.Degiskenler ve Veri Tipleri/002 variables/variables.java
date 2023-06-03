class variables
{
    public static void main (String[] args)
    {
        // int tamsayilari tutan veritipidir
        int sayi = 10;
        System.out.println("Sayim : "+sayi);
        /* println string tipinde cikti verir degiskeni ekrana bastirmak icin
           "" disinda '+' ekleyerek yazdirilacak veri tiplerini giriyoruz */

        System.out.println("Sayim : "+sayi +' ' +7);
        // birden fazla sayi basmak istedik arada bosluksuz bastigi icin bosluk da bastirdik
        // '' arasinda yazilan tek karakterler o karakterin char (ascii de bulunan tek karakter) oldugunu belirtir
        // '' arasinda yazilanlar char oldugu icin o da veri tipi olarak bastirilir

        System.out.println("Sayim : "+ (sayi+8));
        // parantez icerisine alarak bir matematik islemi belirtmis olduk sayi + 8 yaparak ciktiyi ekrana verecektir
        // parantez icerisinde olmazsa sayinin yanina 8 i yazdiracak istemedigimiz sonuclar ortaya cikacaktir

        char harf = 'c';
        // char sadece tek bir karakter tutan veritipidir

        System.out.println("harfim : "+ harf);

        String mesaj = "Selahattin Gungor";
        // string veri tipi birden fazla char veri tipini tutmaya yarar
            // birden fazla karakter = kelime
        System.out.println(mesaj);

        System.out.println(mesaj +harf +sayi);
        // arada bosluklar olmadigi icin mesjadan sonrasini birlesik yazacaktir
    }
}