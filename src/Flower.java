import java.util.Arrays;

public class Flower {
    private String name;
    private int freshness;
    private double price;

    public Flower(String name, int freshness, double price) {
        this.name = name;
        this.freshness = freshness;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", freshness=" + freshness +
                ", price=" + price +
                '}';
    }

    public static double findHighestPrice(Flower[] flowers) {
        double highestPrice = flowers[0].getPrice();
        for (Flower flower : flowers) {
            if (flower.getPrice() > highestPrice) {
                highestPrice = flower.getPrice();
            }
        }
        return highestPrice;
    }

    public static void sortByFreshness(Flower[] flowers) {
        Arrays.sort(flowers, (flower1, flower2) -> flower2.getFreshness() - flower1.getFreshness());
    }

    public static void sortByName(Flower[] flowers) {
        Arrays.sort(flowers, (flower1, flower2) -> flower1.name.compareTo(flower2.name));
    }
}