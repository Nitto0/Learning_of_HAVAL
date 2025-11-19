package prak_4.shop;

public enum categories {
    SWEETS("sweets", products.CHOC, products.CANDY),
    CLOTHES("clothes", products.SHIRT, products.HAT),
    DRINKS("drinks", products.COLA, products.COFFEE);

    private final String name;
    private final products first;
    private final products second;

    categories(String name, products first, products second) {
        this.name = name;
        this.first = first;
        this.second = second;
    }

    public String getName() {
        return name;
    }
}
