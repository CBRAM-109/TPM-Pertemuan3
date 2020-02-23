package tpm3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pertemuan3.R;

public class DetailsHero extends AppCompatActivity {

    ImageView imageView;
    TextView title, deskripsi;

    String data1, data2;
    int imageV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_hero);

        imageView = findViewById(R.id.details_image);
        title = findViewById(R.id.details_title);
        deskripsi = findViewById(R.id.details_deskripsi);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("imageV") && getIntent().hasExtra("data1") &&
        getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            imageV = getIntent().getIntExtra("imageV", 1);
        }
        else {
            Toast.makeText(this,"Data tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title.setText(data1);
        deskripsi.setText(data2);
        imageView.setImageResource(imageV);
    }
}
