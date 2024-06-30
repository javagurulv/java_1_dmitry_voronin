package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_7.task_3;

import java.util.Scanner;

public class StockUtil {

    public String getStockNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название акции: ");
        return scanner.nextLine();
    }

    public int getStockPriceFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество котировок акции: ");
        return  Integer.parseInt(scanner.nextLine());
    }
    public double[] getStockPricesFromUser(int stockPriceCount){
        Scanner scanner = new Scanner(System.in);
        double[] price = new double[stockPriceCount];
        for (int i = 0; i <stockPriceCount; i++){
            System.out.println("Введите цену акции " + (i + 1) + ": ");
            price[i] = Double.parseDouble(scanner.nextLine());
        }
        return price;
    }
    public  double calculateMaxPrice(double[] stockPrices){
        double maxPrice = stockPrices[0];
        for(double price : stockPrices){
            if(price > maxPrice){
                maxPrice = price;
            }
        }
        return  maxPrice;
    }
    public double calculateMinPrice(double[] stockPrices){
        double minPrice = stockPrices[0];
        for(double price : stockPrices){
            if(price < minPrice){
                minPrice = price;
            }
        }
        return  minPrice;
    }
    public double calculateAvaregePrice(double[]stockPrices){
        double totalPrice = 0.0;
        for(double price : stockPrices){
            totalPrice = totalPrice + price;
        }
        return totalPrice / stockPrices.length;
    }
}
