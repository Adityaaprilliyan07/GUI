/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModulLanjutan;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class VolumeBangunRuang extends javax.swing.JFrame {

    /**
     * Creates new form VolumeBangunRuang
     */
    public VolumeBangunRuang() {
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

        Kubus = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tinggi = new javax.swing.JTextField();
        Panjang = new javax.swing.JTextField();
        Lebar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sisi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        VolumeKubus = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Jari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        hasil = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setText("Masukkan Panjang      :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 180, 30);

        jLabel3.setText("Masukkan Lebar          :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 170, 30);

        jLabel4.setText("Masukkan Tinggi         :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 170, 30);
        jPanel1.add(Tinggi);
        Tinggi.setBounds(210, 160, 150, 26);
        jPanel1.add(Panjang);
        Panjang.setBounds(210, 50, 150, 26);
        jPanel1.add(Lebar);
        Lebar.setBounds(210, 100, 150, 26);

        jLabel5.setText("cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 160, 51, 20);

        jLabel10.setText("cm");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 50, 21, 20);

        jLabel11.setText("cm");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 100, 51, 20);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        jPanel1.add(Hitung);
        Hitung.setBounds(240, 220, 79, 29);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\13926481231764053423simple-blue-background.jpg")); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 430, 280);

        Kubus.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel6.setText("Masukkan Panjang Sisi");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 40, 173, 28);
        jPanel2.add(sisi);
        sisi.setBounds(10, 80, 120, 40);

        jLabel7.setText("cm");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(150, 90, 51, 20);

        VolumeKubus.setText("Volume");
        VolumeKubus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumeKubusActionPerformed(evt);
            }
        });
        jPanel2.add(VolumeKubus);
        VolumeKubus.setBounds(10, 140, 87, 29);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\13926481231764053423simple-blue-background.jpg")); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 0, 430, 270);

        Kubus.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        jLabel8.setText("Masukkan Panjang Jari-jari");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(15, 40, 193, 29);
        jPanel3.add(Jari);
        Jari.setBounds(20, 80, 140, 40);

        jLabel9.setText("cm");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(170, 90, 21, 20);

        hasil.setText("Volume");
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        jPanel3.add(hasil);
        hasil.setBounds(40, 140, 87, 29);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\13926481231764053423simple-blue-background.jpg")); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 430, 270);

        Kubus.addTab("Bola", jPanel3);

        getContentPane().add(Kubus);
        Kubus.setBounds(20, 80, 430, 300);

        jLabel1.setText("      Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 350, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\traditional-and-classic-sunburst-or-starburst-background-green-4k-and-full-hd_njhnts86__F0000.png")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 490, 420);

        setBounds(0, 0, 508, 475);
    }// </editor-fold>//GEN-END:initComponents

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        int panjang,lebar, tinggi;
        panjang=Integer.parseInt(Panjang.getText());
        lebar=Integer.parseInt(Lebar.getText());
        tinggi=Integer.parseInt(Tinggi.getText());
        int hasil=panjang*lebar*tinggi;
        try{
            JOptionPane.showMessageDialog(null,"Volume Balok Adalah :"+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
        double jari;
        jari=Double.parseDouble(Jari.getText());
        double hasil=(double) (4/3*3.14*jari*jari*jari);
        try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan Bola Adalah :"+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hasilActionPerformed

    private void VolumeKubusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumeKubusActionPerformed
        // TODO add your handling code here:
        int Sisi;
        Sisi=Integer.parseInt(sisi.getText());
        int hasil = Sisi*Sisi*Sisi;

        try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan Kubus Adalah :"+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_VolumeKubusActionPerformed

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
            java.util.logging.Logger.getLogger(VolumeBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolumeBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolumeBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolumeBangunRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VolumeBangunRuang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Jari;
    private javax.swing.JTabbedPane Kubus;
    private javax.swing.JTextField Lebar;
    private javax.swing.JTextField Panjang;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JButton VolumeKubus;
    private javax.swing.JButton hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField sisi;
    // End of variables declaration//GEN-END:variables
}
