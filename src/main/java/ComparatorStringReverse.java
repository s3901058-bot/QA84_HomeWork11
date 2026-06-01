import java.util.Comparator;

public class ComparatorStringReverse implements Comparator<Double> {

    @Override
    public int compare(Double d1, Double d2) {


        return  Double.compare(d2.doubleValue(),d1.doubleValue());
    }


}
