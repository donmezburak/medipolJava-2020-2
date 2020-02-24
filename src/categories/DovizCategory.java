package categories;

import com.company.Main;
import products.AltinProduct;
import products.BaseProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DovizCategory extends BaseCategory {

    public AltinListener listener;

    public interface AltinListener {
        void altinChanged(double price);
    }

    AltinProduct product = new AltinProduct();

    public DovizCategory(AltinListener listener){
        this.listener = listener;

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                product.addPrice(0.5);
                listener.altinChanged(product.getPrice());
            }
        }, 0, 5000);
    }

    @Override
    public String getName() {
        return "Döviz";
    }

    @Override
    public List<BaseProduct> getProducts() {
        List<BaseProduct> products = new ArrayList<>();
        products.add(product);
        return products;
    }



}





