package task4_pizzas;

import java.util.List;

public class Pizza {

    // TODO

    private String name;
    private List<String> toppings;
    private int time;
    private PizzaSize size;

    public Pizza() {
    }

    public Pizza(String name, List<String> toppings, int time, PizzaSize size) {
        this.name = name;
        this.toppings = toppings;
        this.time = time;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }
}
