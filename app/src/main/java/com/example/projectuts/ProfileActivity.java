package com.example.projectuts;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton back;
    private TextView nama, email;
    private ImageView foto;
    private String profileUri;
    private Uri uri;
    private Button btnLogout;
    private FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nama = findViewById(R.id.tv_name);
        email = findViewById(R.id.tv_email);
        foto = findViewById(R.id.iv_foto);
        back = findViewById(R.id.btn_back);
        btnLogout = findViewById(R.id.btn_logout);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        nama.setText(firebaseUser.getDisplayName());
        email.setText(firebaseUser.getEmail());

        String jmlh_saldo = getIntent().getStringExtra("extra_topup");

        back.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            intent.putExtra("extra_foto", profileUri);
            intent.putExtra("extra_topup", jmlh_saldo);
            startActivity(intent);

        });
        String profileImage = getIntent().getStringExtra("extra_foto");
        if(profileImage== null){

        }else {
            foto.setImageURI(Uri.parse(profileImage));
        }
        foto.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            takeImage.launch(intent);
        });

        btnLogout.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        });

    }
    ActivityResultLauncher<Intent> takeImage = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result ->{
                if (result.getResultCode() == RESULT_OK && result.getData() != null){
                    uri = result.getData().getData();
                    profileUri = uri.toString();
                    foto.setImageURI(uri);
                }
            }
    );
}