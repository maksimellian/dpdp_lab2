import org.apache.hadoop.io.WritableComparator;

public class AirportGroupingComparatorClass extends WritableComparator{
    public AirportGroupingComparatorClass() {
        super(FlightWritableComparable.class, true);
        
    }
}
