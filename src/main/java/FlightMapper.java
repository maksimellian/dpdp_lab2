import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;



//применяется к каждой строке файла и преобразует в ее в набор пар key value
public class FlightMapper extends Mapper<LongWritable, Text, FlightWritableComparable, Text> {
    public static final float CANCELLED = 1.0f;
    public static final int DEST_AIRPORT_ID = 14; // номер колонки id аэропорта прибытия
    public static final int DELAY = 18; // номер колонки задержки
    public static final int INDICATOR = 1; // индикатор датасета
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
        String[] rows = value.toString().split(",");
        if (key.get() > 0) {
            String airportID = rows[DEST_AIRPORT_ID];
            if (!rows[DELAY].isEmpty()) {
                context.write(new FlightWritableComparable(Integer.parseInt(airportID), INDICATOR), new Text(rows[DELAY]));
            }
        }
        /*String str = value.toString().toLowerCase();
        str = str.replaceAll("[^'а-я\\w-'а-я]"," ");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            context.write(new Text(words[i]), new IntWritable(1));
        }*/
    }
}
