package eurospizza;

public class MenuDeInicio extends javax.swing.JFrame {

    public MenuDeInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(642, 477);
        this.setTitle("EUROS PIZZA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JLabel();
        Pedido = new javax.swing.JLabel();
        Llevar = new javax.swing.JButton();
        Aqui = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Bienvenida.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(204, 255, 255));
        Bienvenida.setText("BIENVENIDO/A A EUROS PIZZA");
        getContentPane().add(Bienvenida);
        Bienvenida.setBounds(120, 20, 390, 30);

        Pedido.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Pedido.setForeground(new java.awt.Color(204, 255, 255));
        Pedido.setText("¿Desea realizar su pedido para llevar o para comer aqui?");
        getContentPane().add(Pedido);
        Pedido.setBounds(40, 60, 550, 30);

        Llevar.setBackground(new java.awt.Color(0, 0, 0));
        Llevar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Llevar.setForeground(new java.awt.Color(255, 102, 0));
        Llevar.setText("Para llevar");
        Llevar.setMaximumSize(new java.awt.Dimension(90, 40));
        Llevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlevarActionPerformed(evt);
            }
        });
        getContentPane().add(Llevar);
        Llevar.setBounds(350, 130, 180, 50);

        Aqui.setBackground(new java.awt.Color(0, 0, 0));
        Aqui.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Aqui.setForeground(new java.awt.Color(255, 102, 0));
        Aqui.setText("Para comer aqui");
        Aqui.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Aqui.setMaximumSize(new java.awt.Dimension(100, 40));
        Aqui.setPreferredSize(new java.awt.Dimension(100, 40));
        Aqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AquiActionPerformed(evt);
            }
        });
        getContentPane().add(Aqui);
        Aqui.setBounds(80, 130, 180, 50);

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 102, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(370, 330, 180, 50);

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eurospizza/Imagenes/Fondo.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 630, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LlevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LlevarActionPerformed
        Menu2 M2 = new Menu2();
        M2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LlevarActionPerformed

    private void AquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AquiActionPerformed
        Menu1 M1 = new Menu1();
        M1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AquiActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aqui;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Llevar;
    private javax.swing.JLabel Pedido;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
}
