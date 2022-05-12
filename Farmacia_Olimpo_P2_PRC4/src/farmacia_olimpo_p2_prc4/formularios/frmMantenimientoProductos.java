/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_olimpo_p2_prc4.formularios;

import farmacia_olimpo_p2_prc4.clases.Clientes;
import farmacia_olimpo_p2_prc4.clases.Productos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jarvi
 */
public class frmMantenimientoProductos extends javax.swing.JFrame {
    //Definimos instancias 
    Productos pro = new Productos();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public frmMantenimientoProductos() {
        //Llamamos a la clases CargarDatos, para que nos traiga la info de la base a la tabla de la vista 
        initComponents();
        CargarDatosLocal();
    }

    
    public void CargarDatosLocal() {
        //Inicializamos 
        tblMantenimientoEmpleados.setModel(pro.CargarDatos());
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
        lblMantenimientoProductos = new javax.swing.JLabel();
        lblEnEstaVentana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantenimientoEmpleados = new javax.swing.JTable();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        btnEliminar2 = new javax.swing.JPanel();
        lblModificar3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        lblLimpiar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        lblDerecho = new javax.swing.JLabel();
        lblBuscartxt = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        spBuscar = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        spNombre = new javax.swing.JSeparator();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        spPrecio = new javax.swing.JSeparator();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        spStock = new javax.swing.JSeparator();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        spDescripcion = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        spTelefono1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMantenimientoProductos.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        lblMantenimientoProductos.setForeground(new java.awt.Color(0, 0, 153));
        lblMantenimientoProductos.setText("Mantenimiento Productos");
        jPanel1.add(lblMantenimientoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 860, 90));

