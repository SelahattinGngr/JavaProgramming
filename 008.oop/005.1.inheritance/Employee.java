/* public class employee
{
    buradaki degiskenler bakarsaniz customer ile ayni
    inheritance (kalitim/miras) ile customer de bulunan
    degiskenleri sanki bu class da da varmis gibi kullanmamizi
    saglayan bir method'dur

    int id;
    String firstName;
    String lastName;
    int age;
} */

// bir class'i inheritance almak icin extends kullanilir
public class Employee extends Person {
    double salary;
}