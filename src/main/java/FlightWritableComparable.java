import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritableComparable implements WritableComparable<FlightWritableComparable> {
    int airportID;
    int indicator;

    public FlightWritableComparable() {

    }

    public int getAirportID() {
        return this.airportID;
    }
    public int getIndicator() {
        return this.indicator;
    }

    public FlightWritableComparable(int airportID, int indicator) {
        super();
        this.airportID = airportID;
        this.indicator = indicator;
    }

    @Override
    public int compareTo(FlightWritableComparable flightWritableComparable) {
        if (this.getAirportID() == flightWritableComparable.getAirportID()) {
            return this.getIndicator() - flightWritableComparable.getIndicator();
        }
        return this.airportID - flightWritableComparable.airportID;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(airportID);
        dataOutput.writeInt(indicator);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        airportID = dataInput.readInt();
        indicator = dataInput.readInt();
    }
}
