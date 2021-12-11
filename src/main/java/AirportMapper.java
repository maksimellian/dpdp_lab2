import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirportMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    public static final int AIRPORT_ID = 0;
    public static final int DESCRIPTION = 1;
}
