public class Main {
    // constructor: yapici/olusturucu fonksiyonlar

    /**
     * default olarak consturcor her zaman vardir ama istege bagli olarak
     * kendi istedigimiz ozellikleri vererek kendi consturcorumuzu olusturabiliriz
     */
    /**
     * consturcor'un herhangi return degeri yoktur bu yuzden bir tipi yoktur
     * void bile degildir
     */
    public static void main(String[] av) {
        Araba araba1;
        araba1 = new Araba();
        // constructor ile verilen veriler basilacak
        System.out.println(araba1.getKm());
        System.out.println(araba1.getModel());
        System.out.println(araba1.getMarka());

        System.out.println("------------------------------"); // ayirma cizgisi
        araba1.setKm(17990);
        araba1.setModel(2022);
        araba1.setMarka("honda");

        System.out.println(araba1.getKm());
        System.out.println(araba1.getModel());
        System.out.println(araba1.getMarka());
    }
}