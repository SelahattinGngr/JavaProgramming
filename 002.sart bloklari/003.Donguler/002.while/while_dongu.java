public class while_dongu
{
    // islevi for dongusu ile aynidir farki degiskeni iceride deger atamasi yapamaz
    // sadece sarti karsilarsa dongu devam eder.
    public static void main(String[] args)
    {
        int i = 0;
        String a = "selahattin";
        while (a[i] != '\0')
        {
            System.out.println(a[i]);
            i++;
        }
    }
}
