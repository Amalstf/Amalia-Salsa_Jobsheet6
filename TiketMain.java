/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiketmain;

/**
 *
 * @author Hp
 */
public class TiketMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        daftarTiket list = new daftarTiket();
        Tiket t1 = new Tiket ("Garuda","Surabaya", "Jakarta",1000000);
        Tiket t2 = new Tiket ("citilink","Jakarta", "Denpasar",1200000);
        Tiket t3 = new Tiket ("Lion Air","Surabaya", "Kendari",3000000);
        Tiket t4 = new Tiket ("Garuda","Jakarta", "Palu",2800000);
        Tiket t5 = new Tiket ("night Air","Surabaya", "Solo",700000);
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        
        System.out.println("============================================");
        System.out.println("\t\tDAFTAR TIKET\t\t ");
        System.out.println("============================================");
        list.tampil();
        
        System.out.println("=====================================================");
        System.out.println("Daftar harga tiket berdasarkan dari harga teringgi : ");
        System.out.println("=====================================================");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("=====================================================");
        System.out.println("Daftar Tiket setelah sorting asc berdasarkan Harga : ");
        System.out.println("=====================================================");
        list.selectionSort();
        list.tampil();
        
    }
    
}
