package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TopUpActivity extends AppCompatActivity {

    private TextView tv_saldo;
    private EditText et_jumlahTopup;
    private Button topUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);
        tv_saldo = findViewById(R.id.saldo);
        et_jumlahTopup = findViewById(R.id.et_jumlah_topup);
        topUp = findViewById(R.id.btn_topup);

        String jumlahSaldo = getIntent().getStringExtra("extra_saldo");

        tv_saldo.setText(jumlahSaldo);

        topUp.setOnClickListener(view -> {
            String sldo = tv_saldo.getText().toString();
            String jumlahTopUp = et_jumlahTopup.getText().toString();
            int saldo = Integer.parseInt(sldo);
            int jumlah_saldo = Integer.parseInt(jumlahTopUp) + saldo;
            Intent intent = new Intent(TopUpActivity.this, MainActivity.class);
            intent.putExtra("extra_topup", jumlah_saldo);
            startActivity(intent);
        });

    }
}