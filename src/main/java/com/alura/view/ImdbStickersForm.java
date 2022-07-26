package com.alura.view;

import com.alura.controller.ImdbApi;
import com.alura.model.Movie;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ImdbStickersForm extends javax.swing.JFrame {

    private final List<Movie> items;

    public ImdbStickersForm() {
        initComponents();

        this.setTitle("Imdb Stickers");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.items = ImdbApi.extractMovies();
        if (this.items.isEmpty()) {
            throw new RuntimeException("Oops! Something went wrong loading movies from IMDB");
        }

        this.configureTable();
        this.populateTable("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblImdbStickers = new javax.swing.JLabel();
        lblPoweredBy = new javax.swing.JLabel();
        lblAluraAndImdb = new javax.swing.JLabel();
        scrItems = new javax.swing.JScrollPane();
        tabItems = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(44, 51, 51));

        lblImdbStickers.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        lblImdbStickers.setForeground(new java.awt.Color(251, 171, 96));
        lblImdbStickers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImdbStickers.setText("Alura & Imdb");

        lblPoweredBy.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        lblPoweredBy.setForeground(new java.awt.Color(251, 171, 96));
        lblPoweredBy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoweredBy.setText("Powered By");

        lblAluraAndImdb.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        lblAluraAndImdb.setForeground(new java.awt.Color(251, 171, 96));
        lblAluraAndImdb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAluraAndImdb.setText("Imdb Stickers");

        tabItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabItems.getTableHeader().setReorderingAllowed(false);
        tabItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabItemsMouseClicked(evt);
            }
        });
        scrItems.setViewportView(tabItems);

        txtSearch.setBackground(new java.awt.Color(44, 51, 51));
        txtSearch.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(251, 171, 96));
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImdbStickers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPoweredBy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(lblAluraAndImdb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(scrItems))
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAluraAndImdb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrItems, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblPoweredBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImdbStickers)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabItemsMouseClicked
        int selectedRow = tabItems.getSelectedRow();
        int itemRank = (int) tabItems.getValueAt(selectedRow, 0);

        Movie selectedItem = this.items.get(itemRank - 1);
        new MovieForm(selectedItem).setVisible(true);
    }//GEN-LAST:event_tabItemsMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        this.populateTable(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(ImdbStickersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImdbStickersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImdbStickersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImdbStickersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImdbStickersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAluraAndImdb;
    private javax.swing.JLabel lblImdbStickers;
    private javax.swing.JLabel lblPoweredBy;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrItems;
    private javax.swing.JTable tabItems;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void configureTable() {

        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        model.addColumn("Rank");
        model.addColumn("Title");
        model.addColumn("Year");
        model.addColumn("Rating");
        tabItems.setModel(model);

        int tableWidth = tabItems.getWidth();
        tabItems.getColumnModel().getColumn(0).setPreferredWidth((int) (tableWidth * 0.1));
        tabItems.getColumnModel().getColumn(1).setPreferredWidth((int) (tableWidth * 0.5));
        tabItems.getColumnModel().getColumn(2).setPreferredWidth((int) (tableWidth * 0.2));
        tabItems.getColumnModel().getColumn(3).setPreferredWidth((int) (tableWidth * 0.2));
    }

    private void populateTable(String search) {

        DefaultTableModel model = (DefaultTableModel) tabItems.getModel();
        model.setRowCount(0);

        this.items.forEach((var item) -> {
            if (item.getTitle().toUpperCase().contains(search.toUpperCase())) {
                model.addRow(new Object[]{
                    item.getRank(),
                    item.getTitle(),
                    item.getYear(),
                    item.getRating()
                });
            }
        });
    }
}
