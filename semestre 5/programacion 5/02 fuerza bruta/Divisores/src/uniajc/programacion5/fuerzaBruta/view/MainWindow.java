/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniajc.programacion5.fuerzaBruta.view;

import javax.swing.JOptionPane;
import uniajc.programacion5.fuerzabruta.business.Divisores;

/**
 *
 * @author estudiante103
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        lblNumberInput = new javax.swing.JLabel();
        txtNumberInput = new javax.swing.JTextField();
        btnNumberInput = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNumberOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fuerza Bruta: Encontrar Divisores");

        lblNumberInput.setDisplayedMnemonic('n');
        lblNumberInput.setLabelFor(txtNumberInput);
        lblNumberInput.setText("Encontrar los divisores de:");

        txtNumberInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumberInput.setText("1");
        txtNumberInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumberInputFocusGained(evt);
            }
        });

        btnNumberInput.setMnemonic('E');
        btnNumberInput.setText("Ejecutar");
        btnNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumberInputActionPerformed(evt);
            }
        });

        txtNumberOutput.setColumns(20);
        txtNumberOutput.setRows(5);
        jScrollPane2.setViewportView(txtNumberOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumberInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNumberInput)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberInput)
                    .addComponent(txtNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumberInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumberInputActionPerformed
        // TODO add your handling code here:
        int p = 0, c = 0;
        try {
            p = Integer.parseInt(txtNumberInput.getText());
            if (p < 1 ) {
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "La entrada no es válida", 
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        c = Divisores.Primero(p);
        while (c > 0) {            
            if (Divisores.Valido(p, c)) {
                txtNumberOutput.append(
                    Divisores.Mostrar(p, c));
                txtNumberOutput.append("\n");
            }
            c = Divisores.Siguiente(p, c);
        }
        
    }//GEN-LAST:event_btnNumberInputActionPerformed

    private void txtNumberInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberInputFocusGained
        txtNumberInput.selectAll();
    }//GEN-LAST:event_txtNumberInputFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNumberInput;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumberInput;
    private javax.swing.JTextField txtNumberInput;
    private javax.swing.JTextArea txtNumberOutput;
    // End of variables declaration//GEN-END:variables
}
