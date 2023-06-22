// Net Beans IDE 18
// Douglas Aparecido Barbosa RA: 2268639

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblConfiguracao = new javax.swing.JLabel();
        lblReparo = new javax.swing.JLabel();
        lblAvaliacaoGeral = new javax.swing.JLabel();
        lblServicos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mnBarPrin = new javax.swing.JMenuBar();
        mnGerPedido = new javax.swing.JMenu();
        mnAbreGerPedido = new javax.swing.JMenuItem();
        mnControlePedido = new javax.swing.JMenu();
        mnAbreControlePedido = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnFecharApp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Haettenschweiler", 0, 28)); // NOI18N
        lblTitulo.setText("LOJA DE MANUNTENÇÃO");

        lblConfiguracao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblConfiguracao.setText("Configuração");

        lblReparo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblReparo.setText("Reparo");

        lblAvaliacaoGeral.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblAvaliacaoGeral.setText("Avaliação Geral");

        lblServicos.setFont(new java.awt.Font("Source Sans Pro Black", 1, 20)); // NOI18N
        lblServicos.setText("Serviços:");

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Black", 1, 20)); // NOI18N
        jLabel2.setText("Trabalhamos com:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Computadores");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Notebooks");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Tablets");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Celulares");

        mnGerPedido.setText("Realizar Pedido");

        mnAbreGerPedido.setText("Abrir Gerador de Pedidos");
        mnAbreGerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAbreGerPedidoActionPerformed(evt);
            }
        });
        mnGerPedido.add(mnAbreGerPedido);

        mnBarPrin.add(mnGerPedido);

        mnControlePedido.setText("Controlar Pedido");

        mnAbreControlePedido.setText("Abrir Controle de Pedidos");
        mnAbreControlePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAbreControlePedidoActionPerformed(evt);
            }
        });
        mnControlePedido.add(mnAbreControlePedido);

        mnBarPrin.add(mnControlePedido);

        mnSair.setText("Sair");

        mnFecharApp.setText("Fechar Aplicação");
        mnFecharApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFecharAppActionPerformed(evt);
            }
        });
        mnSair.add(mnFecharApp);

        mnBarPrin.add(mnSair);

        setJMenuBar(mnBarPrin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServicos)
                            .addComponent(lblConfiguracao)
                            .addComponent(lblReparo)
                            .addComponent(lblAvaliacaoGeral))
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblServicos)
                                .addGap(12, 12, 12)
                                .addComponent(lblAvaliacaoGeral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConfiguracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReparo)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAbreGerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAbreGerPedidoActionPerformed
        FazerPedido.getFazerPedido().setVisible(true);
    }//GEN-LAST:event_mnAbreGerPedidoActionPerformed

    private void mnAbreControlePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAbreControlePedidoActionPerformed
        ControlePedido.getcontrolPedido().setVisible(true);
    }//GEN-LAST:event_mnAbreControlePedidoActionPerformed

    private void mnFecharAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFecharAppActionPerformed
        sair();
    }//GEN-LAST:event_mnFecharAppActionPerformed

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da aplicação?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAvaliacaoGeral;
    private javax.swing.JLabel lblConfiguracao;
    private javax.swing.JLabel lblReparo;
    private javax.swing.JLabel lblServicos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnAbreControlePedido;
    private javax.swing.JMenuItem mnAbreGerPedido;
    private javax.swing.JMenuBar mnBarPrin;
    private javax.swing.JMenu mnControlePedido;
    private javax.swing.JMenuItem mnFecharApp;
    private javax.swing.JMenu mnGerPedido;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
