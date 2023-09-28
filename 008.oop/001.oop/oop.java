public class oop {
   /*
    * Java'da bellek yönetimi, otomatik olarak
    * Java Sanal Makinesi (JVM) tarafından gerçekleştirilir.
    * Java'da bellek sızıntısı gibi sorunlarla başa çıkmak için
    * C veya C++ gibi dillerde olduğu gibi belleği açıkça serbest
    * bırakmanıza gerek yoktur. Java'da bellek yönetimi otomatiktir
    * ve Java Garbage Collector (Çöp Toplayıcı) tarafından işlenir.
    */
   // new ile actigimiz yeri free (yada delete emin degilim c den konusuyorum)
   // ile serbest birakmak zorunda degiliz
   public static void main(String[] av) {
      /*
       * olusturdugumuz class'i int, char, string, float
       * gibi bir tur seklinde cagirabiliriz
       * ve ayni sekide cagirdiktan sonra isimlendirebiliriz.
       */
      CustomerManager customerManager;
      customerManager = new CustomerManager();
      /*
       * new CustomerManager() dedigimizde bellekte o an CustomerManager
       * turunde bir nesne uretiyoruz
       */ // C programlamada bulunan malloc
      customerManager.Add();
      customerManager.Remove();
      customerManager.Update();
      /*
       * her methodu/fonksiyonu tek bir yerde tanimlamak yerine
       * isimize yarayacak sekilde class'lara bolup kullaniyoruz.
       */

      CustomerManager customerManager2;
      customerManager2 = new CustomerManager();
      customerManager = customerManager2;
      /*
       * bu sekilde bir cilginlik yaparsak yeni olusturdugumuz alanin
       * adresini eski olusturdugumuza atarsak eski adresimiz
       * yukarida anlatilan garbage collector tarafindan yokedilir
       */
   }
}
