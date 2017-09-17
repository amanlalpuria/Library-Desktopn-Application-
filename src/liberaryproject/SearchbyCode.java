/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liberaryproject;

/**
 *
 * @author amans
 */
public class SearchbyCode extends javax.swing.JFrame {

    /**
     * Creates new form SearchbyCode
     */
    public SearchbyCode() {
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

        indiraPannel = new javax.swing.JPanel();
        indiraButton = new javax.swing.JButton();
        detailPannel = new javax.swing.JPanel();
        accessionNumberforSearchLabel = new javax.swing.JLabel();
        accessionNumberforSearchField = new javax.swing.JTextField();
        accessionNumberLabel = new javax.swing.JLabel();
        claasnumberLabel = new javax.swing.JLabel();
        accessionNumberfield = new javax.swing.JTextField();
        classNumberField = new javax.swing.JTextField();
        bookNameLabel = new javax.swing.JLabel();
        authorNameLabel = new javax.swing.JLabel();
        bookNameField = new javax.swing.JTextField();
        authotNameField = new javax.swing.JTextField();
        editionLabel = new javax.swing.JLabel();
        editionField = new javax.swing.JTextField();
        columnNumberLabel = new javax.swing.JLabel();
        columnNumberField = new javax.swing.JTextField();
        rowNumberLabel = new javax.swing.JLabel();
        rowNumberField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        indiraPannel.setBackground(new java.awt.Color(18, 49, 113));

        indiraButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        indiraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiraButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout indiraPannelLayout = new javax.swing.GroupLayout(indiraPannel);
        indiraPannel.setLayout(indiraPannelLayout);
        indiraPannelLayout.setHorizontalGroup(
            indiraPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indiraPannelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(indiraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        indiraPannelLayout.setVerticalGroup(
            indiraPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indiraPannelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(indiraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        detailPannel.setBackground(new java.awt.Color(153, 255, 153));
        detailPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        accessionNumberforSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accessionNumberforSearchLabel.setText("Accession no:");

        accessionNumberLabel.setText("Accession No. :");

        claasnumberLabel.setText("Class No. :");

        accessionNumberfield.setBackground(new java.awt.Color(153, 255, 153));
        accessionNumberfield.setBorder(null);

        classNumberField.setBackground(new java.awt.Color(153, 255, 153));
        classNumberField.setBorder(null);

        bookNameLabel.setText("Book Name:");

        authorNameLabel.setText("Author Name:");

        bookNameField.setBackground(new java.awt.Color(153, 255, 153));
        bookNameField.setBorder(null);

        authotNameField.setBackground(new java.awt.Color(153, 255, 153));
        authotNameField.setBorder(null);

        editionLabel.setText("Edition:");

        editionField.setBackground(new java.awt.Color(153, 255, 153));
        editionField.setBorder(null);

        columnNumberLabel.setText("Column No.:");

        columnNumberField.setBackground(new java.awt.Color(153, 255, 153));
        columnNumberField.setBorder(null);

        rowNumberLabel.setText("Row No.:");

        rowNumberField.setBackground(new java.awt.Color(153, 255, 153));
        rowNumberField.setBorder(null);

        javax.swing.GroupLayout detailPannelLayout = new javax.swing.GroupLayout(detailPannel);
        detailPannel.setLayout(detailPannelLayout);
        detailPannelLayout.setHorizontalGroup(
            detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPannelLayout.createSequentialGroup()
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPannelLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(accessionNumberforSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accessionNumberforSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailPannelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(claasnumberLabel)
                            .addComponent(accessionNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailPannelLayout.createSequentialGroup()
                                .addComponent(accessionNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailPannelLayout.createSequentialGroup()
                                .addComponent(classNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorNameLabel)
                                    .addComponent(editionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authotNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(columnNumberLabel)
                            .addComponent(rowNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rowNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        detailPannelLayout.setVerticalGroup(
            detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessionNumberforSearchLabel)
                    .addComponent(accessionNumberforSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessionNumberLabel)
                    .addComponent(accessionNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameLabel)
                    .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnNumberLabel)
                    .addComponent(columnNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claasnumberLabel)
                    .addComponent(classNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameLabel)
                    .addComponent(authotNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rowNumberLabel)
                    .addComponent(rowNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editionLabel)
                    .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        accessionNumberLabel.getAccessibleContext().setAccessibleName("Accession No.:");
        bookNameLabel.getAccessibleContext().setAccessibleName("");
        authorNameLabel.getAccessibleContext().setAccessibleName("");
        rowNumberLabel.getAccessibleContext().setAccessibleName("");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_25px.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setText("Search by Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indiraPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLabel)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(detailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indiraPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(detailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(backButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiraButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        SearchBooks searchBooks =new SearchBooks();
        searchBooks.setVisible(true);
        
        //To change the window
        SearchbyCode searchbyCode = new SearchbyCode();
        searchbyCode.setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchbyCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchbyCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchbyCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchbyCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchbyCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessionNumberLabel;
    private javax.swing.JTextField accessionNumberfield;
    private javax.swing.JTextField accessionNumberforSearchField;
    private javax.swing.JLabel accessionNumberforSearchLabel;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JTextField authotNameField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JLabel claasnumberLabel;
    private javax.swing.JTextField classNumberField;
    private javax.swing.JTextField columnNumberField;
    private javax.swing.JLabel columnNumberLabel;
    private javax.swing.JPanel detailPannel;
    private javax.swing.JTextField editionField;
    private javax.swing.JLabel editionLabel;
    private javax.swing.JButton indiraButton;
    private javax.swing.JPanel indiraPannel;
    private javax.swing.JTextField rowNumberField;
    private javax.swing.JLabel rowNumberLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
