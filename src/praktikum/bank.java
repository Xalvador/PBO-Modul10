/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Cordovix-ME
 */
import javax.swing.JOptionPane;

public class bank extends javax.swing.JFrame {
    public int tab = 50000;
   
   
    /**
     * Creates new form bank
     */
    public bank() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        isi = new javax.swing.JTextField();
        tari = new javax.swing.JButton();
        seto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sald = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kelu = new javax.swing.JButton();
        petu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PENARIKAN & PENYETORAN"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        isi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        isi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(isi);
        isi.setBounds(40, 30, 240, 60);

        tari.setText("TARIK");
        tari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tariActionPerformed(evt);
            }
        });
        jPanel1.add(tari);
        tari.setBounds(290, 70, 90, 40);

        seto.setText("SETOR");
        seto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setoActionPerformed(evt);
            }
        });
        jPanel1.add(seto);
        seto.setBounds(290, 20, 90, 40);

        jLabel2.setText("Rp.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 34, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 210, 400, 120);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SALDO ANDA"));
        jPanel2.setLayout(null);

        sald.setEditable(false);
        sald.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sald.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sald.setText("50000");
        sald.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldActionPerformed(evt);
            }
        });
        jPanel2.add(sald);
        sald.setBounds(50, 20, 320, 50);

        jLabel3.setText("Rp.");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 40, 40, 14);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 90, 400, 80);

        kelu.setText("KELUAR");
        kelu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluActionPerformed(evt);
            }
        });
        getContentPane().add(kelu);
        kelu.setBounds(320, 380, 90, 40);

        petu.setText("PETUNJUK");
        getContentPane().add(petu);
        petu.setBounds(220, 380, 100, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANK BANGTUD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 200, 70);

        setBounds(0, 0, 451, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void keluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluActionPerformed

    private void saldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_saldActionPerformed

    private void setoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setoActionPerformed
        // TODO add your handling code here:
        int setor ;
        setor= Integer.parseInt(isi.getText());
        if (setor%100!=0)
            JOptionPane.showMessageDialog(null,
            "Maaf tidak menerima uang koin \n Silahkan ulangi kembali!",
            "Transaksi gagal",0);
        else if (setor<50000)
            JOptionPane.showMessageDialog(null,"Besaran mnimal setor tunai adalah Rp 50.000,00","ERROR",0);
        else if (setor>=50000){
            tab+=setor;
            JOptionPane.showMessageDialog(null,
            "Saldo Anda saat ini sebesar : " + tab);
         sald.setText(""+tab);
        }
    }//GEN-LAST:event_setoActionPerformed

    private void tariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tariActionPerformed
        // TODO add your handling code here:
        int tarik ;
        tarik= Integer.parseInt(isi.getText());
        if (tarik%100!=0)
            JOptionPane.showMessageDialog(null,
            "Maaf tidak menyediakan uang koin \n Silahkan ulangi kembali!",
            "Transaksi gagal",0);
        else if (tarik <50000)
            JOptionPane.showMessageDialog(null,"Besaran mnimal pengambilan adalah Rp 50.000,00","ERROR",0);
        else if (tarik>=50000){
            tab-=tarik;
            JOptionPane.showMessageDialog(null,
            "Saldo Anda saat ini sebesar : " + tab);
         sald.setText(""+tab);
        }
    }//GEN-LAST:event_tariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int pin ;
                String str;
               
                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:","ATM BNI SYARIAH-BOJONENOGO",0);
                pin = Integer.parseInt(str);
                 //meghitung kesempatan login
                        
                if (pin==1234)//cek pin
                     new bank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kelu;
    private javax.swing.JButton petu;
    private javax.swing.JTextField sald;
    private javax.swing.JButton seto;
    private javax.swing.JButton tari;
    // End of variables declaration//GEN-END:variables
}
