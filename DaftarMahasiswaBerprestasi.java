/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minggu5main;

/**
 *
 * @author Hp
 */
class DaftarMahasiswaBerprestasi {
  Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
     void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
}else{
    System.out.println ("Data sudah Penuh !!");
}       
} void tampil(){
       for (Mahasiswa m : listMhs){
           m.tampil();
           System.out.println("----------------------");
       }
}
void bubbleSort(){
    for(int i=0; i<listMhs.length-1; i++){
        for(int j=1; j<listMhs.length-i; j++){
            if (listMhs[j].ipk > listMhs[j-1].ipk){
            //di bawah ini proses swap atau penukaran
                Mahasiswa tmp = listMhs[j];
                listMhs[j]= listMhs[j-1];
                listMhs[j-1]= tmp;
            }
        }
    }
}
void selectionSort(){
    for (int i=0; i<listMhs.length-1; i++){
        int idxMin = i;
        for(int j=i+1; j<listMhs.length; j++){
            if(listMhs[j].ipk<listMhs[idxMin].ipk){
                idxMin= j;
            }
        }
        //swap
        Mahasiswa tmp = listMhs[idxMin];
        listMhs[idxMin] = listMhs[i];
        listMhs[i] = tmp;
    }
}

//void insertionSort() {
//    for (int i = 1; i < listMhs.length; i++){
//        Mahasiswa temp = listMhs[i];
//        int j = i;
//        while (j < 0&& listMhs[j - 1].ipk > temp.ipk){
//            listMhs[j] = listMhs[j - 1];
//            j--;
//        }
//    listMhs[j] = temp;
//    }
//}

void insertionSort(boolean asc) {
    for (int i = 1; i < listMhs.length; i++){
        Mahasiswa temp = listMhs[i];
        int j = i;
        if(asc){
        }else{
        }
    listMhs[j] = temp;
    }
}
    
}

   