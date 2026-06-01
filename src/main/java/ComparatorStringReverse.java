import java.util.Comparator;

public class ComparatorStringReverse implements Comparator<Double> {

    @Override
    public int compare(Double i1, Double i2) {


        return  Double.compare(i2.doubleValue(),i1.doubleValue());
    }


}


