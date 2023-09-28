public class Main {
    public static void main(String[] av) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        AskerKrediManager askerKrediManager = new AskerKrediManager();

        ogretmenKrediManager.setFirstName("haldun");
        ogretmenKrediManager.setLastName("aydin");
        ogretmenKrediManager.setAge(35);
        ogretmenKrediManager.setSalary(36000);
        ogretmenKrediManager.Hesapla(ogretmenKrediManager);
        System.out.println(ogretmenKrediManager.getFirstName() + " adli ogretmenkredisi " + ogretmenKrediManager.getKredi());

        tarimKrediManager.setFirstName("zekeriya");
        tarimKrediManager.setLastName("yilmaz");
        tarimKrediManager.setAge(42);
        tarimKrediManager.setSalary(27000);
        tarimKrediManager.Hesapla(tarimKrediManager);
        System.out.println(tarimKrediManager.getFirstName() + " adli tarimkredisi " + tarimKrediManager.getKredi());

        askerKrediManager.setFirstName("aybars");
        askerKrediManager.setLastName("ozturk");
        askerKrediManager.setAge(24);
        askerKrediManager.setSalary(41000);
        askerKrediManager.Hesapla(askerKrediManager);
        System.out.println(askerKrediManager.getFirstName() + " adli askerkredisi " + askerKrediManager.getKredi());
    }
}
