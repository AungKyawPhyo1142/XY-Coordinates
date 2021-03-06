/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xy.coordinates;

/**
 *
 * @author Lenovo
 */

import javax.swing.*;
import java.awt.*;

public class Help extends javax.swing.JFrame {

boolean subP = false;
    
    public Help() {
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

        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        xyPlane = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        inputdrawPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        xyPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        welcomePanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(62, 54, 54));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_window_20px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        menuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 30, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 238, 163));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manual_20px.png"))); // NOI18N
        jLabel3.setText("USER MANUAL");
        menuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        mainPanel.setBackground(new java.awt.Color(89, 105, 125));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subPanel.setBackground(new java.awt.Color(128, 128, 128));
        subPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xyPlane.setBackground(new java.awt.Color(59, 70, 83));
        xyPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xyPlaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xyPlaneMouseExited(evt);
            }
        });
        xyPlane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(252, 245, 184));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("X-Y Plane");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        xyPlane.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 130, 40));

        subPanel.add(xyPlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, 40));

        inputdrawPanel.setBackground(new java.awt.Color(59, 70, 83));
        inputdrawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputdrawPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inputdrawPanelMouseExited(evt);
            }
        });
        inputdrawPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(252, 245, 184));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Input & Draw");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        inputdrawPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 130, 40));

        subPanel.add(inputdrawPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 40));

        subPanel.setVisible(false);

        mainPanel.add(subPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 620));

        menu.setBackground(new java.awt.Color(59, 70, 83));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_20px.png"))); // NOI18N
        menuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLabelMouseClicked(evt);
            }
        });
        menu.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, -1));

        mainPanel.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 620));

        xyPanel.setBackground(new java.awt.Color(89, 105, 125));
        xyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(252, 245, 184));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("plane.");
        xyPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xy.png"))); // NOI18N
        xyPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(252, 245, 184));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("The X-Y Coordinate Plane");
        xyPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(252, 245, 184));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("When you hit DRAW button, the inputted points will be drawn on this");
        xyPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        xyPanel.setVisible(false);

        mainPanel.add(xyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 620, 650));

        inputPanel.setBackground(new java.awt.Color(89, 105, 125));
        inputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(252, 245, 184));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 245, 184));
        jLabel2.setText("points which have been drawn.");
        inputPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 440, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/drawsection.png"))); // NOI18N
        inputPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel6.setBackground(new java.awt.Color(252, 245, 184));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 245, 184));
        jLabel6.setText("The Draw Section");
        inputPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 20));

        jLabel7.setBackground(new java.awt.Color(252, 245, 184));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 245, 184));
        jLabel7.setText("In this section, all you have to do is");
        inputPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 290, 20));

        jLabel8.setBackground(new java.awt.Color(252, 245, 184));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(252, 245, 184));
        jLabel8.setText("enter the x and y coordinates in the");
        inputPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 290, 20));
        inputPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 620, 10));

        jLabel9.setBackground(new java.awt.Color(252, 245, 184));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(252, 245, 184));
        jLabel9.setText("The Input Section");
        inputPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cap1.PNG"))); // NOI18N
        inputPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/drawsection.png"))); // NOI18N
        inputPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel12.setBackground(new java.awt.Color(252, 245, 184));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(252, 245, 184));
        jLabel12.setText("respective fields and click SUBMIT.");
        inputPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 290, 20));

        jLabel13.setBackground(new java.awt.Color(252, 245, 184));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(252, 245, 184));
        jLabel13.setText("After clicking submit,the points will be displayed in");
        inputPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 440, 20));

        jLabel14.setBackground(new java.awt.Color(252, 245, 184));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(252, 245, 184));
        jLabel14.setText("this area.Click the draw button and the point will be");
        inputPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 440, 20));

        jLabel15.setBackground(new java.awt.Color(252, 245, 184));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(252, 245, 184));
        jLabel15.setText("drawn on the x-y coordinates plane.");
        inputPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 440, 20));

        jLabel16.setBackground(new java.awt.Color(252, 245, 184));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(252, 245, 184));
        jLabel16.setText("Clear button will clear all the fields including the");
        inputPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 440, 20));

        inputPanel.setVisible(false);

        mainPanel.add(inputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 620, 620));

        welcomePanel.setBackground(new java.awt.Color(89, 105, 125));
        welcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomePanel1.setBackground(new java.awt.Color(89, 105, 125));
        welcomePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Introduction\n---------------\n\n\tThis program designed mostly for students to make easier in their mathematical problems.We also make it easier to use and keep the interface simple.\n\n\tProgram consists of 2 parts : inputting the values (x and y coordinates) and ofcourse drawing these values into x-y graph.\n\n\tPlease click the \"MENU BUTTON\" at the top-right corner for more detail informations and take a tour.\n\n\tThank you for using this application.\n\n\t\t\tSincerely,\n\t\t\t          AungKyawPhyo\n\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        welcomePanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 580, 490));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 238, 163));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome from the XY Coordinate System");
        welcomePanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 60));

        welcomePanel.add(welcomePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 620, 620));

        mainPanel.add(welcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 620));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 650, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        this.setVisible(false);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void menuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseClicked

        if (subP) { subPanel.setVisible(true); subP=false; }
        else      { subPanel.setVisible(false); subP=true; }
    }//GEN-LAST:event_menuLabelMouseClicked

    private void inputdrawPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputdrawPanelMouseEntered

        inputdrawPanel.setBackground(new Color(89,105,125));
        
    }//GEN-LAST:event_inputdrawPanelMouseEntered

    private void inputdrawPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputdrawPanelMouseExited

        inputdrawPanel.setBackground(new Color(59,70,83));
        
    }//GEN-LAST:event_inputdrawPanelMouseExited

    private void xyPlaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xyPlaneMouseEntered

        xyPlane.setBackground(new Color(89,105,125));

    }//GEN-LAST:event_xyPlaneMouseEntered

    private void xyPlaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xyPlaneMouseExited

        xyPlane.setBackground(new Color(59,70,83));

    }//GEN-LAST:event_xyPlaneMouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked

        inputPanel.setVisible(true);
        xyPanel.setVisible(false);
        welcomePanel.setVisible(false);
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked

        inputPanel.setVisible(false);
        xyPanel.setVisible(true);
        welcomePanel.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        inputdrawPanel.setBackground(new Color(89,105,125));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        inputdrawPanel.setBackground(new Color(59,70,83));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        xyPlane.setBackground(new Color(89,105,125));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        xyPlane.setBackground(new Color(59,70,83));
    }//GEN-LAST:event_jLabel21MouseExited

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel inputdrawPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel subPanel;
    private javax.swing.JPanel welcomePanel;
    private javax.swing.JPanel welcomePanel1;
    private javax.swing.JPanel xyPanel;
    private javax.swing.JPanel xyPlane;
    // End of variables declaration//GEN-END:variables
}
