package lokadin.sandy.example.com.lokadin;
//coding untuk about us
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class AboutActifity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about); // tampilkan activity fragmen about
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Info Aplikasi"); } } //tampilkan activity about dengan judul info aplikasi
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // ketika tombol kembali ditekan kembali ke home
                return true; default: return super.onOptionsItemSelected(item);
        } }
}