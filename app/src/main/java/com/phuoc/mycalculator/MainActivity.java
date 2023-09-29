package com.phuoc.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.number1);
        edt2 = findViewById(R.id.number2);
        btnCong = findViewById(R.id.cong);
        btnTru = findViewById(R.id.tru);
        btnNhan = findViewById(R.id.nhan);
        btnChia = findViewById(R.id.chia);
        tv_result = findViewById(R.id.tv_result);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 != null && edt2 != null) {
                    float so1 = Integer.parseInt(String.valueOf(edt1.getText()));
                    float so2 = Integer.parseInt(String.valueOf(edt2.getText()));
                    float rs = so1 + so2;
                    tv_result.setText("Phép Cộng: " + String.valueOf(rs));
                    tv_result.setVisibility(View.VISIBLE);
                }
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 != null && edt2 != null) {
                    float so1 = Integer.parseInt(String.valueOf(edt1.getText()));
                    float so2 = Integer.parseInt(String.valueOf(edt2.getText()));
                    float rs = so1 - so2;
                    tv_result.setText("Phép Trừ: " + String.valueOf(rs));
                    tv_result.setVisibility(View.VISIBLE);
                }
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 != null && edt2 != null) {
                    float so1 = Integer.parseInt(String.valueOf(edt1.getText()));
                    float so2 = Integer.parseInt(String.valueOf(edt2.getText()));
                    float rs = so1 * so2;
                    tv_result.setText("Phép Nhân: " + String.valueOf(rs));
                    tv_result.setVisibility(View.VISIBLE);
                }
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 != null && edt2 != null) {
                    float so1 = Integer.parseInt(String.valueOf(edt1.getText()));
                    float so2 = Integer.parseInt(String.valueOf(edt2.getText()));
                    float rs = so1 / so2;
                    tv_result.setText("Phép Chia: " + String.valueOf(rs));
                    tv_result.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}