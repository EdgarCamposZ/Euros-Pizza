package eurospizza;

public class Menu2 extends javax.swing.JFrame {

    public Menu2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(642, 477);
        this.setTitle("EUROS PIZZA        PARA LLEVAR");   
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu2 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        PepperoniG = new javax.swing.JLabel();
        CocaCola3L = new javax.swing.JLabel();
        CarneG = new javax.swing.JLabel();
        SupremaG2 = new javax.swing.JLabel();
        QuesoG = new javax.swing.JLabel();
        Palitroques = new javax.swing.JLabel();
        PanConAjo = new javax.swing.JLabel();
        PepperoniP = new javax.swing.JLabel();
        SupremaP = new javax.swing.JLabel();
        CarneP = new javax.swing.JLabel();
        QuesoP = new javax.swing.JLabel();
        PizzaCalzone = new javax.swing.JLabel();
        Pepsi16Oz = new javax.swing.JLabel();
        CocaCola16oz = new javax.swing.JLabel();
        TeFrambuesa16oz = new javax.swing.JLabel();
        PepperoniGrande = new javax.swing.JSpinner();
        SupremaGrande = new javax.swing.JSpinner();
        CarneGrande = new javax.swing.JSpinner();
        QuesoGrande = new javax.swing.JSpinner();
        Pali = new javax.swing.JSpinner();
        PanC = new javax.swing.JSpinner();
        PepperoniPersonal = new javax.swing.JSpinner();
        SupremaPersonal = new javax.swing.JSpinner();
        CarnePersonal = new javax.swing.JSpinner();
        QuesoPersonal = new javax.swing.JSpinner();
        PizzaC = new javax.swing.JSpinner();
        Pep16 = new javax.swing.JSpinner();
        Coc16 = new javax.swing.JSpinner();
        Te16 = new javax.swing.JSpinner();
        Coc3 = new javax.swing.JSpinner();
        Guardar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Menu2.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        Menu2.setForeground(new java.awt.Color(255, 255, 255));
        Menu2.setText("Menu");
        getContentPane().add(Menu2);
        Menu2.setBounds(270, 0, 70, 30);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(507, 390, 90, 32);

        PepperoniG.setText("Pepperoni Grande");
        getContentPane().add(PepperoniG);
        PepperoniG.setBounds(10, 40, 110, 20);

        CocaCola3L.setText("Coca Cola 3 Litros");
        getContentPane().add(CocaCola3L);
        CocaCola3L.setBounds(430, 320, 110, 20);

        CarneG.setText("Carne Grande");
        getContentPane().add(CarneG);
        CarneG.setBounds(420, 40, 80, 20);

        SupremaG2.setText("Suprema Grande");
        getContentPane().add(SupremaG2);
        SupremaG2.setBounds(220, 40, 110, 20);

        QuesoG.setText("Queso Grande");
        getContentPane().add(QuesoG);
        QuesoG.setBounds(10, 110, 110, 20);

        Palitroques.setText("Palitroques");
        getContentPane().add(Palitroques);
        Palitroques.setBounds(220, 110, 110, 20);

        PanConAjo.setText("PanConAjo");
        getContentPane().add(PanConAjo);
        PanConAjo.setBounds(420, 110, 110, 20);

        PepperoniP.setText("Pepperoni Personal");
        getContentPane().add(PepperoniP);
        PepperoniP.setBounds(10, 180, 120, 20);

        SupremaP.setText("Suprema Personal");
        getContentPane().add(SupremaP);
        SupremaP.setBounds(220, 180, 110, 20);

        CarneP.setText("Carne Personal");
        getContentPane().add(CarneP);
        CarneP.setBounds(420, 180, 110, 20);

        QuesoP.setText("Queso Personal");
        getContentPane().add(QuesoP);
        QuesoP.setBounds(10, 250, 110, 20);

        PizzaCalzone.setText("PizzaCalzone");
        getContentPane().add(PizzaCalzone);
        PizzaCalzone.setBounds(220, 250, 110, 20);

        Pepsi16Oz.setText("Pepsi 16 oz");
        getContentPane().add(Pepsi16Oz);
        Pepsi16Oz.setBounds(420, 250, 110, 20);

        CocaCola16oz.setText("Coca Cola 16 oz");
        getContentPane().add(CocaCola16oz);
        CocaCola16oz.setBounds(20, 320, 110, 20);

