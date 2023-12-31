/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.util.HashMap;

/**
 *
 * @author temuu
 */
public class PanelStatus extends javax.swing.JPanel {

    /**
     * Creates new form PanelStatus
     */
    private final HashMap<Integer,  PanelStatus_item> list = new HashMap<>();
    public PanelStatus() {
        initComponents();
    }
    public void addItem(int fileID, String FileName, String FileSize){
        PanelStatus_item item = new PanelStatus_item();
        item.setFile(FileName, FileSize);
        list.put(fileID, item);
        this.add(item);
        this.repaint();
        this.revalidate();
    }

    public void updateStatus(int fileID, int values){
        list.get(fileID).showStatus(values);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
