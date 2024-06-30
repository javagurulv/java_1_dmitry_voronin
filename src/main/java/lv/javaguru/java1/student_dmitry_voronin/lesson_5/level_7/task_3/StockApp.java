package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_7.task_3;

public class StockApp {

    public static void main(String[] args) {
        StockUtil stockUtil = new StockUtil();
        String stockName = stockUtil.getStockNameFromUser();

        int stockPriceCount = stockUtil.getStockPriceFromUser();

        double[] prices = stockUtil.getStockPricesFromUser(stockPriceCount);

        double maxPrice = stockUtil.calculateMaxPrice(prices);
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        double minPrice = stockUtil.calculateMinPrice(prices);
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);

        double averagePrice = stockUtil.calculateAvaregePrice(prices);
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);


        System.out.println("Программа завершена.");
        }
    }

