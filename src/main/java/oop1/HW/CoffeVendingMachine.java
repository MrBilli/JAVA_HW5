package oop1.HW;

import java.util.ArrayList;

public class CoffeVendingMachine implements Vending {

    protected ArrayList<Coffe> hotDrinks = new ArrayList<Coffe>();

    public CoffeVendingMachine(ArrayList<Coffe> coffeList) {
        for (int i = 0; i < coffeList.size(); i++) {
            hotDrinks.add(coffeList.get(i));
        }
    }

    @Override
    public void addProduct(ArrayList<Coffe> coffeList, String name, double volume, double temperature) {
        for (int i = 0; i < this.hotDrinks.size(); i++) {
            if (coffeList.get(i).name == name && coffeList.get(i).volume == volume && coffeList.get(i).tempreture == temperature)
                hotDrinks.add(coffeList.get(i));
        }
    }

    @Override
    public Coffe getProduct(String name, double volume, double temperature) {
        for (int i = 0; i < this.hotDrinks.size(); i++) {
            if (this.hotDrinks.get(i).name == name && this.hotDrinks.get(i).volume == volume && this.hotDrinks.get(i).tempreture == temperature)
                return this.hotDrinks.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < this.hotDrinks.size(); i++) {
            str += this.hotDrinks.get(i).getName() + " vol " + this.hotDrinks.get(i).getVolume() + " temp " + this.hotDrinks.get(i).getTempreture() + "\n";
        }
        return str;
    }
}
