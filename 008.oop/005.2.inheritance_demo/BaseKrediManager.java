public class BaseKrediManager extends People {
    public void Hesapla(AskerKrediManager askerKrediManager) {
        System.out.println("asker kredisi hesaplandi");
        askerKrediManager.setKredi(askerKrediManager.getSalary() * (askerKrediManager.getAge() / 4));
    }

    public void Hesapla(TarimKrediManager tarimKrediManager) {
        System.out.println("kredi hesaplandi");
        tarimKrediManager.setKredi(tarimKrediManager.getSalary() * (tarimKrediManager.getAge() / 2.43));
    }

    public void Hesapla(OgretmenKrediManager ogretmenKrediManager) {
        System.out.println("kredi hesaplandi");
        ogretmenKrediManager.setKredi(ogretmenKrediManager.getSalary() * (ogretmenKrediManager.getAge() / 1.67));
    }
}
