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
class Tiket {
     String Maskapai, asal, tujuan;
  int harga;
  
  Tiket(String m, String a, String tjn, int h){
      Maskapai = m;
      asal = a;
      tujuan = tjn;
      harga = h;
  }
  void tampil(){
      System.out.println("Makapai = " + Maskapai);
      System.out.println("Asal Keberangkatan = " + asal);
      System.out.println("Tujuan Perjalanan = " + tujuan);
      System.out.println("Harga = " + harga);
  }
    
}
