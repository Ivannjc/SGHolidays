package sg.edu.rp.c346.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.id;
import static sg.edu.rp.c346.sgholidays.R.id.parent;

public class MainActivity extends AppCompatActivity {

    ListView lvType;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvType = (ListView) findViewById(R.id.lvType);

        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Ethnic & Religion");

        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, al);
        lvType.setAdapter(aa);

        lvType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedTypes = al.get(position);
                Toast.makeText(MainActivity.this, selectedTypes,
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, second.class);
                intent.putExtra("types", selectedTypes);
                startActivity(intent);

            }
        });

    }
}
