public class array
{   // Array, ayni tipten cok sayida degişken tanimlamak için kullanilir.
    //  Java dilinde array bir siniftir.
    public static void main(String[] args) {
        String ogrenci1 = "selo";
        String ogrenci2 = "evrim";
        String ogrenci3 = "busra";
        // string veri tipinden 3 tane tanimlamamiz bir array degildir
        /* array string (baska da olabilir) bir veri tipine birden fazla deger atamasi
           yapmamizi bu degerleri de index saydirarak bulmamizi/islememizi saglar  */
        String[] ogrenciler = new String[3];
        // array olusturulurken string[] diye veri tipi tanimlayip isimlendirdik
        // sag tarafinda ise kac elemandan olusacagini verdik

        ogrenciler[0] = "selo"; // programlamada indexler 0 dan baslar
        ogrenciler[1] = "busra";
        ogrenciler[2] = "evrim";

        for (int i = 0; i < ogrenciler.length; i++)
            System.out.println(ogrenciler[i]);
    }
}