/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andet
 */
public class VentanaLista extends javax.swing.JFrame {
    ListaDoble lista = new ListaDoble();
    /**
     * Creates new form VentanaLista
     */
    public VentanaLista() {
        initComponents();
        setSize(430,280);
        setLocationRelativeTo(null);
        btnInsertar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDato = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtArea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbP = new javax.swing.JComboBox<>();
        lblPrio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtDato.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 16)); // NOI18N
        getContentPane().add(txtDato);
        txtDato.setBounds(10, 80, 186, 30);

        btnInsertar.setBackground(new java.awt.Color(102, 255, 51));
        btnInsertar.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 16)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar);
        btnInsertar.setBounds(200, 80, 95, 31);

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(300, 80, 99, 31);

        txtArea.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 20)); // NOI18N
        getContentPane().add(txtArea);
        txtArea.setBounds(10, 120, 390, 90);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 16)); // NOI18N
        jLabel1.setText("Ingrese un dato:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 136, 23);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista Doble Prioridad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 191, 25);

        cmbP.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        cmbP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel", "1", "2", "3" }));
        cmbP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPActionPerformed(evt);
            }
        });
        getContentPane().add(cmbP);
        cmbP.setBounds(300, 50, 100, 23);

        lblPrio.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 16)); // NOI18N
        lblPrio.setText("Prioridad");
        getContentPane().add(lblPrio);
        lblPrio.setBounds(200, 50, 80, 22);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inserta un dato");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 210, 390, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondodeg (1).jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 412, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Prioridad dato= new Prioridad (txtDato.getText().toUpperCase().charAt(0),cmbP.getSelectedIndex());
        boolean respuesta=lista.insertar(dato);
        String mensaje="Error";
        if(respuesta)mensaje="Se insertó el dato correctamente";
        jLabel4.setText(mensaje);
        txtDato.setText("");
        mostrarListaDoble();
        btnInsertar.setEnabled(false);
        cmbP.setSelectedIndex(0);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean respuesta = lista.eliminar();
        String mensaje="Error la lista está vacía";
        if(respuesta)mensaje="Se eliminó un dato corretamente";
        jLabel4.setText(mensaje);
        mostrarListaDoble();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPActionPerformed
        if(cmbP.getSelectedIndex()>0)btnInsertar.setEnabled(true);
    }//GEN-LAST:event_cmbPActionPerformed
    
    public void mostrarListaDoble(){
        if(lista.hayListaDobleVacia()){
            txtArea.setText("");
            return;
        }
        NodoDoble temp=lista.getIni();
        String cad="";
        do{
            cad+=temp.getDato()+" <=> ";
            temp=temp.getSig();
        }while(temp!=null);
        txtArea.setText(cad);
    }
    
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
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<String> cmbP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPrio;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}