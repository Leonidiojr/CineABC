package view;

import control.Salas;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroSalas extends javax.swing.JFrame {
    public CadastroSalas() {
        initComponents();
        
        int[][] tabelaSalas = Salas.listaSalasCadastradas;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        String[] coluna = new String[4];
        for (int i = 0; i < Salas.listaSalasCadastradas.length; i++) {
            if (tabelaSalas[i][1]>0){
                coluna[0] = String.valueOf(tabelaSalas[i][0]);
                coluna[1] = String.valueOf(tabelaSalas[i][1]);
                coluna[2] = String.valueOf(tabelaSalas[i][2]);
                coluna[3] = String.valueOf(tabelaSalas[i][1]*tabelaSalas[i][2]);                
                model.addRow(coluna);
            }            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton50 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cadastroSalaTextFieldNSala = new javax.swing.JTextField();
        cadastroSalaTextFieldNLinhas = new javax.swing.JTextField();
        cadastroSalaLabelNumeroLinhas = new javax.swing.JLabel();
        cadastroSalaLabelNumeroColunas = new javax.swing.JLabel();
        cadastroSalaLabelNumeroSala = new javax.swing.JLabel();
        cadastroSalaTextFieldNColunas = new javax.swing.JTextField();
        cadastroSalaBtnSalvar = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cine ABC");
        setResizable(false);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Colunas", "Linhas", "Cadeiras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/5482890321606261170-128.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Salas");

        jToggleButton1.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton1.setText("A2");
        jToggleButton1.setName("A2"); // NOI18N
        jToggleButton1.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton3.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton3.setText("A1");
        jToggleButton3.setName("A1"); // NOI18N
        jToggleButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jToggleButton3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jToggleButton3CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton2.setText("A3");
        jToggleButton2.setName("A3"); // NOI18N
        jToggleButton2.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton4.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton4.setText("A4");
        jToggleButton4.setToolTipText("");
        jToggleButton4.setName("A4"); // NOI18N
        jToggleButton4.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton5.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton5.setText("A5");
        jToggleButton5.setName("A5"); // NOI18N
        jToggleButton5.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton6.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton6.setText("A6");
        jToggleButton6.setName("A6"); // NOI18N
        jToggleButton6.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton7.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton7.setText("A7");
        jToggleButton7.setName("A7"); // NOI18N
        jToggleButton7.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton8.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton8.setText("A8");
        jToggleButton8.setName("A8"); // NOI18N
        jToggleButton8.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton9.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton9.setText("A9");
        jToggleButton9.setName("A9"); // NOI18N
        jToggleButton9.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton10.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton10.setText("A10");
        jToggleButton10.setName("A10"); // NOI18N
        jToggleButton10.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton11.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton11.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton11.setText("B1");
        jToggleButton11.setName("B1"); // NOI18N
        jToggleButton11.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton12.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton12.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton12.setText("B2");
        jToggleButton12.setName("B2"); // NOI18N
        jToggleButton12.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton13.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton13.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton13.setText("B3");
        jToggleButton13.setName("B3"); // NOI18N
        jToggleButton13.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton14.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton14.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton14.setText("B4");
        jToggleButton14.setToolTipText("");
        jToggleButton14.setName("B4"); // NOI18N
        jToggleButton14.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton15.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton15.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton15.setText("B5");
        jToggleButton15.setName("B5"); // NOI18N
        jToggleButton15.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton16.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton16.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton16.setText("B6");
        jToggleButton16.setName("B6"); // NOI18N
        jToggleButton16.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton17.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton17.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton17.setText("B7");
        jToggleButton17.setName("B7"); // NOI18N
        jToggleButton17.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton18.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton18.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton18.setText("B8");
        jToggleButton18.setToolTipText("");
        jToggleButton18.setName("B8"); // NOI18N
        jToggleButton18.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton19.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton19.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton19.setText("B9");
        jToggleButton19.setToolTipText("");
        jToggleButton19.setActionCommand("A9");
        jToggleButton19.setName("B9"); // NOI18N
        jToggleButton19.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton20.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton20.setForeground(new java.awt.Color(255, 0, 51));
        jToggleButton20.setText("B10");
        jToggleButton20.setActionCommand("A10");
        jToggleButton20.setName("B10"); // NOI18N
        jToggleButton20.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton21.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton21.setText("C1");
        jToggleButton21.setName("C1"); // NOI18N
        jToggleButton21.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton22.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton22.setText("C2");
        jToggleButton22.setName("C2"); // NOI18N
        jToggleButton22.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton23.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton23.setText("C3");
        jToggleButton23.setName("C3"); // NOI18N
        jToggleButton23.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton24.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton24.setText("C4");
        jToggleButton24.setToolTipText("");
        jToggleButton24.setName("C4"); // NOI18N
        jToggleButton24.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton25.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton25.setText("C5");
        jToggleButton25.setName("C5"); // NOI18N
        jToggleButton25.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton26.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton26.setText("C6");
        jToggleButton26.setName("C6"); // NOI18N
        jToggleButton26.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton27.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton27.setText("C7");
        jToggleButton27.setName("C7"); // NOI18N
        jToggleButton27.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton28.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton28.setText("C8");
        jToggleButton28.setName("C8"); // NOI18N
        jToggleButton28.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton29.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton29.setText("C9");
        jToggleButton29.setActionCommand("A9");
        jToggleButton29.setName("C9"); // NOI18N
        jToggleButton29.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton30.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton30.setText("C10");
        jToggleButton30.setActionCommand("A10");
        jToggleButton30.setName("C10"); // NOI18N
        jToggleButton30.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton31.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton31.setText("D1");
        jToggleButton31.setName("D1"); // NOI18N
        jToggleButton31.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton32.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton32.setText("D2");
        jToggleButton32.setName("D2"); // NOI18N
        jToggleButton32.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton33.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton33.setText("D3");
        jToggleButton33.setName("D3"); // NOI18N
        jToggleButton33.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton34.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton34.setText("D4");
        jToggleButton34.setToolTipText("");
        jToggleButton34.setName("D4"); // NOI18N
        jToggleButton34.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton35.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton35.setText("D5");
        jToggleButton35.setName("D5"); // NOI18N
        jToggleButton35.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton36.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton36.setText("D6");
        jToggleButton36.setName("D6"); // NOI18N
        jToggleButton36.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton37.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton37.setText("D7");
        jToggleButton37.setName("D7"); // NOI18N
        jToggleButton37.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton38.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton38.setText("D8");
        jToggleButton38.setName("D8"); // NOI18N
        jToggleButton38.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton39.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton39.setText("D9");
        jToggleButton39.setActionCommand("A9");
        jToggleButton39.setName("D9"); // NOI18N
        jToggleButton39.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton40.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton40.setText("D10");
        jToggleButton40.setActionCommand("A10");
        jToggleButton40.setName("D10"); // NOI18N
        jToggleButton40.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton41.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton41.setText("E1");
        jToggleButton41.setName("E1"); // NOI18N
        jToggleButton41.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton42.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton42.setText("E2");
        jToggleButton42.setName("E2"); // NOI18N
        jToggleButton42.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton43.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton43.setText("E3");
        jToggleButton43.setName("E3"); // NOI18N
        jToggleButton43.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton44.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton44.setText("E4");
        jToggleButton44.setToolTipText("");
        jToggleButton44.setName("E4"); // NOI18N
        jToggleButton44.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton45.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton45.setText("E5");
        jToggleButton45.setName("E5"); // NOI18N
        jToggleButton45.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton46.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton46.setText("E6");
        jToggleButton46.setName("E6"); // NOI18N
        jToggleButton46.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton47.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton47.setText("E7");
        jToggleButton47.setName("E7"); // NOI18N
        jToggleButton47.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton48.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton48.setText("E8");
        jToggleButton48.setName("E8"); // NOI18N
        jToggleButton48.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton49.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton49.setText("E9");
        jToggleButton49.setActionCommand("A9");
        jToggleButton49.setName("E9"); // NOI18N
        jToggleButton49.setPreferredSize(new java.awt.Dimension(80, 80));

        jToggleButton50.setBackground(new java.awt.Color(0, 153, 0));
        jToggleButton50.setText("E10");
        jToggleButton50.setActionCommand("A10");
        jToggleButton50.setName("E10"); // NOI18N
        jToggleButton50.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jToggleButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setText("Fechar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(77, 77, 77))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(231, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(44, 44, 44)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cadastroSalaTextFieldNSala.setText("1");
        cadastroSalaTextFieldNSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaTextFieldNSalaActionPerformed(evt);
            }
        });

        cadastroSalaTextFieldNLinhas.setEditable(false);
        cadastroSalaTextFieldNLinhas.setText("5");
        cadastroSalaTextFieldNLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaTextFieldNLinhasActionPerformed(evt);
            }
        });

        cadastroSalaLabelNumeroLinhas.setText("N° de Linhas");

        cadastroSalaLabelNumeroColunas.setText("N° de Colunas");

        cadastroSalaLabelNumeroSala.setText("N° da Sala");
        cadastroSalaLabelNumeroSala.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastroSalaLabelNumeroSala.setName(""); // NOI18N

        cadastroSalaTextFieldNColunas.setEditable(false);
        cadastroSalaTextFieldNColunas.setText("10");
        cadastroSalaTextFieldNColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaTextFieldNColunasActionPerformed(evt);
            }
        });

        cadastroSalaBtnSalvar.setText("Salvar");
        cadastroSalaBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalaBtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastroSalaBtnSalvar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cadastroSalaLabelNumeroColunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroSalaLabelNumeroSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroSalaLabelNumeroLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroSalaTextFieldNColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaTextFieldNSala, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaTextFieldNLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroSalaLabelNumeroSala)
                    .addComponent(cadastroSalaTextFieldNSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroSalaTextFieldNColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaLabelNumeroColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroSalaTextFieldNLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSalaLabelNumeroLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cadastroSalaBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1135, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int contador = 0;

    
    private void cadastroSalaBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaBtnSalvarActionPerformed
        
        
        String nSalaStr = cadastroSalaTextFieldNSala.getText();
        String nColunasStr = cadastroSalaTextFieldNColunas.getText();
        String nLinhasStr = cadastroSalaTextFieldNLinhas.getText();
        try{
            int nSalaInt = Integer.parseInt(nSalaStr);
            int nColunasInt = Integer.parseInt(nColunasStr);
            int nLinhasInt = Integer.parseInt(nLinhasStr);
            Salas.listaSalasCadastradas[contador][0] = nSalaInt;
            Salas.listaSalasCadastradas[contador][1] = nColunasInt;
            Salas.listaSalasCadastradas[contador][2] = nLinhasInt;
            contador++;
            CarregaSalas();
                             
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Um dos campos foi preenchido de forma incorreta");
            /*for(int i = 0;i<Salas.listaSalasCadastradas.length; i++){
                for (int j = 0; j < Salas.listaSalasCadastradas[i].length; j++) {
                    System.out.println(Salas.listaSalasCadastradas[i][j]);
                }
            }*/
        } 
    }//GEN-LAST:event_cadastroSalaBtnSalvarActionPerformed

    private void CarregaSalas(){
        
        int[][] tabelaSalas = Salas.listaSalasCadastradas;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        String[] coluna = new String[3];
        for (int i = 0; i < Salas.QuantidadeSalasCadastradasDisponiveis(); i++) {
            if (tabelaSalas[i][0] >= 0){
                coluna[0] = String.valueOf(tabelaSalas[i][0]);
                coluna[1] = String.valueOf(tabelaSalas[i][1]);
                coluna[2] = String.valueOf(tabelaSalas[i][2]);
                model.addRow(coluna);
            }
        } 
    }
    
       
    private void cadastroSalaTextFieldNSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaTextFieldNSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSalaTextFieldNSalaActionPerformed

    private void cadastroSalaTextFieldNColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaTextFieldNColunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSalaTextFieldNColunasActionPerformed

    private void cadastroSalaTextFieldNLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalaTextFieldNLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSalaTextFieldNLinhasActionPerformed

    private void jToggleButton3CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jToggleButton3CaretPositionChanged
        
        this.jToggleButton1.setBackground(Color.RED);
          // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3CaretPositionChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JTextField cadastroSalaTextFieldNColunas;
    private javax.swing.JTextField cadastroSalaTextFieldNLinhas;
    private javax.swing.JTextField cadastroSalaTextFieldNSala;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton50;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}

