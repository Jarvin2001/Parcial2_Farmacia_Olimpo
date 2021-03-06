/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_olimpo_p2_prc4.formularios;

import java.awt.Color;

/**
 *
 * @author jarvi
 */
public class frmConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    public frmConfiguracion() {
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

        bg = new javax.swing.JPanel();
        configuracionlbl = new javax.swing.JLabel();
        btnCrudEmpleado = new javax.swing.JPanel();
        lblMantenimientoEmpleados = new javax.swing.JLabel();
        spEmpleados = new javax.swing.JSeparator();
        btnCrudClientes = new javax.swing.JPanel();
        lblMantenimientoClientes = new javax.swing.JLabel();
        spClientes = new javax.swing.JSeparator();
        btnCrudProductos = new javax.swing.JPanel();
        lblMantenimientoProductos = new javax.swing.JLabel();
        spProductos = new javax.swing.JSeparator();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        spRegresar = new javax.swing.JSeparator();
        FOOTER = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setPreferredSize(new java.awt.Dimension(1132, 784));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        configuracionlbl.setBackground(new java.awt.Color(255, 255, 255));
        configuracionlbl.setFont(new java.awt.Font("Montserrat", 1, 80)); // NOI18N
        configuracionlbl.setForeground(new java.awt.Color(51, 153, 255));
        configuracionlbl.setText("Configuraci??n ");
        bg.add(configuracionlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 700, 100));

        btnCrudEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnCrudEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrudEmpleadoMouseClicked(evt);
            }
        });

        lblMantenimientoEmpleados.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblMantenimientoEmpleados.setForeground(new java.awt.Color(178, 176, 176));
        lblMantenimientoEmpleados.setText("Mantenimiento Empleados");
        lblMantenimientoEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMantenimientoEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMantenimientoEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMantenimientoEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCrudEmpleadoLayout = new javax.swing.GroupLayout(btnCrudEmpleado);
        btnCrudEmpleado.setLayout(btnCrudEmpleadoLayout);
        btnCrudEmpleadoLayout.setHorizontalGroup(
            btnCrudEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrudEmpleadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMantenimientoEmpleados)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        btnCrudEmpleadoLayout.setVerticalGroup(
            btnCrudEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrudEmpleadoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblMantenimientoEmpleados)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        bg.add(btnCrudEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 590, 50));

        spEmpleados.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(spEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 560, -1));

        btnCrudClientes.setBackground(new java.awt.Color(255, 255, 255));

        lblMantenimientoClientes.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblMantenimientoClientes.setForeground(new java.awt.Color(178, 176, 176));
        lblMantenimientoClientes.setText("Mantenimiento Clientes");
        lblMantenimientoClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMantenimientoClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMantenimientoClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMantenimientoClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCrudClientesLayout = new javax.swing.GroupLayout(btnCrudClientes);
        btnCrudClientes.setLayout(btnCrudClientesLayout);
        btnCrudClientesLayout.setHorizontalGroup(
            btnCrudClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrudClientesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMantenimientoClientes)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        btnCrudClientesLayout.setVerticalGroup(
            btnCrudClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrudClientesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblMantenimientoClientes)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        bg.add(btnCrudClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        spClientes.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(spClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 560, -1));

        btnCrudProductos.setBackground(new java.awt.Color(255, 255, 255));

        lblMantenimientoProductos.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblMantenimientoProductos.setForeground(new java.awt.Color(178, 176, 176));
        lblMantenimientoProductos.setText("Mantenimiento Productos");
        lblMantenimientoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMantenimientoProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMantenimientoProductosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCrudProductosLayout = new javax.swing.GroupLayout(btnCrudProductos);
        btnCrudProductos.setLayout(btnCrudProductosLayout);
        btnCrudProductosLayout.setHorizontalGroup(
            btnCrudProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrudProductosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMantenimientoProductos)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        btnCrudProductosLayout.setVerticalGroup(
            btnCrudProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrudProductosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblMantenimientoProductos)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        bg.add(btnCrudProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 590, 50));

        spProductos.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(spProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 560, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        lblRegresar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(0, 0, 153));
        lblRegresar.setText("Regresar");
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegresarLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblRegresar)
                .addContainerGap())
        );

        bg.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 590, 50));

        spRegresar.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(spRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 560, 50));
        bg.add(FOOTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1130, 350));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia_olimpo_p2_prc4/recursosGraficos/tuercas.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 550, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
     //BOTON Anterior JFRAME
    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        //Invocamos a la ventana Inicio
        frmInicio newframe = new frmInicio();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void lblMantenimientoEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoEmpleadosMouseEntered
        lblMantenimientoEmpleados.setForeground(Color.BLACK);
        
        
       
    }//GEN-LAST:event_lblMantenimientoEmpleadosMouseEntered

    private void lblMantenimientoEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoEmpleadosMouseExited
        lblMantenimientoEmpleados.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblMantenimientoEmpleadosMouseExited

    private void lblMantenimientoClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoClientesMouseEntered
        lblMantenimientoClientes.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMantenimientoClientesMouseEntered

    private void lblMantenimientoClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoClientesMouseExited
       lblMantenimientoClientes.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblMantenimientoClientesMouseExited

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        lblRegresar.setForeground(Color.red);
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        lblRegresar.setForeground(Color.blue);
    }//GEN-LAST:event_lblRegresarMouseExited

    private void lblMantenimientoProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoProductosMouseEntered
        lblMantenimientoProductos.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMantenimientoProductosMouseEntered

    private void lblMantenimientoProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoProductosMouseExited
        lblMantenimientoProductos.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblMantenimientoProductosMouseExited

    private void btnCrudEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrudEmpleadoMouseClicked
       //Invocamos a la ventana Mantenimiento Empleados
        frmMantenimientoEmpleados newframe = new frmMantenimientoEmpleados();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrudEmpleadoMouseClicked

    private void lblMantenimientoEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoEmpleadosMouseClicked
        frmMantenimientoEmpleados newframe = new frmMantenimientoEmpleados();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMantenimientoEmpleadosMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
         //Invocamos a la ventana Inicio
        frmInicio newframe = new frmInicio();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblMantenimientoClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoClientesMouseClicked
       frmMantenimientoClientes newframe = new frmMantenimientoClientes();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMantenimientoClientesMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FOOTER;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCrudClientes;
    private javax.swing.JPanel btnCrudEmpleado;
    private javax.swing.JPanel btnCrudProductos;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel configuracionlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMantenimientoClientes;
    private javax.swing.JLabel lblMantenimientoEmpleados;
    private javax.swing.JLabel lblMantenimientoProductos;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JSeparator spClientes;
    private javax.swing.JSeparator spEmpleados;
    private javax.swing.JSeparator spProductos;
    private javax.swing.JSeparator spRegresar;
    // End of variables declaration//GEN-END:variables
}
