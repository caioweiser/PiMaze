/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author 182210010
 */
public class GUIPrincipal extends javax.swing.JFrame implements InternalFrameListener {

    boolean flagGUIEntrarCampanha  = false;
    boolean flagGUICriarCampanha  = false;
    /*boolean flagGUICenasDD  = false;
    boolean flagGUICampanhaDD  = false;
    boolean flagGUIParentes  = false;
    */
    
    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
    }

    
    private void abrirGUICriarCampanha(){
        
        if(!flagGUICriarCampanha){
        GUICriarCampanha gCC = new GUICriarCampanha();
        
        jdpAreaDeTrabalho.add(gCC);
        
        gCC.setVisible(true);
        
        flagGUICriarCampanha = true;
        
        gCC.addInternalFrameListener(this);
            
        
    }
        
    }
    private void abrirGUIEntrarCampanha(){
        if(!flagGUIEntrarCampanha){
        GUIEntrarCampanha gEC = new GUIEntrarCampanha();
        
        jdpAreaDeTrabalho.add(gEC);
        
        gEC.setVisible(true);
        
        flagGUIEntrarCampanha = true;
        
        gEC.addInternalFrameListener(this);
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

        jLabel1 = new javax.swing.JLabel();
        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnCriarCampanha = new javax.swing.JButton();
        jbtnAbrirCampanhas = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpAreaDeTrabalho.setBackground(new java.awt.Color(100, 100, 100));

        jLabel2.setText("Abrir Campanhas");

        jLabel3.setText("Criar Campanhas");

        jbtnCriarCampanha.setText("Criar");
        jbtnCriarCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCriarCampanhaActionPerformed(evt);
            }
        });
        jbtnCriarCampanha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnCriarCampanhaKeyPressed(evt);
            }
        });

        jbtnAbrirCampanhas.setText("Abrir");
        jbtnAbrirCampanhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAbrirCampanhasActionPerformed(evt);
            }
        });
        jbtnAbrirCampanhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAbrirCampanhasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAbrirCampanhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCriarCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnAbrirCampanhas))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbtnCriarCampanha))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jdpAreaDeTrabalho.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAbrirCampanhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAbrirCampanhasActionPerformed
        abrirGUIEntrarCampanha();
    }//GEN-LAST:event_jbtnAbrirCampanhasActionPerformed

    private void jbtnAbrirCampanhasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAbrirCampanhasKeyPressed
if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    abrirGUIEntrarCampanha();
}
    }//GEN-LAST:event_jbtnAbrirCampanhasKeyPressed

    private void jbtnCriarCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCriarCampanhaActionPerformed
abrirGUICriarCampanha();
    }//GEN-LAST:event_jbtnCriarCampanhaActionPerformed

    private void jbtnCriarCampanhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCriarCampanhaKeyPressed
if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    abrirGUICriarCampanha();
}
    }//GEN-LAST:event_jbtnCriarCampanhaKeyPressed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAbrirCampanhas;
    private javax.swing.JButton jbtnCriarCampanha;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        
        
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof GUICriarCampanha){
            flagGUICriarCampanha = false;
        } 
        if(e.getInternalFrame() instanceof GUIEntrarCampanha){
            flagGUIEntrarCampanha = false;
        }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
}
