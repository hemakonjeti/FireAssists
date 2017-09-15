package androiindians.exit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView exit1,exit2,exit3,exit4;
    View vview13,vview16,vview17,vview18,vview23,vview26,vview210,vview36,vview310,vview46,vview61,vview62,vview63,vview64,
            vview71,vview72,vview710,vview81,vview810,vview91,vview910,vview103,vview104,vview105;
    ImageView imageView27,imageView33,imageView39,imageView56,imageView65,imageView73,imageView79,imageView95;
    private static int SPLASH_TIME_OUT = 5000;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        exit1= (ImageView) findViewById(R.id.txtview1);
        exit2= (ImageView) findViewById(R.id.txtview2);
        exit3= (ImageView) findViewById(R.id.txtview3);
        exit4= (ImageView) findViewById(R.id.txtview4);
        vview13=findViewById(R.id.view13);
        vview16=findViewById(R.id.view16);
        vview17=findViewById(R.id.view17);
        vview18=findViewById(R.id.view18);
        vview23=findViewById(R.id.view23);
        vview26=findViewById(R.id.view26);
        vview210=findViewById(R.id.view210);
        vview36=findViewById(R.id.view36);
        vview310=findViewById(R.id.view310);
        vview46=findViewById(R.id.view46);
        vview61=findViewById(R.id.view61);
        vview62=findViewById(R.id.view62);
        vview63=findViewById(R.id.view63);
        vview64=findViewById(R.id.view64);
        vview71=findViewById(R.id.view71);
        vview72=findViewById(R.id.view72);
        vview710=findViewById(R.id.view710);
        vview81=findViewById(R.id.view81);
        vview810=findViewById(R.id.view810);
        vview91=findViewById(R.id.view91);
        vview910=findViewById(R.id.view910);
        vview103=findViewById(R.id.view103);
        vview104=findViewById(R.id.view104);
        vview105=findViewById(R.id.view105);
        imageView27= (ImageView) findViewById(R.id.image27);
        imageView33= (ImageView) findViewById(R.id.image33);
        imageView39= (ImageView) findViewById(R.id.image39);
        imageView56= (ImageView) findViewById(R.id.image56);
        imageView65= (ImageView) findViewById(R.id.image65);
        imageView73= (ImageView) findViewById(R.id.image73);
        imageView79= (ImageView) findViewById(R.id.image79);
        imageView95= (ImageView) findViewById(R.id.image95);
        first();


    }

    private void first() {
        imageView95.setVisibility(View.INVISIBLE);
        vview105.setVisibility(View.INVISIBLE);
        vview104.setVisibility(View.INVISIBLE);
        vview103.setVisibility(View.INVISIBLE);
        imageView27.setVisibility(View.VISIBLE);
        imageView27.setBackgroundColor(getResources().getColor(R.color.white));
        white();
        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView27.setBackgroundColor(getResources().getColor(R.color.red));
                vview17.setVisibility(View.VISIBLE);
                vview18.setVisibility(View.VISIBLE);
                exit2.setBackgroundColor(getResources().getColor(R.color.red));

            }
        });
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                second();
            }
        }, SPLASH_TIME_OUT);
    }
    private void second(){
        vview17.setVisibility(View.INVISIBLE);
        vview18.setVisibility(View.INVISIBLE);
        imageView27.setVisibility(View.INVISIBLE);
        white();
        imageView33.setBackgroundColor(getResources().getColor(R.color.white));
        imageView33.setVisibility(View.VISIBLE);
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView33.setBackgroundColor(getResources().getColor(R.color.red));
                vview23.setVisibility(View.VISIBLE);
                vview13.setVisibility(View.VISIBLE);
                exit1.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                three();
            }
        }, SPLASH_TIME_OUT);
    }
    private void three(){
        imageView33.setVisibility(View.INVISIBLE);
        vview23.setVisibility(View.INVISIBLE);
        vview13.setVisibility(View.INVISIBLE);
        white();

        imageView39.setVisibility(View.VISIBLE);
        imageView39.setBackgroundColor(getResources().getColor(R.color.white));
        imageView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView39.setBackgroundColor(getResources().getColor(R.color.red));
                vview310.setVisibility(View.VISIBLE);
                vview210.setVisibility(View.VISIBLE);
                exit2.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                four();
            }
        }, SPLASH_TIME_OUT);
    }
    private void four(){
        imageView39.setVisibility(View.INVISIBLE);
        vview310.setVisibility(View.INVISIBLE);
        vview210.setVisibility(View.INVISIBLE);
        white();
        imageView56.setVisibility(View.VISIBLE);
        imageView56.setBackgroundColor(getResources().getColor(R.color.white));
        imageView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView56.setBackgroundColor(getResources().getColor(R.color.red));
                vview46.setVisibility(View.VISIBLE);
                vview36.setVisibility(View.VISIBLE);
                vview26.setVisibility(View.VISIBLE);
                vview16.setVisibility(View.VISIBLE);
                vview17.setVisibility(View.VISIBLE);
                vview18.setVisibility(View.VISIBLE);
                exit2.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                five();

            }
        }, SPLASH_TIME_OUT);
    }
    private void five(){
        imageView56.setVisibility(View.INVISIBLE);
        vview46.setVisibility(View.INVISIBLE);
        vview36.setVisibility(View.INVISIBLE);
        vview26.setVisibility(View.INVISIBLE);
        vview16.setVisibility(View.INVISIBLE);
        vview17.setVisibility(View.INVISIBLE);
        vview18.setVisibility(View.INVISIBLE);
        white();
        imageView65.setVisibility(View.VISIBLE);
        imageView65.setBackgroundColor(getResources().getColor(R.color.white));
        imageView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView65.setBackgroundColor(getResources().getColor(R.color.red));
                vview64.setVisibility(View.VISIBLE);
                vview63.setVisibility(View.VISIBLE);
                vview62.setVisibility(View.VISIBLE);
                vview61.setVisibility(View.VISIBLE);
                vview71.setVisibility(View.VISIBLE);
                vview81.setVisibility(View.VISIBLE);
                vview91.setVisibility(View.VISIBLE);
                exit3.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                six();
            }
        }, SPLASH_TIME_OUT);
    }
    private void six(){
        vview64.setVisibility(View.INVISIBLE);
        vview63.setVisibility(View.INVISIBLE);
        vview62.setVisibility(View.INVISIBLE);
        vview61.setVisibility(View.INVISIBLE);
        vview71.setVisibility(View.INVISIBLE);
        vview81.setVisibility(View.INVISIBLE);
        vview91.setVisibility(View.INVISIBLE);
        imageView65.setVisibility(View.INVISIBLE);
        white();
        imageView73.setVisibility(View.VISIBLE);
        imageView73.setBackgroundColor(getResources().getColor(R.color.white));
        imageView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView73.setBackgroundColor(getResources().getColor(R.color.red));
                vview72.setVisibility(View.VISIBLE);
                vview71.setVisibility(View.VISIBLE);
                vview81.setVisibility(View.VISIBLE);
                vview91.setVisibility(View.VISIBLE);
                exit3.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                seven();
            }
        }, SPLASH_TIME_OUT);
    }
    private void seven(){
        vview72.setVisibility(View.INVISIBLE);
        vview71.setVisibility(View.INVISIBLE);
        vview81.setVisibility(View.INVISIBLE);
        vview91.setVisibility(View.INVISIBLE);
        imageView73.setVisibility(View.INVISIBLE);
        white();
        imageView79.setVisibility(View.VISIBLE);
        imageView79.setBackgroundColor(getResources().getColor(R.color.white));
        imageView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView79.setBackgroundColor(getResources().getColor(R.color.red));
                vview710.setVisibility(View.VISIBLE);
                vview810.setVisibility(View.VISIBLE);
                vview910.setVisibility(View.VISIBLE);
                exit4.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                eight();
            }
        }, SPLASH_TIME_OUT);
    }
    private void eight(){
        vview710.setVisibility(View.INVISIBLE);
        vview810.setVisibility(View.INVISIBLE);
        vview910.setVisibility(View.INVISIBLE);
        imageView79.setVisibility(View.INVISIBLE);
        white();
        imageView95.setVisibility(View.VISIBLE);
        imageView95.setBackgroundColor(getResources().getColor(R.color.white));
        imageView95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView95.setBackgroundColor(getResources().getColor(R.color.red));
                vview105.setVisibility(View.VISIBLE);
                vview104.setVisibility(View.VISIBLE);
                vview103.setVisibility(View.VISIBLE);
                exit3.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                first();
            }
        }, SPLASH_TIME_OUT);
    }
    public void white(){
        exit1.setBackgroundColor(getResources().getColor(R.color.white));
        exit3.setBackgroundColor(getResources().getColor(R.color.white));
        exit4.setBackgroundColor(getResources().getColor(R.color.white));
        exit2.setBackgroundColor(getResources().getColor(R.color.white));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(MainActivity.this,Homepage.class);
        startActivity(intent);
    }

}

