package lokadin.sandy.example.com.lokadin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
// activity ini untuk melakukan comment tempat dalam aplikasi
public class Comment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment); //tampilkan activity comment

        final VideoView myVideoView = (VideoView) findViewById(R.id.myVideoView);
        myVideoView.setVideoPath("https://youtu.be/wusW4Vzns40"); //play video mengenai lampung

        // Player control(play pause stop)
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(myVideoView); 
        myVideoView.setMediaController(mediaController);

        myVideoView.start(); //play video

        String[] foods = {"Diskominfo", "Disdukcapil", "Dinkes", "DinasPU", "Disdik"}; //membuat list

        ListAdapter myAdatper = new CustomAdapter(this, foods);
        final ListView myListView = (ListView) findViewById(R.id.myListView); //tampilkan list dalam list view
        myListView.setAdapter(myAdatper);

        myListView.setOnItemClickListener(
            new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String food = String.valueOf(parent.getItemAtPosition(position));
                    Toast.makeText(Comment.this, food, Toast.LENGTH_LONG).show(); //tampilkan toast nama tempat saat diklik, karena coding dapat dari github jadi variabelnya masih food :D

                    Intent i = new Intent(view.getContext(), DetailActivity.class);
                    i.putExtra("foodName",food);

                    startActivity(i);

                }
            }
        );
    }
}
