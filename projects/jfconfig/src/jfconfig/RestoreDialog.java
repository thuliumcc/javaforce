package jfconfig;

/**
 * Created : Apr 17, 2012
 *
 * @author pquiring
 */

import java.awt.*;
import java.io.File;
import java.util.*;

import javaforce.*;

public class RestoreDialog extends javax.swing.JDialog {

  /**
   * Creates new form RestoreDialog
   */
  public RestoreDialog(java.awt.Frame parent, boolean modal, boolean personal, String name) {
    super(parent, modal);
    initComponents();
    setPosition();
    this.personal = personal;
    if (personal) {
      tabs.remove(systemOpts);
      diffFolder.setText(System.getenv("HOME") + "/Restored Files");
      listDest();
    } else {
      tabs.remove(personalOpts);
    }
    this.name = name;
    listSrc();
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
    src = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    backups = new javax.swing.JComboBox();
    restore = new javax.swing.JButton();
    cancel = new javax.swing.JButton();
    tabs = new javax.swing.JTabbedPane();
    personalOpts = new javax.swing.JPanel();
    overwrite = new javax.swing.JCheckBox();
    diffFolder = new javax.swing.JTextField();
    diffSelect = new javax.swing.JButton();
    useDiffFolder = new javax.swing.JCheckBox();
    systemOpts = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    dest = new javax.swing.JComboBox();
    jparted = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    refresh = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jLabel1.setText("Source");

    src.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    src.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        srcItemStateChanged(evt);
      }
    });

    jLabel2.setText("Backups");

    backups.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    restore.setText("Restore");
    restore.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        restoreActionPerformed(evt);
      }
    });

    cancel.setText("Cancel");
    cancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cancelActionPerformed(evt);
      }
    });

    overwrite.setText("Overwrite files");

    diffFolder.setText("~/Restored Files");
    diffFolder.setEnabled(false);

    diffSelect.setText("Select ...");
    diffSelect.setEnabled(false);

    useDiffFolder.setText("Restore to different folder");
    useDiffFolder.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        useDiffFolderItemStateChanged(evt);
      }
    });

    javax.swing.GroupLayout personalOptsLayout = new javax.swing.GroupLayout(personalOpts);
    personalOpts.setLayout(personalOptsLayout);
    personalOptsLayout.setHorizontalGroup(
      personalOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(personalOptsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(personalOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(personalOptsLayout.createSequentialGroup()
            .addComponent(diffFolder)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(diffSelect))
          .addGroup(personalOptsLayout.createSequentialGroup()
            .addGroup(personalOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(overwrite)
              .addComponent(useDiffFolder))
            .addGap(0, 240, Short.MAX_VALUE)))
        .addContainerGap())
    );
    personalOptsLayout.setVerticalGroup(
      personalOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(personalOptsLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(useDiffFolder)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(personalOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(diffFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(diffSelect))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(overwrite)
        .addContainerGap(21, Short.MAX_VALUE))
    );

    tabs.addTab("Options", personalOpts);

    jLabel3.setText("Destination");

    dest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jparted.setText("Partition Editor");
    jparted.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jpartedActionPerformed(evt);
      }
    });

    jLabel5.setText("Use Partition Editor to format and mount destination in /mnt");

    refresh.setText("Refresh");
    refresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refreshActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout systemOptsLayout = new javax.swing.GroupLayout(systemOpts);
    systemOpts.setLayout(systemOptsLayout);
    systemOptsLayout.setHorizontalGroup(
      systemOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(systemOptsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(systemOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(systemOptsLayout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dest, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemOptsLayout.createSequentialGroup()
            .addComponent(refresh)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jparted))
          .addGroup(systemOptsLayout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(0, 25, Short.MAX_VALUE)))
        .addContainerGap())
    );
    systemOptsLayout.setVerticalGroup(
      systemOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(systemOptsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(systemOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
        .addGroup(systemOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jparted)
          .addComponent(refresh))
        .addContainerGap())
    );

    tabs.addTab("Options", systemOpts);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tabs)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(src, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(backups, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(cancel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(restore)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(backups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(restore)
          .addComponent(cancel))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
    dispose();
  }//GEN-LAST:event_cancelActionPerformed

  private void restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreActionPerformed
    if (src.getSelectedIndex() == -1) return;
    if (backups.getSelectedIndex() == -1) return;
    if (personal) {
      if (useDiffFolder.isSelected()) {
        File file = new File(diffFolder.getText());
        file.mkdirs();
      }
    } else {
      if (dest.getSelectedIndex() == -1) return;
    }
    accepted = true;
    dispose();
  }//GEN-LAST:event_restoreActionPerformed

  private void srcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_srcItemStateChanged
    listBackups();
  }//GEN-LAST:event_srcItemStateChanged

  private void jpartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpartedActionPerformed
    try { Runtime.getRuntime().exec("jparted"); } catch (Exception e) {}
  }//GEN-LAST:event_jpartedActionPerformed

  private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
    listDest();
  }//GEN-LAST:event_refreshActionPerformed

  private void useDiffFolderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_useDiffFolderItemStateChanged
    if (useDiffFolder.isSelected()) {
      diffFolder.setEnabled(true);
      diffSelect.setEnabled(true);
    } else {
      diffFolder.setEnabled(false);
      diffSelect.setEnabled(false);
    }
  }//GEN-LAST:event_useDiffFolderItemStateChanged

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox backups;
  private javax.swing.JButton cancel;
  private javax.swing.JComboBox dest;
  private javax.swing.JTextField diffFolder;
  private javax.swing.JButton diffSelect;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JButton jparted;
  private javax.swing.JCheckBox overwrite;
  private javax.swing.JPanel personalOpts;
  private javax.swing.JButton refresh;
  private javax.swing.JButton restore;
  private javax.swing.JComboBox src;
  private javax.swing.JPanel systemOpts;
  private javax.swing.JTabbedPane tabs;
  private javax.swing.JCheckBox useDiffFolder;
  // End of variables declaration//GEN-END:variables

  private boolean personal;
  private String name;

  public boolean accepted, nosrc;

  private void listSrc() {
    src.removeAllItems();
    File file = new File("/media");
    File files[] = file.listFiles();
    if (files.length == 0) {
      nosrc = true;
      return;
    }
    for(int a=0;a<files.length;a++) {
      src.addItem(files[a].getName());
    }
    src.setSelectedIndex(-1);
  }

  private void listDest() {
    dest.removeAllItems();
    if (personal) {
      dest.addItem(System.getenv("HOME"));
    }
    File file = new File("/mnt");
    File files[] = file.listFiles();
    if (files.length == 0) {
      return;
    }
    for(int a=0;a<files.length;a++) {
      dest.addItem(files[a].getName());
    }
    dest.setSelectedIndex(-1);
  }

  private void listBackups() {
    backups.removeAllItems();
    int idx = src.getSelectedIndex();
    if (idx == -1) return;
    File file = new File("/media/" + (String)src.getSelectedItem() + "/Backups/" + (personal ? "Personal" : "System") + "/");
    if (!file.exists()) return;
    File files[] = file.listFiles();
    Arrays.sort(files);
    for(int a=files.length-1;a>=0;a--) {  //show in reverse order
      if (files[a].getName().startsWith(name + "-")) {
        backups.addItem(files[a].getName());
      }
    }
  }

  public String getSource() {
    return "/media/" + (String)src.getSelectedItem() + "/Backups/" + (personal ? "Personal" : "System") + "/" + (String)backups.getSelectedItem();
  }

  public boolean getUseDiffFolder() {
    return useDiffFolder.isSelected();
  }

  public String getDiffFolder() {
    return diffFolder.getText();
  }

  public boolean isOverwrite() {
    return overwrite.isSelected();
  }

  public String getDest() {
    return (String)dest.getSelectedItem();
  }

  private void setPosition() {
    Rectangle s = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
    Dimension d = getSize();
    setLocation(s.width/2 - d.width/2, s.height/2 - (d.height/2));
  }
}
