/**
 * Created : Mar 30, 2012
 *
 * @author pquiring
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javaforce.*;

import jfile.*;

public class AddAppWindow extends javax.swing.JFrame {

  /**
   * Creates new form AddAppWindow
   */
  public AddAppWindow() {
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

    IconMenu = new javax.swing.JPopupMenu();
    openItem = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    props = new javax.swing.JMenuItem();
    DesktopMenu = new javax.swing.JPopupMenu();
    search = new javax.swing.JTextField();
    panel = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();

    openItem.setText("Open");
    openItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        openItemActionPerformed(evt);
      }
    });
    IconMenu.add(openItem);
    IconMenu.add(jSeparator1);

    props.setText("Properties");
    props.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        propsActionPerformed(evt);
      }
    });
    IconMenu.add(props);

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Applications");
    addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentResized(java.awt.event.ComponentEvent evt) {
        formComponentResized(evt);
      }
    });
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    search.setToolTipText("Search");
    search.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        searchKeyReleased(evt);
      }
    });

    panel.setLayout(new java.awt.GridLayout(1, 1));

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
          .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(search)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {dispose(); return;}
    doSearch();
  }//GEN-LAST:event_searchKeyReleased

  private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
    try {
      JMenuItem mi = (JMenuItem)evt.getSource();
      JPopupMenu pm = (JPopupMenu)mi.getParent();
      browser.invoke((JFileIcon)pm.getInvoker());
    } catch (Exception e) {
      JFLog.log(e);
    }
  }//GEN-LAST:event_openItemActionPerformed

  private void propsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propsActionPerformed
    JMenuItem mi = (JMenuItem)evt.getSource();
    JPopupMenu pm = (JPopupMenu)mi.getParent();
    JFileIcon button = (JFileIcon)pm.getInvoker();
    FileEntry entry = button.entry;
    JFileProperties dialog = new JFileProperties(entry, false);
    dialog.setVisible(true);
  }//GEN-LAST:event_propsActionPerformed

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    browser = new JFileBrowser(JFileBrowser.VIEW_ICONS, "/usr/share/applications"
      , DesktopMenu, IconMenu, null, -1
      , false, "jfile", "jopen", Color.white, Color.black
      , true, true, false, true, Dock.jbusClient, false, Dock.dock);
    panel.add(browser);
    revalidate();
    browser.setFilter(".*[.]desktop");
  }//GEN-LAST:event_formWindowOpened

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    Dock.dock.addAppDialogClosed();
  }//GEN-LAST:event_formWindowClosed

  private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    if (browser != null) {
      try {
        browser.refresh();
      } catch (Throwable t) {
        JFLog.log(t);
      }
    }
  }//GEN-LAST:event_formComponentResized

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPopupMenu DesktopMenu;
  private javax.swing.JPopupMenu IconMenu;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JMenuItem openItem;
  private javax.swing.JPanel panel;
  private javax.swing.JMenuItem props;
  private javax.swing.JTextField search;
  // End of variables declaration//GEN-END:variables

  public JFileBrowser browser;

  private String clean(String in) {
    char ca[] = in.toCharArray();
    String out = "";
    for(int a=0;a<ca.length;a++) {
      char c = ca[a];
      if (c >= '0' && c <= '9') {
        out += c;
        continue;
      }
      if (c >= 'a' && c <= 'z') {
        out += c;
        continue;
      }
      if (c >= 'A' && c <= 'Z') {
        out += c;
        continue;
      }
    }
    return out;
  }

  public void doSearch() {
    browser.setFilter(".*" + clean(search.getText()) + ".*[.]desktop");
  }
}
