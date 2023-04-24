package com.example.projectuts;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private TextView textName, tv_saldo;
    private FirebaseUser firebaseUser;
    private Button btnTopUp;
    private ImageView profile;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.name);
        btnTopUp = findViewById(R.id.btn_topup);
        profile = findViewById(R.id.iv_foto);
        tv_saldo = findViewById(R.id.tv_saldo);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if (firebaseUser.getDisplayName()!=null){
            textName.setText(firebaseUser.getDisplayName());
        }else{
            textName.setText("Login Gagal");
        }

        String profileImage = getIntent().getStringExtra("extra_foto");
        if(profileImage== null){

        }else {
            profile.setImageURI(Uri.parse(profileImage));
        }

        String jmlh_saldo = getIntent().getStringExtra("extra_topup");
        String balance = getIntent().getStringExtra("extra_balance");
        if (jmlh_saldo != null){
            tv_saldo.setText(jmlh_saldo);
        }
        if (balance != null){
            tv_saldo.setText(balance);
        }

        profile.setOnClickListener(view -> {
            Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
            toProfile.putExtra("extra_foto", profileImage);
            toProfile.putExtra("extra_topup", jmlh_saldo);
            startActivity(toProfile);
        });



        String jumlah_saldo = tv_saldo.getText().toString();

        RecyclerView rvBuku = findViewById(R.id.rv_buku);
        rvBuku.setHasFixedSize(true);
        rvBuku.setLayoutManager(new GridLayoutManager(this, 2));
        AdapterBuku adapter = new AdapterBuku(DataBuku.books, jumlah_saldo, profileImage);
        rvBuku.setAdapter(adapter);


        btnTopUp.setOnClickListener(view -> {
            String saldo = tv_saldo.getText().toString();
            Intent intent = new Intent(MainActivity.this, TopUpActivity.class);
            intent.putExtra("extra_saldo", saldo);
            intent.putExtra("extra_foto", profileImage);
            startActivity(intent);
        });



    }

}