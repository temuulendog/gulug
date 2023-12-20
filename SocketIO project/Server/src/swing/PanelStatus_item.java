
package swing;


public class PanelStatus_item extends javax.swing.JPanel {

    public PanelStatus_item() {
        initComponents();
    }
    public void showStatus(int values){
        pro.setValue(values);
    }
    public void setFile(String fileName, String fileSize){
        lbFileName1.setText(fileName);
        lbSize.setText(fileSize);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pro = new javax.swing.JProgressBar();
        lbSize = new javax.swing.JLabel();
        lbFileName1 = new javax.swing.JLabel();

        pro.setStringPainted(true);

        lbSize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSize.setText("Size");

        lbFileName1.setText("FileName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFileName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(lbSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pro, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(lbSize)
                .addComponent(lbFileName1))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFileName1;
    private javax.swing.JLabel lbSize;
    private javax.swing.JProgressBar pro;
    // End of variables declaration//GEN-END:variables
}
