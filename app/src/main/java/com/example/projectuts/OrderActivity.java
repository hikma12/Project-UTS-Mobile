package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class OrderActivity extends AppCompatActivity {

    public static final String EXTRA_BOOK = "extra_book";
    private ImageView foto;
    private TextView namaBuku, harga, total, jumlah, saldo;
    private Button checkOut;
    private ImageButton back;
    private  int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        foto = findViewById(R.id.foto);
        namaBuku = findViewById(R.id.namaBuku);
        harga = findViewById(R.id.tv_harga);
        jumlah = findViewById(R.id.tv_jumlah);
        total = findViewById(R.id.total);
        checkOut = findViewById(R.id.btn_checkOut);
        back = findViewById(R.id.btn_back);
        saldo = findViewById(R.id.saldo);

        ModelBuku buku = getIntent().getParcelableExtra(EXTRA_BOOK);
        Glide.with(OrderActivity.this)
                .load(buku.getFotoBuku())
                .apply(new RequestOptions().override(350,
                        350))
                .into(foto);
        namaBuku.setText(buku.getNamaBuku());
        harga.setText(buku.getHarga());
        String jumlahSaldo = getIntent().getStringExtra("extra_saldo");
        saldo.setText(jumlahSaldo);

        String profileImage = getIntent().getStringExtra("extra_foto");

        checkOut.setOnClickListener(view -> {
            if (jumlah.getText().toString().equals("0")){
                Toast.makeText(this, "Silahkan tentukan jumlah terlebih dahulu", Toast.LENGTH_SHORT).show();
            }else {
                String balance = saldo.getText().toString();
                String totalPembayaran = total.getText().toString();
                int jumlah_saldo = Integer.parseInt(balance) - Integer.parseInt(totalPembayaran);
                String jumlah = String.valueOf(jumlah_saldo);
                if (Integer.parseInt(totalPembayaran) > Integer.parseInt(balance) ){
                    Toast.makeText(this, "Saldo anda tidak cukup", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "Pesanan anda sedang di proses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OrderActivity.this, MainActivity.class);
                    intent.putExtra(OrderActivity.EXTRA_BOOK, buku);
                    intent.putExtra("extra_foto", profileImage);
                    intent.putExtra("extra_balance", jumlah);
                    startActivity(intent);
                }
            }

        });

        back.setOnClickListener(view -> {
            finish();
        });

    }

    public void kurang(View view) {
        if (count <= 0){
            count = 0;
        }else {
            count--;
            jumlah.setText("" + count);
            ModelBuku buku = getIntent().getParcelableExtra(EXTRA_BOOK);
            int sum = Integer.valueOf(jumlah.getText().toString());
            int harga = Integer.valueOf(buku.getHarga());
            total.setText(String.valueOf(sum * harga));
        }
    }

    public void tambah(View view) {
        count++;
        jumlah.setText(""+ count);
        ModelBuku buku = getIntent().getParcelableExtra(EXTRA_BOOK);
        int sum = Integer.valueOf(jumlah.getText().toString());
        int harga = Integer.valueOf(buku.getHarga());
        total.setText(String.valueOf(sum * harga));

    }
}