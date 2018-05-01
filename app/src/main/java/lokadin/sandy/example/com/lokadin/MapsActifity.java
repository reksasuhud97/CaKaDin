package lokadin.sandy.example.com.lokadin;

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
    static final LatLng Bandung= new LatLng(-5.421668639562308,105.27362470941125);
    final int RQS_GooglePlayServices = 1;
    private GoogleMap myMap;
    private String provider = null;
    private Marker mCurrenPosition = null;

    LatLng dinaspendidikan = new LatLng(-5.4332973, 105.2568225);
    LatLng dinaskesehatan = new LatLng(-5.4301658, 105.2701797);
    LatLng dinaspenataanruang = new LatLng(-5.3694961, 105.2356825);
    LatLng dinastenagakerja = new LatLng(-5.2064516,105.14373225);
    LatLng dispangtan = new LatLng(-5.37296045, 105.24243195);
    LatLng dishub = new LatLng(-5.434063, 105.25546);
    LatLng dinaspemudadanolahraga = new LatLng(-5.4057416, 105.27105535);
    LatLng perpustakaan = new LatLng(-5.40111345, 105.25108725);

    LatLng kebudayaandanpariwisata = new LatLng(-5.42822095, 105.25934545);
    LatLng kominfo = new LatLng(-5.4052204999, 105.26608395);
    LatLng perdagangandanperindustrian = new LatLng(-5.87309454999, 106.24708725);
    LatLng lingkunganhidup = new LatLng(-5.40612355, 105.25777215);
    LatLng disdukcapil = new LatLng(-5.40436184, 105.7035732499);
    LatLng dinassosial = new LatLng(-5.2137524, 105.142349599);
    LatLng dinaskoprasi = new LatLng(-5.216964, 105.243343);
    LatLng penanamanmodaldanperijinan = new LatLng(-5.2100338, 105.1370182);
    LatLng keluargaberencana = new LatLng(-5.18366315, 105.1755942);
    LatLng damkar = new LatLng(5.4014661, 105.1814916);
    LatLng perumahandanpemukiman = new LatLng(-5.546911599, 105.41653045);
    LatLng pemberdayaanperempuan = new LatLng(-5.01471985, 107.576086049);

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
                .fromResource(R.drawable.marker)).title("Dinas Kesehatan").snippet("Jalan Dokter Susilo No.44, Pahoman, Engal, Kota Bandar Lampung, Lampung 35212").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaskesehatan, 15));

        myMap.addMarker(new MarkerOptions().position(dinaspenataanruang).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pekerjaan Umum & Penataan Ruang").snippet("Jl. Zainal Abidin Pagar Alam KM.11, Rajabasa, Kota Bandar Lampung, Lampung 35144").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaspenataanruang, 15));
        myMap.addMarker(new MarkerOptions().position(dinastenagakerja).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Tenaga Kerja").snippet("JL Cemara, Komplek Perkantoran Pemda Tulang Bawang, Tj. Senang, Kota Bandar Lampung, Lampung 35136").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinastenagakerja, 15));
        myMap.addMarker(new MarkerOptions().position(dispangtan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pangan dan pertanian").snippet("JL. Hj. Zainal Abidin Pagaralam, No. 01, Labuhan Ratu, Kedaton, Kota Bandar Lampung, Lampung 35132").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dispangtan, 15));
        myMap.addMarker(new MarkerOptions().position(dishub).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perhubungan").snippet("Jl. Cut Mutia No. 76 Teluk Betung,Kota Bandar Lampung, Lampung, Pengajaran, Teluk Betung Utara, Pengajaran, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35215").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dishub, 15));
        myMap.addMarker(new MarkerOptions().position(dinaspemudadanolahraga).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pemuda dan Olahraga").snippet("JL. Hasanuddin, Gg. Kantor Pos No. 2, Telubetung, 35211, Gn. MAS, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35211").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dinaspemudadanolahraga, 15));
        myMap.addMarker(new MarkerOptions().position(perpustakaan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perpustakaan dan Kearsipan").snippet("Jl. Prof. Mr. Hm. Yamin No.33, Rw. Laut, Engal, Kota Bandar Lampung, Lampung 35213").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(perpustakaan, 15));
        myMap.addMarker(new MarkerOptions().position(kebudayaandanpariwisata).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Kebudayaan dan Pariwisata").snippet("Jl. Wolter Monginsidi No.120, Pengajaran, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35125").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kebudayaandanpariwisata, 15));
        myMap.addMarker(new MarkerOptions().position(kominfo).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Komunikasi dan Informatika").snippet("Jl. Dr. Susilo No. 2, Sumur Batu, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35212").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kominfo, 15));
        myMap.addMarker(new MarkerOptions().position(perdagangandanperindustrian).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perdagangan dan Perindustrian").snippet("Jl. Cut Mutia No.23 B, Gulak Galik, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35124").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(perdagangandanperindustrian, 15));
        myMap.addMarker(new MarkerOptions().position(lingkunganhidup).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Lingkungan Hidup").snippet("Jl. Basuki Rahmat No.10, Talang, Tlk. Betung Utara, Kota Bandar Lampung, Lampung 35211").alpha(0.5f));
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
                .fromResource(R.drawable.marker)).title("Dinas Pengendalian Kependudukan dan KB").snippet("Jl. Bung Tomo No.12, Gedong Air, Tanjung Karang Barat, Bandar Lampung, Kota Bandar Lampung, Lampung 35151").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(keluargaberencana, 15));
        myMap.addMarker(new MarkerOptions().position(damkar).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas BPBD KOTA BANDAR LAMPUNG").snippet("Jl. Kapten Tendean No.2, Palapa, Tj. Karang Pusat, Kota Bandar Lampung, Lampung 35116").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(damkar, 15));
        myMap.addMarker(new MarkerOptions().position(perumahandanpemukiman).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Perumahan dan Kawasan Pemukiman").snippet("Jl. Gatot Subroto No.50, Garuntang, Tlk. Betung Sel., Kota Bandar Lampung, Lampung").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(perumahandanpemukiman, 15));
        myMap.addMarker(new MarkerOptions().position(pemberdayaanperempuan).icon(BitmapDescriptorFactory
                .fromResource(R.drawable.marker)).title("Dinas Pemerdayaan Perempuan dan Perlindungan Anak").snippet("Jl. Bung Tomo No.12, Gedong Air, Tanjung Karang Barat, Bandar Lampung, Kota Bandar Lampung, Lampung 35151").alpha(0.5f));
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pemberdayaanperempuan, 15));

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
                    urlString.append("http://maps.google.com/maps?f=d&hl=en");
                    urlString.append("&saddr=" + String.valueOf(myMap.getMyLocation().getLatitude()) + "," + String.valueOf(myMap.getMyLocation().getLongitude()));
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
                Toast.makeText(getApplicationContext(), "Ketuk Tanda untuk Melakukan Navigasi menggunakan GMaps",
                        Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                //JIKA KLIKNYA INGIN DI INFO WINDOW

            }
        });

    }


}
