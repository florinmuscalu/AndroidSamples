package ro.florinm.androidsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ver = findViewById(R.id.text_version);
        ver.setText("Version: " + BuildConfig.VERSION_NAME + "." + BuildConfig.VERSION_CODE);
    }

    public void click1(View view) {
        Intent intent = new Intent(this, Activity_1.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void click2(View view) {
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}