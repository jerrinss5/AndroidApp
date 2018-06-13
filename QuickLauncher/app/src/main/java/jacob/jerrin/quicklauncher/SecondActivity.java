package jacob.jerrin.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("jacob.jerrin.quicklauncher.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.textView);

            // getting the value from the other activity
            String text = getIntent().getExtras().getString("jacob.jerrin.quicklauncher.SOMETHING");

            // setting it to the text view
            tv.setText(text);
        }
    }
}
