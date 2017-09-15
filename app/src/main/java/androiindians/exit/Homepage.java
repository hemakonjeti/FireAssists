package androiindians.exit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class Homepage extends AppCompatActivity {
    Button b;
    private GridAdapter mAdapter;
    private ArrayList<String> listPharmacy;
    private ArrayList<Integer> listIcon;
    private Button signOut;

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        gridView = (GridView) findViewById(R.id.gridView);
        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridAdapter(this,listPharmacy, listIcon);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter((GridAdapter) mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                // Toast.makeText(Welcome.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent sc=new Intent(Homepage.this,Second.class);
                sc.putExtra("FireName",gridView.getItemAtPosition(position).toString());
                startActivity(sc);

            }
        });

    }

    public void prepareList()
    {
        listPharmacy = new ArrayList<String>();

        listPharmacy.add("Alram");
        listPharmacy.add("Call");
        listPharmacy.add("Flash");
        listPharmacy.add("Chat");
        listPharmacy.add("Near By Firestation");
        listPharmacy.add("Near By Exit");


        listIcon = new ArrayList<Integer>();
        listIcon.add(R.drawable.alaram);
        listIcon.add(R.drawable.phone);
        listIcon.add(R.drawable.torch);
        listIcon.add(R.drawable.chat);
        listIcon.add(R.drawable.google);
        listIcon.add(R.drawable.emerexit);


    }


}
