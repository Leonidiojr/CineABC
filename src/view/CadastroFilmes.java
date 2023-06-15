package view;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class CadastroFilmes extends javax.swing.JFrame {

    /**
     * Creates new form cadastroFilme
     */
    public CadastroFilmes() {
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

        jPanel1 = new javax.swing.JPanel();
        cadastroFilmeBtnConfirmar = new javax.swing.JButton();
        cadastroFilmeLabelCodigoFilme = new javax.swing.JLabel();
        cadastroFilmeLabelNomeFilme = new javax.swing.JLabel();
        cadastroFilmeLabelGenero = new javax.swing.JLabel();
        cadastroFilmeLabelIdioma = new javax.swing.JLabel();
        cadastroFilmeLabelDuracao = new javax.swing.JLabel();
        cadastroFilmeLabelClassificacaoIndicativa = new javax.swing.JLabel();
        cadastroFilmeComboBoxClassificacaoIndicativa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cadastroFilmeComboBoxIdioma = new javax.swing.JComboBox<>();
        cadastroFilmeTextfieldCodigoFilme = new javax.swing.JTextField();
        cadastroFilmeTextfieldNomeFilme = new javax.swing.JTextField();
        cadastroFilmeTextfieldGenero = new javax.swing.JTextField();
        cadastroFilmeTextfieldDuracao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastroFilmeBtnConfirmar.setText("Confirmar");
        cadastroFilmeBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeBtnConfirmarActionPerformed(evt);
            }
        });

        cadastroFilmeLabelCodigoFilme.setText("Código do filme:");

        cadastroFilmeLabelNomeFilme.setText("Nome do filme:");

        cadastroFilmeLabelGenero.setText("Gênero(s):");

        cadastroFilmeLabelIdioma.setText("Idioma:");

        cadastroFilmeLabelDuracao.setText("Duração(min):");

        cadastroFilmeLabelClassificacaoIndicativa.setText("Classificação indicativa:");

        cadastroFilmeComboBoxClassificacaoIndicativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma das opções>", "Livre", "10", "12", "14", "16", "18" }));
        cadastroFilmeComboBoxClassificacaoIndicativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeComboBoxClassificacaoIndicativaActionPerformed(evt);
            }
        });

        jLabel7.setText("Cadastro de Filmes");

        cadastroFilmeComboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma das opções>", "Áudio Original", "Dublado", "Legendado" }));
        cadastroFilmeComboBoxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeComboBoxIdiomaActionPerformed(evt);
            }
        });

        cadastroFilmeTextfieldCodigoFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeTextfieldCodigoFilmeActionPerformed(evt);
            }
        });

        cadastroFilmeTextfieldNomeFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeTextfieldNomeFilmeActionPerformed(evt);
            }
        });

        cadastroFilmeTextfieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeTextfieldGeneroActionPerformed(evt);
            }
        });

        cadastroFilmeTextfieldDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmeTextfieldDuracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroFilmeLabelCodigoFilme)
                            .addComponent(cadastroFilmeLabelNomeFilme)
                            .addComponent(cadastroFilmeLabelGenero)
                            .addComponent(cadastroFilmeLabelIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastroFilmeLabelDuracao)
                            .addComponent(cadastroFilmeLabelClassificacaoIndicativa)
                            .addComponent(cadastroFilmeBtnConfirmar))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroFilmeComboBoxClassificacaoIndicativa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastroFilmeComboBoxIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastroFilmeTextfieldCodigoFilme)
                            .addComponent(cadastroFilmeTextfieldNomeFilme)
                            .addComponent(cadastroFilmeTextfieldGenero)
                            .addComponent(cadastroFilmeTextfieldDuracao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7)))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastroFilmeLabelCodigoFilme)
                    .addComponent(cadastroFilmeTextfieldCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroFilmeLabelNomeFilme)
                    .addComponent(cadastroFilmeTextfieldNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroFilmeLabelGenero)
                    .addComponent(cadastroFilmeTextfieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastroFilmeLabelIdioma)
                    .addComponent(cadastroFilmeComboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroFilmeLabelDuracao)
                    .addComponent(cadastroFilmeTextfieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroFilmeComboBoxClassificacaoIndicativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroFilmeLabelClassificacaoIndicativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(cadastroFilmeBtnConfirmar)
                .addGap(20, 20, 20))
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
    
    String[] informacoesCadastroFilme = new String [4];
    String[][] informacoesFilmesCadastrados = new String[20][6]; 
    //int duracaoFilmeCalculo = 0; //JAVA FREAK
    
    private void cadastroFilmeBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeBtnConfirmarActionPerformed
        // Todo o código referente ao botão "confirmar":
        
        informacoesCadastroFilme[0] = cadastroFilmeTextfieldCodigoFilme.getText();
        informacoesCadastroFilme[1] = cadastroFilmeTextfieldNomeFilme.getText();
        informacoesCadastroFilme[2] = cadastroFilmeTextfieldGenero.getText();
        
        informacoesCadastroFilme[3] = cadastroFilmeTextfieldDuracao.getText();
        String texto = cadastroFilmeTextfieldDuracao.getText();
        try{
            int valorEmInteiro = Integer.parseInt(texto);
            //duracaoFilmeCalculo = valorEmInteiro; //JAVA FREAK
            
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo referente a duração do filme não foi preenchido corretamente", null, WIDTH);
            System.out.println("O texto não pôde ser convertido para um valor inteiro.");
        }
        //System.out.println(duracaoFilmeCalculo); //JAVA FREAK
        
        if(cadastroFilmeComboBoxIdioma.getSelectedItem().equals("<Selecione uma das opções>")){
            JOptionPane.showMessageDialog(null, "O campo referente ao idioma não foi preenchido corretamente", null, WIDTH);
        }
        
        if(cadastroFilmeComboBoxClassificacaoIndicativa.getSelectedItem().equals("<Selecione uma das opções>")){
            JOptionPane.showMessageDialog(null, "O campo referente a classificação indicativa não foi preenchido corretamente", null, WIDTH);
        }
             
        //SALVAR DADOS NA  MATRIZ PARA CRIAR UM FILME
        for (int i = 0; i < informacoesFilmesCadastrados.length; i++) {
            
            
            
            for (int j = 0; j < informacoesFilmesCadastrados[i].length; j++) {
                
                
                
            }
        }
        
    }//GEN-LAST:event_cadastroFilmeBtnConfirmarActionPerformed

    private void cadastroFilmeComboBoxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeComboBoxIdiomaActionPerformed
        // Código referente a ComboBox "Idioma":
    }//GEN-LAST:event_cadastroFilmeComboBoxIdiomaActionPerformed

    private void cadastroFilmeComboBoxClassificacaoIndicativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeComboBoxClassificacaoIndicativaActionPerformed
        // Código referente a ComboBox "ClassificacaoIndicativa":
    }//GEN-LAST:event_cadastroFilmeComboBoxClassificacaoIndicativaActionPerformed
    
    private void cadastroFilmeTextfieldCodigoFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeTextfieldCodigoFilmeActionPerformed
        // Código referente ao campo de texto "Código do filme":
    }//GEN-LAST:event_cadastroFilmeTextfieldCodigoFilmeActionPerformed

    private void cadastroFilmeTextfieldNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeTextfieldNomeFilmeActionPerformed
        // Código referente ao campo de texto "Nome do filme":
    }//GEN-LAST:event_cadastroFilmeTextfieldNomeFilmeActionPerformed

    private void cadastroFilmeTextfieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeTextfieldGeneroActionPerformed
        // Código referente ao campo de texto "Gênero":
    }//GEN-LAST:event_cadastroFilmeTextfieldGeneroActionPerformed

    private void cadastroFilmeTextfieldDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmeTextfieldDuracaoActionPerformed
        // Código referente ao campo de texto "Duração(min)":
    }//GEN-LAST:event_cadastroFilmeTextfieldDuracaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroFilmeBtnConfirmar;
    private javax.swing.JComboBox<String> cadastroFilmeComboBoxClassificacaoIndicativa;
    private javax.swing.JComboBox<String> cadastroFilmeComboBoxIdioma;
    private javax.swing.JLabel cadastroFilmeLabelClassificacaoIndicativa;
    private javax.swing.JLabel cadastroFilmeLabelCodigoFilme;
    private javax.swing.JLabel cadastroFilmeLabelDuracao;
    private javax.swing.JLabel cadastroFilmeLabelGenero;
    private javax.swing.JLabel cadastroFilmeLabelIdioma;
    private javax.swing.JLabel cadastroFilmeLabelNomeFilme;
    private javax.swing.JTextField cadastroFilmeTextfieldCodigoFilme;
    private javax.swing.JTextField cadastroFilmeTextfieldDuracao;
    private javax.swing.JTextField cadastroFilmeTextfieldGenero;
    private javax.swing.JTextField cadastroFilmeTextfieldNomeFilme;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
