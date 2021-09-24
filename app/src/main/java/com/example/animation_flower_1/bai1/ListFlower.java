package com.example.animation_flower_1.bai1;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ListFlower extends AppCompatActivity {
    private LinearLayout layout1,layout2, layout3, layout4, layout5;
    private ImageView hoa3;
    private ImageView  hoa4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_flower);
        layout3=findViewById(R.id.layout3);
        layout4=findViewById(R.id.layout4);
        layout1=findViewById(R.id.layout1);
        layout2=findViewById(R.id.layout2);
        layout5=findViewById(R.id.layout5);
        hoa3 = findViewById(R.id.hoa3);
        hoa4 = findViewById(R.id.hoa4);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.myapplication.Bai1.ListFlower.this, "Vui long chon hoa thu 3", Toast.LENGTH_SHORT).show();
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.myapplication.Bai1.ListFlower.this, "Vui long chon hoa thu 3", Toast.LENGTH_SHORT).show();
            }
        });
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.myapplication.Bai1.ListFlower.this, "Vui long chon hoa thu 3", Toast.LENGTH_SHORT).show();
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(com.example.myapplication.Bai1.ListFlower.this, DetailHoa1.class);
                Pair[] pair = new Pair[1];
                pair[0] = new Pair<View, String>(hoa3,"hoa3");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(com.example.myapplication.Bai1.ListFlower.this, pair);
                startActivity(shareIntent, options.toBundle());
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(com.example.myapplication.Bai1.ListFlower.this, com.example.myapplication.Bai1.DetailHoa2.class);
                Pair[] pair = new Pair[1];
                pair[0] = new Pair<View, String>(hoa4,"hoa4");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(com.example.myapplication.Bai1.ListFlower.this, pair);
                startActivity(shareIntent, options.toBundle());
            }
        });

    }
}