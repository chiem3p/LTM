    
import Client.Client;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SUN
 */
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class cPort extends javax.swing.JFrame {

    /**
     * Creates new form cPort
     */
    public cPort() {
        model.addColumn("Port"); 
        model.addColumn("Protocol"); 
        model.addColumn("Service"); 
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 24));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        imgBack = new javax.swing.JLabel();
        inP = new javax.swing.JTextField();
        txtINP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imgTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inP1 = new javax.swing.JTextField();
        inP2 = new javax.swing.JTextField();
        boderInp1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quét port");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(90, 960, 160, 60);

        title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Quét Port");
        getContentPane().add(title);
        title.setBounds(850, 40, 460, 60);

        imgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        getContentPane().add(imgBack);
        imgBack.setBounds(70, 960, 230, 60);

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
        inP.setBounds(810, 180, 750, 60);

        txtINP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtINP.setForeground(new java.awt.Color(255, 255, 255));
        txtINP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtINP.setText("Nhập IP: ");
        txtINP.setToolTipText("");
        getContentPane().add(txtINP);
        txtINP.setBounds(380, 170, 400, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Khoảng: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 270, 420, 60);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/txtInpCity.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 260, 440, 80);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/txtInpCity.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 170, 440, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/border.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 170, 1210, 80);

        imgTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1b.png"))); // NOI18N
        getContentPane().add(imgTitle);
        imgTitle.setBounds(360, 0, 1090, 180);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-->");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1130, 260, 120, 80);

        inP1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        inP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inP1.setBorder(null);
        inP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inP1ActionPerformed(evt);
            }
        });
        inP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inP1KeyPressed(evt);
            }
        });
        getContentPane().add(inP1);
        inP1.setBounds(810, 270, 350, 60);

        inP2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        inP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inP2.setBorder(null);
        inP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inP2ActionPerformed(evt);
            }
        });
        inP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inP2KeyPressed(evt);
            }
        });
        getContentPane().add(inP2);
        inP2.setBounds(1220, 270, 350, 60);

        boderInp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/border.png"))); // NOI18N
        getContentPane().add(boderInp1);
        boderInp1.setBounds(370, 260, 1210, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Port");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 380, 460, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Service");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1210, 380, 460, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Protocol");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(740, 376, 470, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/A003.png"))); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(281, 370, 1389, 80);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(model);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setEnabled(false);
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 410, 1390, 570);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/border02.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 400, 1410, 590);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 420, 1390, 560);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UI u = new UI();
        u.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void inPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPActionPerformed

    private void inPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inPKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.renderPort();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_inPKeyPressed

    private void inP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inP1ActionPerformed

    private void inP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inP1KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.renderPort();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_inP1KeyPressed

    private void inP2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inP2KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.renderPort();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_inP2KeyPressed
    private void renderPort() {
        String IP = inP.getText();
        String start = inP1.getText();
        String end = inP2.getText();
        if(Math.abs(Integer.parseInt(start) - Integer.parseInt(end)) > 500)
        {
            JOptionPane.showMessageDialog(null, "Giới hạn là 500 port");
            return;
        }
        Client cli = new Client("localhost",8000,100000);
        JSONObject result = cli.getPortOpen(IP + ":" + start + ":" + end);
        if(result.get("success").toString().equals("false"))
        {
            JOptionPane.showMessageDialog(null, "Không thể quét ip này");
            return;
        }
        JSONArray data = (JSONArray) result.get("data");
        model.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            JSONObject ob = (JSONObject) data.get(i);
            model.addRow(new Object[]{ob.get("port").toString(), ob.get("protocol").toString(), ob.get("service").toString()});
        }
    }   
    private void inP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inP2ActionPerformed

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
            java.util.logging.Logger.getLogger(cPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cPort().setVisible(true);
            }
        });
    }
    private DefaultTableModel model = new DefaultTableModel(); 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton back;
    private javax.swing.JLabel boderInp1;
    private javax.swing.JLabel imgBack;
    private javax.swing.JLabel imgTitle;
    private javax.swing.JTextField inP;
    private javax.swing.JTextField inP1;
    private javax.swing.JTextField inP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtINP;
    // End of variables declaration//GEN-END:variables
}
