package sg.edu.rp.c346.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class second extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Day> holiday;
    TextView tvHol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        lv = (ListView) this.findViewById(R.id.lvHoliday);
        tvHol = (TextView) this.findViewById(R.id.textView2);

        Intent i = getIntent();
        String types = i.getStringExtra("types");
        tvHol.setText(types);

        holiday = new ArrayList<Day>();
        if(types.equalsIgnoreCase("Secular")){
            holiday.add(new Day("New Year's Holiday", "1 Jan 2017", "Sleep"));
            holiday.add(new Day("Labourday", "1 May 2017", "Sleep"));
        }else if(types.equalsIgnoreCase("Ethnic & Religion")){
            holiday.add(new Day("Chinese New Year Holiday", "28-29 Jan 2017", "Sleep"));
            holiday.add(new Day("Good Friday", "14 April 2017", "Sleep"));
        }

        aa = new DayAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Day selectedTypes = holiday.get(position);
                Toast.makeText(second.this, selectedTypes.getName(),
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}
