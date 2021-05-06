/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
/**
 *
 * @author Lapankha
 */
public class Profil extends javax.swing.JFrame {

    /**
     * Creates new form Profil
     */
    public Profil() {
        initComponents();
        User obj = new User();
        String [][] data = obj.getProfil(User.IDUser);
        LNama.setText(data[0][0]);
        LJK.setText(data[0][1]);
        LEmail.setText(data[0][2]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LNama = new javax.swing.JLabel();
        LJK = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuProfil = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuKategori = new javax.swing.JMenuItem();
        MenuBuku = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Profil");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Email");

        LNama.setText("jLabel5");

        LJK.setText("jLabel6");

        LEmail.setText("jLabel7");

        jLabel2.setText("Nama");

        jMenu1.setText("Profil");

        MenuProfil.setText("Profil");
        MenuProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuProfilMouseReleased(evt);
            }
        });
        MenuProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProfilActionPerformed(evt);
            }
        });
        jMenu1.add(MenuProfil);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data");

        MenuKategori.setText("Data Kategori");
        MenuKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuKategoriMouseReleased(evt);
            }
        });
        MenuKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuKategoriActionPerformed(evt);
            }
        });
        jMenu2.add(MenuKategori);

        MenuBuku.setText("Data Buku");
        MenuBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuBukuMouseReleased(evt);
            }
        });
        jMenu2.add(MenuBuku);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LNama, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(LJK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LNama))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LJK))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEmail)
                    .addComponent(jLabel4))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuProfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProfilMouseReleased

        DataKategori dk = new DataKategori();
        DataBuku db = new DataBuku();
        db.setVisible(false);
        dk.setVisible(false);
    }//GEN-LAST:event_MenuProfilMouseReleased

    private void MenuProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProfilActionPerformed

    private void MenuKategoriMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuKategoriMouseReleased
        DataKategori dk = new DataKategori();
        dk.setLocationRelativeTo(this);
        dk.setVisible(true);
    }//GEN-LAST:event_MenuKategoriMouseReleased

    private void MenuKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuKategoriActionPerformed

    }//GEN-LAST:event_MenuKategoriActionPerformed

    private void MenuBukuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBukuMouseReleased
        DataBuku db = new DataBuku();
        db.setLocationRelativeTo(this);
        db.setVisible(true);
    }//GEN-LAST:event_MenuBukuMouseReleased

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
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LJK;
    private javax.swing.JLabel LNama;
    private javax.swing.JMenuItem MenuBuku;
    private javax.swing.JMenuItem MenuKategori;
    private javax.swing.JMenuItem MenuProfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
