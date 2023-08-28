/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

/**
 *
 * @author danig
 */
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class MainAdmin extends javax.swing.JFrame {

    String user = "root";
    String password = "";

    /**
     * Creates new form MainAdmin
     */
    public MainAdmin() {
        setLocation(580, 250);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnVerEmpleados = new javax.swing.JButton();
        btnDespedir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        btnVerClientes = new javax.swing.JButton();
        btnContratar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(740, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 0, 102));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WellnessMentality");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 80));

        jPanel4.setBackground(new java.awt.Color(153, 0, 102));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WellnessMentality");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 740, 80));

        btnSalir.setBackground(new java.awt.Color(153, 0, 102));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 100, 20));

        btnVerEmpleados.setBackground(new java.awt.Color(153, 0, 102));
        btnVerEmpleados.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnVerEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEmpleados.setText("Ver empleados");
        btnVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, 30));

        btnDespedir.setBackground(new java.awt.Color(153, 0, 102));
        btnDespedir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDespedir.setForeground(new java.awt.Color(255, 255, 255));
        btnDespedir.setText("Despedir");
        btnDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespedirActionPerformed(evt);
            }
        });
        jPanel1.add(btnDespedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 180, 30));

        area1.setEditable(false);
        area1.setColumns(20);
        area1.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 560, 170));

        btnVerClientes.setBackground(new java.awt.Color(153, 0, 102));
        btnVerClientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnVerClientes.setText("Ver clientes");
        btnVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 180, 30));

        btnContratar.setBackground(new java.awt.Color(153, 0, 102));
        btnContratar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnContratar.setForeground(new java.awt.Color(255, 255, 255));
        btnContratar.setText("Contratar");
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LoginAdmin loginAdmin = new LoginAdmin();
        loginAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmpleadosActionPerformed
        area1.setText("");
        try {
            Arbol arbol = new Arbol();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/wellness", user, password);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM infoempleados");

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                Empleado em = new Empleado(rst.getInt(1), rst.getNString(2), rst.getNString(3), rst.getNString(4));
                arbol.insertar(em);
            }

            arbol.preOrder(area1);
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnVerEmpleadosActionPerformed

    private void btnDespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespedirActionPerformed

        try {
            int idDespedir = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del empleado a despedir"));
            Arbol arbol = new Arbol();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/wellness", user, password);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM infoempleados");

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                Empleado em = new Empleado(rst.getInt(1), rst.getNString(2), rst.getNString(3), rst.getNString(4));
                arbol.insertar(em);
                try {

                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/wellness", user, password);
                    PreparedStatement ps = cn.prepareStatement("DELETE FROM infoempleados WHERE ID = ?");

                    ps.setInt(1, idDespedir);
                    area1.setText("");
                    ps.executeUpdate();
                    arbol.eliminar(idDespedir);
                } catch (SQLException e) {
                }
            }

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnDespedirActionPerformed

    private void btnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientesActionPerformed
        LinkedList<Cliente> listaEmpleados = new LinkedList();
        //listaEmpleados.add(new Empleado(WIDTH, user, user, user))
        area1.setText("");
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/wellness", user, password);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM infoclientes");

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                Cliente cliente = new Cliente(rst.getInt("ID"), rst.getString("Nombre"), rst.getString("Correo"), rst.getString("Password"), rst.getFloat("Peso"), rst.getFloat("Altura"));
                listaEmpleados.add(cliente);
            }
            for (Cliente cli : listaEmpleados) {
                System.out.println(cli);
                area1.append(cli + "\n");
            }

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnVerClientesActionPerformed

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
        RegistroEmpleado registroEmpleado = new RegistroEmpleado();
        registroEmpleado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContratarActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JButton btnContratar;
    private javax.swing.JButton btnDespedir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerClientes;
    private javax.swing.JButton btnVerEmpleados;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
