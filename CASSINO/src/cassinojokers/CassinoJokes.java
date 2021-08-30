package cassinojokers;

import javax.swing.JOptionPane;


public class CassinoJokes extends javax.swing.JFrame {

   
    
    private String nome;
    private int valor_entrada;
    private int qtd_100_basks;
    private int qtd_500_basks;
    private int qtd_1000_basks;
    private int troco;
    int qtd_basks;
    
    public CassinoJokes() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome_campo = new javax.swing.JTextField();
        entrada_campo = new javax.swing.JTextField();
        botao_100_basks = new javax.swing.JButton();
        botao_500_basks = new javax.swing.JButton();
        botao_1000_basks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cassino Jokes");

        jLabel2.setText("Nome:");

        jLabel3.setText("Valor de entrada:");

        nome_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_campoActionPerformed(evt);
            }
        });

        entrada_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrada_campoActionPerformed(evt);
            }
        });

        botao_100_basks.setText("100 Basks");
        botao_100_basks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_100_basksActionPerformed(evt);
            }
        });

        botao_500_basks.setText("500 Basks");
        botao_500_basks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_500_basksActionPerformed(evt);
            }
        });

        botao_1000_basks.setText("1000 Basks");
        botao_1000_basks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_1000_basksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botao_100_basks)
                        .addGap(20, 20, 20)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nome_campo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entrada_campo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao_500_basks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(botao_1000_basks)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entrada_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_100_basks, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_500_basks, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_1000_basks, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }

    private void nome_campoActionPerformed(java.awt.event.ActionEvent evt) {
        nome = nome_campo.getText();
    }

    private void entrada_campoActionPerformed(java.awt.event.ActionEvent evt) {
        valor_entrada = Integer.parseInt(entrada_campo.getText());
    }

    private void botao_100_basksActionPerformed(java.awt.event.ActionEvent evt) {
        chamaJogos(100);
        qtd_100_basks = qtd_basks;
    }

    private void botao_500_basksActionPerformed(java.awt.event.ActionEvent evt) {
        chamaJogos(500);
        qtd_500_basks = qtd_basks;
    }

    private void botao_1000_basksActionPerformed(java.awt.event.ActionEvent evt) {
        chamaJogos(1000);
        qtd_1000_basks = qtd_basks;
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
            java.util.logging.Logger.getLogger(CassinoJokes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CassinoJokes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CassinoJokes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CassinoJokes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CassinoJokes().setVisible(true);
            }
        });
    }
    
    public void chamaJogos(int valor_ficha){
        nome = nome_campo.getText();
        valor_entrada = Integer.parseInt(entrada_campo.getText());
        qtd_basks = valor_entrada/valor_ficha;
        troco = valor_entrada - (qtd_basks*valor_ficha);
        JOptionPane.showMessageDialog(null, "Você adquiriu " + qtd_basks + " fichas de " + valor_ficha + " basks e seu troco é R$" + troco + ",00");
        MenuJogos frame = new MenuJogos();
        frame.setVisible(true);
    }

    
    private javax.swing.JButton botao_1000_basks;
    private javax.swing.JButton botao_100_basks;
    private javax.swing.JButton botao_500_basks;
    private javax.swing.JTextField entrada_campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nome_campo;
    
}
