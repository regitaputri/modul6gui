/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6gui;

/**
 *
 * @author ASUS
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HargaBarang2 = new javax.swing.JTextField();
        HargaBarang3 = new javax.swing.JTextField();
        HargaBarang4 = new javax.swing.JTextField();
        Diskon = new javax.swing.JTextField();
        HargaBarang1 = new javax.swing.JTextField();
        buttonProses = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 100, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Harga Barang 2 :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Harga Barang 3 :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Harga Barang 4 :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 210, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Diskon");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 260, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Harga Barang 1 :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 60, 190, 30);
        jPanel1.add(HargaBarang2);
        HargaBarang2.setBounds(160, 110, 120, 30);
        jPanel1.add(HargaBarang3);
        HargaBarang3.setBounds(160, 160, 120, 30);
        jPanel1.add(HargaBarang4);
        HargaBarang4.setBounds(160, 210, 120, 30);
        jPanel1.add(Diskon);
        Diskon.setBounds(160, 260, 120, 30);

        HargaBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaBarang1ActionPerformed(evt);
            }
        });
        jPanel1.add(HargaBarang1);
        HargaBarang1.setBounds(160, 60, 120, 30);

        buttonProses.setText("Proses");
        buttonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonProses);
        buttonProses.setBounds(50, 320, 65, 23);

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHapus);
        buttonHapus.setBounds(150, 320, 63, 23);

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonKeluar);
        buttonKeluar.setBounds(240, 320, 63, 23);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 360, 330, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 510);

        setBounds(0, 0, 390, 541);
    }// </editor-fold>//GEN-END:initComponents

    private void HargaBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaBarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaBarang1ActionPerformed

    private void buttonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesActionPerformed
        // TODO add your handling code here:
        int hargabarang1 = Integer.parseInt(HargaBarang1.getText().toString());
        int hargabarang2 = Integer.parseInt(HargaBarang2.getText().toString());
        int hargabarang3 = Integer.parseInt(HargaBarang3.getText().toString());
        int hargabarang4 = Integer.parseInt(HargaBarang4.getText().toString());
        int diskon = Integer.parseInt(Diskon.getText().toString());
        int totalharga = hargabarang1 + hargabarang2 + hargabarang3 + hargabarang4;
        int hargadiskon = totalharga * diskon/100;
        int totalbayar = totalharga - hargadiskon;
        
        Hasil.setText("Harga Barang 1: "+hargabarang1+"\nHarga Barang 2: "+hargabarang2+"\nHarga Barang 3: "
        +hargabarang3+"\nHarga Barang 4: "+hargabarang4+"\nDiskon Anda: "+diskon+"\nTotal Harga: "
                +totalharga+"\nTotal Bayar: "+totalbayar);
        
        
    }//GEN-LAST:event_buttonProsesActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        HargaBarang1.setText(" ");
        HargaBarang2.setText(" ");
        HargaBarang3.setText(" ");
        HargaBarang4.setText(" ");
        Diskon.setText(" ");
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextField HargaBarang1;
    private javax.swing.JTextField HargaBarang2;
    private javax.swing.JTextField HargaBarang3;
    private javax.swing.JTextField HargaBarang4;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
