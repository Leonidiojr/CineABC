package view;

import javax.swing.JOptionPane;

public class CadastroSalas extends javax.swing.JFrame {
    public CadastroSalas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        cadastroSalaLabelNumeroSala = new javax.swing.JLabel();
        cadastroSalaLabelNumeroColunas = new javax.swing.JLabel();
        cadastroSalaLabelNumeroLinhas = new javax.swing.JLabel();
        cadastroSalaLabelTitulo = new javax.swing.JLabel();
        cadastroSalaBtnSalvar = new javax.swing.JButton();
        cadastroSalaTextFieldNSala = new javax.swing.JTextField();
        cadastroSalaTextFieldNColunas = new javax.swing.JTextField();
        cadastroSalaTextFieldNLinhas = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastroSalaLabelNumeroSala.setText("N° da Sala");
        cadastroSalaLabelNumeroSala.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastroSalaLabelNumeroSala.setName(""); // NOI18N

        cadastroSalaLabelNumeroColunas.setText("N° de Colunas");

        cadastroSalaLabelNumeroLinhas.setText("N° de Linhas");

        cadastroSalaLabelTitulo.setText("Cadastro de Salas");

        cadastroSalaBtnSalvar.setText("Salvar");
        cadastroSalaBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaBtnSalvarActionPerformed(evt);
            }
        });

        cadastroSalaTextFieldNSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaTextFieldNSalaActionPerformed(evt);
            }
        });

        cadastroSalaTextFieldNColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaTextFieldNColunasActionPerformed(evt);
            }
        });

        cadastroSalaTextFieldNLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaTextFieldNLinhasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastroSalaLabelNumeroColunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroSalaLabelNumeroSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroSalaLabelNumeroLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroSalaTextFieldNSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaTextFieldNColunas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaTextFieldNLinhas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroSalaLabelTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cadastroSalaBtnSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cadastroSalaLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroSalaLabelNumeroSala)
                    .addComponent(cadastroSalaTextFieldNSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroSalaLabelNumeroColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaTextFieldNColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroSalaLabelNumeroLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaTextFieldNLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(cadastroSalaBtnSalvar)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int contador = 0;
    int[][] listaSalasCadastradas = new int[10][3];
    
    private void cadastroSalaBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaBtnSalvarActionPerformed
        String nSalaStr = cadastroSalaTextFieldNSala.getText();
        String nColunasStr = cadastroSalaTextFieldNColunas.getText();
        String nLinhasStr = cadastroSalaTextFieldNLinhas.getText();
        try{
            int nSalaInt = Integer.parseInt(nSalaStr);
            int nColunasInt = Integer.parseInt(nColunasStr);
            int nLinhasInt = Integer.parseInt(nLinhasStr);
            listaSalasCadastradas[contador][0] = nSalaInt;
            listaSalasCadastradas[contador][1] = nColunasInt;
            listaSalasCadastradas[contador][2] = nLinhasInt;
            contador++;
            for(int i = 0;i<listaSalasCadastradas.length; i++){
                for (int j = 0; j < listaSalasCadastradas[i].length; j++) {
                    System.out.println(listaSalasCadastradas[i][j]);
                }
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Um dos campos foi preenchido de forma incorreta");
            for(int i = 0;i<listaSalasCadastradas.length; i++){
                for (int j = 0; j < listaSalasCadastradas[i].length; j++) {
                    System.out.println(listaSalasCadastradas[i][j]);
                }
            }
        } 
    }//GEN-LAST:event_cadastroSalaBtnSalvarActionPerformed

    private void cadastroSalaTextFieldNSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaTextFieldNSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSalaTextFieldNSalaActionPerformed

    private void cadastroSalaTextFieldNColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaTextFieldNColunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSalaTextFieldNColunasActionPerformed

    private void cadastroSalaTextFieldNLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaTextFieldNLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSalaTextFieldNLinhasActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroSalaBtnSalvar;
    private javax.swing.JLabel cadastroSalaLabelNumeroColunas;
    private javax.swing.JLabel cadastroSalaLabelNumeroLinhas;
    private javax.swing.JLabel cadastroSalaLabelNumeroSala;
    private javax.swing.JLabel cadastroSalaLabelTitulo;
    private javax.swing.JTextField cadastroSalaTextFieldNColunas;
    private javax.swing.JTextField cadastroSalaTextFieldNLinhas;
    private javax.swing.JTextField cadastroSalaTextFieldNSala;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