        TeFrambuesa16oz.setText("Te Frambuesa 16 oz");
        getContentPane().add(TeFrambuesa16oz);
        TeFrambuesa16oz.setBounds(220, 320, 120, 20);

        PepperoniGrande.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        PepperoniGrande.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PepperoniGrandeStateChanged(evt);
            }
        });
        getContentPane().add(PepperoniGrande);
        PepperoniGrande.setBounds(130, 40, 60, 26);

        SupremaGrande.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SupremaGrandeStateChanged(evt);
            }
        });
        getContentPane().add(SupremaGrande);
        SupremaGrande.setBounds(330, 40, 60, 26);

        CarneGrande.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        CarneGrande.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CarneGrandeStateChanged(evt);
            }
        });
        getContentPane().add(CarneGrande);
        CarneGrande.setBounds(530, 40, 60, 26);

        QuesoGrande.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        QuesoGrande.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuesoGrandeStateChanged(evt);
            }
        });
        getContentPane().add(QuesoGrande);
        QuesoGrande.setBounds(130, 110, 60, 26);

        Pali.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        Pali.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PaliStateChanged(evt);
            }
        });
        getContentPane().add(Pali);
        Pali.setBounds(330, 110, 60, 26);

        PanC.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        PanC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PanCStateChanged(evt);
            }
        });
        getContentPane().add(PanC);
        PanC.setBounds(540, 110, 60, 26);

        PepperoniPersonal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        PepperoniPersonal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PepperoniPersonalStateChanged(evt);
            }
        });
        getContentPane().add(PepperoniPersonal);
        PepperoniPersonal.setBounds(130, 180, 60, 26);

        SupremaPersonal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        SupremaPersonal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SupremaPersonalStateChanged(evt);
            }
        });
        getContentPane().add(SupremaPersonal);
        SupremaPersonal.setBounds(330, 180, 60, 26);

        CarnePersonal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        CarnePersonal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CarnePersonalStateChanged(evt);
            }
        });
        getContentPane().add(CarnePersonal);
        CarnePersonal.setBounds(540, 180, 60, 26);

        QuesoPersonal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        QuesoPersonal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuesoPersonalStateChanged(evt);
            }
        });
        getContentPane().add(QuesoPersonal);
        QuesoPersonal.setBounds(130, 250, 60, 26);

        PizzaC.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        PizzaC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PizzaCStateChanged(evt);
            }
        });
        getContentPane().add(PizzaC);
        PizzaC.setBounds(330, 250, 60, 26);

        Pep16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        Pep16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Pep16StateChanged(evt);
            }
        });
        getContentPane().add(Pep16);
        Pep16.setBounds(540, 250, 60, 26);

        Coc16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        Coc16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Coc16StateChanged(evt);
            }
        });
        getContentPane().add(Coc16);
        Coc16.setBounds(130, 320, 60, 26);

        Te16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        Te16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Te16StateChanged(evt);
            }
        });
        getContentPane().add(Te16);
        Te16.setBounds(340, 320, 60, 26);

        Coc3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 75, 1));
        Coc3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Coc3StateChanged(evt);
            }
        });
        getContentPane().add(Coc3);
        Coc3.setBounds(540, 320, 60, 26);

        Guardar.setText("Guardar");
        Guardar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GuardarStateChanged(evt);
            }
        });
        getContentPane().add(Guardar);
        Guardar.setBounds(380, 390, 90, 32);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eurospizza/Imagenes/Fondo.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 630, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        MenuDeInicio Ini = new MenuDeInicio();
        Ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void Coc3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Coc3StateChanged
        Integer valor = (Integer)Coc3.getValue();
        Variables V = new Variables();
        V.CL = valor;
    }//GEN-LAST:event_Coc3StateChanged

    private void PepperoniGrandeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PepperoniGrandeStateChanged
        Integer valor = (Integer)PepperoniGrande.getValue();
        Variables V = new Variables();
        V.PG = valor;
    }//GEN-LAST:event_PepperoniGrandeStateChanged

    private void CarneGrandeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CarneGrandeStateChanged
        Integer valor = (Integer)CarneGrande.getValue();
        Variables V = new Variables();
        V.CG = valor;
    }//GEN-LAST:event_CarneGrandeStateChanged

    private void QuesoGrandeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuesoGrandeStateChanged
        Integer valor = (Integer)QuesoGrande.getValue();
        Variables V = new Variables();
        V.QG = valor;
    }//GEN-LAST:event_QuesoGrandeStateChanged

    private void PaliStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PaliStateChanged
        Integer valor = (Integer)Pali.getValue();
        Variables V = new Variables();
        V.P = valor;
    }//GEN-LAST:event_PaliStateChanged

    private void PanCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PanCStateChanged
        Integer valor = (Integer)PanC.getValue();
        Variables V = new Variables();
        V.PCA = valor;
    }//GEN-LAST:event_PanCStateChanged

    private void PepperoniPersonalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PepperoniPersonalStateChanged
        Integer valor = (Integer)PepperoniPersonal.getValue();
        Variables V = new Variables();
        V.PP = valor;
    }//GEN-LAST:event_PepperoniPersonalStateChanged

    private void SupremaPersonalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SupremaPersonalStateChanged
        Integer valor = (Integer)SupremaPersonal.getValue();
        Variables V = new Variables();
        V.SP = valor;
    }//GEN-LAST:event_SupremaPersonalStateChanged

    private void CarnePersonalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CarnePersonalStateChanged
        Integer valor = (Integer)CarnePersonal.getValue();
        Variables V = new Variables();
        V.CP = valor;
    }//GEN-LAST:event_CarnePersonalStateChanged

    private void QuesoPersonalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuesoPersonalStateChanged
        Integer valor = (Integer)QuesoPersonal.getValue();
        Variables V = new Variables();
        V.QP = valor;
    }//GEN-LAST:event_QuesoPersonalStateChanged

    private void PizzaCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PizzaCStateChanged
        Integer valor = (Integer)PizzaC.getValue();
        Variables V = new Variables();
        V.PC = valor;
    }//GEN-LAST:event_PizzaCStateChanged

    private void Pep16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Pep16StateChanged
        Integer valor = (Integer)Pep16.getValue();
        Variables V = new Variables();
        V.Poz = valor;
    }//GEN-LAST:event_Pep16StateChanged

    private void Coc16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Coc16StateChanged
        Integer valor = (Integer)Coc16.getValue();
        Variables V = new Variables();
        V.Coz = valor;
    }//GEN-LAST:event_Coc16StateChanged

    private void Te16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Te16StateChanged
        Integer valor = (Integer)Te16.getValue();
        Variables V = new Variables();
        V.Toz = valor;
    }//GEN-LAST:event_Te16StateChanged

    private void SupremaGrandeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SupremaGrandeStateChanged
        Integer valor = (Integer)SupremaGrande.getValue();
        Variables V = new Variables();
        V.SG = valor;
    }//GEN-LAST:event_SupremaGrandeStateChanged

    private void GuardarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GuardarStateChanged
        
    }//GEN-LAST:event_GuardarStateChanged

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarneG;
    private javax.swing.JSpinner CarneGrande;
    private javax.swing.JLabel CarneP;
    private javax.swing.JSpinner CarnePersonal;
    private javax.swing.JSpinner Coc16;
    private javax.swing.JSpinner Coc3;
    private javax.swing.JLabel CocaCola16oz;
    private javax.swing.JLabel CocaCola3L;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Menu2;
    private javax.swing.JSpinner Pali;
    private javax.swing.JLabel Palitroques;
    private javax.swing.JSpinner PanC;
    private javax.swing.JLabel PanConAjo;
    private javax.swing.JSpinner Pep16;
    private javax.swing.JLabel PepperoniG;
    private javax.swing.JSpinner PepperoniGrande;
    private javax.swing.JLabel PepperoniP;
    private javax.swing.JSpinner PepperoniPersonal;
    private javax.swing.JLabel Pepsi16Oz;
    private javax.swing.JSpinner PizzaC;
    private javax.swing.JLabel PizzaCalzone;
    private javax.swing.JLabel QuesoG;
    private javax.swing.JSpinner QuesoGrande;
    private javax.swing.JLabel QuesoP;
    private javax.swing.JSpinner QuesoPersonal;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel SupremaG2;
    private javax.swing.JSpinner SupremaGrande;
    private javax.swing.JLabel SupremaP;
    private javax.swing.JSpinner SupremaPersonal;
    private javax.swing.JSpinner Te16;
    private javax.swing.JLabel TeFrambuesa16oz;
    // End of variables declaration//GEN-END:variables

}
