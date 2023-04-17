package com.example.projectuts;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private TextView textName;
    private FirebaseUser firebaseUser;
    private Button btnLogout;
    private ImageView profile;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.name);
        btnLogout = findViewById(R.id.btn_logout);
        profile = findViewById(R.id.iv_foto);
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


        profile.setOnClickListener(view -> {
            Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
            toProfile.putExtra("extra_foto", profileImage);
            startActivity(toProfile);
        });


        RecyclerView rvBuku = findViewById(R.id.rv_buku);
        rvBuku.setHasFixedSize(true);
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        AdapterBuku adapter = new AdapterBuku(DataBuku.books);
        rvBuku.setAdapter(adapter);
        btnLogout.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        });


    }


}