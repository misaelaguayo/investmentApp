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
        String searchResult =  in.getStringExtra("userInput");
        EditText searchBar = (EditText) findViewById(R.id.searchBar);
        searchBar.setText(searchResult);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        companies = res.getStringArray(R.array.items);
        percentChange = res.getStringArray(R.array.prices);
        ticker = res.getStringArray(R.array.descriptions);

        ItemAdapter itemAdapter= new ItemAdapter(this,companies,percentChange,ticker);
        myListView.setAdapter(itemAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showDetailActivity = new Intent(getApplicationContext(),DetailActivity.class);
                showDetailActivity.putExtra("butterfield.mentorschools.org.ITEM_INDEX",position);
                startActivity(showDetailActivity);
            }
        });
    }
}
