package com.example.doubleimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//2019038058 홍범순
public class MainActivity extends AppCompatActivity {
    ImageView imgView1, imgView2;
    Button upBtn, downBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView1 = findViewById(R.id.imgView1);
        imgView2 = findViewById(R.id.imgView2);
        upBtn = findViewById(R.id.upBtn);
        downBtn = findViewById(R.id.downBtn);


        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView1.setImageResource(R.drawable.mypicture);
                imgView2.setImageResource(R.drawable.ic_launcher_foreground);
            }
        });

        downBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView1.setImageResource(R.drawable.ic_launcher_foreground);
                imgView2.setImageResource(R.drawable.mypicture);

            }
        });
    }
}