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

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class BookDetailActivity extends AppCompatActivity {

    public static final String EXTRA_BOOK = "extra_book";
    private TextView namaBuku, penulis, harga, deskripsi, halaman, penerbit, tglTerbit, isbn;
    private ImageView fotoBuku;
    private ImageButton back;
    private Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        namaBuku = findViewById(R.id.tv_namaBuku);
        penulis = findViewById(R.id.tv_penulis);
        harga = findViewById(R.id.tv_harga);
        deskripsi = findViewById(R.id.tv_deskripsi);
        halaman = findViewById(R.id.tv_jumlahHalaman);
        penerbit = findViewById(R.id.tv_penerbit);
        tglTerbit = findViewById(R.id.tv_tglTerbit);
        isbn = findViewById(R.id.tv_isbn);
        fotoBuku = findViewById(R.id.iv_buku);
        back = findViewById(R.id.btn_back);
        order = findViewById(R.id.btn_order);

        ModelBuku buku = getIntent().getParcelableExtra(EXTRA_BOOK);
        String jumlahSaldo = getIntent().getStringExtra("extra_saldo");

        namaBuku.setText(buku.getNamaBuku());
        penulis.setText(buku.getPenulis());
        harga.setText(buku.getHarga());
        deskripsi.setText(buku.getDeskripsi());
        halaman.setText(buku.getJumlahHalaman());
        penerbit.setText(buku.getPenerbit());
        tglTerbit.setText(buku.getTglTerbit());
        isbn.setText(buku.getIsbn());
        Glide.with(BookDetailActivity.this)
                .load(buku.getFotoBuku())
                .apply(new RequestOptions().override(350,
                        350))
                .into(fotoBuku);

        back.setOnClickListener(view -> {
            finish();
        });


        order.setOnClickListener(view -> {
            Intent intent = new Intent(BookDetailActivity.this, OrderActivity.class);
            intent.putExtra(OrderActivity. EXTRA_BOOK, buku);
            intent.putExtra("extra_saldo", jumlahSaldo);
            startActivity(intent);

        });


    }
}