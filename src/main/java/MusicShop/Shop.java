package MusicShop;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return this.till;
    }

    public void setTill(double till) {
        this.till += till;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }

    public double totalProfitOfStock() {
        double totalStockProfit = 0;
        for (ISell item : this.stock) {
            totalStockProfit += item.calculateMarkup();

        }
        return totalStockProfit;
    }

    public boolean checkIfItemInStock(ISell guitar) {
        for (ISell item : this.stock) {
            if (item == guitar) {
            }
            return true;
        }
        return false;
    }

    public double sellItem(ISell item) {
        checkIfItemInStock(item);
        this.stock.remove(item);
        setTill(item.calculateMarkup());
        return this.till;
    }

}
