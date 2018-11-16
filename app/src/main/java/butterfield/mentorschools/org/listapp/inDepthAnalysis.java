package butterfield.mentorschools.org.listapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class inDepthAnalysis extends AppCompatActivity {
    public static TextView companyName;
    public static TextView companyTicker;
    public static TextView Open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_depth_analysis);

        Intent in = getIntent();
        String tickerInput =  in.getStringExtra("userInput");

        companyName = (TextView) findViewById(R.id.companyName);
        companyTicker = (TextView) findViewById(R.id.companyTicker);
        Open = (TextView) findViewById(R.id.open);

        new fetchData().execute("http://13.59.22.125/" + tickerInput);



    }
}
