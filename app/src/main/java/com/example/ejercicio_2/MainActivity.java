package com.example.ejercicio_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
private static final String URL_INTERNET ="https://numeralpaint.com/wp-content/uploads/2020/10/Abstract-Picasso-art-paint-by-numbers.jpg";
private static final String URL_INTERNET_PICASO="http://i.imgur.com/Dvpvkl.png";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
        loadImageByInternetUrlWithPicasso();

    }
    private void setUpView(){
        imageView =findViewById(R.id.imageView);

    }
    private void loadImageByInternetUrlWithPicasso(){
        Picasso.get()
                .load(URL_INTERNET)
                .into(imageView);
    }


    }

