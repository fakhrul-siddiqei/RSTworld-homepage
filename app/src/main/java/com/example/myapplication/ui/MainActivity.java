package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.Adapterhome;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Adapter homeAdapter;

    //arrays of images and title
    TextView tap,data,value;
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapterhome adapter;
    LinearLayout ct;
    int k=0;
    public String[] options={"<REFERRAL INCOME>","<GENERATION BONUS>","<DAILY WORK BONUS>"};
    public String[] am={"50500৳","20125৳","940৳"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList = findViewById(R.id.rec);
        tap= findViewById(R.id.tap);
        value=findViewById(R.id.data2);
        titles = new ArrayList<>();
        images = new ArrayList<>();
        data=findViewById(R.id.data);
        ct=findViewById(R.id.contentTOP);
        titles.add("Wallet");
        titles.add("Register");
        titles.add("Cashout");
        titles.add("Cashout Report");
        titles.add("Cashout Accept");
        titles.add("Accepted Cashout");
        titles.add("My Team");
        titles.add("Sending report");
        titles.add("Self Transfer");
        titles.add("Payment Method");
        titles.add("Online Banking");
        titles.add("Internet Package");
        titles.add("Unit Level Tree");
        titles.add("Shopping");
        titles.add("Ecommerce");
        titles.add("Donate");
        titles.add("Add Fund");
        titles.add("Health Care");
        titles.add("Rank Gallery");
        titles.add("Notice");
        titles.add("Training");
        titles.add("QR/Bar Code scanner");
        titles.add("Ad post");
        titles.add("Games");
        titles.add("Loan");
        titles.add("Ride");
        titles.add("Online Food");
        titles.add("Dollar buy/sell");
        titles.add("Travel");


        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        images.add(R.drawable.p6);
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        images.add(R.drawable.p6);
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        images.add(R.drawable.p6);
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        images.add(R.drawable.p6);
        images.add(R.drawable.p1);
        images.add(R.drawable.p2);
        images.add(R.drawable.p3);
        images.add(R.drawable.p4);
        images.add(R.drawable.p5);
        adapter = new Adapterhome(this,titles,images);
        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data.setText(options[k]);
                value.setText(am[k]);
                k=k+1;
                if(k>=3)
                {
                    k=0;
                }
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);

        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new CountDownTimer(2000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        tap.setText("109500 ৳");
                    }

                    public void onFinish() {
                        tap.setText("TAP FOR\nBALANCE");
                    }
                }.start();
            }
        });

    }


}