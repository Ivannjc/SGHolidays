package sg.edu.rp.c346.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017608 on 27/4/2017.
 */

public class DayAdapter extends ArrayAdapter<Day> {
    private Context context;
    private ArrayList<Day> day;
    private TextView tvDayName;
    private ImageView ivDay;
    private TextView tvDay;

    public DayAdapter(Context context, int resource, ArrayList<Day> objects) {
        super(context, resource, objects);

        day = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View secondView = inflater.inflate(R.layout.row, parent, false);


        tvDayName = (TextView) secondView.findViewById(R.id.textView3);

        tvDay = (TextView) secondView.findViewById(R.id.textView4);

        ivDay = (ImageView) secondView.findViewById(R.id.imageView);



        Day currentDay = day.get(position);


        tvDayName.setText(currentDay.getName());
        tvDay.setText(currentDay.getDay());

        if(currentDay.getName() == "New Year's Holiday") {
            ivDay.setImageResource(R.drawable.newyear);
        }
        else if (currentDay.getName() == "Chinese New Year Holiday"){
            ivDay.setImageResource(R.drawable.cny);
        }
        else if (currentDay.getName() == "Good Friday"){
            ivDay.setImageResource(R.drawable.goodfriday);
        }
        else if (currentDay.getName() == "Labourday"){
            ivDay.setImageResource(R.drawable.labourday);
        }
        // Return the nicely done up View to the ListView
        return secondView;
    }
}
