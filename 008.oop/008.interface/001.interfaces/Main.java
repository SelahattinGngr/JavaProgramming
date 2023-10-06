public class Main {
    // interface bir class kabul edilmiyor
    // ama interfaceler normal bir class gibi referans tutabilir
    // interfacesler sadece referans tutucu olarak gorulur
    public static void main(String[] av) {
        // interfacesler de abstract'lar gibi newlenemez
        // ICustomerDal customerDal = new ICustomerDal();
        ICustomerDal customerDal = new MySqlCustomerDal();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    };
}
