package UI;

import Object.Instrucction;

public class TestRoom extends javax.swing.JFrame {

    public TestRoom() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instrucctionDelay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instrucctionDelay.setText("Test Instrucction delay");
        instrucctionDelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrucctionDelayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(instrucctionDelay)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(instrucctionDelay)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void instrucctionDelayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucctionDelayActionPerformed
        System.out.println("Started test instrucction delay");
        Instrucction instrucction = new Instrucction("delay", 1500, "Delay",true);
        instrucction.initiate();
        System.out.println("lorem");
    }//GEN-LAST:event_instrucctionDelayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton instrucctionDelay;
    // End of variables declaration//GEN-END:variables
}
