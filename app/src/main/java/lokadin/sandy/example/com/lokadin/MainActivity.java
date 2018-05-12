package lokadin.sandy.example.com.lokadin;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isKonek = false;
    Pendeteksi_koneksi pk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pk = new Pendeteksi_koneksi(getApplicationContext());
        isKonek = pk.isConnectingToInternet(); //melakukan cek koneksi internet
        if (isKonek){
            Toast.makeText(this, "terhubung ke internet", Toast.LENGTH_SHORT).show(); // jika terkoneksi tampilkan terhubung
        }else{
            Toast.makeText(this, "tidak ada koneksi internet", Toast.LENGTH_SHORT).show(); //jika tidak terkoneksi, tampilkan pesan juga
            //this.finish();
        }
    }
    public void klikTombolMenu(View v){ //menampilkan beberapa tombol menu pada home
        Intent intent; // membuat object intent baru, jadi pada saat tombol diklik maka akan mengalihkan ke activity lain
        switch (v.getId()) {
            case R.id.tombolmaps: //ketika tombol maps diklik, tampilkan activity mapsactivity
                intent = new Intent (this, MapsActifity.class);
                startActivity(intent);
                break;
            case R.id.tombolhome: //ketika tombol tambah lokasi diklik, tampilkan activity home item
                intent = new Intent(this,HomeItem.class);
                startActivity(intent);
                break;
            case R.id.tombolabout: //ketika tombol about diklik, tampilkan activity about us
                intent = new Intent(this,AboutActifity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

//pada saat user mengklik setting ada opsi keluar, aplikasi akan melakukan konfirmasi terlebih dahulu
        if (id == R.id.action_settings) {
            android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
            builder.setMessage("Anda yakin keluar dari Aplikasi?")
                    .setCancelable(false).setPositiveButton("Ya",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            MainActivity.this.finish();
                        }
                    }).setNegativeButton("Tidak",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("apakah anda yakin ingin keluar")
                .setCancelable(false);
        dialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface arg0, int arg1) {
                // TODO Auto-generated method stub
                MainActivity.this.finish();
            }
        });
        dialog.setNegativeButton("Tidak",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        arg0.cancel();

                    }
                });
        dialog.show();
    }

    //buat menu setting pada activity home
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}

