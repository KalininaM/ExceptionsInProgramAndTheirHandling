package HomeWork3;

import HomeWork3.Exceptions.EmptyProductException;
import HomeWork3.Exceptions.NameNotFoundException;
import HomeWork3.Views.UserGUI;
public class Program {
    public static void main(String[] args) throws NameNotFoundException, EmptyProductException {
        UserGUI gui = new UserGUI();
        gui.show();
    }
}
