// Douglas Aparecido Barbosa RA: 2668639

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FazerPedido extends javax.swing.JFrame {

    private Cliente cliente;
    private Produto produto;
    private Servicos servico;
    private GerPedido gerPedido = new GerPedido();
    
    private static FazerPedido fazerPedido;
    
    private FazerPedido() {
        initComponents();
    }
    
    public static FazerPedido getFazerPedido() {
        if (fazerPedido == null) {
            fazerPedido = new FazerPedido();
        }
        return fazerPedido;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btFazPedido = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        lblServico = new javax.swing.JLabel();
        cbServicos = new javax.swing.JComboBox<>();
        lblProduto = new javax.swing.JLabel();
        cbProdutos = new javax.swing.JComboBox<>();
        btAbreControlePed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btFazPedido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btFazPedido.setText("Realizar Pedido");
        btFazPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFazPedidoActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNome.setText("NOME:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail.setText("EMAIL:");

        lblServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblServico.setText("SERVIÇO:");

        cbServicos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbServicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA UM SERVIÇO", "AVALIAÇÃO GERAL", "CONFIGURAÇÃO", "REPARO" }));
        cbServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServicosActionPerformed(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblProduto.setText("PRODUTO:");

        cbProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA UM PRODUTO", "COMPUTADOR", "NOTEBOOK", "TABLET", "CELULAR" }));

        btAbreControlePed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btAbreControlePed.setText("Controle de Pedido");
        btAbreControlePed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbreControlePedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btFazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAbreControlePed, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblServico)
                                .addGap(18, 18, 18)
                                .addComponent(cbServicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctEmail)
                            .addComponent(ctNome))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServico)
                    .addComponent(cbServicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbProdutos)
                    .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFazPedido)
                    .addComponent(btAbreControlePed))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btFazPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFazPedidoActionPerformed
        fazerPed();
    }//GEN-LAST:event_btFazPedidoActionPerformed

    private void cbServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbServicosActionPerformed

    private void btAbreControlePedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbreControlePedActionPerformed
        ControlePedido.getcontrolPedido().setVisible(true);
    }//GEN-LAST:event_btAbreControlePedActionPerformed
    
    public void fazerPed() {
        cliente = new Cliente();
        produto = new Produto();
        
        try {
            cliente.setName(ctNome.getText());
            cliente.setEmail(ctEmail.getText());
            
            String servicoSelecionado = cbServicos.getSelectedItem().toString();
            if (servicoSelecionado.equalsIgnoreCase("Escolha um serviço")) {
                JOptionPane.showMessageDialog(null, "Por favor, escolha um serviço", "Serviço não escolhido", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (servicoSelecionado.equalsIgnoreCase("Avaliação Geral")) {
                    servico = new AvaliacaoGeral();
                    servico.setValorServico(50.0);
                    servico.setServicoEscolhido("Avaliação Geral");
                }
                else if (servicoSelecionado.equalsIgnoreCase("Configuração")) {
                    servico = new Configuracao();
                    servico.setValorServico(30.0);
                    servico.setServicoEscolhido("Configuração");
                }
                else if (servicoSelecionado.equalsIgnoreCase("Reparo")) {
                    servico = new Reparo();
                    servico.setValorServico(70.0);
                    servico.setServicoEscolhido("Reparo");
                }
                servico.setCliente(cliente);
                
                String resultado = cbProdutos.getSelectedItem().toString();
                String produtoSelecionado = resultado.substring(0, 1).toUpperCase() + resultado.substring(1).toLowerCase();
            
                if (produtoSelecionado.equalsIgnoreCase("Escolha um produto")) {
                    JOptionPane.showMessageDialog(null, "Escolha um produto", "Produto não escolhido", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    if (produtoSelecionado.equalsIgnoreCase("Computador")) {
                        produto.setNome(produtoSelecionado);
                    produto.setTaxaServicoProduto(50.0);
                    }
                    else if (produtoSelecionado.equalsIgnoreCase("Notebook")) {
                        produto.setNome(produtoSelecionado);
                        produto.setTaxaServicoProduto(40.0);
                    }
                    else if (produtoSelecionado.equalsIgnoreCase("Tablet")) {
                        produto.setNome(produtoSelecionado);
                        produto.setTaxaServicoProduto(30.0);
                    }
                    else if (produtoSelecionado.equalsIgnoreCase("Celular")) {
                        produto.setNome(produtoSelecionado);
                        produto.setTaxaServicoProduto(20.0);
                    }
                
                    servico.setProduto(produto);

                    servico = gerPedido.fazerPedido(servico);

                    if (servico != null) {
                        JOptionPane.showMessageDialog(null, "Pedido efetuado com sucesso", "Cadastro OK", JOptionPane.INFORMATION_MESSAGE);
                        limpar();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Já existe pessoa com este E-mail", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
                        ctEmail.setText("");
                        ctEmail.requestFocus();
                    }
            }
          }
                            
        }   
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de digitação", "Erro na entrada", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de entrada", "Erro na entrada", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void limpar() {
        ctNome.setText("");
        ctEmail.setText("");
        cbServicos.setSelectedIndex(0);
        cbProdutos.setSelectedIndex(0);
        ctNome.requestFocus();
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
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FazerPedido().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbreControlePed;
    private javax.swing.JButton btFazPedido;
    private javax.swing.JComboBox<String> cbProdutos;
    private javax.swing.JComboBox<String> cbServicos;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctNome;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblServico;
    // End of variables declaration//GEN-END:variables
}
