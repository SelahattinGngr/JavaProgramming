public class if_blogu
{
    /*  sart operatorleri
        < kucukse
        > buyukse
        == esitse
     */
    public static void main (String[] args)
    {
        // test etmek icin sayi degiskenini degistirin
        int sayi = 20;

        // if eger demektir, yanindaki paranteze bir sart girilir
        // bu sarti karsiliyorsa blogun icerisine girer
        if (sayi < 50)
            System.out.println("sayi 50 den kucuk");

        // else if, if sartini karsilamadigi zaman kontrol edilecektir
        // sarti karsilarsa bloga girer ve baska else if`lere bakmayacaktir
        else if (sayi > 50)
            System.out.println("sayi 50 den buyuk");

        // else, hic bir if/else if sartina girmediginde sartsiz girdigi bloktur
        else
            System.out.println("sayi 50 dir");

        /* if, else if, else birbiriyle baglidir if e girmesi durumunda
           diger sartlari kontrol etmeden gececektir */

        // birden fazla if mevcut ise her bir if`i tek tek kontrol edecektir

        // birden fazla if var ve sonrasine else eklenir ise en son if`in else i olacaktir
    }
}