/*
 * JWeb.java
 *
 * Created on August 2, 2007, 4:22 PM
 *
 * @author  pquiring
 */

import javax.swing.event.HyperlinkEvent;
import java.net.URL;
import javaforce.*;
import java.io.*;

public class WebApp extends javax.swing.JFrame {

  /** Creates new form JWeb */
  public WebApp() {
    initComponents();
    html.setContentType("text/html");
    html.setEditable(false);
    setTitle("JWeb");
    loadcfg();
    setProxy();
    setSize(640, 480);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    htmlScroll = new javax.swing.JScrollPane();
    html = new javax.swing.JEditorPane();
    home = new javax.swing.JButton();
    url = new javax.swing.JTextField();
    go = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    menu_file = new javax.swing.JMenu();
    file_Settings = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("jWeb");

    html.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
      public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
        htmlHyperlinkUpdate(evt);
      }
    });
    htmlScroll.setViewportView(html);

    home.setText("Home");
    home.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeActionPerformed(evt);
      }
    });

    url.setText("URL");
    url.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        urlActionPerformed(evt);
      }
    });

    go.setText("Go");
    go.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        goActionPerformed(evt);
      }
    });

    menu_file.setText("Menu");

    file_Settings.setText("Settings...");
    file_Settings.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        file_SettingsActionPerformed(evt);
      }
    });
    menu_file.add(file_Settings);

    menuBar.add(menu_file);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(home)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(url, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(go))
      .addComponent(htmlScroll)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(go)
          .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(htmlScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void file_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_SettingsActionPerformed
    EditSettings.editSettings(this);
    savecfg();
    setProxy();
  }//GEN-LAST:event_file_SettingsActionPerformed

  private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
    try {
      html.setPage(getURL());
    } catch(Exception e) {}
  }//GEN-LAST:event_urlActionPerformed

  private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
    try {
      html.setPage(getURL());
    } catch(Exception e) {}
  }//GEN-LAST:event_goActionPerformed

  private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
    try {
      url.setText(Settings.homePage);
      html.setPage(new URL(Settings.homePage));
    } catch(Exception e) {}
  }//GEN-LAST:event_homeActionPerformed

  private void htmlHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_htmlHyperlinkUpdate
    if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
      try {
        html.setPage(evt.getURL());
        url.setText(evt.getURL().toExternalForm());
      } catch(Exception e) {}
    }
  }//GEN-LAST:event_htmlHyperlinkUpdate

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new WebApp().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem file_Settings;
  private javax.swing.JButton go;
  private javax.swing.JButton home;
  private javax.swing.JEditorPane html;
  private javax.swing.JScrollPane htmlScroll;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menu_file;
  private javax.swing.JTextField url;
  // End of variables declaration//GEN-END:variables

  public void loadcfg() {
    XML xml = new XML();
    String filename = JF.getUserPath() + "/.jweb.xml";
    File file = new File(filename);
    if (!file.exists()) return;  //doesn't exist
    if (!xml.read(filename)) return;  //bad cfg
    if (!xml.root.name.equals("jweb")) return;  //bad cfg
    xml.writeClass(xml.root, new Settings());
  }

  public void savecfg() {
    XML xml = new XML();
    XML.XMLTag tag;
    xml.root.name = "jweb";
    xml.readClass(xml.root, new Settings());
    String filename = JF.getUserPath() + "/.jweb.xml";
    xml.write(filename);
  }

  public void setProxy() {
    System.getProperties().put("proxySet",Settings.proxy ? "true" : "false");
    System.getProperties().put("proxyHost",Settings.proxyHost);
    System.getProperties().put("proxyPort",Settings.proxyPort);
  }

  public URL getURL() {
    String tmp = url.getText();
    if (!tmp.startsWith("http://") && !tmp.startsWith("https://")) tmp = "http://" + tmp;
    try {
      return new URL(tmp);
    } catch (Exception e) {
      return null;
    }
  }
}

