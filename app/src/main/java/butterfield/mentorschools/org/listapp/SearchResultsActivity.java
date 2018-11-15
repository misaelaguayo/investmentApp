package butterfield.mentorschools.org.listapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

public class SearchResultsActivity extends AppCompatActivity {
    ListView myListView;
    String[] companies;
    String[] percentChange;
    String[] ticker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        Intent in = getIntent();
        String searchRaw =  in.getStringExtra("userInput");
        String searchResult;
        if (searchRaw.equals("aapl"))
        {
            searchResult = "Apple, Inc.";
        }
        else
        {
            searchResult = "sample";
        }

        EditText companyName = (EditText) findViewById(R.id.companyName);
        companyName.setText(searchResult);

    }
}
