package lokadin.sandy.example.com.lokadin;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class AboutActifity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Info Aplikasi"); } }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // app icon in action bar clicked; goto parent activity. this.finish();
                return true; default: return super.onOptionsItemSelected(item);
        } }
}