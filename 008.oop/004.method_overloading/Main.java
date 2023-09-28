public class Main {
    /**
     * method overloading = method asiri yukleme
     * ayni isimde birden fazla ama farkli is yapan farkli parametre alan
     * methodlardir
     */
    public static void main(String[] av) {
        araba araba1;
        araba araba2;
        araba1 = new araba();
        araba2 = new araba();

        araba1.setModel(2022);
        araba1.setUzunluk(300);
        araba2.setModel(2023);
        araba2.setUzunluk(2.80);

        System.out.println(araba1.getModel());
        System.out.println(araba1.getUzunluk());
        System.out.println(araba2.getModel());
        System.out.println(araba2.getUzunluk());
    }
}