        lblEnEstaVentana.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblEnEstaVentana.setForeground(new java.awt.Color(153, 153, 153));
        lblEnEstaVentana.setText("En esta ventana podras Agregar, Modificar y Eliminar prodocutos a tu inventario");
        jPanel1.add(lblEnEstaVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 850, -1));

        tblMantenimientoEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tblMantenimientoEmpleados.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tblMantenimientoEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProductos", "Nombre", "Precio", "Stock", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMantenimientoEmpleados.setGridColor(new java.awt.Color(0, 0, 153));
        tblMantenimientoEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMantenimientoEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMantenimientoEmpleados);
        if (tblMantenimientoEmpleados.getColumnModel().getColumnCount() > 0) {
            tblMantenimientoEmpleados.getColumnModel().getColumn(0).setResizable(false);
            tblMantenimientoEmpleados.getColumnModel().getColumn(1).setResizable(false);
            tblMantenimientoEmpleados.getColumnModel().getColumn(2).setResizable(false);
            tblMantenimientoEmpleados.getColumnModel().getColumn(3).setResizable(false);
            tblMantenimientoEmpleados.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1080, 350));

        btnAgregar.setBackground(new java.awt.Color(0, 102, 255));

        lblAgregar1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar1.setText("Agregar");
        lblAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAgregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 120, 30));

        btnModificar.setBackground(new java.awt.Color(0, 102, 255));

        lblModificar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(255, 255, 255));
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("Modificar");
        lblModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 120, 30));

        btnEliminar2.setBackground(new java.awt.Color(0, 102, 255));

        lblModificar3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblModificar3.setForeground(new java.awt.Color(255, 255, 255));
        lblModificar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar3.setText("Eliminar");
        lblModificar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEliminar2Layout = new javax.swing.GroupLayout(btnEliminar2);
        btnEliminar2.setLayout(btnEliminar2Layout);
        btnEliminar2Layout.setHorizontalGroup(
            btnEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminar2Layout.createSequentialGroup()
                .addComponent(lblModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEliminar2Layout.setVerticalGroup(
            btnEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModificar3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        lblLimpiar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("Limpiar");
        lblLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, -1));

        btnRegresar.setBackground(new java.awt.Color(0, 102, 255));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        Regresar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regresar.setText("<  Regresar");
        Regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel1.add(lblDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 20, 820));

        lblBuscartxt.setBackground(new java.awt.Color(102, 102, 102));
        lblBuscartxt.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblBuscartxt.setForeground(new java.awt.Color(102, 102, 102));
        lblBuscartxt.setText("Buscar");
        jPanel1.add(lblBuscartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        txtBuscar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 310, 30));
        jPanel1.add(spBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 10));

        lblNombre.setBackground(new java.awt.Color(102, 102, 102));
        lblNombre.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, -1));

        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 430, 30));
        jPanel1.add(spNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 440, 10));

        lblPrecio.setBackground(new java.awt.Color(102, 102, 102));
        lblPrecio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(102, 102, 102));
        lblPrecio.setText("Precio");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, -1));

        txtPrecio.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecio.setBorder(null);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 430, 30));
        jPanel1.add(spPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 440, 10));

        lblStock.setBackground(new java.awt.Color(102, 102, 102));
        lblStock.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(102, 102, 102));
        lblStock.setText("Stock");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 150, -1));

        txtStock.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtStock.setForeground(new java.awt.Color(153, 153, 153));
        txtStock.setBorder(null);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 430, 30));
        jPanel1.add(spStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 440, 10));

        lblDescripcion.setBackground(new java.awt.Color(102, 102, 102));
        lblDescripcion.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        lblDescripcion.setText("Descripcion");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 150, -1));

        txtDescripcion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 430, 30));
        jPanel1.add(spDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 440, 10));

        btnBuscar.setBackground(new java.awt.Color(0, 102, 255));

        lblBuscar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");
        lblBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, -1));

        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 0));
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setBorder(null);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 110, 40));
        jPanel1.add(spTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 110, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseClicked
        txtBuscar.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtDescripcion.setText("");
       
    }//GEN-LAST:event_lblLimpiarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtBuscar.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtDescripcion.setText("");
       

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        //Invocamos a la ventana Inicio
        frmConfiguracion newframe = new frmConfiguracion();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed

    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        frmConfiguracion newframe = new frmConfiguracion();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarMouseClicked

    private void tblMantenimientoEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantenimientoEmpleadosMouseClicked
       int i = tblMantenimientoEmpleados.getSelectedRow();
        TableModel model = tblMantenimientoEmpleados.getModel();
        this.txtid.enable(false);
        this.txtid.setText(model.getValueAt(i, 0).toString());
        this.txtNombre.setText(model.getValueAt(i, 1).toString());
        this.txtPrecio.setText(model.getValueAt(i, 2).toString());
        this.txtStock.setText(model.getValueAt(i, 3).toString());
        this.txtDescripcion.setText(model.getValueAt(i, 4).toString());
       
    }//GEN-LAST:event_tblMantenimientoEmpleadosMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void lblAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregar1MouseClicked
        String resultado;
        pro.setNombre(this.txtNombre.getText());
        pro.setPrecio(this.txtPrecio.getText());
        pro.setStock(Integer.valueOf(this.txtStock.getText()));
        pro.setDescripcion(this.txtDescripcion.getText());
        resultado = pro.NuevoProducto();
        CargarDatosLocal();
    }//GEN-LAST:event_lblAgregar1MouseClicked

    private void lblModificar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificar3MouseClicked
        String resultado = null;
        resultado = pro.EliminarDatos(Integer.parseInt(txtid.getText()));
        CargarDatosLocal();
    }//GEN-LAST:event_lblModificar3MouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked
         String resultado = null;
        resultado = pro.ModificarDatos(
                Integer.parseInt(txtid.getText()),
                txtNombre.getText(),
                txtPrecio.getText(),
                Integer.parseInt(txtStock.getText()),// Float.parseFloat
                txtDescripcion.getText());
        CargarDatosLocal();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_lblModificarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
       
    }//GEN-LAST:event_lblBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(frmMantenimientoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMantenimientoProductos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Regresar;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEliminar2;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregar1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscartxt;
    private javax.swing.JLabel lblDerecho;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEnEstaVentana;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblMantenimientoProductos;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblModificar3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JSeparator spBuscar;
    private javax.swing.JSeparator spDescripcion;
    private javax.swing.JSeparator spNombre;
    private javax.swing.JSeparator spPrecio;
    private javax.swing.JSeparator spStock;
    private javax.swing.JSeparator spTelefono1;
    private javax.swing.JTable tblMantenimientoEmpleados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}