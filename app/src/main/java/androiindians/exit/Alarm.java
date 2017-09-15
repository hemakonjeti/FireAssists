package androiindians.exit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Alarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_alarm);



        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.emer_sound);

        final Button playCatMeow = (Button) this.findViewById(R.id.play_cat_meow);

        playCatMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catSoundMediaPlayer.start();
            }
        });



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(Alarm.this,Homepage.class);
        startActivity(intent);
    }
}