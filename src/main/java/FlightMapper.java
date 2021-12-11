import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

//применяется к каждой строке файла и преобразует в ее в набор пар key value
public class FlightMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
        String line = 
        /*String str = value.toString().toLowerCase();
        str = str.replaceAll("[^'а-я\\w-'а-я]"," ");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            context.write(new Text(words[i]), new IntWritable(1));
        }*/
    }
}
