/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

/**
 *
 * @author 99
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        panelawal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        background = new javax.swing.JLabel();
        panellogin = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        BtnInfo = new javax.swing.JButton();
        btnStore = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        bgkiri = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        infopanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        storepanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bgkanan = new javax.swing.JLabel();
        registerpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bgregister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI V.1.0");

        panelawal.setBackground(new java.awt.Color(153, 153, 153));
        panelawal.setPreferredSize(new java.awt.Dimension(628, 372));
        panelawal.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        panelawal.add(jLabel1);
        jLabel1.setBounds(270, 80, 80, 40);

        jTextField1.setBackground(new java.awt.Color(11, 28, 32,50));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelawal.add(jTextField1);
        jTextField1.setBounds(230, 120, 170, 30);

        jPasswordField1.setBackground(new java.awt.Color(11, 28, 32,50));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        panelawal.add(jPasswordField1);
        jPasswordField1.setBounds(230, 170, 170, 30);
        panelawal.add(jSeparator1);
        jSeparator1.setBounds(230, 150, 170, 2);
        panelawal.add(jSeparator2);
        jSeparator2.setBounds(230, 200, 170, 20);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelawal.add(jButton1);
        jButton1.setBounds(230, 210, 80, 23);

        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelawal.add(jButton2);
        jButton2.setBounds(320, 210, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\Tugas Individu\\User-Login.png")); // NOI18N
        panelawal.add(jLabel2);
        jLabel2.setBounds(190, 120, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\Tugas Individu\\Lock.png")); // NOI18N
        panelawal.add(jLabel3);
        jLabel3.setBounds(190, 170, 30, 30);
        panelawal.add(jSeparator3);
        jSeparator3.setBounds(190, 150, 30, 10);
        panelawal.add(jSeparator5);
        jSeparator5.setBounds(190, 200, 30, 10);

        background.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\panelmenu.jpg")); // NOI18N
        panelawal.add(background);
        background.setBounds(0, 0, 628, 372);

        panellogin.setLayout(null);

        menupanel.setLayout(null);

        BtnInfo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BtnInfo.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\Mountain-01-WF.png")); // NOI18N
        BtnInfo.setText("INFO GUNUNG");
        BtnInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        menupanel.add(BtnInfo);
        BtnInfo.setBounds(20, 70, 110, 30);

        btnStore.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnStore.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\Store.png")); // NOI18N
        btnStore.setText("STORE");
        btnStore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });
        menupanel.add(btnStore);
        btnStore.setBounds(20, 120, 110, 30);

        jButton10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\Dialog-Box-About.png")); // NOI18N
        jButton10.setText("ABOUT");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        menupanel.add(jButton10);
        jButton10.setBounds(20, 170, 110, 30);

        btnLogout.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\Logout.png")); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        menupanel.add(btnLogout);
        btnLogout.setBounds(20, 310, 110, 30);

        btnHome.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\House-07.png")); // NOI18N
        btnHome.setText("HOME");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        menupanel.add(btnHome);
        btnHome.setBounds(20, 20, 110, 30);

        bgkiri.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\Tugas Individu\\panelmenu.jpg")); // NOI18N
        bgkiri.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menupanel.add(bgkiri);
        bgkiri.setBounds(0, 2, 150, 370);

        panellogin.add(menupanel);
        menupanel.setBounds(-1, -1, 150, 370);

        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setLayout(new java.awt.CardLayout());

        infopanel.setBackground(new java.awt.Color(149, 165, 166));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("INFO");

        javax.swing.GroupLayout infopanelLayout = new javax.swing.GroupLayout(infopanel);
        infopanel.setLayout(infopanelLayout);
        infopanelLayout.setHorizontalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel8)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        infopanelLayout.setVerticalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel8)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        mainPanel.add(infopanel, "card4");

        storepanel.setBackground(new java.awt.Color(46, 204, 113));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setText("STORE");

        javax.swing.GroupLayout storepanelLayout = new javax.swing.GroupLayout(storepanel);
        storepanel.setLayout(storepanelLayout);
        storepanelLayout.setHorizontalGroup(
            storepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storepanelLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel9)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        storepanelLayout.setVerticalGroup(
            storepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storepanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel9)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        mainPanel.add(storepanel, "card5");

        homepanel.setBackground(new java.awt.Color(44, 62, 80));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HOME");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepanelLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        mainPanel.add(homepanel, "card3");

        bgkanan.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\Tugas Individu\\panelmenu.jpg")); // NOI18N
        mainPanel.add(bgkanan, "card2");

        panellogin.add(mainPanel);
        mainPanel.setBounds(160, 0, 460, 370);

        registerpanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        registerpanel.add(jLabel4);
        jLabel4.setBounds(150, 100, 80, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DAFTAR AKUN");
        registerpanel.add(jLabel5);
        jLabel5.setBounds(240, 20, 130, 30);
        registerpanel.add(jTextField2);
        jTextField2.setBounds(230, 100, 200, 20);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAMA");
        registerpanel.add(jLabel7);
        jLabel7.setBounds(150, 60, 60, 30);
        registerpanel.add(jTextField3);
        jTextField3.setBounds(230, 60, 200, 20);

        jButton3.setText("Daftar");
        registerpanel.add(jButton3);
        jButton3.setBounds(260, 150, 73, 23);

        bgregister.setIcon(new javax.swing.ImageIcon("D:\\GILANG\\Project\\Materi Kuliah\\Semester 3\\Pemrograman berbasis OO\\project\\formlogin\\build\\classes\\icon\\Untitled-1 copy.jpg")); // NOI18N
        registerpanel.add(bgregister);
        bgregister.setBounds(0, 0, 628, 372);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelawal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(registerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelawal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(registerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panellogin.setVisible(true);
        panelawal.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        panelawal.setVisible(true);
        panellogin.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        registerpanel.setVisible(true);
        panelawal.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(homepanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(infopanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
        // TODO add your handling code here:
        //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(storepanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnStoreActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        AboutView n = new AboutView();
        n.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInfo;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bgkanan;
    private javax.swing.JLabel bgkiri;
    private javax.swing.JLabel bgregister;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStore;
    private javax.swing.JPanel homepanel;
    private javax.swing.JPanel infopanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel panelawal;
    private javax.swing.JPanel panellogin;
    private javax.swing.JPanel registerpanel;
    private javax.swing.JPanel storepanel;
    // End of variables declaration//GEN-END:variables
}