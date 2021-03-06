/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

public class singleName extends javax.swing.JPanel {

    /**
     * Creates new form singleName
     */
    //constructor
    public singleName() {
        initComponents();
    }
    //variable
    public singlePlayer sp;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameBox = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        enterNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameBox.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });
        add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 163, -1));

        startButton.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        startButton.setText("Start");
        startButton.setBorder(null);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 163, -1));

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/home.png"))); // NOI18N
        homeButton.setToolTipText("");
        homeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        homeButton.setBorderPainted(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        enterNameLabel.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        enterNameLabel.setText("Enter Your Name");
        add(enterNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1417, 891));
        jLabel2.setMinimumSize(new java.awt.Dimension(1417, 891));
        jLabel2.setPreferredSize(new java.awt.Dimension(1417, 891));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 630));

        jButton1.setText("jButton1");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    //home button
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        QuizApp.frame.remove(this);
        mainPanel mp = new mainPanel();
        QuizApp.frame.add(mp);
        QuizApp.frame.revalidate();
        QuizApp.frame.repaint();
        
        
    }//GEN-LAST:event_homeButtonActionPerformed
    //name field
    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBoxActionPerformed
    //start button
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        sp =new singlePlayer(new Player(nameBox.getText()));
        QuizApp.frame.remove(this);
        QuizApp.frame.add(sp);
        QuizApp.frame.revalidate();
        QuizApp.frame.repaint();
    }//GEN-LAST:event_startButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterNameLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameBox;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
