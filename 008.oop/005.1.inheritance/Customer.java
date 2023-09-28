/* public class customer
{
    buradaki degiskenler bakarsaniz employee ile ayni
    inheritance (kalitim/miras) ile person de bulunan
    degiskenleri sanki bu class da da varmis gibi kullanmamizi
    saglayan bir method'dur 
 
    int id;
    String firstName;
    String lastName;
    int age;
} */

// bir class'i inheritance almak icin extends kullanilir
public class Customer extends Person {
    String email;
}