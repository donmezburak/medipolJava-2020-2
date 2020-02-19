package categories;

import products.BaseProduct;

import java.util.List;

public abstract class BaseCategory {

    public abstract String getName();

    public abstract List<BaseProduct> getProducts();

    public void showProduct(){

        for (int i = 0; i < getProducts().size();i++){
            BaseProduct product = getProducts().get(i);
            System.out.println(i + "." + product.getName() + " fiyat: " + product.getPrice());
        }

    }


}
