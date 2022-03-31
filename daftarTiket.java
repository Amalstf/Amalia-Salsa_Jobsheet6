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
class daftarTiket {
    Tiket listTiket[] = new Tiket[5];
    int idx;
     void tambah(Tiket t){
        if(idx < listTiket.length){
            listTiket[idx] = t;
            idx++;
}else{
    System.out.println ("Tiket Tidak Tersedia");
}       
} void tampil(){
       for (Tiket t : listTiket){
           t.tampil();
           System.out.println("----------------------");
       }
}
void bubbleSort(){
    for(int i=0; i<listTiket.length-1; i++){
        for(int j=1; j<listTiket.length-i; j++){
            if (listTiket[j].harga > listTiket[j-1].harga){
            //di bawah ini proses swap atau penukaran
                Tiket tmp = listTiket[j];
                listTiket[j]= listTiket[j-1];
                listTiket[j-1]= tmp;
            }
        }
    }
}
void selectionSort(){
    for (int i=0; i<listTiket.length-1; i++){
        int idxMin = i;
        for(int j=i+1; j<listTiket.length; j++){
            if(listTiket[j].harga<listTiket[idxMin].harga){
                idxMin= j;
            }
        }
        //swap
        Tiket tmp = listTiket[idxMin];
        listTiket[idxMin] = listTiket[i];
        listTiket[i] = tmp;
    }
}

}
