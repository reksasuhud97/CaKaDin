package lokadin.sandy.example.com.lokadin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(@NonNull Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);

        TextView myText = (TextView) customView.findViewById(R.id.myText);
        ImageView myImage = (ImageView) customView.findViewById(R.id.myImage);
        myText.setText(singleFoodItem);

        if(singleFoodItem == "Diskominfo") {
            myImage.setImageResource(R.drawable.dinas_keminfo);
        }else if(singleFoodItem == "Disdukcapil"){
            myImage.setImageResource(R.drawable.dinas_kependudukan);
        }else if(singleFoodItem == "Dinkes"){
            myImage.setImageResource(R.drawable.dinas_kesehatan);
        }else if(singleFoodItem == "DinasPU"){
            myImage.setImageResource(R.drawable.dinas_pekerjaan_umum);
        }else if(singleFoodItem == "Disdik"){
            myImage.setImageResource(R.drawable.dinas_pendidikan);
        }

        return customView;
    }
}
