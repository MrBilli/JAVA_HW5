package oop1.HW;

import oop1.Product;

import java.util.ArrayList;

public interface Vending {


    HotDrink getProduct(String name, double volume, double temperature);

    void addProduct(ArrayList<Coffe> coffeList, String name, double volume, double temperature);
}
