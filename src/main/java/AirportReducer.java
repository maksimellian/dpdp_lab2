import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
// 
public class AirportReducer extends Reducer<FlightWritableComparable, Text, IntWritable, Text> {

    @Override
    protected void reduce(FlightWritableComparable key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {

    }
}
