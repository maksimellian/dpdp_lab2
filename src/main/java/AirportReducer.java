import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class AirportReducer extends Reducer<FlightWritableComparable, Text, IntWritable, Text> {
    
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws
            IOException, InterruptedException {
        long count = 0;
        while (values.iterator().hasNext()) {
            values.iterator().next();
            count += 1;
        }
        context.write(key, new LongWritable(count));
    }
}
