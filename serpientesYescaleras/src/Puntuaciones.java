


import java.sql.*;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author david
 */
public class Puntuaciones extends javax.swing.JPanel {

    /**
     * Creates new form Puntuaciones
     */
    public Puntuaciones() {
        initComponents();
        cargarTablaIndividual();
        cargarTablaCompetencia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Puntuacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompetencia = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaIndividual = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 694));

        panel_Puntuacion.setPreferredSize(new java.awt.Dimension(1150, 694));
        panel_Puntuacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCompetencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nickname", "Instagram", "tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompetencia.setShowGrid(false);
        jScrollPane1.setViewportView(tablaCompetencia);

        panel_Puntuacion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 470, 190));

        tablaIndividual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nickname", "Instagram", "tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaIndividual.setShowGrid(false);
        jScrollPane2.setViewportView(tablaIndividual);

        panel_Puntuacion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 470, 190));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Atras.gif"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_Puntuacion.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 200, 50));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Juego Competencia");
        panel_Puntuacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Juego Individual");
        panel_Puntuacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 65)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Leaderboard");
        jLabel5.setToolTipText("");
        panel_Puntuacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 65)); // NOI18N
        jLabel3.setText("Leaderboard");
        jLabel3.setToolTipText("");
        panel_Puntuacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Panel vacio.png"))); // NOI18N
        jLabel1.setToolTipText("");
        panel_Puntuacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Inicio b4 = new Inicio();
        showPanel(b4.getFondo());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cargarTablaIndividual(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaIndividual.getModel();
        modeloTabla.setRowCount(0);
        
        //PreparedStatement ps;
        //ResultSet rs;
        //ResultSetMetaData rsmd;
        int columnas;
        ResultSetMetaData rsmd;
        Connection conexion = null;
        Statement senten = null;
        //tiros_lanzados = Integer.parseInt(txtlanzados2.getText());
        //tiros_encestados = Integer.parseInt(txtencestados2.getText());
        //efectividad = (tiros_encestados/tiros_lanzados)*100;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
            conexion = DriverManager.getConnection(url, "sa", "12345678");
            senten = conexion.createStatement();
            // Paso 4: Ejecutar una consulta:
            
            String consulta = "SELECT\n"
                    + "    j.nickname,\n"
                    + "    j.instagram,\n"
                    + "    CONVERT(VARCHAR(10), MIN(DATEDIFF(SECOND, ju.fecha_inicio, ju.fecha_fin)) / 60) + ' minutos' AS tiempo\n"
                    + "FROM\n"
                    + "    Jugador j\n"
                    + "INNER JOIN\n"
                    + "    Registro_Partida rp ON j.id_jugador = rp.id_jugador\n"
                    + "INNER JOIN\n"
                    + "    Juego ju ON rp.id_juego = ju.id_juego\n"
                    + "WHERE\n"
                    + "    ju.tipo_juego = 'individual'\n"
                    + "GROUP BY\n"
                    + "    j.nickname,\n"
                    + "    j.instagram\n"
                    + "ORDER BY\n"
                    + "    MIN(DATEDIFF(SECOND, ju.fecha_inicio, ju.fecha_fin)) ASC;";
            ResultSet resultado = senten.executeQuery(consulta);
            rsmd = resultado.getMetaData();
            columnas = rsmd.getColumnCount();
            
           // Paso 5: Manipilar los resultados:
            System.out.println("El resultado de la consulta es:");
            System.out.printf("%-30s %-30s %s%n", "Nickname", "Instagram", "Tiempo");
            while (resultado.next()) {
                Object [] fila = new Object[columnas];
                for(int indice=0; indice<columnas;indice++){
                    fila[indice] = resultado.getObject(indice+1);
                }
                modeloTabla.addRow(fila);
            }
   
           /* if (resultado == 0) {
                System.out.println("No se pudo intertar el registro.");
                JOptionPane.showMessageDialog(null, "No se pudo intertar el registro.");
            }
            else {
                System.out.println("Registro insertado exitosamente.");
                JOptionPane.showMessageDialog(null, "Registro insertado exitosamente.");
            }
*/
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
    private void cargarTablaCompetencia(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCompetencia.getModel();
        modeloTabla.setRowCount(0);
        
        //PreparedStatement ps;
        //ResultSet rs;
        //ResultSetMetaData rsmd;
        int columnas;
        ResultSetMetaData rsmd;
        Connection conexion = null;
        Statement senten2 = null;
        //tiros_lanzados = Integer.parseInt(txtlanzados2.getText());
        //tiros_encestados = Integer.parseInt(txtencestados2.getText());
        //efectividad = (tiros_encestados/tiros_lanzados)*100;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url2 = "jdbc:sqlserver://localhost:1433;databaseName=Base_Proyecto_Poo4;TrustServerCertificate=True;";
            conexion = DriverManager.getConnection(url2, "sa", "12345678");
            senten2 = conexion.createStatement();
            // Paso 4: Ejecutar una consulta:
            
            String consulta = "SELECT\n"
                    + "    j.nickname,\n"
                    + "    j.instagram,\n"
                    + "    CONVERT(VARCHAR(10), MIN(DATEDIFF(SECOND, ju.fecha_inicio, ju.fecha_fin)) / 60) + ' minutos' AS tiempo\n"
                    + "FROM\n"
                    + "    Jugador j\n"
                    + "INNER JOIN\n"
                    + "    Registro_Partida rp ON j.id_jugador = rp.id_jugador\n"
                    + "INNER JOIN\n"
                    + "    Juego ju ON rp.id_juego = ju.id_juego\n"
                    + "WHERE\n"
                    + "    ju.tipo_juego = 'Competencia'\n"
                    + "    AND rp.jugador_ganador = 1\n"
                    + "GROUP BY\n"
                    + "    j.nickname, j.instagram\n"
                    + "ORDER BY\n"
                    + "    MIN(DATEDIFF(SECOND, ju.fecha_inicio, ju.fecha_fin)) ASC;";
            ResultSet resultado = senten2.executeQuery(consulta);
            rsmd = resultado.getMetaData();
            columnas = rsmd.getColumnCount();
            
           // Paso 5: Manipilar los resultados:
            System.out.println("El resultado de la consulta es:");
            System.out.printf("%-30s %-30s %s%n", "Nickname", "Instagram", "Tiempo");
            while (resultado.next()) {
                Object [] fila = new Object[columnas];
                for(int indice=0; indice<columnas;indice++){
                    fila[indice] = resultado.getObject(indice+1);
                }
                modeloTabla.addRow(fila);
            }
   
           /* if (resultado == 0) {
                System.out.println("No se pudo intertar el registro.");
                JOptionPane.showMessageDialog(null, "No se pudo intertar el registro.");
            }
            else {
                System.out.println("Registro insertado exitosamente.");
                JOptionPane.showMessageDialog(null, "Registro insertado exitosamente.");
            }
*/
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: no se encuentra el archivo de la");
            System.out.println("clase para la conexión con la base de datos.");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Error de conexión a la base de datos.");
            ex.printStackTrace();
        } finally {
            try {
                senten2.close();
                conexion.close();
            }
            catch (SQLException ex) {
                System.out.println("Error en cierre de conexión.");
            }

        }
        
        
    }
    private void showPanel(JPanel p){
        p.setSize(1150, 694);
        p.setLocation(0, 0);
        panel_Puntuacion.removeAll();
        panel_Puntuacion.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        panel_Puntuacion.revalidate();
        panel_Puntuacion.repaint();
    }
 public JPanel getFondo() {
        return panel_Puntuacion;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_Puntuacion;
    private javax.swing.JTable tablaCompetencia;
    private javax.swing.JTable tablaIndividual;
    // End of variables declaration//GEN-END:variables
}