package task4_pizzas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PizzaTask {

    private DataHandlerTask4 dataHandler;

    public PizzaTask() {
        dataHandler = new DataHandlerTask4();
    }

    /**
     * Példafeladat.
     * A fájl beolvasását végző metódus helyes megírása után a beolvasott adatok így érhetőek el.
     * A dataHandler.getPizzas() elvégzi a beolvasást, ha a lista hossza 0 - lásd ott.
     */
    public void dataFromFile() {
        List<Pizza> pizzas = dataHandler.getPizzas();

        System.out.println("A fájl tartalma:");

        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }

    /**
     * Hány percig tartana elkészíteni adott pizzákat?
     * Add össze a bemeneti paraméterként kapott pizzák elkészítési idejét,
     * és térj vissza az eredménnyel!
     */
    public int sumPreparationTime(String... pizzaNames) {
        // TODO

        int counter = 0;

        List<String> pizzarriba = new ArrayList<>();
        Collections.addAll(pizzarriba,pizzaNames);

        for (Pizza pizza : dataHandler.getPizzas()) {
            if (pizzarriba.contains(pizza.getName())) {
                counter += pizza.getTime();
            }
        }
        return counter;
    }

    /**
     * Gyűjtsd össze azokat a pizzákat, amelyek rendelhetőek az adott méretben!
     */
    public List<Pizza> findPizzasBySize(PizzaSize size) {
        // TODO

        List<Pizza> pizzaList = new ArrayList<>();

        for (Pizza pizza : dataHandler.getPizzas()) {
            if (pizza.getSize() == size) {
                pizzaList.add(pizza);
            }
        }
        return pizzaList;
    }

    /**
     * Gyűjtsd össze azokat a pizzákat, amelyeken megtalálható az adott feltét!
     *
     * A feltétnél teljes egyezés szükséges.
     * Például van hagyma és lilahagyma. Ha a keresett feltét a "hagyma",
     * akkor a lilahagymás feltétű pizza NE kerüljön bele a listába.
     */
    public List<Pizza> findPizzasWithTopping(String topping) {
        // TODO

        List<Pizza> pizzaList = new ArrayList<>();

        for (Pizza pizza : dataHandler.getPizzas()) {
            if (pizza.getToppings().contains(topping)) {
                pizzaList.add(pizza);
            }
        }
        return pizzaList;
    }

}
