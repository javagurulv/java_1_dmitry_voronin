package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_4;

public class Stock {
    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String company, int currentPrice){
        this.company = company;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.currentPrice = currentPrice;
    }
    public void updatePrice(int newPrice){
        this.currentPrice = newPrice;
        if(this.minPrice > newPrice){
            this.minPrice = newPrice;
        }
        if(this.maxPrice < newPrice){
            this.maxPrice = newPrice;
        }
    }

    public String getCompany() {
        return company;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }
}
