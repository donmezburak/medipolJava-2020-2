package categories;

import products.BaseProduct;
import products.CifProduct;

import java.util.ArrayList;
import java.util.List;

public class TemizlikCategory extends BaseCategory {
    @Override
    public String getName() {
        return "Temizlik";
    }

    @Override
    public List<BaseProduct> getProducts() {
        List<BaseProduct> products = new ArrayList<>();
        products.add(new CifProduct());
        return products;
    }
}
