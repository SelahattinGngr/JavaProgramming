public class asal
{
    public static void main(String[] str)
    {
        int number;
        boolean asal;

        number = 1;
        asal = true;

        // 1 asal sayi degildir
        if (number == 1)
        {
            System.out.println("sayi asal degildir\n");
            return ; // return diyerek direkt kodu bitiriyoruz
        }
        // asal sayilar sadece 1 e ve kendisine bolunen sayilardir
        // number / 2 yapma sebebimiz programi uzatmamak icin yarisina kadar gidiyoruz
        // bir sayi yarisina bolunemiyorsa zaten o sayidan sonra da bir sayiya tam bolunemez
        for (int i = 2; i <= number / 2; i++)
        {
            // % mod operatortudur, bir sayinin bir sayiya bolumunden kalani gosterir
            if ((number % i) == 0)
                asal = false;
        }
        // asal == true ile ayni islevdedir
        if (asal) // asal degiskeni true ise 1 demektir bu da if sartini calistirmaya yeter
            System.out.println("sayi asal sayidir\n");
        else
            System.out.println("sayi asal degildir\n");
    }
}