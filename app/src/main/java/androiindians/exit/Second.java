package androiindians.exit;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Second extends AppCompatActivity {
    Toolbar mToolbar;

    ImageView imageView;

    String[] FireArray = {"Alaram","Call","Flash","Chat","Near By Firestation","Near Exit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("FireName"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("Alram")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, FireArray);
                Intent i = new Intent(getApplicationContext(), Alarm.class);

                startActivity(i);







            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Call")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, FireArray);

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:911"));
                startActivity(callIntent);


            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Flash")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, FireArray);
                Intent i = new Intent(getApplicationContext(), Flash.class);

                startActivity(i);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Chat")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, FireArray);
                Intent i = new Intent(getApplicationContext(), Chat.class);

                startActivity(i);

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Near By Firestation")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, FireArray);
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);

                startActivity(i);
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Near By Exit")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, FireArray);
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        }
    }


}

