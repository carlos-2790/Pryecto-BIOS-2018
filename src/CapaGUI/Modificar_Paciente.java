/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import Excepciones.OBException;
import Logica.Paciente;
import Logica.Persona;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Modificar_Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_Paciente
     */
    public Modificar_Paciente() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_ci = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_mutualista = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR DATOS PACIENTE");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("(Ingresar CI sin puntos ni guiones)");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("CI");

        jLabel6.setText("Direccion");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Mutualista");

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        txt_ci.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_buscar))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_ci)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_telefono)
                                    .addComponent(txt_mutualista)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mutualista, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menu)
                    .addComponent(btn_limpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String nombre=null;
    String apellido=null;
    String direccion=null;
    Integer telefono=null;
    String mutualista=null;
    Integer ci=null;
    
    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       buscarPaciente();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        
        try {
            if(txt_buscar.getText()==null || txt_buscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la Cedula ");
            }else if(Integer.parseInt(txt_buscar.getText())<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar un numero que sea mayor a cero");
            }
            else{
                 Integer cedula= Integer.parseInt(txt_buscar.getText());
                 Persistencia.PersistenciaPaciente.Baja(cedula);
                 limpiar();
                 JOptionPane.showMessageDialog(null,"Se elimino correctamente");
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       
        try {
            
            nombre=txt_nombre.getText();
            apellido=txt_apellido.getText();
            ci=Integer.parseInt(txt_ci.getText());
            direccion=txt_direccion.getText();
            telefono=Integer.parseInt(txt_telefono.getText());
            mutualista=txt_mutualista.getText();
            
            if(nombre==null|| nombre.isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar el 'NOMBRE'");
            }
            else if(nombre.matches("[0-9]*")){
                JOptionPane.showMessageDialog(null,"No se aceptan  numeros en el campo 'NOMBRE'");
            }
            else if(apellido==null || apellido.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Debe ingresar el 'APELLIDO'");
            }
            else if(apellido.matches("[0-9]*")){
                JOptionPane.showMessageDialog(null,"EL campo 'Apellido' no acepta numeros");
            }
            else if(ci<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar un numero mayor que cero");
            }
            else if(direccion==null || direccion.isEmpty() ){
                JOptionPane.showMessageDialog(null,"Debe ingresar la 'DIRECCION'");
            }
            else if(direccion.matches("[0-9]*")){
                JOptionPane.showMessageDialog(null, "La direccion no puede empezar con numeros o solo llevar numeros");
            }
            else if(telefono<=0){
                JOptionPane.showMessageDialog(null,"El telefono no puede ser menor a cero o empezar con cero");
            }
            else if(mutualista==null|| mutualista.isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la 'MUTUALISTA'");
            }
            else if(mutualista.matches("[0-9]*")){
                JOptionPane.showMessageDialog(null,"EL campo 'MUTUALISTA' no empezar con numeros o llevar solo numeros");
            }else {
                 
            Paciente paciente=new Paciente(nombre, apellido, ci, direccion, telefono, mutualista);
            Persistencia.PersistenciaPaciente.Actualizar(paciente);
            JOptionPane.showMessageDialog(null,"Se mofifico correctamente");
            limpiar();}
                     
        } catch (SQLException | OBException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar caracteres numericos "+e.getMessage());
        }
        
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        Menu_Usuarario usuario= new Menu_Usuarario();
        usuario.setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_ci;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mutualista;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    
    private void buscarPaciente() {
        
        try {
            
            if(txt_buscar.getText()==null || txt_buscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar la cedula");
            }else if(Integer.parseInt(txt_buscar.getText())<=0){
                JOptionPane.showMessageDialog(null,"Debe ingresar un numero mayor a cero");
            }else{
            
            Paciente paciente= Persistencia.PersistenciaPaciente.obtenerPorCI(Integer.parseInt(txt_buscar.getText()));
            txt_nombre.setText(paciente.getNombre());
            txt_apellido.setText(paciente.getApellido());
            txt_ci.setText(paciente.getCI().toString());
            txt_direccion.setText(paciente.getDireccion());
            txt_telefono.setText(paciente.getTelefono().toString());
            txt_mutualista.setText(paciente.getMutualista());  }         
            
        } catch (SQLException | OBException  e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar Caracteres solo numericos"+e.getMessage());
        }
      
    }

    private void limpiar(){
        txt_buscar.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_ci.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_mutualista.setText("");   
    }
    



}