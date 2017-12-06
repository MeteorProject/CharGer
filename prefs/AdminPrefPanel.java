/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charger.prefs;

import charger.Global;
import charger.layout.SpringGraphLayout;
import charger.obj.Graph;
import charger.obj.GraphObject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

/**
 *
 * @author hsd
 */
public class AdminPrefPanel extends javax.swing.JPanel {

     int matchingStrategyDisplayWidth = 280;
    
    
    /**
     * Creates new form CompatibilityPrefPanel
     */
    public AdminPrefPanel() {
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

        ShowBoringDebugInfo = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        numIterationsField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        ShowBoringDebugInfo.setBackground(new java.awt.Color(255, 255, 255));
        ShowBoringDebugInfo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ShowBoringDebugInfo.setSelected(Global.ShowBoringDebugInfo);
        ShowBoringDebugInfo.setText("Show internal info (boring)");
        ShowBoringDebugInfo.setToolTipText("Show some boring debug information");
        ShowBoringDebugInfo.setOpaque(true);
        ShowBoringDebugInfo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ShowBoringDebugInfoItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(BorderFactory.createTitledBorder( Global.BeveledBorder,
            "Spring Layout Parameters", TitledBorder.LEFT,
            TitledBorder.TOP, new Font( "SansSerif", Font.BOLD + Font.ITALIC, 11 ), Color.black ));

    numIterationsField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    numIterationsField.setText(Global.springLayoutMaxIterations + "");
    numIterationsField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            numIterationsFieldActionPerformed(evt);
        }
    });

    jLabel1.setText("Number of iterations:");

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(jPanel1Layout.createSequentialGroup()
            .add(35, 35, 35)
            .add(jLabel1)
            .add(28, 28, 28)
            .add(numIterationsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(36, 36, 36))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(jPanel1Layout.createSequentialGroup()
            .add(14, 14, 14)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(numIterationsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLabel1))
            .addContainerGap(92, Short.MAX_VALUE))
    );

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(layout.createSequentialGroup()
            .add(26, 26, 26)
            .add(ShowBoringDebugInfo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 38, Short.MAX_VALUE)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(82, 82, 82))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(layout.createSequentialGroup()
            .add(32, 32, 32)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(ShowBoringDebugInfo))
            .addContainerGap(366, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    }//GEN-LAST:event_formComponentShown

    private void ShowBoringDebugInfoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ShowBoringDebugInfoItemStateChanged
        if ( evt.getStateChange() == ItemEvent.SELECTED ) {
            Global.ShowBoringDebugInfo = true;
        } else {
            Global.ShowBoringDebugInfo = false;
        }
    }//GEN-LAST:event_ShowBoringDebugInfoItemStateChanged

    private void numIterationsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numIterationsFieldActionPerformed
        Global.springLayoutMaxIterations= PreferencesFrame.getNonNegativeIntFromField( numIterationsField, 5000 );

    }//GEN-LAST:event_numIterationsFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox ShowBoringDebugInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numIterationsField;
    // End of variables declaration//GEN-END:variables
}
