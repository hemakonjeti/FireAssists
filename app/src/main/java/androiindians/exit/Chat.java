package androiindians.exit;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Chat extends AppCompatActivity {
    Button btn;
    EditText m,n;
    IntentFilter intentFilter;
    private BroadcastReceiver intentReceiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            //display the message in the textview
            TextView t=(TextView)findViewById(R.id.textmsg);
            t.setText(intent.getExtras().getString("message"));
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        // intent to filter for sms messages recieved
        intentFilter=new IntentFilter();
        intentFilter.addAction("SMS_RECEIVED_ACTION");
        btn=(Button)findViewById((R.id.btnsend));
        m=(EditText)findViewById(R.id.message);
        n=(EditText)findViewById(R.id.number);
        // getwindow().setsoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myMsg=m.getText().toString();
                String theNumber=n.getText().toString();
                sendMsg(theNumber,myMsg);

            }
        });


    }

    private void sendMsg(String theNumber, String myMsg) {

        String SENT="message sent";
        String DELIVERED="message delivered";
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        PendingIntent sentPI=PendingIntent.getBroadcast(this,0,new Intent(SENT),0);
        PendingIntent delivereredPI=PendingIntent.getBroadcast(this,0,new Intent(DELIVERED),0);
        PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,intent,0);
        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(theNumber,null,myMsg,sentPI,delivereredPI);
        Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(Chat.this,Homepage.class);
        startActivity(intent);
    }
}
