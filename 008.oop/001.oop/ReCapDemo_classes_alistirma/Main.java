import java.util.Scanner; // Scanner sınıfını kullanmak için

public class Main {
    public static void main(String[] av) {
        // bizim yazdigimiz class'i nesne olarak tanimliyoruz
        Dortislem HesapMakinem;
        HesapMakinem = new Dortislem();
        // sistem class'i kullanicidan girdi almak icin kullanacagiz
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("lutfen yapilacak islem operatoru girin ('+', '-', '*', '/')");
        char operator = scanner.next().charAt(0);
        // tek bir char alacaksak next().charAt(0) class'i cagiracagiz
        int sayi1;
        int sayi2;
        switch (operator) {
            // int sayi1;
            // int sayi2;
            // switch iceriisnde degisken tanimlanmiyormus
            case '+':
                System.out.println("toplanacak ilk sayiyi giriniz");
                sayi1 = scanner.nextInt(); // int alacaksak nextInt
                System.out.println("toplanacak ikinci sayiyi giriniz");
                sayi2 = scanner.nextInt();
                System.out.println("sayilarin toplami: " + HesapMakinem.topla(sayi1, sayi2));
                break;
            case '-':
                System.out.println("cikartilacak ilk sayiyi giriniz");
                sayi1 = scanner.nextInt();
                System.out.println("cikartilacak ikinci sayiyi giriniz");
                sayi2 = scanner.nextInt();
                System.out.println("sayilarin cikartmasi: " + HesapMakinem.cikar(sayi1, sayi2));
                break;
            case '*':
                System.out.println("carpilacak ilk sayiyi giriniz");
                sayi1 = scanner.nextInt();
                System.out.println("carpilacak ikinci sayiyi giriniz");
                sayi2 = scanner.nextInt();
                System.out.println("sayilarin carpimi: " + HesapMakinem.carp(sayi1, sayi2));
                break;
            case '/':
                System.out.println("bolunecek ilk sayiyi giriniz");
                sayi1 = scanner.nextInt(); // int alacaksak nextInt
                System.out.println("bolunecek ikinci sayiyi giriniz");
                sayi2 = scanner.nextInt();
                System.out.println("sayilarin bolumu: " + HesapMakinem.bol(sayi1, sayi2));
                break;
            default:
                System.out.println("gecerli operator girin");
                scanner.close();
        }
    }
}