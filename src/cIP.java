
import Client.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUN
 */
public class cIP extends javax.swing.JFrame {

    /**
     * Creates new form cIP
     */
    public cIP() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        imgBack = new javax.swing.JLabel();
        txtINP = new javax.swing.JLabel();
        inP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Xác định vị trí");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Xác định vị trí IP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(760, 40, 430, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, -10, 1090, 210);

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(90, 980, 160, 60);

        imgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        getContentPane().add(imgBack);
        imgBack.setBounds(70, 980, 230, 60);

        txtINP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtINP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtINP.setText("Nhập IP: ");
        txtINP.setToolTipText("");
        getContentPane().add(txtINP);
        txtINP.setBounds(400, 200, 230, 70);

        inP.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        inP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inP.setBorder(null);
        inP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPActionPerformed(evt);
            }
        });
        inP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inPKeyPressed(evt);
            }
        });
        getContentPane().add(inP);
        inP.setBounds(637, 200, 740, 67);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/border.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(630, 194, 780, 80);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UI u=new UI();
        u.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void inPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPActionPerformed

    private void inPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inPKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String ip = ((javax.swing.JTextField) evt.getSource()).getText();
            Client cli = new Client();
            //JSONObject a = cli.getWeather(location)
            System.out.println(cli.getIPLocation(ip));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_inPKeyPressed

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
            java.util.logging.Logger.getLogger(cIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton back;
    private javax.swing.JLabel imgBack;
    private javax.swing.JTextField inP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtINP;
    // End of variables declaration//GEN-END:variables
}
