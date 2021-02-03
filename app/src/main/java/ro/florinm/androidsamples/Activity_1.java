package ro.florinm.androidsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Activity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        TextView tv = findViewById(R.id.test_text);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }

    String s = "";
    int counter = 1;

    public void addLine(View view) {
        TextView tv = findViewById(R.id.test_text);
        s = s + "Line " + counter + "<br>";
        counter++;

        tv.setText(Html.fromHtml(s, Html.FROM_HTML_MODE_LEGACY));
        int scrollAmount = tv.getLayout().getLineTop(tv.getLineCount()) - tv.getHeight();
        if (scrollAmount > 0)
            tv.scrollTo(0, scrollAmount);
        else
            tv.scrollTo(0, 0);
    }
}