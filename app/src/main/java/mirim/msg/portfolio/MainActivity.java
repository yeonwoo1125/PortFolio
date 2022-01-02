package mirim.msg.portfolio;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);

        Button profile_yeonwoo_btn = (Button) findViewById(R.id.profile_btn);
        profile_yeonwoo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), yeonwooProfile.class);
                startActivity(intent);
            }
        });
    }

}