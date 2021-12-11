import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
// Разрабатываем reduce функцию, которая берет первую строку, извлекает из
// нее имя аэропорта, далее рассчитывает из последующих строк среднее
// минимальное и максимальное время задержки и печатает результат.
public class AirportReducer extends Reducer<FlightWritableComparable, Text, IntWritable, Text> {

    @Override
    protected void reduce(FlightWritableComparable key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        
    }
}
