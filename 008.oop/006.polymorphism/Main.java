public class Main {
    /*
     * polymorphism cok bicimlilik demektir
     * aralarinda inheritance olan class'lar arasinda
     * cok bicimlilik yapilabilir
     */
    public static void main(String[] av) {
        /*
         * file, email, database logger'lar hepsi baselogger'dan inherit alindigi icin
         * baseloger dizisine atilabilirler
         */
        BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
                new ConsoleLogger() };

        // int[] sayilar = new int[] {2, 3, 4, "selam"};
        // bu kullanimda "selam" bir str oldugu icin int dizisine atilamaz

        for (BaseLogger logger1 : loggers) {
            logger1.log("log mesaji");
        }

        CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());
        customerManager1.add();
        CustomerManager customerManager2 = new CustomerManager(new FileLogger());
        customerManager2.add();
    }
}
