package com.example.projectuts;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterBuku extends RecyclerView.Adapter<AdapterBuku.ViewHolder> {

    private final ArrayList<ModelBuku> books;
    private String jml_saldo;
    public  AdapterBuku(ArrayList<ModelBuku> books, String jumlah_saldo){
        this.books = books;
        jml_saldo = jumlah_saldo;
    }




    @NonNull
    @Override
    public AdapterBuku.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBuku.ViewHolder holder, int position) {

        ModelBuku buku = books.get(position);
        holder.setData(buku);
//        String jumlahSaldo = getIntent().getStringExtra("extra_saldo");


        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), BookDetailActivity.class);
            intent.putExtra(BookDetailActivity.EXTRA_BOOK, buku);
            intent.putExtra("extra_saldo", jml_saldo);
            holder.itemView.getContext().startActivity(intent);
        });
    }

//    private Intent getIntent() {
//        return null;
//    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView namaBuku, penulis, harga;
        private final ImageView fotoBuku;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaBuku = itemView.findViewById(R.id.tv_namaBuku);
            penulis = itemView.findViewById(R.id.tv_penulis);
            harga = itemView.findViewById(R.id.tv_harga);
            fotoBuku = itemView.findViewById(R.id.iv_buku);
        }

        public void setData(ModelBuku buku) {
            Glide.with(itemView.getContext())
                    .load(buku.getFotoBuku())
                    .apply(new RequestOptions().override(350,
                            350))
                    .into(fotoBuku);
            namaBuku.setText(buku.getNamaBuku());
            penulis.setText(buku.getPenulis());
            harga.setText(buku.getHarga());
        }


    }
}
