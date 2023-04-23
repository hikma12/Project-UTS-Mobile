package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class TopUpActivity extends AppCompatActivity {

    private TextView tv_saldo;
    private EditText et_jumlahTopup;
    private Button topUp;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);
        tv_saldo = findViewById(R.id.saldo);
        et_jumlahTopup = findViewById(R.id.et_jumlah_topup);
        topUp = findViewById(R.id.btn_topup);
        back = findViewById(R.id.btn_back);

        String jumlahSaldo = getIntent().getStringExtra("extra_saldo");
        String profileImage = getIntent().getStringExtra("extra_foto");

        tv_saldo.setText(jumlahSaldo);

        back.setOnClickListener(view -> {
            finish();
        });

        topUp.setOnClickListener(view -> {
            String balance = tv_saldo.getText().toString();
            String jumlahTopUp = et_jumlahTopup.getText().toString();
            int jumlah_saldo = Integer.parseInt(jumlahTopUp) + Integer.parseInt(balance);
            String jumlah = String.valueOf(jumlah_saldo);
            Intent intent = new Intent(TopUpActivity.this, MainActivity.class);
            intent.putExtra("extra_topup", jumlah);
            intent.putExtra("extra_foto", profileImage);
            startActivity(intent);
        });


    }
}