package products;

public class AltinProduct extends BaseProduct {
    double price = 525;
    @Override
    public String getName() {
        return "Altın";
    }

    @Override
    public double getPrice() {
        return price;
    }
    public void addPrice(double price){
        this.price += price;
    }
}



