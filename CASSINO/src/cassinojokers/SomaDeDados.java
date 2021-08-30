import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class SomaDeDados extends javax.swing.JFrame {
    
    private int soma, numRand, numRand2;
    private Random rand;
    private boolean b = false;
    
    public SomaDeDados() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Soma de Dados");

        jButton1.setText("Lançar Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\CassinoJokes\\img\\dado 1.png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(128, 128));
        jLabel2.setMinimumSize(new java.awt.Dimension(512, 512));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\CassinoJokes\\img\\dado 1.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(63, 63, 63))
        );

        pack();
    }

    private void lançarDados(){
        if (!b) {
            soma = 0;
            rand = new Random();
            numRand = (rand.nextInt(6) + 1);
        
            jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\CassinoJokes\\img\\dado " + String.valueOf(numRand) +".png")); // NOI18N

            numRand2 = (rand.nextInt(6) + 1);
        
            jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\CassinoJokes\\img\\dado " + String.valueOf(numRand2) +".png")); // NOI18N

            soma = numRand + numRand2;
        
            if (soma == 7 || soma == 11) {
                jLabel4.setText("Você venceu!");
                jLabel4.setForeground(new java.awt.Color(0, 204, 51));
            } else if (soma == 2 || soma == 3 || soma == 12) {
                jLabel4.setText("Você perdeu!");
                jLabel4.setForeground(new java.awt.Color(255, 0, 0));            
            } else {
                jLabel4.setText("Lance os dados novamente!");
                jLabel4.setForeground(new java.awt.Color(0, 0, 0));
                b = true;
            }
            System.out.println("numRand: " + numRand);
            System.out.println("numRand2: " + numRand2);
            System.out.println("soma: " + soma);
        } else {
            numRand = (rand.nextInt(6) + 1);
            
            jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\CassinoJokes\\img\\dado " + String.valueOf(numRand) +".png")); // NOI18N
            
            numRand2 = (rand.nextInt(6) + 1);
            
            jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\CassinoJokes\\img\\dado " + String.valueOf(numRand2) +".png")); // NOI18N
            
            soma = numRand + numRand2;
            
            if (soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10) {
                jLabel4.setText("Você venceu!");
                jLabel4.setForeground(new java.awt.Color(0, 204, 51));                
            } else {
                jLabel4.setText("Você perdeu!");
                jLabel4.setForeground(new java.awt.Color(255, 0, 0));                
            }
            
            b = false;            
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        lançarDados();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Se a soma do dados for 7 ou 11, você ganha.\nSe a soma for 2, 3 ou 12, você perde.\nSe a soma for 4, 5, 6, 8, 9 ou 10, você lança os dados novamente, se for um desses valores de novo você vence, se não, você perde.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SomaDeDados().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    
}