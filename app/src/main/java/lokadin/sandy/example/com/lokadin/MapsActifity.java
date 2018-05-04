package lokadin.sandy.example.com.lokadin;

import android.location.Location;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.widget.Toast;



public class MapsActifity extends AppCompatActivity {
    static final LatLng Bandung = new LatLng(-5.421668639562308, 105.27362470941125);
    final int RQS_GooglePlayServices = 1;
    private GoogleMap myMap;
    private String provider = null;
    private Marker mCurrenPosition = null;
    LatLng dinaspendidikan = new LatLng(-5.4332973, 105.2568225);
    LatLng dinaskesehatan = new LatLng(-5.4257687, 105.2710487);
    LatLng dinasPU = new LatLng(-5.3694961, 105.2356825);

    LatLng dinaspenataanruang = new LatLng(-5.3983355, 105.2506352);
    LatLng dinastenagakerja = new LatLng(-5.72977665, 105.98304575);
    LatLng dispangtan = new LatLng(-5.402482099, 105.2387580);
    LatLng dishub = new LatLng(-5.28428835, 105.1196817);
    LatLng dinaspemudadanolahraga = new LatLng(-5.4421424, 105.26862570);
    LatLng perpustakaan = new LatLng(-5.40111345, 105.25108725);
    LatLng kebudayaandanpariwisata = new LatLng(-5.39868315, 105.25519445);
    LatLng kominfo = new LatLng(-5.2772459, 105.19095089);
    LatLng perdagangandanperindustrian = new LatLng(-5.87309454999, 106.24708725);
    LatLng lingkunganhidup = new LatLng(-5.5492138, 105.7769987);
    LatLng disdukcapil = new LatLng(-5.495915, 105.70357324999);
    LatLng dinassosial = new LatLng(-5.21166655, 105.24687025);
    LatLng dinaskoprasi = new LatLng(-5.4017062, 105.2582672);
    LatLng penanamanmodaldanperijinan = new LatLng(-5.4341863, 105.2600271);
    LatLng keluargaberencana = new LatLng(-5.55747945, 105.4146009);
    LatLng damkar = new LatLng(-5.3993774499, 105.24591994);
    LatLng perumahandanpemukiman = new LatLng(-5.277369599, 105.2307628);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Maps Kantor Dinas");
        }

        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment) myFragmentManager.findFragmentById(R.id.map);
        myMap = mySupportMapFragment.getMap();

        myMap.addMarker(new MarkerOptions().position(dinaspendidikan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pendidikan").snippet("Jl. Amir Hamzah, Gotong Royong, Tj. Karang Pusat, Kota Bandar Lampung, Lampung 35119").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaspendidikan, 15));
        myMap.addMarker(new MarkerOptions().position(dinaskesehatan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Kesehatan").snippet("Jalan Way Pengubuan, Pahoman, Bandar Lampung City, Lampung, Indonesia").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaskesehatan, 15));
        myMap.addMarker(new MarkerOptions().position(dinasPU).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas PU Bina Marga").snippet("Jl. Zainal Abidin Pagar Alam KM.11, Rajabasa, Kota Bandar Lampung, Lampung 35144").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinasPU, 15));
        myMap.addMarker(new MarkerOptions().position(dinaspenataanruang).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Penataan Kota").snippet("Gedung Sai Batin, 2nd Floor, JL. Dr. Susilo, No. 2, Komplek Kantor Walikota Bandar Lampung, Sumur Batu, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35214").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaspenataanruang, 15));
        myMap.addMarker(new MarkerOptions().position(dinastenagakerja).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Tenaga Kerja").snippet("Jl. Diponegoro No.52, Gulak Galik, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35214").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinastenagakerja, 15));
        myMap.addMarker(new MarkerOptions().position(dispangtan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pangan dan pertanian").snippet("JL. Hj. Zainal Abidin Pagaralam, No. 01, Labuhan Ratu, Kedaton, Kota Bandar Lampung, Lampung 35132").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dispangtan, 15));
        myMap.addMarker(new MarkerOptions().position(dishub).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perhubungan").snippet("Jl. Basuki Rahmat No.34, Sumur Putri, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35211").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dishub, 15));
        myMap.addMarker(new MarkerOptions().position(dinaspemudadanolahraga).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pemuda dan Olahraga").snippet("JL. Hasanuddin, Gg. Kantor Pos No. 2, Telubetung, 35211, Gn. MAS, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35211").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaspemudadanolahraga, 15));
        myMap.addMarker(new MarkerOptions().position(perpustakaan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perpustakaan dan Kearsipan").snippet("Jl. Wolter Monginsidi, Pengajaran, Tj. Karang Pusat, Kota Bandar Lampung, Lampung 35214").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(perpustakaan, 15));
        myMap.addMarker(new MarkerOptions().position(kebudayaandanpariwisata).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pariwisata").snippet("Jl. Jend. Sudirman No.29, Rw. Laut, Engal, Kota Bandar Lampung, Lampung 35118").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kebudayaandanpariwisata, 15));
        myMap.addMarker(new MarkerOptions().position(kominfo).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Komunikasi dan Informatika").snippet(" Jl. Dr. Susilo No. 2, Sumur Batu, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35212").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kominfo, 15));
        myMap.addMarker(new MarkerOptions().position(perdagangandanperindustrian).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perdagangan").snippet("Jl. Cut Mutia No.23 B, Gulak Galik, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35124").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(perdagangandanperindustrian, 15));
        myMap.addMarker(new MarkerOptions().position(lingkunganhidup).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Lingkungan Hidup dan Kebersihan").snippet("Jl. Basuki Rahmat No.10, Talang, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35211").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lingkunganhidup, 15));
        myMap.addMarker(new MarkerOptions().position(disdukcapil).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Kependudukan dan Pencatatan Sipil").snippet("Jalan Dr. Susilo No. 1A, Sumur Batu, Teluk Betung Utara, Sumur Batu, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35212").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(disdukcapil, 15));
        myMap.addMarker(new MarkerOptions().position(dinassosial).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Sosial").snippet("Jl. Panglima Polim No.1, Gedong Air, Tj. Karang Bar., Kota Bandar Lampung, Lampung 35151").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinassosial, 15));
        myMap.addMarker(new MarkerOptions().position(dinaskoprasi).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Koperasi dan UMKM").snippet("Jalan Cut Meutia No.40, Gulak Galik, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35214").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaskoprasi, 15));
        myMap.addMarker(new MarkerOptions().position(penanamanmodaldanperijinan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Penanaman Modal dan Perijinan").snippet("Jl. Cut Mutia No.25, Gulak Galik, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35212").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(penanamanmodaldanperijinan, 15));
        myMap.addMarker(new MarkerOptions().position(keluargaberencana).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Koordinasi KB & Pemberdayaan Perempuan").snippet("Jl. Bung Tomo No.12, Gedong Air, Tanjung Karang Barat, Bandar Lampung, Kota Bandar Lampung, Lampung 35151").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(keluargaberencana, 15));
        myMap.addMarker(new MarkerOptions().position(damkar).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas BPBD Kota B.Lampung").snippet("Jl. Kapten Tendean No.2, Palapa, Tj. Karang Pusat, Kota Bandar Lampung, Lampung 35116").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(damkar, 15));
        myMap.addMarker(new MarkerOptions().position(perumahandanpemukiman).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perumahan dan Kawasan Pemukiman").snippet("Jl. Gatot Subroto No.50, Garuntang, Tlk. Betung Sel., Kota Bandar Lampung, Lampung").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(perumahandanpemukiman, 15));
      

        myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        myMap.getUiSettings().setCompassEnabled(true);
        myMap.getUiSettings().setMapToolbarEnabled(true);
        myMap.getUiSettings().setZoomControlsEnabled(true);
        myMap.getUiSettings().setMapToolbarEnabled(true);
        myMap.getUiSettings().setTiltGesturesEnabled(true);
        myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bandung, 12));

        myMap.setMyLocationEnabled(true);

        myMap.setOnMarkerClickListener(new OnMarkerClickListener() {

            @Override
            public boolean onMarkerClick(Marker arg0) {
                // TODO Auto-generated method stub

                try {
                    StringBuilder urlString = new StringBuilder();
                    String daddr = (String.valueOf(arg0.getPosition().latitude) + "," + String.valueOf(arg0.getPosition().longitude));
                    String saddr = (String.valueOf(myMap.getMyLocation().getLatitude()) + "," + String.valueOf(myMap.getMyLocation().getLongitude()));
                    urlString.append("http://maps.google.com/maps?f=d&hl=en");
                    urlString.append("&saddr=" + saddr);
                    urlString.append("&daddr=" + daddr);
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString.toString()));

                    startActivity(i);
                } catch (Exception ee) {

                    Toast.makeText(getApplicationContext(), "Lokasi Saat Ini Belum Didapatkan, Coba Nyalakan GPS, Keluar Ruangan dan Tunggu Beberapa Saat", Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });


        myMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {
                String LatA = String.valueOf(myMap.getMyLocation().getLatitude());
                String LngA = String.valueOf(myMap.getMyLocation().getLongitude());
                String LatB = String.valueOf(arg0.getPosition().latitude);
                String LngB = String.valueOf(arg0.getPosition().longitude);
                Double a = Double.parseDouble(LatA);
                Double b = Double.parseDouble(LngA);
                Double c = Double.parseDouble(LatB);
                Double d = Double.parseDouble(LngB);
                LatLng latLngA = new LatLng(a, b);
                LatLng latLngB = new LatLng(c, d);

                Location locationA = new Location("point A");
                locationA.setLatitude(latLngA.latitude);
                locationA.setLongitude(latLngA.longitude);
                Location locationB = new Location("point B");
                locationB.setLatitude(latLngB.latitude);
                locationB.setLongitude(latLngB.longitude);

                double distance = locationA.distanceTo(locationB);
                int distance2 = (int) distance;
                String jarak = Double.toString(distance2);
                Toast.makeText(getApplicationContext(), "Ketuk Tanda untuk Melakukan Navigasi , Jarak Kesana : " + jarak + "Meter", Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                //JIKA KLIKNYA INGIN DI INFO WINDOW

            }
        });
    }
}

