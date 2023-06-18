
package treestructure.newpackage;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

/*
  @author priyawarat arya
 */

public class Tree extends javax.swing.JFrame {

    //Creates new form Tree/
    
    public Tree() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTextField1 = new javax.swing.JTextField();
        jButton1Add = new javax.swing.JButton();
        jButton2Edit = new javax.swing.JButton();
        jButton3Remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Employee_ID 1");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emp_ID 5");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emp_ID 6");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Employee_ID 2");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emp_ID 7");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emp_ID 8");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Employee_ID 3");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emp_ID 10");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emp_ID 11");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 220, 300));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 106, -1));

        jButton1Add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1Add.setText("Add");
        jButton1Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AddActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 106, -1));

        jButton2Edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2Edit.setText("Rename");
        jButton2Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2EditActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 106, -1));

        jButton3Remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3Remove.setText("Delete");
        jButton3Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3RemoveActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 106, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        
        // displaying selected node in textField
        
        TreeSelectionModel smd = jTree1.getSelectionModel();
        
        if(smd.getSelectionCount()>0){
             DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
             jTextField1.setText(selectedNode.getUserObject().toString());
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void jButton1AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AddActionPerformed
       
        //Adding a new Node in Tree ...
        
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(jTextField1.getText());
        selectedNode.add(newNode);
        
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        model.reload();
        
        
    }//GEN-LAST:event_jButton1AddActionPerformed

    private void jButton2EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2EditActionPerformed
        
        // Rename a Node in Tree ..
        
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        selectedNode.setUserObject(jTextField1.getText());
        
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        model.reload();
    }//GEN-LAST:event_jButton2EditActionPerformed

    
    private void jButton3RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3RemoveActionPerformed
        
        //Delete a Node from Tree ..
        
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        
        if(selectedNode!= jTree1.getModel().getRoot())
        {
            DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
            model.removeNodeFromParent(selectedNode);
            model.reload();
        }
    }//GEN-LAST:event_jButton3RemoveActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Add;
    private javax.swing.JButton jButton2Edit;
    private javax.swing.JButton jButton3Remove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
