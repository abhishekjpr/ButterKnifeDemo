package com.example.abhishekjpr.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textview)
    TextView textview;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void changeData(){
        textview.setText("You have change data..!!");
    }

    @OnClick(R.id.textview)
    public void createToast(){
        Toast.makeText(MainActivity.this, "Textview selected", Toast.LENGTH_SHORT).show();
    }
}
