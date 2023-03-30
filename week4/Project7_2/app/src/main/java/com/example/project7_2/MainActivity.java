package com.example.project7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnChangeBG, btnChangeButton;
    LinearLayout baseLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseLayout = findViewById(R.id.baseLayout);
        btnChangeBG = findViewById(R.id.btnChangeBG);
        btnChangeButton = findViewById(R.id.btnChangeButton);

        registerForContextMenu(btnChangeBG);
        registerForContextMenu(btnChangeButton);


    }

    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, view, menuInfo);

        MenuInflater menuInflater = getMenuInflater();

        if(view == btnChangeBG){
            menu.setHeaderTitle("배경색 변경");
            menuInflater.inflate(R.menu.menu1, menu);

        }

        if(view == btnChangeButton){
            menu.setHeaderTitle("버튼색 변경");
            menuInflater.inflate(R.menu.menu2, menu);

        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRed:
                // Handle menu item 1 click
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                // Handle menu item 2 click
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                // Handle menu item 3 click
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                // Handle menu item 4 click
                btnChangeButton.setRotation(45);
                return true;
            case R.id.subSize:
                // Handle menu item 5 click
                btnChangeButton.setScaleX(2);
                btnChangeButton.setScaleY(2);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }


}