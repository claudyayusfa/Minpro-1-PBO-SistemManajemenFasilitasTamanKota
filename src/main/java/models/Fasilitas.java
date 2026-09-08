
package models;

public class Fasilitas {
    private int id;
    private String nama;
    private String jenis;
    private String kondisi;
    private int jumlah;
    
    //Constructor
    public Fasilitas(int id, String nama, String jenis, String kondisi, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.kondisi = kondisi;
        this.jumlah = jumlah;
    }
    
    //Getter and Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getKondisi() {
        return kondisi;
    }
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}