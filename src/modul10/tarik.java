/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

/**
 *
 * @author Cordovix-ME
 */
import javax.swing.JOptionPane;

/**
 *
 * @author tomama
 */
class tarik {
    private int saldo;
    public void ambil (int tab, int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silahkan ulangi lagi", "Transaksi Gagal",0);
        else if (t<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal pengamblan tunai adalah Rp 50.000,00", "Transaksi Gagal", 0);
        else{
            saldo = tab-t;
            JOptionPane.showMessageDialog(null, "Saldo minimal harus Rp 50.000,00, Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
        }
    }
    
    public int getsaldo()
    {
        return saldo;
    }
}