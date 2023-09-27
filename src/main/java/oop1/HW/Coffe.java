package oop1.HW;

public class Coffe extends HotDrink {

    protected double tempreture;

    public double getTempreture() {
        return tempreture;
    }

    public void setTempreture(double tempreture) {
        this.tempreture = tempreture;
    }

    public Coffe(String name, double volume, double temperature) {
        this.volume = volume;
        this.name = name;
        this.tempreture = temperature;
    }
    @Override
    public String toString() {
        return this.name + " vol " + this.volume + " temp " + this.tempreture;
    }
}
