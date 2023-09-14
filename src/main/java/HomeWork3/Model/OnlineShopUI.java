package HomeWork3.Model;

import HomeWork3.Exceptions.EmptyProductException;
import HomeWork3.Exceptions.NameNotFoundException;
import HomeWork3.Exceptions.NameProductException;
import HomeWork3.Exceptions.PriceProductException;
public interface OnlineShopUI {
    void addProduct(String product, double price) throws NameProductException, PriceProductException;

    void deleteProduct(String name) throws NameNotFoundException, NameProductException, EmptyProductException;

    String getProduct(String name) throws NameNotFoundException, NameProductException, EmptyProductException;

    void getAllProducts() throws EmptyProductException;
}
