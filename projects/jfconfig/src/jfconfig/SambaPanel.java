package jfconfig;

/**
 * Created : Mar 18, 2012
 *
 * @author pquiring
 */

import java.io.*;
import java.util.*;
import javaforce.*;
import javaforce.linux.*;

public class SambaPanel extends javax.swing.JPanel {

  /**
   * Creates new form SambaPanel
   */
  public SambaPanel() {
    initComponents();
    loadConfig();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jToolBar1 = new javax.swing.JToolBar();
    back = new javax.swing.JButton();
    restart = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    usershareowneronly = new javax.swing.JCheckBox();
    apply = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    workgroup = new javax.swing.JTextField();
    wins = new javax.swing.JCheckBox();
    winsip = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    realm = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    security = new javax.swing.JComboBox();
    jPanel2 = new javax.swing.JPanel();
    join = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    username = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    password = new javax.swing.JPasswordField();
    unjoin = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    server = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    debugLevel = new javax.swing.JComboBox();
    jButton1 = new javax.swing.JButton();

    jToolBar1.setFloatable(false);
    jToolBar1.setRollover(true);

    back.setText("<Back");
    back.setFocusable(false);
    back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backActionPerformed(evt);
      }
    });
    jToolBar1.add(back);

    restart.setText("Restart Servers");
    restart.setFocusable(false);
    restart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    restart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    restart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        restartActionPerformed(evt);
      }
    });
    jToolBar1.add(restart);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));

    usershareowneronly.setText("Users can only share files they own");
    usershareowneronly.setToolTipText("Often required on NTFS volumes.");

    apply.setText("Apply");
    apply.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        applyActionPerformed(evt);
      }
    });

    jLabel7.setText("Workgroup/Domain:");

    workgroup.setText("WORKGROUP");

    wins.setText("Enable WINS Support : IP =");

    jLabel1.setText("Realm/FQDN:");

    jLabel6.setText("Security Mode:");

    security.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "ADS" }));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(apply))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(wins)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(winsip))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7)
              .addComponent(jLabel1)
              .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(realm)
              .addComponent(workgroup, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
              .addComponent(security, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(usershareowneronly, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(workgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(realm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(security, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(usershareowneronly)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(wins)
          .addComponent(winsip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(apply)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Join Domain"));

    join.setText("Join");
    join.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        joinActionPerformed(evt);
      }
    });

    jLabel2.setText("Username");

    jLabel3.setText("Password");

    unjoin.setText("Unjoin");
    unjoin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        unjoinActionPerformed(evt);
      }
    });

    jLabel4.setText("Server");

    jLabel5.setText("Debug Level");

    debugLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(19, 19, 19)
            .addComponent(server))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(unjoin)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(join))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(debugLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3)
          .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(debugLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(unjoin)
          .addComponent(join))
        .addContainerGap())
    );

    jButton1.setText("Help");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton1)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    ConfigApp.This.setPanel(new ServersPanel());
  }//GEN-LAST:event_backActionPerformed

  private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
    saveConfig();
    apply();
  }//GEN-LAST:event_applyActionPerformed

  private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
    restart();
  }//GEN-LAST:event_restartActionPerformed

  private void joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinActionPerformed
    join();
  }//GEN-LAST:event_joinActionPerformed

  private void unjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unjoinActionPerformed
    unjoin();
  }//GEN-LAST:event_unjoinActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
      Runtime.getRuntime().exec("jhelp jconfig-samba");
    } catch (Exception e) {

    }
  }//GEN-LAST:event_jButton1ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton apply;
  private javax.swing.JButton back;
  private javax.swing.JComboBox debugLevel;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JButton join;
  private javax.swing.JPasswordField password;
  private javax.swing.JTextField realm;
  private javax.swing.JButton restart;
  private javax.swing.JComboBox security;
  private javax.swing.JTextField server;
  private javax.swing.JButton unjoin;
  private javax.swing.JTextField username;
  private javax.swing.JCheckBox usershareowneronly;
  private javax.swing.JCheckBox wins;
  private javax.swing.JTextField winsip;
  private javax.swing.JTextField workgroup;
  // End of variables declaration//GEN-END:variables

