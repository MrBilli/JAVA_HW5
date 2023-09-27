package oop1.HW;

import java.util.ArrayList;
import java.util.List;

// 4830 БАСАНОВ АЛЕКСЕЙ

public class main {
    public static void main(String[] args) {
        Coffe cappucinino = new Coffe("cappucino", 0.5, 28);
        Coffe iceCappucino = new Coffe("iceCappucino", 0.4, 5);
        Coffe espresso = new Coffe("espresso", 0.1, 25);
        ArrayList<Coffe> coffeArrayList = new ArrayList<>(List.of(cappucinino, iceCappucino, espresso));
        CoffeVendingMachine coffeMachine = new CoffeVendingMachine(coffeArrayList);
        System.out.println(coffeMachine);
        System.out.println(coffeMachine.getProduct("cappucino", 0.5, 28));
    }
}
