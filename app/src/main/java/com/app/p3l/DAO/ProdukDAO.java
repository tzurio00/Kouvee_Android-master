package com.app.p3l.DAO;

public class ProdukDAO {
    String nama,link_gambar,deleted_at;
    int stock,harga,kategori_id,id;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLink_gambar() {
        return link_gambar;
    }

    public void setLink_gambar(String link_gambar) {
        this.link_gambar = link_gambar;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProdukDAO(String nama, String link_gambar, int stock, int harga, int kategori_id,int id) {
        this.nama = nama;
        this.link_gambar = link_gambar;
        this.stock = stock;
        this.harga = harga;
        this.kategori_id = kategori_id;
        this.id = id;
    }
}
