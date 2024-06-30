package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_4;

public class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG",70);
        System.out.println("Company : " + google.getCompany());
        System.out.println("Current price : " + google.getCurrentPrice());
        System.out.println("Min price : " + google.getMinPrice());
        System.out.println("Max priice : " + google.getMaxPrice());

        google.updatePrice(20);
        google.updatePrice(15);
        google.updatePrice(10);

        System.out.println("Company : " + google.getCompany());
        System.out.println("Current price : " + google.getCurrentPrice());
        System.out.println("Min price : " + google.getMinPrice());
        System.out.println("Max priice : " + google.getMaxPrice());
    }
}
