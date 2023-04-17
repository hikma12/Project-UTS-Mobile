package com.example.projectuts;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class ModelBuku implements Parcelable {
    String namaBuku;
    String penulis;
    String deskripsi;
    String fotoBuku;
    String harga;
    String jumlahHalaman;
    String penerbit;
    String tglTerbit;
    String isbn;


    protected ModelBuku(Parcel in) {
        namaBuku = in.readString();
        penulis = in.readString();
        deskripsi = in.readString();
        fotoBuku = in.readString();
        harga = in.readString();
        jumlahHalaman = in.readString();
        penerbit = in.readString();
        tglTerbit = in.readString();
        isbn = in.readString();
    }

    public ModelBuku(String namaBuku, String penulis, String deskripsi, String fotoBuku, String jumlahHalaman, String penerbit, String tglTerbit, String isbn, String harga) {
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.deskripsi = deskripsi;
        this.fotoBuku = fotoBuku;
        this.harga = harga;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.isbn = isbn;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getFotoBuku() {
        return fotoBuku;
    }

    public String getHarga() {
        return harga;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTglTerbit() {
        return tglTerbit;
    }

    public String getIsbn() {
        return isbn;
    }

    public static final Creator<ModelBuku> CREATOR = new Creator<ModelBuku>() {
        @Override
        public ModelBuku createFromParcel(Parcel in) {
            return new ModelBuku(in);
        }

        @Override
        public ModelBuku[] newArray(int size) {
            return new ModelBuku[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(namaBuku);
        parcel.writeString(penulis);
        parcel.writeString(deskripsi);
        parcel.writeString(fotoBuku);
        parcel.writeString(harga);
        parcel.writeString(jumlahHalaman);
        parcel.writeString(penerbit);
        parcel.writeString(tglTerbit);
        parcel.writeString(isbn);
    }
}
