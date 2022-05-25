package grafica;

import com.toedter.calendar.JDateChooser;
import datos.Registro;
import datos.Opcion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.GestorRegistro;

/**
 *
 * @author TP303
 */
public class Ventana extends javax.swing.JFrame {
   
    private Opcion laopcion;
    private JDateChooser cjFecha;
    
    private DefaultTableModel modelTabla;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
        cjFecha = new JDateChooser();
        getContentPane().add(cjFecha);
        cjFecha.setBounds(40, 110, 150, 20);
        
        this.cargarRegistros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        cjNombre = new javax.swing.JTextField();
        cjId = new javax.swing.JTextField();
        cjPlaca = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btIngreso = new javax.swing.JRadioButton();
        btSalida = new javax.swing.JRadioButton();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        buttonGroup1.add(btIngreso);
        btIngreso.setText("INGRESO");
        btIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresoActionPerformed(evt);
            }
        });

        buttonGroup1.add(btSalida);
        btSalida.setText("SALIDA");
        btSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalidaActionPerformed(evt);
            }
        });

        label3.setText("NOMBRE");

        label2.setText("ID");

        label1.setText("PLACA");

        jLabel1.setText("FECHA");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PARQUEADERO MOTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(label1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cjId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(cjPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalida)
                    .addComponent(btIngreso))
                .addGap(27, 27, 27))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label3)
                    .addComponent(label2)
                    .addComponent(label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cjId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cjPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(btGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalir)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresoActionPerformed
      this.clickOpcion(1);
    }//GEN-LAST:event_btIngresoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        this.crearRegistro();
        
        int entero;
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite los minutos que espera dejar su moto en el parqueadero \nel costo por minuto es igual a 85$"));
        JOptionPane.showMessageDialog(null,"el valor a pagar es : "+entero*85);
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalidaActionPerformed
        this.clickOpcion(2);
    }//GEN-LAST:event_btSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
     private void clickOpcion(int opcion){
        //JOptionPane.showMessageDialog(this, opcion);
        if (opcion == 1){
            this.laopcion = Opcion.INGRESO;
        }else{
            this.laopcion = Opcion.SALIDA;
        }
    }
    private void crearRegistro(){
        
        String nombre = cjNombre.getText();
        String identificacion = cjId.getText();
        Date fecha = cjFecha.getDate();//this.convertirStrinToDate(cjFechaNac.getText());
        String placa = cjPlaca.getText();//this.convertirStrinToDate(cjFechaCita.getText());
        
        GestorRegistro g = new GestorRegistro();
        Registro c = g.crearReg(nombre, identificacion,  fecha, this.laopcion,placa);
        if (c != null){
            this.cargarRegistros();
            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos");
        }
        
    }
    private Date convertirStrinToDate(String fecha){
        //"22/33/2222"
        if (fecha == null || fecha.isEmpty()){
            return new Date();
        }else{
            String lafecha[] = fecha.split("/");
            Calendar c = Calendar.getInstance();
            c.set(Integer.parseInt(lafecha[2]), 
                Integer.parseInt(lafecha[1]), 
                Integer.parseInt(lafecha[0]));
        return c.getTime();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JRadioButton btIngreso;
    private javax.swing.JRadioButton btSalida;
    private javax.swing.JButton btSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cjId;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables

    private void cargarRegistros() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("PLACA");
        modelo.addColumn("FECHA");
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("OPCION");
        
        GestorRegistro gestor = new GestorRegistro();
        Map<String, Registro> lista = gestor.obtenerLista();
        for (Map.Entry<String, Registro> dato  : lista.entrySet()) {
            Registro elregistro = dato.getValue();
            Object[] datos = {
                elregistro.obtenerConductor().obtenerPlaca(),
                utilidades.Util.convertirDateString(elregistro.obtenerFecha()),
             
              
                elregistro.obtenerConductor().obtenerIdentificacion(),
                elregistro.obtenerConductor().obtenerNombre(),
                elregistro.obtenerOpcion().toString()
            };
            modelo.addRow(datos);
            
        }
        this.tblDatos.setModel(modelo);
    }
//    public static void main(String[] args){
//        
//        int entero;
//        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
//        JOptionPane.showMessageDialog(null,"el numero es:"+entero);
//    }
    
    /*private void cargarTabla(Registro c) {
    ArrayList<Registro> listatotal = new ArrayList<>();
    }
    */
}//FIN DE CLASE

