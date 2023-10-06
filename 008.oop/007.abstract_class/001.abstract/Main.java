public class Main {
    public static void main(String[] av) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();

        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();

        /*
         * abstract classlar newlenemez
         * GameCalculator gameCalculator = new GameCalculator();
         */

        /*
         * abstract bir class newlenecek ise icerigini girmek zorunludur
         * ama tavsiye edilen bir yöntem degildir
         */
        GameCalculator gameCalculator = new GameCalculator() {
            public void hesapla() {
                System.out.println(" AAAAAAAAAAAAA ");
            }
        };

    }
}
