package HomeWork3.Model;

import HomeWork3.Exceptions.EmptyProductException;
import HomeWork3.Exceptions.NameNotFoundException;
import HomeWork3.Exceptions.NameProductException;
import HomeWork3.Exceptions.PriceProductException;
import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements OnlineShopUI {

    private String name;

    private final List<Product> products;


    public OnlineShop(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, double price) throws NameProductException, PriceProductException {
        if (name == null || name.isEmpty()) throw new NameProductException("Введите верное наименование!");
        if (price == 0) throw new PriceProductException("Цена товара не может быть нулевой!");
        products.add(new Product(name, price));
    }

    public void deleteProduct(String name) throws EmptyProductException, NameNotFoundException, NameProductException {
        if (products.size() == 0) throw new EmptyProductException("Склад пуст!");
        if (name == null || name.isEmpty()) throw new NameProductException("Введите верное наименование!");
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
            } else throw new NameNotFoundException("Такого товара нет в наличии!");
        }


    }

    public String getProduct(String name) throws EmptyProductException, NameNotFoundException, NameProductException {
        if (products.size() == 0) throw new EmptyProductException("Склад пуст!");
        if (name == null || name.isEmpty()) throw new NameProductException("Введите верное наименование!");
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product.toString();
            }
        }
        throw new NameNotFoundException("Такого товара нет в наличии!");
    }

    public void getAllProducts() throws EmptyProductException {
        if (products.size() == 0) throw new EmptyProductException("Склад пуст!");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}