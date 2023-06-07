public class recapdemo
{
    public static void main(String[] args)
    {
        // double[] myList = new double[4];
            // array olustururken boyut belirleme yukaridaki gibidir
            // array olusturuldugu gibi deger atamasi ise
        double[] myList = {1.2, 5.3, 3.4, 7.8};
        // bu yapi arkada bir new yapip kac deger girildi ise o kadar yer aciyor
        for (double number:myList)
            System.out.println(number);
        System.out.println();

        double total = 0;
        for (double number:myList)
            total += number; // total = total + number demektir += operatoru topla ve esitle demek
        System.out.println(total);
    }
}