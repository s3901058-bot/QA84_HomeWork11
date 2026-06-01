import java.util.Comparator;

public class ComparatorIntegerRevers implements Comparator<Integer> {
    @Override
    public int compare(Integer d1, Integer d2) {

        return Integer.compare(d1,d2);
    }
}
