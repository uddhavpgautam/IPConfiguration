package IPConfiguration;

import java.awt.Color;
import java.net.SocketException;

public class IPConfigurationPanel extends javax.swing.JPanel {

    public IPConfigurationPanel() throws SocketException {
        initComponents();
        networkInterfaceList.addItem(null);
        ListUpNets LUN = new ListUpNets();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IPV4 = new javax.swing.JButton();
        IPV6 = new javax.swing.JButton();
        networkInterfaceList = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        try {
            iPV41 = new IPConfiguration.IPV4();
        } catch (java.net.SocketException e1) {
            e1.printStackTrace();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
        try {
            iPV61 = new IPConfiguration.IPV6();
        } catch (java.net.SocketException e1) {
            e1.printStackTrace();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        IPV4.setText("IPV4");
        IPV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPV4ActionPerformed(evt);
            }
        });

        IPV6.setText("IPV6");
        IPV6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPV6ActionPerformed(evt);
            }
        });

        networkInterfaceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkInterfaceListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(IPV4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(IPV6)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(networkInterfaceList, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IPV4)
                    .addComponent(IPV6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(networkInterfaceList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.CardLayout());
        jPanel2.add(iPV41, "card2");
        jPanel2.add(iPV61, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IPV6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPV6ActionPerformed
        jPanel2.add(iPV41);
        IPV6.setBackground(Color.green);
//        Color col = "#E3E5E9";
        IPV4.setBackground(Color.gray);
    }//GEN-LAST:event_IPV6ActionPerformed

    private void IPV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPV4ActionPerformed
        jPanel2.add(iPV61);
        IPV4.setBackground(Color.green);
        IPV6.setBackground(Color.gray);
    }//GEN-LAST:event_IPV4ActionPerformed

    private void networkInterfaceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkInterfaceListActionPerformed

    }//GEN-LAST:event_networkInterfaceListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IPV4;
    private javax.swing.JButton IPV6;
    private IPConfiguration.IPV4 iPV41;
    private IPConfiguration.IPV6 iPV61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JComboBox networkInterfaceList;
    // End of variables declaration//GEN-END:variables
}
