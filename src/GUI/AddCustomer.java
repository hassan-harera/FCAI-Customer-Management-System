package GUI;

import DataBase.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddCustomer extends javax.swing.JFrame {

    private Connection con = null;

    public AddCustomer() {
        con = MyConnection.con();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jcustomerName = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jAdd = new javax.swing.JButton();
        jcustomerId = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jcancel = new javax.swing.JButton();
        jNationality = new javax.swing.JTextField();
        jPhone = new javax.swing.JTextField();
        jcustomerNationality = new javax.swing.JLabel();
        jcustomerPhone = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 202, 36));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Customer");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));

        jcustomerName.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jcustomerName.setForeground(new java.awt.Color(236, 240, 241));
        jcustomerName.setText("customer name:");

        jName.setBackground(new java.awt.Color(108, 122, 137));
        jName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(228, 241, 254));

        jAdd.setBackground(new java.awt.Color(34, 167, 240));
        jAdd.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jAdd.setForeground(new java.awt.Color(255, 255, 255));
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jcustomerId.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jcustomerId.setForeground(new java.awt.Color(236, 240, 241));
        jcustomerId.setText("customer id:");

        jId.setBackground(new java.awt.Color(108, 122, 137));
        jId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jId.setForeground(new java.awt.Color(228, 241, 254));
        jId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jIdKeyPressed(evt);
            }
        });

        jcancel.setBackground(new java.awt.Color(242, 38, 19));
        jcancel.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jcancel.setForeground(new java.awt.Color(255, 255, 255));
        jcancel.setText("Back");
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
            }
        });

        jNationality.setBackground(new java.awt.Color(108, 122, 137));
        jNationality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNationality.setForeground(new java.awt.Color(228, 241, 254));

        jPhone.setBackground(new java.awt.Color(108, 122, 137));
        jPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPhone.setForeground(new java.awt.Color(228, 241, 254));
        jPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPhoneKeyPressed(evt);
            }
        });

        jcustomerNationality.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jcustomerNationality.setForeground(new java.awt.Color(236, 240, 241));
        jcustomerNationality.setText("customer nationality:");

        jcustomerPhone.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jcustomerPhone.setForeground(new java.awt.Color(236, 240, 241));
        jcustomerPhone.setText("customer phone:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcustomerNationality)
                    .addComponent(jcustomerPhone)
                    .addComponent(jcustomerName)
                    .addComponent(jcustomerId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPhone)
                    .addComponent(jNationality, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jName)
                    .addComponent(jAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcancel, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcustomerId)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcustomerName)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcustomerNationality))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcustomerPhone))
                .addGap(18, 18, 18)
                .addComponent(jAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcancel)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        String name = jName.getText();
        String id = jId.getText();
        String phone = jPhone.getText();
        String nationality = jNationality.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a name");
        } else if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Add an id");
        } else if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a phone number");
        } else if (nationality.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a nationality");
        } else if (checkId(id)) {
            JOptionPane.showMessageDialog(null, "This id is already exists");
        } else {
            PreparedStatement ps;
            String query = "insert into customer VALUES (?,?,?,?,?,?);";
            try {
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(id));
                ps.setString(2, name);
                ps.setString(3, phone);
                ps.setString(4, nationality);
                ps.setInt(5, 0);
                ps.setInt(6, 0);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "New customer was inserted");
            } catch (SQLException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            new HomePage().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jAddActionPerformed

    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelActionPerformed
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jcancelActionPerformed

    private void jPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPhoneKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jPhone.setEditable(true);
        } else {
            jPhone.setEditable(false);
        }
    }//GEN-LAST:event_jPhoneKeyPressed

    private void jIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIdKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jId.setEditable(true);
        } else {
            jId.setEditable(false);
        }
    }//GEN-LAST:event_jIdKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JTextField jName;
    private javax.swing.JTextField jNationality;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPhone;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jcancel;
    private javax.swing.JLabel jcustomerId;
    private javax.swing.JLabel jcustomerName;
    private javax.swing.JLabel jcustomerNationality;
    private javax.swing.JLabel jcustomerPhone;
    // End of variables declaration//GEN-END:variables

    private boolean checkId(String id) {
        PreparedStatement ps;
        String query = "select id from customer where id=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(id));
            if (ps.executeQuery().next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
