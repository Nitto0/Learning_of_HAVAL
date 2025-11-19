package prak_4.shop;

public enum products {
    CHOC("chocolate", 100),
    CANDY("candy", 50),

    SHIRT("shirt", 1500),
    HAT("hat", 1000),

    COLA("cola", 75),
    COFFEE("coffee", 350);

    private final String name;
    private final int cost;

    products (String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
