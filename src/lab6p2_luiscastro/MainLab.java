/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6p2_luiscastro;

/**
 *
 * @author lfern
 */
public class MainLab extends javax.swing.JFrame {

    /**
     * Creates new form MainLab
     */
    public MainLab() {
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

        pn_principal = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        bt_equipos = new javax.swing.JButton();
        bt_jugadores = new javax.swing.JButton();
        bt_transferencias = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu_opciones = new javax.swing.JMenu();
        menu_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_principal.setBackground(new java.awt.Color(204, 204, 255));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        bt_equipos.setText("Crear Equipos");
        bt_equipos.setFocusable(false);
        bt_equipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_equipos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bt_equipos);

        bt_jugadores.setText("Crear Jugadores");
        bt_jugadores.setFocusable(false);
        bt_jugadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_jugadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bt_jugadores);

        bt_transferencias.setText("Transferencias");
        bt_transferencias.setFocusable(false);
        bt_transferencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_transferencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bt_transferencias);

        javax.swing.GroupLayout pn_principalLayout = new javax.swing.GroupLayout(pn_principal);
        pn_principal.setLayout(pn_principalLayout);
        pn_principalLayout.setHorizontalGroup(
            pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
        );
        pn_principalLayout.setVerticalGroup(
            pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 381, Short.MAX_VALUE))
        );

        menu_opciones.setText("Opciones");
        jMenuBar2.add(menu_opciones);

        menu_ayuda.setText("Ayuda");
        jMenuBar2.add(menu_ayuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_equipos;
    private javax.swing.JButton bt_jugadores;
    private javax.swing.JButton bt_transferencias;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_opciones;
    private javax.swing.JPanel pn_principal;
    // End of variables declaration//GEN-END:variables
}
