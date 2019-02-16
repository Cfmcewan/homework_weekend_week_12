package MusicShop.MiscItems;

public abstract class MiscalleneousItem {

    private double buyingPrice;
    private double sellingPrice;

    public MiscalleneousItem(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
