/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUN
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
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

        cWeather = new javax.swing.JButton();
        cIP = new javax.swing.JButton();
        cPort = new javax.swing.JButton();
        Khung1 = new javax.swing.JLabel();
        khung2 = new javax.swing.JLabel();
        khung3 = new javax.swing.JLabel();
        Tittle = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        cWeather.setBackground(new java.awt.Color(0, 102, 51));
        cWeather.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cWeather.setForeground(new java.awt.Color(255, 255, 255));
        cWeather.setText("Tra cứu thời tiết");
        cWeather.setAutoscrolls(true);
        cWeather.setBorder(null);
        cWeather.setContentAreaFilled(false);
        cWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cWeatherActionPerformed(evt);
            }
        });
        getContentPane().add(cWeather);
        cWeather.setBounds(580, 440, 780, 130);

        cIP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cIP.setForeground(new java.awt.Color(255, 255, 255));
        cIP.setText("Xác định vị trí IP");
        cIP.setBorder(null);
        cIP.setContentAreaFilled(false);
        cIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIPActionPerformed(evt);
            }
        });
        getContentPane().add(cIP);
        cIP.setBounds(570, 660, 770, 140);

        cPort.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cPort.setForeground(new java.awt.Color(255, 255, 255));
        cPort.setText("Quét Port");
        cPort.setBorder(null);
        cPort.setContentAreaFilled(false);
        cPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPortActionPerformed(evt);
            }
        });
        getContentPane().add(cPort);
        cPort.setBounds(580, 900, 780, 130);

        Khung1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.png"))); // NOI18N
        getContentPane().add(Khung1);
        Khung1.setBounds(560, 430, 810, 150);

        khung2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4.png"))); // NOI18N
        getContentPane().add(khung2);
        khung2.setBounds(570, 650, 800, 160);

        khung3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5.png"))); // NOI18N
        getContentPane().add(khung3);
        khung3.setBounds(570, 890, 820, 140);

        Tittle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/titled.png"))); // NOI18N
        getContentPane().add(Tittle);
        Tittle.setBounds(-50, 40, 1920, 1080);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cWeatherActionPerformed
        cWeather w = new cWeather();
        w.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_cWeatherActionPerformed

    private void cIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIPActionPerformed
        cIP i = new cIP();
        i.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_cIPActionPerformed

    private void cPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPortActionPerformed
        cPort p = new cPort();
        p.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cPortActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Khung1;
    private javax.swing.JLabel Tittle;
    private javax.swing.JButton cIP;
    private javax.swing.JButton cPort;
    private javax.swing.JButton cWeather;
    private javax.swing.JLabel khung2;
    private javax.swing.JLabel khung3;
    // End of variables declaration//GEN-END:variables
}
