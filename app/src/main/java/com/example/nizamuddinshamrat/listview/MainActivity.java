package com.example.nizamuddinshamrat.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv  = (ListView)findViewById(R.id.lvid);
       final String[] name = {"Shakil","Shamarat","Sohel"};
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.lvlayout,R.id.txtid,name);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Clicked on "+name[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
