import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, Text, Text> {
    public static final int AIRPORT_ID = 0;
    public static final int DESCRIPTION = 1;
    public static final int INDICATOR = 0;
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
        String[] airports = value.toString().split(",");
        if (key.get() > 0) {
            String airport = airports[AIRPORT_ID].replaceAll("\"", "");
            context.write(new FlightWritableComparable(Integer.parseInt(airport), INDICATOR), new Text(airports[DESCRIPTION]));
        }
    }
}
