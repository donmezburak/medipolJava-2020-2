package categories;

import products.BaseProduct;
import products.PeynirProduct;
import products.ZeytinProduct;

import java.util.ArrayList;
import java.util.List;

public class YiyecekCategory extends BaseCategory {
    @Override
    public String getName() {
        return "Yiyecek";
    }

    @Override
    public List<BaseProduct> getProducts() {
        List<BaseProduct> products = new ArrayList<>();
        products.add(new PeynirProduct());
        products.add(new ZeytinProduct());
        return products;
    }
}
