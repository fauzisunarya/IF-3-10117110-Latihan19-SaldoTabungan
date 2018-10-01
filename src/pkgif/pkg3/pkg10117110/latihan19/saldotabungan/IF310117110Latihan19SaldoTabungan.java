
/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * saldo tabungan
 */
package pkgif.pkg3.pkg10117110.latihan19.saldotabungan;


import java.util.Scanner;

public class IF310117110Latihan19SaldoTabungan {
    
    public static void main(String[] args) {
        
   


        int i;
        int saldoAwal;
        int bunga; 
        int jumlahBunga; 
        int bulan;
        

        saldoAwal = 2500000;
        bunga = 15;
        bulan = 6;
        
        i=1;
        while (i <= bulan) {
            
            //perhitungan 
            jumlahBunga = saldoAwal*bunga/100;
            saldoAwal += jumlahBunga;
    
            
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        } 
    }

    }
    

