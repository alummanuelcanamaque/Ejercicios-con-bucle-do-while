/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.pkg3.pkg4c.elecciones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Cañamaque
 */
public class elecciones extends javax.swing.JFrame {

    /**
     * Creates new form elecciones
     */
    public elecciones() {
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

        boton_Votos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_Votos.setText("Generar Votos");
        boton_Votos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VotosActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_Votos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_Votos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_VotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VotosActionPerformed
        int pp=0;
        int psoe=0;
        int coleta=0;
        int ladronesSinFronteras=0;
        Random rnd=new Random();
        do{
            int partido = rnd.nextInt(4)+1;
             switch(partido){
                case 1:
                   pp++;
                   break;
                case 2:
                   psoe++;
                   break;
                case 3:
                   coleta++;
                   break;
                case 4:
                   ladronesSinFronteras++;
                   break;
           }
            
        }while(pp<1000 && psoe<1000 && coleta<1000 && ladronesSinFronteras<1000);
        area.setText("Votos PSOE: "+psoe);
        area.append("\nVotos PP: "+pp);
        area.append("\nVotos Coleta: "+coleta);
        area.append("\nVotos Ladrones Sin Fronteras: "+ladronesSinFronteras);
        
        if(pp==1000){
           JOptionPane.showMessageDialog(this, "Rajoy acuestate"); 
        }
        if(psoe==1000){
           JOptionPane.showMessageDialog(this, "Zapatero acuestate"); 
        }
        if(coleta==1000){
           JOptionPane.showMessageDialog(this, "Coleta wins");
        }
        if(ladronesSinFronteras==1000){
           JOptionPane.showMessageDialog(this, "Otro mas al bote"); 
        }
    }//GEN-LAST:event_boton_VotosActionPerformed

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
            java.util.logging.Logger.getLogger(elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton boton_Votos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
