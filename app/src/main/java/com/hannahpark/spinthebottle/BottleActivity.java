package com.hannahpark.spinthebottle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BottleActivity extends AppCompatActivity {

    ImageView iv_bottle;
    Button bt_spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle);

        iv_bottle = findViewById(R.id.iv_bottle);
        bt_spin = findViewById(R.id.bt_spin);

        bt_spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
