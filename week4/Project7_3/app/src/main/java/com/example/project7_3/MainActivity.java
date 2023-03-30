package com.example.project7_3;
//2019038058 홍범순
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvName, tvEmail, tvToast;
    Button mainButton;
    EditText dlgEdit1, dlgEdit2;
    View dialogView, toastView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        mainButton = findViewById(R.id.mainButton);


        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = View.inflate(MainActivity.this, R.layout.dialog1, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_launcher_foreground);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", dlgSetPositiveButtonClicked());
                dlg.setNegativeButton("취소", dlgSetNegativeButtonClicked());
                dlg.show();
            }
        });

    }


    private DialogInterface.OnClickListener dlgSetPositiveButtonClicked(){
        return new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dlgEdit1 = dialogView.findViewById(R.id.dlgEdit1);
                dlgEdit2 = dialogView.findViewById(R.id.dlgEdit2);
                String name = dlgEdit1.getText().toString();
                String email = dlgEdit2.getText().toString();
                tvName.setText("이름: " + name);
                tvEmail.setText("이메일: " + email);
            }
        };
    }


    private DialogInterface.OnClickListener dlgSetNegativeButtonClicked(){
        return new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast toast = new Toast(MainActivity.this);
                toastView = View.inflate(MainActivity.this, R.layout.toast1, null);
                tvToast = toastView.findViewById(R.id.tvToast);
                tvToast.setText("취소했습니다");
                toast.setView(toastView);
                toast.show();
            }
        };
    }


}