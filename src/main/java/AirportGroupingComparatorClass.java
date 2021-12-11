import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

// разбивает исходные данные reduce на группы

public class AirportGroupingComparatorClass extends WritableComparator{
    public AirportGroupingComparatorClass() {
        super(FlightWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        FlightWritableComparable first = (FlightWritableComparable) a;
        FlightWritableComparable second = (FlightWritableComparable) b;
        //
        return first.compareTo(second);
    }
}
