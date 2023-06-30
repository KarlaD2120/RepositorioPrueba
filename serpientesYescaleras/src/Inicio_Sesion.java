
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author david
 * 
 */

public class Inicio_Sesion extends javax.swing.JPanel {

    private String Nickname1;
    private String Sexo;
    /**
     * Contructor del Panel y de las variables
     */
    public Inicio_Sesion() {
        initComponents();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbtFemenino);
        buttonGroup.add(rbtMasculino);
        // Iniciar el programa con ambos JRadioButton deseleccionados
        buttonGroup.clearSelection();
        listenerParaRadioButtom();

    }

    public Inicio_Sesion(String Nickname1) {
        this.Nickname1 = Nickname1;
    }

    //Getters 
    public String getNickname1() {
        return Nickname1;
    }
    //Setter

    public void setNickname1(String Nickname1) {
        this.Nickname1 = Nickname1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicioSesion = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtNickname = new javax.swing.JTextField();
        txtNicknameRegistro = new javax.swing.JTextField();
        txtInstagram = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        rbtFemenino = new javax.swing.JRadioButton();
        rbtMasculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        panelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IniciasSesion.gif"))); // NOI18N
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(200, 90));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        panelInicioSesion.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Registrar.gif"))); // NOI18N
        btnRegistrar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelInicioSesion.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        txtNickname.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicknameActionPerformed(evt);
            }
        });
        panelInicioSesion.add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 190, 30));

        txtNicknameRegistro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtNicknameRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicknameRegistroActionPerformed(evt);
            }
        });
        panelInicioSesion.add(txtNicknameRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 130, 30));

        txtInstagram.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        panelInicioSesion.add(txtInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 220, 30));

        txtNombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelInicioSesion.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 220, 30));

        rbtFemenino.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        rbtFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbtFemenino.setText("Femenino");
        rbtFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemeninoActionPerformed(evt);
            }
        });
        panelInicioSesion.add(rbtFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        rbtMasculino.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        rbtMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbtMasculino.setText("Masculino");
        panelInicioSesion.add(rbtMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Sesion.png"))); // NOI18N
        jLabel1.setToolTipText("");
        panelInicioSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNicknameRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameRegistroActionPerformed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameActionPerformed
    
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        Nickname1 = txtNickname.getText();
        BancoDeVariables.setjugador1(Nickname1);
        conexionVerificacionNickname();
    
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    private void listenerParaRadioButtom(){
            rbtFemenino.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sexo = "F";
                System.out.println(Sexo);
            }
        });

        rbtMasculino.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sexo = "M";
                System.out.println(Sexo);
            }
        });
}
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        listenerParaRadioButtom();
        //Validacion para verificar que se ingresen letras y no numeros
        String nicknameIngresado = txtNicknameRegistro.getText();
        String nombreIngresado = txtNombre.getText();

        if (nombreIngresado.matches("[a-zA-Z\\s]+")) { // Si es una cadena

            if (nicknameIngresado.matches("[a-zA-Z0-9\\s]+")) { // Permitir letras y números
                // Establecer conexión con la base de datos para verificar nickname
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
                String username = "sa";
                String password = "12345678";
                String nombre = txtNombre.getText();
                //Sexo se elige arriba
                String Instagram = txtInstagram.getText();
                String NicknameRegistro = txtNicknameRegistro.getText();;
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // Crear consulta SQL
                    String sql = "SELECT COUNT(*) FROM Jugador WHERE nickname = ?";

                    // Preparar la declaración
                    try (PreparedStatement statement = connection.prepareStatement(sql)) {
                        // Establecer el valor del parámetro
                        statement.setString(1, NicknameRegistro);

                        // Ejecutar la consulta de verificacion
                        try (ResultSet resultSet = statement.executeQuery()) {
                            if (resultSet.next()) {
                                int count = resultSet.getInt(1);

                                if (count > 0) {
                                    // Ya existe un usuario con el mismo Nickname
                                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con el mismo Nickname. Por favor, crea uno diferente o inicia sesión.");
                                } else {
                                    //Conecta a la base de datos y registra 
                                    conexionRegistro();
                                    conexionEncontrarIDdeNicknameRegistro();
                                    //Continua con el menu
                                    MododeJuego b4 = new MododeJuego();
                                    showPanel(b4.getFondo2());
                                }
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(this, "ERROR: el nickname ingresado es inválido. Intente nuevamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: el nombre ingresado es inválido. Intente nuevamente");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void rbtFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFemeninoActionPerformed
    private void conexionRegistro(){
        //Conexion a la base de datos para registrar
        Connection conexion = null;
        PreparedStatement senten = null;
        String nombre = txtNombre.getText();
        //Sexo se elige arriba
        String Instagram = txtInstagram.getText();
        String NicknameRegistro=txtNicknameRegistro.getText();;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
            conexion = DriverManager.getConnection(url, "sa", "12345678");
            // Paso 4: Ejecutar una consulta:
            String consulta = "insert into Jugador values (?,?,?,?)";

            senten = conexion.prepareStatement(consulta);
            senten.setString(1, nombre);
            senten.setString(2, Sexo);
            senten.setString(3, Instagram);
            senten.setString(4, NicknameRegistro);
            int resultado = senten.executeUpdate();
            if (resultado == 0) {
                System.out.println("No se pudo intertar el registro.");
                JOptionPane.showMessageDialog(null, "No se pudo intertar el registro.");
                }
                else {
                    System.out.println("Registro insertado exitosamente.");
                    JOptionPane.showMessageDialog(null, "Registro insertado exitosamente.");
                    }

                } catch (ClassNotFoundException ex) {
                    System.out.println("Error: no se encuentra el archivo de la");
                    System.out.println("clase para la conexión con la base de datos.");
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    System.out.println("Error de conexión a la base de datos.");
                    ex.printStackTrace();
                } finally {
                    try {
                        senten.close();
                        conexion.close();
                    }
                    catch (SQLException ex) {
                        System.out.println("Error en cierre de conexión.");
                    }

                }
    }
    private void conexionVerificacionNickname(){
        // Establecer conexión con la base de datos para verificar nickname registrado
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
                String username = "sa";
                String password = "12345678";
                String nombre = txtNombre.getText();
                //Sexo se elige arriba
                String Nickname = txtNickname.getText();;
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    // Crear consulta SQL
                    String sql = "SELECT COUNT(*) FROM Jugador WHERE nickname = ?";

                    // Preparar la declaración
                    try (PreparedStatement statement = connection.prepareStatement(sql)) {
                        // Establecer el valor del parámetro
                        statement.setString(1, Nickname);

                        // Ejecutar la consulta de verificacion
                        try (ResultSet resultSet = statement.executeQuery()) {
                            if (resultSet.next()) {
                                int count = resultSet.getInt(1);

                                if (count > 0) {
                                    // Ya existe un usuario con el mismo Nickname
                                    conexionEncontrarIDdeNickname();
                                    MododeJuego b4 = new MododeJuego();
                                    showPanel(b4.getFondo2());
                                    System.out.println(Nickname1);
                                } else {
                                    //No existe el nickname en la base de datos
                                    JOptionPane.showMessageDialog(null, "Nickname inexistente, por favor escriba correctamente el nickname o registrate");
                                }
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }
    private void conexionEncontrarIDdeNickname(){
        //Conexion a la base de datos para registrar
        Connection conexion = null;
        PreparedStatement senten = null;
        String Nickname=txtNickname.getText();;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
            conexion = DriverManager.getConnection(url, "sa", "12345678");
            // Paso 4: Ejecutar una consulta:
            String consulta = "SELECT id_jugador FROM Jugador WHERE nickname = ?";

            senten = conexion.prepareStatement(consulta);
            senten.setString(1, Nickname);
            
            try (ResultSet resultSet = senten.executeQuery()) {
                if (resultSet.next()) {
                    int idJugador = resultSet.getInt("id_jugador");
                    BancoDeVariables.setIdJugador1(idJugador);
                    System.out.println("El ID del jugador con ese nickname es: " + idJugador);
                } else {
                    System.out.println("No se encontró ningún jugador con el nickname 'Ghost'.");
                }
            }
                } catch (ClassNotFoundException ex) {
                    System.out.println("Error: no se encuentra el archivo de la");
                    System.out.println("clase para la conexión con la base de datos.");
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    System.out.println("Error de conexión a la base de datos.");
                    ex.printStackTrace();
                } finally {
                    try {
                        senten.close();
                        conexion.close();
                    }
                    catch (SQLException ex) {
                        System.out.println("Error en cierre de conexión.");
                    }

                }
    }
    private void conexionEncontrarIDdeNicknameRegistro(){
        //Conexion a la base de datos para registrar
        Connection conexion = null;
        PreparedStatement senten = null;
        String Nickname=txtNicknameRegistro.getText();;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
            conexion = DriverManager.getConnection(url, "sa", "12345678");
            // Paso 4: Ejecutar una consulta:
            String consulta = "SELECT id_jugador FROM Jugador WHERE nickname = ?";

            senten = conexion.prepareStatement(consulta);
            senten.setString(1, Nickname);
            
            try (ResultSet resultSet = senten.executeQuery()) {
                if (resultSet.next()) {
                    int idJugador = resultSet.getInt("id_jugador");
                    BancoDeVariables.setIdJugador1(idJugador);
                    System.out.println("El ID del jugador con ese nickname es: " + idJugador);
                } else {
                    System.out.println("No se encontró ningún jugador con el nickname 'Ghost'.");
                }
            }
                } catch (ClassNotFoundException ex) {
                    System.out.println("Error: no se encuentra el archivo de la");
                    System.out.println("clase para la conexión con la base de datos.");
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    System.out.println("Error de conexión a la base de datos.");
                    ex.printStackTrace();
                } finally {
                    try {
                        senten.close();
                        conexion.close();
                    }
                    catch (SQLException ex) {
                        System.out.println("Error en cierre de conexión.");
                    }

                }
    }
    private void showPanel(JPanel p) {
        p.setSize(1150, 694);
        p.setLocation(0, 0);
        panelInicioSesion.removeAll();
        panelInicioSesion.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelInicioSesion.revalidate();
        panelInicioSesion.repaint();
    }

    public JPanel getFondo() {
        return panelInicioSesion;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelInicioSesion;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtInstagram;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNicknameRegistro;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}