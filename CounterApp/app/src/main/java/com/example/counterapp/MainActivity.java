package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    android.widget.Button btn;
    android.widget.TextView txv;
    private Object TextView;
    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn (Button);findViewById(R.id.bt);
        txv (TextView);findViewById(R.id.tx);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }

    private void txv(Object textView) {
    }

    private void btn(Object button) {
    }
}
