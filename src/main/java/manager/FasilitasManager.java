
package manager;

import java.util.ArrayList;
import models.Fasilitas;
import helper.InputHelper;

public class FasilitasManager {
    
    private ArrayList<Fasilitas> daftarFasilitas = new ArrayList<>();

    //READ
    public void tampilkanFasilitas() {
        System.out.println("\nDATA FASILITAS TAMAN KOTA");
        
        if (daftarFasilitas.isEmpty()) {
            System.out.println("Belum ada data fasilitas.");
            return;
        }
        for (Fasilitas fasilitas : daftarFasilitas) {
            System.out.println("\n----------------------------");
            System.out.println("ID Fasilitas    : " + fasilitas.getId());
            System.out.println("Nama Fasilitas  : " + fasilitas.getNama());
            System.out.println("Jenis           : " + fasilitas.getJenis());
            System.out.println("Kondisi         : " + fasilitas.getKondisi());
            System.out.println("Jumlah          : " + fasilitas.getJumlah());
        }
    }
    
    //CREATE
    public void tambahFasilitas() {
        System.out.println("\nTAMBAH DATA FASILITAS");
        
        int id = InputHelper.inputInteger("ID Fasilitas: ");
        
        for (Fasilitas fasilitas : daftarFasilitas) {
            if (fasilitas.getId() == id) {
                System.out.println("ID tersebut sudah digunakan!");
                return;
            }
        }
        
        String nama = InputHelper.inputString("Nama Fasilitas: ");
        
        String jenis = InputHelper.inputString("Jenis Fasilitas: ");
        
        System.out.println("Kondisi Fasilitas");
        String kondisi = InputHelper.inputKondisi();
        
        int jumlah = InputHelper.inputInteger("Jumlah Fasilitas: ");
        
        Fasilitas fasilitas = new Fasilitas(
                id,
                nama,
                jenis,
                kondisi,
                jumlah
        );
        daftarFasilitas.add(fasilitas);
        
        System.out.println("\nFasilitas berhasil ditambahkan!");
    }
    
    //DELETE
    public void hapusFasilitas() {
        System.out.println("\nHAPUS FASILITAS");
        
        int id = InputHelper.inputInteger("Masukkan ID Fasilitas: ");
        
        Fasilitas fasilitasDitemukan = null;
        
        for (Fasilitas fasilitas : daftarFasilitas) {
            if (fasilitas.getId() == id) {
                fasilitasDitemukan = fasilitas;
                break;
            }
        }
        
        if (fasilitasDitemukan == null) {
            System.out.println("Fasilitas tidak ditemukan!");
            return;
        }
        
        daftarFasilitas.remove(fasilitasDitemukan);
        System.out.println("Fasilitas berhasil dihapus!");
    }
    
    //UPDATE
    public void updateFasilitas() {
        System.out.println("\nUPDATE FASILITAS");
        
        int id = InputHelper.inputInteger("Masukkan ID Fasilitas: ");
        
        Fasilitas fasilitasDitemukan = null;
        
        for (Fasilitas fasilitas : daftarFasilitas) {
            if (fasilitas.getId() == id) {
                fasilitasDitemukan = fasilitas;
                break;
            }
        }
        
        if (fasilitasDitemukan == null) {
            System.out.println("Fasilitas dengan ID tersebut tidak ditemukan!");
            return;
        }
        
        String nama = InputHelper.inputString("Nama Fasilitas Baru: ");
        
        String jenis = InputHelper.inputString("Jenis Fasilitas Baru: ");
        
        System.out.println("\nKondisi Fasilitas Baru: ");
        String kondisi = InputHelper.inputKondisi();
        
        int jumlah = InputHelper.inputInteger("Jumlah Fasilitas Baru: ");
        
        fasilitasDitemukan.setNama(nama);
        fasilitasDitemukan.setJenis(jenis);
        fasilitasDitemukan.setKondisi(kondisi);
        fasilitasDitemukan.setJumlah(jumlah);
        System.out.println("\nFasilitas berhasil diperbarui!");
    }
}