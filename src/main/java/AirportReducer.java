import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class AirportReducer extends Reducer<FlightWritableComparable, Text, IntWritable, Text> {
}