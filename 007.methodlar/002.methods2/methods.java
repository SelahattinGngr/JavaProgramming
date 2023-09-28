public class methods
{
    /*
        void veri tipindeki bir fonksiyon bir veri return etmek zorunda degildir.
		int veri tipindeki bir fonksiyon int veri return etmek zorundadir.
		fonksiyona gonderilen veri farkli tipte olabilir onemli olan fonksiyon tipidir.
    */
    public static void main(String[] av)
    {
        mesajVer("sayilarimizin toplami: " + toplam(9, 3));
    }
    public static int toplam(int a, int b)
    {
        return (a + b);
    }
    public static void mesajVer(String str)
    {
        System.out.println(str);
    }
}