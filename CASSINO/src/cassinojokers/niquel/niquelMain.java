package com.mycompany.niquel;

public class niquelMain extends javax.swing.JFrame {
    
    public int tries = 0;
    private String A,B,C;
    public Sorter sorter = new Sorter();;
    public int money = 500;
    
    public niquelMain() {
        initComponents();
        
            jLabel3.setText("Você possui: R$" + money );
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caça Niqueis");
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(60, 63, 65));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 120, 50, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Caça Niquel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 262, 46);

        jLabel2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/550861585787256833/871947704186601492/dime.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 80, 320, 260);

        jLabelA.setFont(jLabelA.getFont().deriveFont(jLabelA.getFont().getSize()+20f));
        jLabelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelA);
        jLabelA.setBounds(210, 180, 70, 90);

        jLabelB.setFont(jLabelB.getFont().deriveFont(jLabelB.getFont().getSize()+20f));
        jLabelB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelB);
        jLabelB.setBounds(280, 180, 70, 90);

        jLabelC.setFont(jLabelC.getFont().deriveFont(jLabelC.getFont().getSize()+20f));
        jLabelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelC);
        jLabelC.setBounds(350, 180, 60, 90);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 480, 300, 40);

        Message.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Message);
        Message.setBounds(0, 370, 660, 60);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Sair");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 480, 72, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(money >= 10){
            money -= 10;
            jLabel3.setText("Você possui: R$" + money );
            sorter.roll();
            setHouses();
            checkWin();
        }else{
            Message.setText("Você não possui a quantidadade minima para o cassino :(");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void checkWin(){
        switch(sorter.winState){
            case 0:
                Message.setText("3 cocôs, que pena :(");
            break;
            
            case 1:
                money += 210;
                Message.setText("3 cerejas, você ganhou R$500!");
            break;
            
            case 2:
                money += 1510;
                Message.setText("3 cifrões, você ganhou R$1.500!!");
            break;
            
            case 3:
                money += 5010;
                Message.setText("3 diamanetes, você ganhou R$5.000!!");
            break;
            
            case 4:
                Message.setText("");
            break;
        }
        
    }
    private void setHouses(){
        jLabelA.setText(sorter.a);
        jLabelB.setText(sorter.b);
        jLabelC.setText(sorter.c);
        //jLabel3.setText(Integer.toString(sorter.tries));
       
    }
    
    
   
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
            java.util.logging.Logger.getLogger(niquelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(niquelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(niquelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(niquelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new niquelMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    // End of variables declaration//GEN-END:variables
}
