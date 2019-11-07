
package if1.pkg10118006.latihan42.tabungan;

import java.util.Scanner;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 * Deskripsi Program : Program ini untuk menampilkan output saldo tabungan.
 */
public class IF110118006Latihan42Tabungan {

    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        
        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        System.out.print("Jumlah uang yang diambil : ");        
        System.out.print("Saldo anda Sekarang : " 
                + tabungan.ambilUang(scn.nextInt())+ "\n");
    }
    
}
