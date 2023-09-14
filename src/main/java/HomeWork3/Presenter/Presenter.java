package HomeWork3.Presenter;

import HomeWork3.Exceptions.EmptyProductException;
import HomeWork3.Exceptions.NameNotFoundException;
import HomeWork3.Exceptions.NameProductException;
import HomeWork3.Exceptions.PriceProductException;
import HomeWork3.Model.Model;
public class Presenter {
    private Model model;

    public Presenter() {
        model = new Model();
    }

    public void addProduct(String name, double price) {
        try {
            model.addProduct(name, price);
        } catch (NameProductException | PriceProductException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(String name) {
        try {
            model.deleteProduct(name);
        } catch (NameProductException | NameNotFoundException | EmptyProductException e) {
            System.out.println(e.getMessage());
        }
    }


    public String getProduct(String name) {
        try {
            return model.getProduct(name);
        } catch (NameNotFoundException | NameProductException | EmptyProductException e) {
            return e.getMessage();
        }

    }

    public void getAllProducts() {
        try {
            model.getAllProducts();
        } catch (EmptyProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
