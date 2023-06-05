public class do_while
{
    public static void main(String[] args)
    {
        int i = 15;
        // do while dongusu while dongusune cok benzer
        /* do anahtar kelimesi ile baslatilir while sartini karsiladigi
           surece calismaya devam eder */
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        /* do while ile while farki
            while de sart saglanmadan donguye girmez
            do while de sart saglanmasa da donguye girer
            dongu bitiminde sarti kontrol eder */

        /* while sarti i nin 10 dan kucuk olmasi lakin i = 15
           ilk once donguye girdigi icin herhangi bir kontrol yapilmadi */
    }
}