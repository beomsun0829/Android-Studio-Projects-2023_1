package com.example.animalgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
//2019038058 홍범순
public class MainActivity extends AppCompatActivity {
    TextView textView2;
    Switch switchAgree;
    RadioGroup radioGroup1;
    RadioButton rdoBtnAndroidQ, rdoBtnAndroidR, rdoBtnAndroidS;
    Button endBtn,resetBtn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchAgree = findViewById(R.id.switchAgree);
        textView2 = findViewById(R.id.textView2);
        radioGroup1 = findViewById(R.id.radioGroup1);
        rdoBtnAndroidQ = findViewById(R.id.rdoBtnAndroidQ);
        rdoBtnAndroidR = findViewById(R.id.rdoBtnAndroidR);
        rdoBtnAndroidS = findViewById(R.id.rdoBtnAndroidS);
        endBtn = findViewById(R.id.endBtn);
        resetBtn = findViewById(R.id.resetBtn);
        imageView = findViewById(R.id.imageView);

        switchAgree.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(switchAgree.isChecked() == true){
                textView2.setVisibility(View.VISIBLE);
                radioGroup1.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
            }

            else {
                textView2.setVisibility(View.INVISIBLE);
                radioGroup1.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.INVISIBLE);
            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId) {
                    case R.id.rdoBtnAndroidQ:
                        imageView.setImageResource(R.drawable.android_q);
                        break;
                    case R.id.rdoBtnAndroidR:
                        imageView.setImageResource(R.drawable.android_r);
                        break;
                    case R.id.rdoBtnAndroidS:
                        imageView.setImageResource(R.drawable.android_s);
                        break;
                }
            }
        });

        endBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchAgree.setChecked(false);
                textView2.setVisibility(View.INVISIBLE);
                radioGroup1.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.INVISIBLE);
            }
        });

    }
}