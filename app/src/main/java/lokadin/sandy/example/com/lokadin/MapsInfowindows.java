package lokadin.sandy.example.com.lokadin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


/* coding ini untuk sementara belum difungsikan per tanggal 12/05/2018 karena DB SQLite pada DBHelper.java gagal query*/
public class MapsInfowindows extends AppCompatActivity{
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_info);

        Intent intent = getIntent();
        String strlatitude = intent.getStringExtra(LokadinDetailActifity.LAT);
        String strlongitude = intent.getStringExtra(LokadinDetailActifity.LONG);
        String strnama = intent.getStringExtra(LokadinDetailActifity.NAME);
        String stralamat = intent.getStringExtra(LokadinDetailActifity.LOKASI);

        Double latitude = Double.parseDouble(strlatitude);
        Double longitude = Double.parseDouble(strlongitude);


        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        map.getUiSettings().setZoomControlsEnabled(true);
        map.getMapType();
        map.setIndoorEnabled(true);
        map.setBuildingsEnabled(true);
        map.getUiSettings().setMapToolbarEnabled(true);

        Marker bandung = map.addMarker(new MarkerOptions()
                .position(new LatLng(latitude,longitude))
                .title(strnama)
                .snippet(stralamat));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), 12));

        map.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(strnama);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
