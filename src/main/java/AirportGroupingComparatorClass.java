import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportGroupingComparatorClass extends WritableComparator{
    public AirportGroupingComparatorClass() {
        super(FlightWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        
        return a - b;
    }
}
