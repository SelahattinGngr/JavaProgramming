public class variables_example
{
    public static void main (String[] args)
    {
        int sayim = 53;
        // sayim = "Selo"; int veri tipine string/char veri tipinde degisken eklenemez
        System.out.println(sayim);

        double sayim1 = 12.5;
        // ondalikli sayilari double tutar
        System.out.println(sayim1);

        char    harfim = 's';
        // ascii de karsiligi bulunan tek bir karakteri tutar
        System.out.println(harfim);

        char    harfim1 = 122;
        // char a bir tam sayi verirsek var ise ascii de karsiligini kullanir
        System.out.println(harfim1);
    }
}