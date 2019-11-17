
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
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

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

        txtTitle = new javax.swing.JLabel();
        imgTitle = new javax.swing.JLabel();
        txtINP = new javax.swing.JLabel();
        khungtxtINP = new javax.swing.JLabel();
        inP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        imgBack = new javax.swing.JLabel();
        INPCountry = new javax.swing.JLabel();
        INPIP = new javax.swing.JLabel();
        INPReg = new javax.swing.JLabel();
        INPLong = new javax.swing.JLabel();
        INPzip = new javax.swing.JLabel();
        INPDomain = new javax.swing.JLabel();
        INPLa = new javax.swing.JLabel();
        INPCity = new javax.swing.JLabel();
        txtZip = new javax.swing.JLabel();
        txtIP = new javax.swing.JLabel();
        txtRegion = new javax.swing.JLabel();
        txtCity = new javax.swing.JLabel();
        txtDomain = new javax.swing.JLabel();
        txtLatitude = new javax.swing.JLabel();
        txtLongitude = new javax.swing.JLabel();
        txtCountry = new javax.swing.JLabel();
        khung1 = new javax.swing.JLabel();
        khung12 = new javax.swing.JLabel();
        khung2 = new javax.swing.JLabel();
        khung22 = new javax.swing.JLabel();
        txtISP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        INPisp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Xác định vị trí");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        txtTitle.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Xác định vị trí IP");
        getContentPane().add(txtTitle);
        txtTitle.setBounds(760, 40, 430, 60);

        imgTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.png"))); // NOI18N
        getContentPane().add(imgTitle);
        imgTitle.setBounds(340, -10, 1090, 210);

        txtINP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtINP.setForeground(new java.awt.Color(255, 255, 255));
        txtINP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtINP.setText("Nhập IP: ");
        txtINP.setToolTipText("");
        getContentPane().add(txtINP);
        txtINP.setBounds(390, 190, 230, 70);

        khungtxtINP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/txtInpCity.png"))); // NOI18N
        getContentPane().add(khungtxtINP);
        khungtxtINP.setBounds(290, 190, 450, 80);

        inP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
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
        inP.setBounds(720, 197, 760, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/border.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 190, 1280, 80);

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

        INPCountry.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPCountry);
        INPCountry.setBounds(100, 410, 430, 60);

        INPIP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPIP);
        INPIP.setBounds(530, 410, 430, 60);

        INPReg.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPReg);
        INPReg.setBounds(960, 410, 430, 60);

        INPLong.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPLong);
        INPLong.setBounds(1390, 570, 430, 60);

        INPzip.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        INPzip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(INPzip);
        INPzip.setBounds(100, 570, 430, 60);

        INPDomain.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPDomain);
        INPDomain.setBounds(530, 570, 430, 60);

        INPLa.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPLa);
        INPLa.setBounds(960, 570, 430, 60);

        INPCity.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(INPCity);
        INPCity.setBounds(1390, 410, 430, 60);

        txtZip.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtZip.setForeground(new java.awt.Color(255, 255, 255));
        txtZip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtZip.setText("Mã Bưu Điện");
        getContentPane().add(txtZip);
        txtZip.setBounds(100, 500, 430, 70);

        txtIP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtIP.setForeground(new java.awt.Color(255, 255, 255));
        txtIP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIP.setText("Địa Chỉ IP");
        getContentPane().add(txtIP);
        txtIP.setBounds(530, 340, 430, 70);

        txtRegion.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtRegion.setForeground(new java.awt.Color(255, 255, 255));
        txtRegion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegion.setText("Khu Vực");
        getContentPane().add(txtRegion);
        txtRegion.setBounds(960, 340, 430, 70);

        txtCity.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtCity.setForeground(new java.awt.Color(255, 255, 255));
        txtCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCity.setText("Thành Phố");
        getContentPane().add(txtCity);
        txtCity.setBounds(1390, 340, 430, 70);

        txtDomain.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtDomain.setForeground(new java.awt.Color(255, 255, 255));
        txtDomain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDomain.setText("Tên Miền");
        getContentPane().add(txtDomain);
        txtDomain.setBounds(530, 500, 430, 70);

        txtLatitude.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtLatitude.setForeground(new java.awt.Color(255, 255, 255));
        txtLatitude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLatitude.setText("Vĩ Độ");
        getContentPane().add(txtLatitude);
        txtLatitude.setBounds(960, 500, 430, 70);

        txtLongitude.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtLongitude.setForeground(new java.awt.Color(255, 255, 255));
        txtLongitude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLongitude.setText("Kinh Độ");
        getContentPane().add(txtLongitude);
        txtLongitude.setBounds(1390, 500, 430, 70);

        txtCountry.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtCountry.setForeground(new java.awt.Color(255, 255, 255));
        txtCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCountry.setText("Quốc Gia");
        getContentPane().add(txtCountry);
        txtCountry.setBounds(100, 340, 430, 70);

        khung1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/B.png"))); // NOI18N
        getContentPane().add(khung1);
        khung1.setBounds(90, 330, 1740, 86);

        khung12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/B1.png"))); // NOI18N
        getContentPane().add(khung12);
        khung12.setBounds(90, 410, 1740, 80);

        khung2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/B.png"))); // NOI18N
        getContentPane().add(khung2);
        khung2.setBounds(90, 490, 1740, 86);

        khung22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/B1.png"))); // NOI18N
        getContentPane().add(khung22);
        khung22.setBounds(90, 570, 1740, 80);

        txtISP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtISP.setForeground(new java.awt.Color(255, 255, 255));
        txtISP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtISP.setText("isp");
        getContentPane().add(txtISP);
        txtISP.setBounds(800, 650, 340, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/txtisp.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 650, 860, 70);

        INPisp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        INPisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(INPisp);
        INPisp.setBounds(530, 720, 860, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/B1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 720, 860, 80);

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
            String ip = ((javax.swing.JTextField) evt.getSource()).getText();
            Client cli = new Client();
            JSONObject IP = cli.getIPLocation(ip);
            Object longitude = IP.get("longitude");
            Object latitude = IP.get("latitude");
            Object address = IP.get("");
            Object city = IP.get("city_name");
            Object isp = IP.get("isp");
            Object domain = IP.get("domain");
            Object countryname = IP.get("country_name");
            Object regionname = IP.get("region_name");
            Object zipcode = IP.get("zip_code");
            
            System.out.println(countryname);
            INPIP.setText(ip);
            INPCountry.setText(countryname.toString());
            System.out.println(city);
            INPCity.setText(city.toString());
            System.out.println(regionname);
            INPReg.setText(regionname.toString());
            System.out.println(zipcode);
            INPzip.setText(zipcode.toString());
            System.out.println(domain);
            INPDomain.setText(domain.toString());
            System.out.println(latitude);
            INPLa.setText(latitude.toString());
            System.out.println(longitude);
            INPLong.setText(longitude.toString());
            System.out.println();
            INPisp.setText(isp.toString());
            
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
    private javax.swing.JLabel INPCity;
    private javax.swing.JLabel INPCountry;
    private javax.swing.JLabel INPDomain;
    private javax.swing.JLabel INPIP;
    private javax.swing.JLabel INPLa;
    private javax.swing.JLabel INPLong;
    private javax.swing.JLabel INPReg;
    private javax.swing.JLabel INPisp;
    private javax.swing.JLabel INPzip;
    private javax.swing.JButton back;
    private javax.swing.JLabel imgBack;
    private javax.swing.JLabel imgTitle;
    private javax.swing.JTextField inP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel khung1;
    private javax.swing.JLabel khung12;
    private javax.swing.JLabel khung2;
    private javax.swing.JLabel khung22;
    private javax.swing.JLabel khungtxtINP;
    private javax.swing.JLabel txtCity;
    private javax.swing.JLabel txtCountry;
    private javax.swing.JLabel txtDomain;
    private javax.swing.JLabel txtINP;
    private javax.swing.JLabel txtIP;
    private javax.swing.JLabel txtISP;
    private javax.swing.JLabel txtLatitude;
    private javax.swing.JLabel txtLongitude;
    private javax.swing.JLabel txtRegion;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtZip;
    // End of variables declaration//GEN-END:variables
}
