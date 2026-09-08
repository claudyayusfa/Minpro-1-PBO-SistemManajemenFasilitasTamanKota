
package main;

import manager.FasilitasManager;
import helper.InputHelper;

public class Main {

    public static void main(String[] args) {
        
        FasilitasManager manager = new FasilitasManager();
        
        int pilihan;
        
        do {
            System.out.println("\n--------------------------------------");
            System.out.println("SISTEM MANAJEMEN FASILITAS TAMAN KOTA");
            System.out.println("--------------------------------------");
            System.out.println("1. Tampilkan Fasilitas");
            System.out.println("2. Tambah Fasilitas");
            System.out.println("3. Hapus Fasilitas");
            System.out.println("4. Update Fasilitas");
            System.out.println("5. Keluar dari Program");
            System.out.println("--------------------------------------");
            
            pilihan = InputHelper.inputInteger("Pilih Menu (1-5): ");
            
            switch (pilihan) {
                case 1:
                    manager.tampilkanFasilitas();
                    break;
                case 2:
                    manager.tambahFasilitas();
                    break;
                case 3:
                    manager.hapusFasilitas();
                    break;
                case 4:
                    manager.updateFasilitas();
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih sudah menggunakan!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
