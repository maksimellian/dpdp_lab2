import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

// Разрабатываем reduce функцию, которая берет первую строку, извлекает из
// нее имя аэропорта, далее рассчитывает из последующих строк среднее
// минимальное и максимальное время задержки и печатает результат.
public class AirportReducer extends Reducer<FlightWritableComparable, Text, IntWritable, Text> {

    @Override
    protected void reduce(FlightWritableComparable key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        int counter = 0;
        float minDelay = Float.MAX_VALUE;
        float maxDelay = Float.MIN_VALUE;
        float totalDelay = 0;
        Iterator<Text> iterator = values.iterator();
        String airportName = iterator.next().toString();
        while (iterator.hasNext()) {
            float delay = Float.parseFloat(iterator.next().toString());
            if (delay < minDelay) {
                minDelay = delay;
            }
            if (delay > maxDelay) {
                maxDelay = delay;
            }
            totalDelay += delay;
            counter++;
        }
        if (counter > 0) {
            context.write(new Text("Airport: " + airportName), );
        }
    }
}
