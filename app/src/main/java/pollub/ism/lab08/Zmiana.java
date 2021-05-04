package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;
import java.util.Date;

@Entity(tableName = "Zmiana")
public class Zmiana {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int WEGETABLE_ID;
    public int YEAR;
    public int MONTH;
    public int DAY;
    public int HOURS;
    public int MINUTES;
    public int SECONDS;
    public int QUANTITY_OLD;
    public int QUANTITY_NEW;

    @Override
    public String toString() {
        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append(DAY);
        myStringBuilder.append(".");
        myStringBuilder.append(MONTH);
        myStringBuilder.append(".");
        myStringBuilder.append(YEAR);
        myStringBuilder.append(", ");
        myStringBuilder.append(HOURS);
        myStringBuilder.append(":");
        myStringBuilder.append(MINUTES);
        myStringBuilder.append(":");
        myStringBuilder.append(SECONDS);
        myStringBuilder.append(",    ");
        myStringBuilder.append(QUANTITY_OLD);
        myStringBuilder.append(" -> ");
        myStringBuilder.append(QUANTITY_NEW);
        return myStringBuilder.toString();
    }
}
