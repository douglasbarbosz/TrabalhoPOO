// Douglas Aparecido Barbosa RA: 2268639

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlePedido extends javax.swing.JFrame {

    private Cliente cliente;
    private Servicos servico;
    private GerPedido gerPedido = new GerPedido();
    
    private static ControlePedido controlPedido;
    
    private ControlePedido() {
        initComponents();
    }
    
    public static ControlePedido getcontrolPedido() {
        if (controlPedido == null) {
            controlPedido = new ControlePedido();
        }
        return controlPedido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        btAtualizaDados = new javax.swing.JButton();
        btCancelarPed = new javax.swing.JButton();
        btConsultarDados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNome.setText("NOME:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail.setText("EMAIL:");

        btAtualizaDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btAtualizaDados.setText("Atualizar Dados");
        btAtualizaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizaDadosActionPerformed(evt);
            }
        });

        btCancelarPed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btCancelarPed.setText("Cancelar Pedido");
        btCancelarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarPedActionPerformed(evt);
            }
        });

        btConsultarDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btConsultarDados.setText("Consultar Dados");
        btConsultarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarDadosActionPerformed(evt);
            }
        });

        tblPedido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOME", "EMAIL", "SERVIÇO", "PRODUTO", "PREÇO TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tblPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctNome)
                            .addComponent(ctEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultarDados)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelarPed))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultarDados)
                    .addComponent(btAtualizaDados)
                    .addComponent(btCancelarPed))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarPedActionPerformed
        cancelar();
    }//GEN-LAST:event_btCancelarPedActionPerformed

    private void btConsultarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarDadosActionPerformed
        consultarDados();
    }//GEN-LAST:event_btConsultarDadosActionPerformed

    private void btAtualizaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizaDadosActionPerformed
        atualizarDados();
    }//GEN-LAST:event_btAtualizaDadosActionPerformed

    public void cancelar() {
    cliente = new Cliente();
    servico = new Servicos();

    try {
        cliente.setEmail(ctEmail.getText());

        servico = gerPedido.consultaPedido(cliente);

        if (servico != null) {
            ctEmail.setText(servico.getCliente().getEmail());
            ctNome.setText(servico.getCliente().getName());
            int x = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar esse pedido?", "Cancelamento", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                gerPedido.cancelaPedido(servico); 
                JOptionPane.showMessageDialog(null, "Pedido cancelado", "Cancelamento de pedido", JOptionPane.INFORMATION_MESSAGE);
                limpar();        
                listarTab();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe nenhum pedido com esse E-mail para ser cancelado", "Sem pedidos", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, "O E-mail contém letras", "Erro de E-mail", JOptionPane.ERROR_MESSAGE);
        limpar();
    }
}
    
    public void consultarDados() {
        cliente = new Cliente();
        servico = new Servicos();
        
        try {
            cliente.setEmail(ctEmail.getText());
        
            servico = gerPedido.consultaPedido(cliente);
        
            if (servico != null) {
                ctEmail.setText(servico.getCliente().getEmail());
                ctNome.setText(servico.getCliente().getName());
                JOptionPane.showMessageDialog(null, "Confirme os dados", "Confirmação de dados", JOptionPane.INFORMATION_MESSAGE);
                limpar();
                listarTab();
            }
            else {
                JOptionPane.showMessageDialog(null, "Não existe ninguém com esse E-mail", "Negação de Dados", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O E-mail é inválido", "Erro de E-mail", JOptionPane.ERROR_MESSAGE);
            ctEmail.setText("");
            ctEmail.requestFocus();
        }
    }
    
    public void atualizarDados() {
        cliente = new Cliente();
        servico = new Servicos();
        
        try {
            cliente.setEmail(ctEmail.getText());
            servico.setCliente(cliente);
            servico = gerPedido.atualizaPedido(servico);
        
            if (servico != null) {
                ctEmail.setText(servico.getCliente().getEmail());
                ctNome.setText(servico.getCliente().getName());
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso", "Confirmação de atualização de dados", JOptionPane.INFORMATION_MESSAGE);
                limpar();
                listarTab();
            }
            else {
                JOptionPane.showMessageDialog(null, "Não existe ninguém com esse E-mail", "Negando o CPF", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O E-mail é inválido", "Erro de E-mail", JOptionPane.ERROR_MESSAGE);
            ctEmail.setText("");
            ctEmail.requestFocus();
        }
    }
    
    public void listarTab() {
        DefaultTableModel modelo = (DefaultTableModel) tblPedido.getModel();
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for (Servicos serv : gerPedido.getBdPedidos()) {
            if (serv instanceof AvaliacaoGeral) {
                modelo.insertRow(posLin, new Object [] {serv.getCliente().getName(), serv.getCliente().getEmail(), serv.getServicoEscolhido(), serv.getProduto().getNome(), "R$ " + String.format("%.2f",((AvaliacaoGeral) serv).precoFinal())});
            } else if (serv instanceof Configuracao) {
                modelo.insertRow(posLin, new Object [] {serv.getCliente().getName(), serv.getCliente().getEmail(), serv.getServicoEscolhido(), serv.getProduto().getNome(), "R$ " + String.format("%.2f",((Configuracao) serv).precoFinal())});
            } else if (serv instanceof Reparo) {
                modelo.insertRow(posLin, new Object [] {serv.getCliente().getName(), serv.getCliente().getEmail(), serv.getServicoEscolhido(), serv.getProduto().getNome(), "R$ " + String.format("%.2f",((Reparo) serv).precoFinal())});
            }
            posLin++;
        }
    }
    
    public void limpar() {
        ctNome.setText("");
        ctEmail.setText("");
        ctEmail.requestFocus();
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
            java.util.logging.Logger.getLogger(ControlePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlePedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizaDados;
    private javax.swing.JButton btCancelarPed;
    private javax.swing.JButton btConsultarDados;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblPedido;
    // End of variables declaration//GEN-END:variables
}
