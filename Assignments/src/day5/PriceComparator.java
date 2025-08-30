package day5;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy toy1, Toy toy2) {
        return Float.compare(toy1.getPrice(), toy2.getPrice());
    }
}
