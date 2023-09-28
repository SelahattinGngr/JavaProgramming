public class method
{
	/* java, C, C++ gibi dillerde kod islenmeye mainden baslar
	 * kodun ilerleyisi mainde dallanarak ilerler */
	/* daha temiz kodlar yazmak icin farkli fonksiyonlara ihtiyacimiz vardir
	 * calisma sirasi gelen fonksiyonlar verdigimiz gorevleri yerine getirir
	 * maine geri doner, main biterse kod bitmis demektir. */
	public static void main(String[] av) {
		sayiBulmaca(7);
		sayiBulmaca(6);
		sayiBulmaca(3);
	}

	/* main icerisinde sayiBulmaca fonksiyonunu cagirdik main bu fonksiyona girdi
	 * fonksiyonun isi bitince maine geri dondu, mainin baska isi kalmadigi icin bitmistir*/

	/* fonksiyon yaninda () icerisinde belirtilen veri tipi fonksiyon cagirilirken
	 * gonderilecek veri tipidir */
	// sayiBulmaca (int) veri tipi gonderdigimde bu fonkiyon bir int beklemektedir
	public static void sayiBulmaca(int aranacak) {
		int[] sayilar = new int[] {1, 2, 3, 4, 5, 7, 8, 9, 0};
		boolean varmi = false;

		for (int sayi : sayilar)
			if (sayi == aranacak) {
				varmi = true;
				break;
			}
		if (varmi)
			mesajVer("sayi mevcuttur ", aranacak);
		else
			mesajVer("sayi namevcuttur ", aranacak);
	}

	public static void mesajVer(String str, int aranacak) {
		System.out.println(str + aranacak);
	}
	// cagirilan fonksiyonlarda da baska fonksiyon cagirilabilir
	// ornek olarak System.out.println bir sistem fonksiyonudur ve cagirip kullandik
}