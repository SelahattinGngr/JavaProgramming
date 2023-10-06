public class Main {
    public static void main(String[] av) {
        /*
         * customermanager.databasemanager'e kullanilacak database
         * classini tanimlayip o sistem uzerinden yurutuyoruz.
         * direkt baslangic olarak oracle olarak baslatirsak yarin
         * bir gun kodda degisiklige giderse veya database sistemi
         * degistirmek istersek kodu tek tek degistirmemek icin
         * bu yontem kullanildi.
         * solid kavramina uymak icin yapilmasi onemli adimdir
         */
        CustomerManager customerManager = new CustomerManager();
        customerManager.dataBaseManager = new OracleDataBaseManager();
        customerManager.getCustomer();
    }
}
