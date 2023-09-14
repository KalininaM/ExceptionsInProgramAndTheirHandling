package HomeWork3.Model;

import HomeWork3.Exceptions.EmptyProductException;
import HomeWork3.Exceptions.NameNotFoundException;
import HomeWork3.Exceptions.NameProductException;
import HomeWork3.Exceptions.PriceProductException;
public class Model {
    private final OnlineShop shop;

    public Model() {
        this.shop = new OnlineShop("Товары 24\7");
    }

    public void addProduct(String name, double price) throws NameProductException, PriceProductException {
        shop.addProduct(name, price);
    }

    public void deleteProduct(String name) throws NameNotFoundException, NameProductException, EmptyProductException {
        shop.deleteProduct(name);

    }

    public String getProduct(String name) throws NameProductException, NameNotFoundException, EmptyProductException {
        return shop.getProduct(name);
    }

    public void getAllProducts() throws EmptyProductException {
        shop.getAllProducts();
    }
}
