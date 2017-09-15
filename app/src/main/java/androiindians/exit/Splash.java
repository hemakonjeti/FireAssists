package androiindians.exit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 500;


    private static final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //code for hide title bar.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                    Intent next = new Intent(Splash.this, Homepage.class);
                    startActivity(next);
                    finish();


            }


        }, SPLASH_TIME_OUT);

    }




}
