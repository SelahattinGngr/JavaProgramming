public class switch_blogu
{
    public static void main (String[] args)
    {
        char not = 'G';

        // switch icerisine sartimizin oznesi yani ne uzerinden sart yapilacagi yazilir
        switch (not)
        {
            case 'A':
                System.out.println("tam not gectiniz");
                break;
            case 'B':
                System.out.println("iyi not gectiniz");
                break;
            case 'C':
                System.out.println("ortalama not gectiniz");
                break;
            case 'D':
                System.out.println("kosullu gectiniz");
                break;
            case 'F':
                System.out.println("kaldin krdsm");
                break;
            default:
                System.out.println("gecersiz not krdsm");
        }
    }
}