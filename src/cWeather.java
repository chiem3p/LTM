/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUN
 */
import Client.Client;
public class cWeather extends javax.swing.JFrame {

    /**
     * Creates new form cWeather
     */
    public cWeather() {
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

        txt = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        imgBack = new javax.swing.JLabel();
        txtINP = new javax.swing.JLabel();
        inP = new javax.swing.JTextField();
        txtht = new javax.swing.JLabel();
        txtday2 = new javax.swing.JLabel();
        txtday1 = new javax.swing.JLabel();
        txtday = new javax.swing.JLabel();
        borderday1 = new javax.swing.JLabel();
        borderInP = new javax.swing.JLabel();
        borderday2 = new javax.swing.JLabel();
        borderday3 = new javax.swing.JLabel();
        day1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        borderday5 = new javax.swing.JLabel();
        day2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        day = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        day3 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tra cứu thời tiết");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        txt.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText("Tra cứu thời tiết");
        getContentPane().add(txt);
        txt.setBounds(790, 50, 480, 60);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1c.png"))); // NOI18N
        getContentPane().add(img);
        img.setBounds(360, 0, 1190, 200);

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
        txtINP.setText("Nhập tỉnh/Thành phố:");
        txtINP.setToolTipText("");
        getContentPane().add(txtINP);
        txtINP.setBounds(200, 200, 430, 70);

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

        txtht.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtht.setForeground(new java.awt.Color(255, 255, 255));
        txtht.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtht.setText("Hiện tại");
        getContentPane().add(txtht);
        txtht.setBounds(120, 370, 220, 90);

        txtday2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtday2.setForeground(new java.awt.Color(255, 255, 255));
        txtday2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtday2.setText("Ngày kia");
        getContentPane().add(txtday2);
        txtday2.setBounds(1590, 370, 200, 90);

        txtday1.setBackground(new java.awt.Color(255, 255, 255));
        txtday1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtday1.setForeground(new java.awt.Color(255, 255, 255));
        txtday1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtday1.setText("Ngày mai");
        getContentPane().add(txtday1);
        txtday1.setBounds(1100, 370, 200, 80);

        txtday.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtday.setForeground(new java.awt.Color(255, 255, 255));
        txtday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtday.setText("Hôm nay");
        getContentPane().add(txtday);
        txtday.setBounds(590, 370, 250, 90);

        borderday1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borderday1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon6.png"))); // NOI18N
        getContentPane().add(borderday1);
        borderday1.setBounds(500, 370, 430, 90);

        borderInP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/border.png"))); // NOI18N
        getContentPane().add(borderInP);
        borderInP.setBounds(630, 194, 780, 80);

        borderday2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borderday2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon3.png"))); // NOI18N
        getContentPane().add(borderday2);
        borderday2.setBounds(10, 370, 440, 90);

        borderday3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borderday3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon5.png"))); // NOI18N
        getContentPane().add(borderday3);
        borderday3.setBounds(1480, 370, 420, 90);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea2.setRows(5);
        day1.setViewportView(jTextArea2);

        getContentPane().add(day1);
        day1.setBounds(500, 450, 420, 520);

        borderday5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borderday5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon4.png"))); // NOI18N
        getContentPane().add(borderday5);
        borderday5.setBounds(990, 370, 420, 90);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea3.setRows(5);
        day2.setViewportView(jTextArea3);

        getContentPane().add(day2);
        day2.setBounds(990, 450, 420, 520);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        day.setViewportView(jTextArea1);

        getContentPane().add(day);
        day.setBounds(20, 450, 420, 520);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea4.setRows(5);
        day3.setViewportView(jTextArea4);

        getContentPane().add(day3);
        day3.setBounds(1480, 450, 420, 520);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 2140, 1080);

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
            
            String location = ((javax.swing.JTextField) evt.getSource()).getText();
            Client cli = new Client();
            System.out.println(cli.getWeather(location));
      // Enter was pressed. Your code goes here.
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
            java.util.logging.Logger.getLogger(cWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cWeather().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton back;
    private javax.swing.JLabel borderInP;
    private javax.swing.JLabel borderday1;
    private javax.swing.JLabel borderday2;
    private javax.swing.JLabel borderday3;
    private javax.swing.JLabel borderday5;
    private javax.swing.JScrollPane day;
    private javax.swing.JScrollPane day1;
    private javax.swing.JScrollPane day2;
    private javax.swing.JScrollPane day3;
    private javax.swing.JLabel img;
    private javax.swing.JLabel imgBack;
    private javax.swing.JTextField inP;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txtINP;
    private javax.swing.JLabel txtday;
    private javax.swing.JLabel txtday1;
    private javax.swing.JLabel txtday2;
    private javax.swing.JLabel txtht;
    // End of variables declaration//GEN-END:variables
}
