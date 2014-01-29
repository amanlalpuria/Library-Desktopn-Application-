/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itechkenya.leavemanager.gui;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import org.itechkenya.leavemanager.api.JpaManager;
import org.itechkenya.leavemanager.api.MessageManager;
import org.itechkenya.leavemanager.domain.Employee;
import org.itechkenya.leavemanager.jpa.exceptions.IllegalOrphanException;
import org.itechkenya.leavemanager.jpa.exceptions.NonexistentEntityException;

/**
 *
 * @author gitahi
 */
public class EmployeeFrame extends LeaveManagerFrame {

    /**
     * Creates new form EmployeeFrame
     */
    public EmployeeFrame() {
        try {
            initComponents();
            configureComponents();
            loadData();
        } catch (Exception ex) {
            MessageManager.showErrorMessage(this.getContentPane(), ex.getMessage());
            Logger.getLogger(OrganizationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        codeLabel = new javax.swing.JLabel();
        codeTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        otherNamesLabel = new javax.swing.JLabel();
        otherNamesTextField = new javax.swing.JTextField();
        activeCheckBox = new javax.swing.JCheckBox();
        newButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Employees");

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        codeLabel.setText("Code");

        lastNameLabel.setText("Last Name");

        otherNamesLabel.setText("Other Names");

        activeCheckBox.setText("Active");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherNamesLabel)
                    .addComponent(activeCheckBox)
                    .addComponent(lastNameLabel)
                    .addComponent(codeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeTextField)
                    .addComponent(otherNamesTextField)
                    .addComponent(lastNameTextField))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherNamesLabel)
                    .addComponent(otherNamesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activeCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(closeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        clear();
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Employee employee = (Employee) getSelectedItem();
        try {
            if (employee == null) {
                employee = new Employee();
                flesh(employee);
                JpaManager.getEjc().create(employee);
                updateTable(employee, UpdateType.CREATE);
            } else {
                flesh(employee);
                JpaManager.getEjc().edit(employee);
                updateTable(employee, UpdateType.EDIT);
            }
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        for (Object item : getSelectedItems()) {
            Employee employee = (Employee) item;
            try {
                JpaManager.getEjc().destroy(employee.getId());
                updateTable(employee, UpdateType.DESTROY);
            } catch (IllegalOrphanException ex) {
                MessageManager.showErrorMessage(this, "Dependent record(s) found. Delete those first.");
                Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NonexistentEntityException ex) {
                MessageManager.showErrorMessage(this, ex.getMessage());
                Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activeCheckBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel otherNamesLabel;
    private javax.swing.JTextField otherNamesTextField;
    private javax.swing.JPanel panel;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    @Override
    public final void loadData() {
        List<Employee> organizationsList = JpaManager.getEjc().findEmployeeEntities();
        EmployeeTableModel model = new EmployeeTableModel();
        for (Employee employee : organizationsList) {
            model.createRow(employee);
        }
        table.setModel(model);
    }

    @Override
    public JButton getOkButton() {
        return saveButton;
    }

    @Override
    public JButton getDeleteButton() {
        return deleteButton;
    }

    @Override
    public JTable getTable() {
        return table;
    }

    @Override
    public void clearFields() {
        codeTextField.setText("");
        lastNameTextField.setText("");
        otherNamesTextField.setText("");
        activeCheckBox.setSelected(false);
    }

    @Override
    public void showSelectedItem(Object item) {
        Employee employee = (Employee) item;
        if (employee != null) {
            codeTextField.setText(employee.getCode());
            lastNameTextField.setText(employee.getLastName());
            otherNamesTextField.setText(employee.getOtherNames());
            activeCheckBox.setSelected(employee.getActive());
        }
    }

    @Override
    public void flesh(Object item) {
        Employee employee = (Employee) item;
        if (employee != null) {
            employee.setCode(codeTextField.getText());
            employee.setLastName(lastNameTextField.getText());
            employee.setOtherNames(otherNamesTextField.getText());
            employee.setActive(activeCheckBox.isSelected());
        }
    }

    private class EmployeeTableModel extends LeaveManagerTableModel {

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (rowIndex >= getRows().size()) {
                return null;
            }
            Employee employee = (Employee) getRow(rowIndex);
            switch (columnIndex) {
                case 0:
                    return employee.getCode();
                case 1:
                    return employee.getLastName();
                case 2:
                    return employee.getOtherNames();
                case 3:
                    return employee.getActive();
                default:
                    return null;
            }
        }

        @Override
        public Class getColumnClass(int column) {
            return getValueAt(0, column).getClass();
        }

        @Override
        public String[] getColumns() {
            String[] columns = {"Code", "Last Name", "Other Names", "Active"};
            return columns;
        }
    }
}
