package habib.webservice.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import habib.webservice.R;

public class SplashScreen extends AppCompatActivity
{
    private static int SPLACH_TIME_OUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intentHome=new Intent(SplashScreen.this,Login.class);
                startActivity(intentHome);
                finish();
            }
        },SPLACH_TIME_OUT);
    }
}
