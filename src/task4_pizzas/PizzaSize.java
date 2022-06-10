package task4_pizzas;

public enum PizzaSize {

    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    EXTRA_LARGE("EXTRA_LARGE");

    public final String sizey;

    PizzaSize(String sizey) {
        this.sizey = sizey;
    }

    public static PizzaSize sizeConverter (String size) {
        PizzaSize size1 = null;

        switch (size) {

            case "SMALL":
                size1 = PizzaSize.SMALL;
                break;
            case "MEDIUM":
                size1 = PizzaSize.MEDIUM;
                break;
            case "LARGE":
                size1 = PizzaSize.LARGE;
                break;
            case "EXTRA_LARGE":
                size1 = PizzaSize.EXTRA_LARGE;
                break;
        }
        return size1;
    }

}
