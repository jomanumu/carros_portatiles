
import java.sql.Time;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class form_reservar_carros extends javax.swing.JFrame {
    Map<String, String> usuariosRegistrados = new HashMap();
    Map<String, String> carrosPortatiles = new HashMap();
    Map<String, String> usuariosAdministradores = new HashMap();
    
    int carrosDisponibles = 0;
    int carrosNoDisponibles = 0;
    
    String usuario = "";
    String password = "";
    
    // VARIABLES QUE ALMACENA EL CODIGO Y LA RESERVA
    String codReserva = "";
    boolean reservado = false;
    
    /**
     * Creates new form form_reservar_carros
     */
    public form_reservar_carros() {
        initComponents();
    }
    
    public form_reservar_carros(Map userRegistrados, Map userAdministradores, Map carrosPort, int carrosD, int carrosND,
            String user, String pass) {
        initComponents();
        usuariosRegistrados = userRegistrados;
        usuariosAdministradores = userAdministradores;
        carrosPortatiles = carrosPort;
        carrosDisponibles = carrosD;
        carrosNoDisponibles = carrosND;
        usuario = user;
        password = pass;
        
        // SI EL USUARIO YA REALIZÓ UNA RESERVA, APARECERÁ UN FORMULARIO DONDE
        // PODRÁ CANCELAR DICHA RESERVA.
        if (reservado == true) {
            form_cancelar_reserva formCancelarReserva = new form_cancelar_reserva(usuariosRegistrados, usuariosAdministradores, 
                    carrosPortatiles, carrosDisponibles, carrosNoDisponibles, usuario, password, reservado, codReserva);
            this.setVisible(false);
            formCancelarReserva.setVisible(true);
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

        grupoBotonDiaHora = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        L1 = new javax.swing.JRadioButton();
        M1 = new javax.swing.JRadioButton();
        X1 = new javax.swing.JRadioButton();
        J1 = new javax.swing.JRadioButton();
        V1 = new javax.swing.JRadioButton();
        L2 = new javax.swing.JRadioButton();
        M2 = new javax.swing.JRadioButton();
        X2 = new javax.swing.JRadioButton();
        J2 = new javax.swing.JRadioButton();
        V2 = new javax.swing.JRadioButton();
        L3 = new javax.swing.JRadioButton();
        M3 = new javax.swing.JRadioButton();
        X3 = new javax.swing.JRadioButton();
        J3 = new javax.swing.JRadioButton();
        V3 = new javax.swing.JRadioButton();
        L4 = new javax.swing.JRadioButton();
        M4 = new javax.swing.JRadioButton();
        X4 = new javax.swing.JRadioButton();
        J4 = new javax.swing.JRadioButton();
        V4 = new javax.swing.JRadioButton();
        L5 = new javax.swing.JRadioButton();
        M5 = new javax.swing.JRadioButton();
        J5 = new javax.swing.JRadioButton();
        X5 = new javax.swing.JRadioButton();
        V5 = new javax.swing.JRadioButton();
        L6 = new javax.swing.JRadioButton();
        M6 = new javax.swing.JRadioButton();
        X6 = new javax.swing.JRadioButton();
        J6 = new javax.swing.JRadioButton();
        V6 = new javax.swing.JRadioButton();
        botonReservar = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVA DE CARROS DE PORTÁTILES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("LUNES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("VIERNES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("JUEVES");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("MIERCOLES");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("MARTES");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("8:15 - 9:15");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("9:15 - 10:15");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("10:15 - 11:15");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("11:45 - 12:45");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("12:45 -13:45");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("13:45-14:45");

        grupoBotonDiaHora.add(L1);
        L1.setName(""); // NOI18N

        grupoBotonDiaHora.add(M1);

        grupoBotonDiaHora.add(X1);

        grupoBotonDiaHora.add(J1);

        grupoBotonDiaHora.add(V1);

        grupoBotonDiaHora.add(L2);

        grupoBotonDiaHora.add(M2);

        grupoBotonDiaHora.add(X2);

        grupoBotonDiaHora.add(J2);

        grupoBotonDiaHora.add(V2);

        grupoBotonDiaHora.add(L3);

        grupoBotonDiaHora.add(M3);

        grupoBotonDiaHora.add(X3);

        grupoBotonDiaHora.add(J3);

        grupoBotonDiaHora.add(V3);

        grupoBotonDiaHora.add(L4);

        grupoBotonDiaHora.add(M4);

        grupoBotonDiaHora.add(X4);

        grupoBotonDiaHora.add(J4);

        grupoBotonDiaHora.add(V4);

        grupoBotonDiaHora.add(L5);

        grupoBotonDiaHora.add(M5);

        grupoBotonDiaHora.add(J5);

        grupoBotonDiaHora.add(X5);

        grupoBotonDiaHora.add(V5);

        grupoBotonDiaHora.add(L6);

        grupoBotonDiaHora.add(M6);

        grupoBotonDiaHora.add(X6);

        grupoBotonDiaHora.add(J6);

        grupoBotonDiaHora.add(V6);

        botonReservar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonReservar.setText("RESERVAR");
        botonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L1)
                                    .addComponent(jLabel2))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(M2)
                                            .addComponent(M1)
                                            .addComponent(M3)
                                            .addComponent(M4)
                                            .addComponent(M5)
                                            .addComponent(M6))
                                        .addGap(132, 132, 132)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(X1)
                                            .addComponent(X2)
                                            .addComponent(X3)
                                            .addComponent(X4)
                                            .addComponent(X5))
                                        .addGap(129, 129, 129)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(J1)
                                            .addComponent(J2)
                                            .addComponent(J3)
                                            .addComponent(J4)
                                            .addComponent(J5))
                                        .addGap(129, 129, 129)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(V5)
                                            .addComponent(V4)
                                            .addComponent(V3)
                                            .addComponent(V2)
                                            .addComponent(V1)
                                            .addComponent(V6))
                                        .addGap(0, 49, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L2)
                                    .addComponent(L3)
                                    .addComponent(L4)
                                    .addComponent(L5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(L6)
                                        .addGap(273, 273, 273)
                                        .addComponent(X6)
                                        .addGap(129, 129, 129)
                                        .addComponent(J6)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(botonReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {J1, J2, J3, J4, J5, J6, L1, L2, L3, L4, L5, L6, M1, M2, M3, M4, M5, M6, V1, V2, V3, V4, V5, V6, X1, X2, X3, X4, X5, X6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(X1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L1))
                                .addComponent(J1)
                                .addComponent(V1))
                            .addComponent(M1))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M2)
                                .addGap(46, 46, 46)
                                .addComponent(M3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(X2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(L2)
                                        .addGap(4, 4, 4))
                                    .addComponent(J2)
                                    .addComponent(V2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(J3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(V3, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addComponent(L3)
                            .addComponent(X3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(M4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(X4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(J4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(V4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(L4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5)
                    .addComponent(M5)
                    .addComponent(J5)
                    .addComponent(X5)
                    .addComponent(V5))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(M6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(X6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(J6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(V6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(botonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {J1, J2, J3, J4, J5, J6, L1, L2, L3, L4, L5, L6, M1, M2, M3, M4, M5, M6, V1, V2, V3, V4, V5, V6, X1, X2, X3, X4, X5, X6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActionPerformed
        String dia = "lunes";
        if (L1.isSelected() && reservado != true) {
            reservado = true;
            codReserva = "L1";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 8:15");
            L1.setEnabled(false);
        } else if (L2.isSelected() && reservado != true) {
            reservado = true;
            codReserva = "L2";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 9:15");
            L2.setEnabled(false);
        } else if (L3.isSelected() && reservado != true) {
            reservado = true;
            codReserva = "L3";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 10:15");
            L3.setEnabled(false);
        } else if (L4.isSelected() && reservado != true) {
            reservado = true;
            codReserva = "L4";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 11:45");
            L4.setEnabled(false);
        } else if (L5.isSelected() && reservado != true) {
            reservado = true;
            codReserva = "L5";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 12:45");
            L5.setEnabled(false);
        } else if (L6.isSelected() && reservado != true) {
            reservado = true;
            codReserva = "L6";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 13:15");
            L6.setEnabled(false);
        } else if (M1.isSelected() && reservado != true) {
            dia = "martes";
            reservado = true;
            codReserva = "M1";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 8:15");
            M1.setEnabled(false);
        } else if (M2.isSelected() && reservado != true) {
            dia = "martes";
            reservado = true;
            codReserva = "M2";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 9:15");
            M2.setEnabled(false);
        } else if (M3.isSelected() && reservado != true) {
            dia = "martes";
            reservado = true;
            codReserva = "M3";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 10:15");
            M3.setEnabled(false);
        } else if (M4.isSelected() && reservado != true) {
            dia = "martes";
            reservado = true;
            codReserva = "M4";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 11:45");
            M4.setEnabled(false);
        } else if (M5.isSelected() && reservado != true) {
            dia = "martes";
            reservado = true;
            codReserva = "M5";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 12:45");
            M5.setEnabled(false);
        } else if (M6.isSelected() && reservado != true) {
            dia = "martes";
            reservado = true;
            codReserva = "M6";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 13:45");
            M2.setEnabled(false);
        } else if (X1.isSelected() && reservado != true) {
            dia = "miércoles";
            reservado = true;
            codReserva = "X1";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 8:15");
            X1.setEnabled(false);
        } else if (X2.isSelected() && reservado != true) {
            dia = "miércoles";
            reservado = true;
            codReserva = "X2";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 9:15");
            X2.setEnabled(false);
        } else if (X3.isSelected() && reservado != true) {
            dia = "miércoles";
            reservado = true;
            codReserva = "X3";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 10:15");
            X3.setEnabled(false);
        } else if (X4.isSelected() && reservado != true) {
            dia = "miércoles";
            reservado = true;
            codReserva = "X4";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 11:45");
            X4.setEnabled(false);
        } else if (X5.isSelected() && reservado != true) {
            dia = "miércoles";
            reservado = true;
            codReserva = "X5";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 12:45");
            X5.setEnabled(false);
        } else if (X6.isSelected() && reservado != true) {
            dia = "miércoles";
            reservado = true;
            codReserva = "X6";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 13:45");
            X6.setEnabled(false);
        } else if (J1.isSelected() && reservado != true) {
            dia = "jueves";
            reservado = true;
            codReserva = "J1";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 8:15");
            J1.setEnabled(false);
        } else if (J2.isSelected() && reservado != true) {
            dia = "jueves";
            reservado = true;
            codReserva = "J2";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 9:15");
            J2.setEnabled(false);
        } else if (J3.isSelected() && reservado != true) {
            dia = "jueves";
            reservado = true;
            codReserva = "J3";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 10:15");
            J3.setEnabled(false);
        } else if (J4.isSelected() && reservado != true) {
            dia = "jueves";
            reservado = true;
            codReserva = "J4";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 11:45");
            J4.setEnabled(false);
        } else if (J5.isSelected() && reservado != true) {
            dia = "jueves";
            reservado = true;
            codReserva = "J5";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 12:45");
            J5.setEnabled(false);
        } else if (J6.isSelected() && reservado != true) {
            dia = "jueves";
            reservado = true;
            codReserva = "J6";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 13:45");
            J6.setEnabled(false);
        }  else if (V1.isSelected() && reservado != true) {
            dia = "viernes";
            reservado = true;
            codReserva = "V1";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 8:15");
            V1.setEnabled(false);
        } else if (V2.isSelected() && reservado != true) {
            dia = "viernes";
            reservado = true;
            codReserva = "V2";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 9:15");
            V2.setEnabled(false);
        } else if (V3.isSelected() && reservado != true) {
            dia = "viernes";
            reservado = true;
            codReserva = "V3";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 10:15");
            V3.setEnabled(false);
        } else if (V4.isSelected() && reservado != true) {
            dia = "viernes";
            reservado = true;
            codReserva = "V4";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 11:45");
            V4.setEnabled(false);
        } else if (V5.isSelected() && reservado != true) {
            dia = "viernes";
            reservado = true;
            codReserva = "V5";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 12:45");
            V5.setEnabled(false);
        } else if (V6.isSelected() && reservado != true) {
            dia = "viernes";
            reservado = true;
            codReserva = "V6";
            JOptionPane.showMessageDialog(null, "El usuario " + usuario + " ha reservado un carro de portátiles el " + dia + " a las 13:45");
            V6.setEnabled(false);
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "YA TIENES UNA RESERVA RECIENTE, ¿DESEAN CANCELARLA?");
            if (opcion != 0) {
                // NADA
            } else {
                form_cancelar_reserva formCancelarReserva = new form_cancelar_reserva(usuariosRegistrados, usuariosAdministradores, carrosPortatiles, 
                    carrosDisponibles, carrosNoDisponibles, usuario, password, reservado, codReserva);
                this.setVisible(false);
                formCancelarReserva.setVisible(true);
            }
            
        }
    }//GEN-LAST:event_botonReservarActionPerformed

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
            java.util.logging.Logger.getLogger(form_reservar_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_reservar_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_reservar_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_reservar_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_reservar_carros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton J1;
    private javax.swing.JRadioButton J2;
    private javax.swing.JRadioButton J3;
    private javax.swing.JRadioButton J4;
    private javax.swing.JRadioButton J5;
    private javax.swing.JRadioButton J6;
    private javax.swing.JRadioButton L1;
    private javax.swing.JRadioButton L2;
    private javax.swing.JRadioButton L3;
    private javax.swing.JRadioButton L4;
    private javax.swing.JRadioButton L5;
    private javax.swing.JRadioButton L6;
    private javax.swing.JRadioButton M1;
    private javax.swing.JRadioButton M2;
    private javax.swing.JRadioButton M3;
    private javax.swing.JRadioButton M4;
    private javax.swing.JRadioButton M5;
    private javax.swing.JRadioButton M6;
    private javax.swing.JRadioButton V1;
    private javax.swing.JRadioButton V2;
    private javax.swing.JRadioButton V3;
    private javax.swing.JRadioButton V4;
    private javax.swing.JRadioButton V5;
    private javax.swing.JRadioButton V6;
    private javax.swing.JRadioButton X1;
    private javax.swing.JRadioButton X2;
    private javax.swing.JRadioButton X3;
    private javax.swing.JRadioButton X4;
    private javax.swing.JRadioButton X5;
    private javax.swing.JRadioButton X6;
    private javax.swing.JButton botonReservar;
    private javax.swing.ButtonGroup grupoBotonDiaHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