//[global]usershare owner only = false
  public static class Config {
    public String workgroup, realm, security;
    public boolean usershareowneronly;
    public boolean wins;
    public String winsip;
  }

  private Config config;
  private String configFolder = "/etc/jconfig.d/";
  private String configFile = "samba.xml";

  private void loadConfig() {
    defaultConfig();
    try {
      XML xml = new XML();
      FileInputStream fis = new FileInputStream(configFolder + configFile);
      xml.read(fis);
      xml.writeClass(config);
    } catch (FileNotFoundException e1) {
      defaultConfig();
    } catch (Exception e2) {
      JFLog.log(e2);
      defaultConfig();
    }
    workgroup.setText(config.workgroup);
    realm.setText(config.realm);
    if (config.security == null) config.security = "USER";
    if (config.security.equals("USER")) security.setSelectedIndex(0);
    if (config.security.equals("ADS")) security.setSelectedIndex(1);
    usershareowneronly.setSelected(config.usershareowneronly);
    wins.setSelected(config.wins);
    winsip.setText(config.winsip);
  }

  private void defaultConfig() {
    config = new Config();
    config.workgroup = "WORKGROUP";
    config.security = "USER";
    config.realm = "";
    config.winsip = "";
  }

  private void saveConfig() {
    config.workgroup = workgroup.getText();
    config.realm = realm.getText();
    config.security = (String)security.getSelectedItem();
    config.usershareowneronly = usershareowneronly.isSelected();
    config.wins = wins.isSelected();
    config.winsip = winsip.getText();
    try {
      XML xml = new XML();
      File tmpFile = File.createTempFile("samba", ".xml");
      FileOutputStream fos = new FileOutputStream(tmpFile);
      xml.readClass("samba", config);
      xml.write(fos);
      fos.close();
      Linux.mkdir(configFolder);
      if (!Linux.copyFile(tmpFile.getAbsolutePath(), configFolder + configFile)) {
        tmpFile.delete();
        throw new Exception("file io error");
      }
      tmpFile.delete();
    } catch (Exception e) {
      JFLog.log(e);
    }
  }

  private void apply() {
    //save config to /etc/samba/smb.conf
    try {
      String str = new String(JF.readAll(this.getClass().getClassLoader().getResourceAsStream("smb.conf")));
      File tmpFile = File.createTempFile("smb", ".conf");
      FileOutputStream fos = new FileOutputStream(tmpFile);
      str = str.replaceAll("[$]WORKGROUP", config.workgroup);
      str = str.replaceAll("[$]USERSHAREOWNERONLY", "" + config.usershareowneronly);
      str = str.replaceAll("[$]WINS", "" + config.wins);
      str = str.replaceAll("[$]WINSIP", config.winsip);
      str = str.replaceAll("[$]REALM", "" + config.realm);
      str = str.replaceAll("[$]SECURITY", "" + config.security);
      fos.write(str.getBytes());
      fos.close();
      if (!Linux.copyFile(tmpFile.getAbsolutePath(), "/etc/samba/smb.conf")) {
        tmpFile.delete();
        throw new Exception("file io error");
      }
      tmpFile.delete();
      JF.showMessage("Notice", "Please restart server to make changes effective.");
    } catch (Exception e) {
      JFLog.log(e);
    }
  }

  private boolean valid(boolean checkDomain) {
    if (checkDomain) {
      if (realm.getText().length() == 0) return false;
    }
    if (server.getText().length() == 0) return false;
    if (username.getText().length() == 0) return false;
    if (password.getPassword().length == 0) return false;
    return true;
  }

  private void join() {
    if (!valid(true)) return;
    ArrayList<String> cmd = new ArrayList<String>();
    cmd.add("sudo");
    cmd.add("net");
    cmd.add("ads");
    cmd.add("join");
    char first = server.getText().charAt(0);
    if ((first >= '0') && (first <= '9'))
      cmd.add("-I");
    else
      cmd.add("-S");
    cmd.add(server.getText());
    cmd.add("-U");
    cmd.add(username.getText() + "%" + new String(password.getPassword()));  //workgroup.getText() + "\\\\" +
    if (debugLevel.getSelectedIndex() > 0) {
      cmd.add("-d");
      cmd.add("" + debugLevel.getSelectedIndex());
    }
// net dom join ...
//    cmd.add("domain=" + realm.getText());
//    cmd.add("account=" + realm.getText() + "\\\\" + username.getText());
//    cmd.add("password=" + password.getPassword());
    try {
      ShellProcess sp = new ShellProcess();
      String output = sp.run(cmd, false);
      if (sp.getErrorLevel() != 0) {
        JF.showError("Error", "Join Failed: Command=" + sp.command + "\n" + "Output=" + output);
        return;
      }
      JFLog.log("Samba:Join Output=" + output);
      //add to /etc/domains.lst
      File tmpFile = File.createTempFile("domains", ".lst", new File("/tmp"));
      String lst = "";
      if (new File("/etc/domains.lst").exists()) {
        lst = new String(JF.readAll(new FileInputStream("/etc/domains.lst")));
        if (!lst.endsWith("\n")) lst += "\n";
      }
      boolean added = false;
      String lns[] = lst.split("\n");
      for(int a=0;a<lns.length;a++) {
        if (lns[a].indexOf(workgroup.getText()) != -1) {added = true; break;}
      }
      if (!added) {
        FileOutputStream fos = new FileOutputStream(tmpFile);
        lst += "domain=" + workgroup.getText() + ",server=" + server.getText() + "\n";
        fos.write(lst.getBytes());
        fos.close();
        if (!Linux.copyFile(tmpFile.getAbsolutePath(), "/etc/domains.lst")) {
          JF.showError("Error", "Join Successful but failed to update /etc/domains.lst");
          return;
        }
      }
      FixStuffPanel.fixSamba(true);
      tmpFile.delete();
      JF.showMessage("Notice", "Join Successful!");
    } catch (Exception e) {
      JFLog.log(e);
    }
  }

  private void unjoin() {
    if (!valid(false)) return;
    ArrayList<String> cmd = new ArrayList<String>();
    cmd.add("sudo");
    cmd.add("net");
    cmd.add("ads");
    cmd.add("leave");
    char first = server.getText().charAt(0);
    if ((first >= '0') && (first <= '9'))
      cmd.add("-I");
    else
      cmd.add("-S");
    cmd.add(server.getText());
    cmd.add("-U");
    cmd.add(realm.getText() + "\\\\" + username.getText() + "%" + password.getPassword());
//  net dom unjoin ...
//    cmd.add("account=" + username.getText());
//    cmd.add("password=" + password.getPassword());
    try {
      ShellProcess sp = new ShellProcess();
      String output = sp.run(cmd, false);
      if (sp.getErrorLevel() != 0) {
        JF.showError("Error", "UnJoin Failed:" + output);
        return;
      }
      //remove domain from /etc/domains.lst
      File tmpFile = File.createTempFile("domains", ".lst", new File("/tmp"));
      FileOutputStream fos = new FileOutputStream(tmpFile);
      String lst = "";
      if (new File("/etc/domains.lst").exists()) {
        lst = new String(JF.readAll(new FileInputStream("/etc/domains.lst")));
        if (!lst.endsWith("\n")) lst += "\n";
      }
      String lns[] = lst.split("\n");
      String domainString = realm.getText();
      for(int a=0;a<lns.length;a++) {
        if (lns[a].equalsIgnoreCase(domainString)) {
          lst = "";
          for(int b=0;b<lns.length;b++) {
            if (b != a) lst += lns[b] + "\n";
          }
          break;
        }
      }
      fos.write(lst.getBytes());
      fos.close();
      if (!Linux.copyFile(tmpFile.getAbsolutePath(), "/etc/domains.lst")) {
        JF.showError("Error", "UnJoin Successful but failed to update /etc/domains.lst");
        return;
      }
      JF.showMessage("Notice", "UnJoin Successful");
    } catch (Exception e) {
      JFLog.log(e);
    }
  }

  private void restart() {
    boolean ok = true;
    if (!Linux.restartService("smbd")) {
      JF.showError("Error", "Failed to Restart smbd");
      ok = false;
    }
    if (!Linux.restartService("nmbd")) {
      JF.showError("Error", "Failed to Restart nmbd");
      ok = false;
    }
    if (ok) JF.showMessage("Notice", "Samba restarted");
  }
}
