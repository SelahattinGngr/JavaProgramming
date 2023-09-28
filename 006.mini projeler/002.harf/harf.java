public class harf
{
    public static void main(String[] str)
    {
        char harf;

        harf = 'A';
        switch (harf)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalin sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }
    }
}