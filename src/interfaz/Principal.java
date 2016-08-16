/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 *
 * @author lcastane6
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JLabel();
        txtN2 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        txtPrimerNumero = new javax.swing.JTextField();
        txtSegundoNumero = new javax.swing.JTextField();
        txtResultado = new javax.swing.JLabel();
        txtRes = new javax.swing.JTextField();
        cmdBorrar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 3, 18)); // NOI18N
        jLabel1.setText("Suma De Dos Numeros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        txtN1.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        txtN1.setText("Primer Numero");
        getContentPane().add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 10));

        txtN2.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        txtN2.setText("Segundo Numero");
        getContentPane().add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, 10));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        txtPrimerNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrimerNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 116, 70, -1));

        txtSegundoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtSegundoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 114, 70, -1));

        txtResultado.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        txtResultado.setText("Resultado");
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 173, -1, -1));
        getContentPane().add(txtRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 48, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNumeroActionPerformed
        
    }//GEN-LAST:event_txtPrimerNumeroActionPerformed

    private void txtSegundoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoNumeroActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String n1,n2,res;
        int nume1, nume2, suma;
        
        n1=txtPrimerNumero.getText().trim();
        n2=txtSegundoNumero.getText().trim();
        
        nume1=Integer.parseInt(n1);
        nume2=Integer.parseInt(n2);
        
        suma = nume1 + nume2;
        
        res=String.valueOf(suma);
        
        txtRes.setText(res);
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtPrimerNumero.setText("");
        txtSegundoNumero.setText("");
        txtRes.setText("");
        
        txtPrimerNumero.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel txtN1;
    private javax.swing.JLabel txtN2;
    private javax.swing.JTextField txtPrimerNumero;
    private javax.swing.JTextField txtRes;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JTextField txtSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
