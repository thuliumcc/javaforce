package jconfig;

/**
 * Created : Apr 12, 2012
 *
 * @author pquiring
 */

import java.util.*;
import javax.swing.*;

import javaforce.*;

public class DateTimePanel extends javax.swing.JPanel {

  /**
   * Creates new form DateTimePanel
   */
  public DateTimePanel() {
    initComponents();
    Calendar now = Calendar.getInstance();
    set_year.setValue(new Integer(now.get(Calendar.YEAR)));
    set_month.setSelectedIndex(now.get(Calendar.MONTH));
    set_day.setValue(new Integer(now.get(Calendar.DAY_OF_MONTH)));
    set_hour.setValue(new Integer(now.get(Calendar.HOUR_OF_DAY)));
    set_minute.setValue(new Integer(now.get(Calendar.MINUTE)));
    set_second.setValue(new Integer(now.get(Calendar.SECOND)));
    tzPanel = new TimeZonePanel();
    tzPanel.loadCurrentZone();
    tz.add(tzPanel);
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
    jLabel1 = new javax.swing.JLabel();
    set_year = new javax.swing.JSpinner();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    set_day = new javax.swing.JSpinner();
    jLabel4 = new javax.swing.JLabel();
    set_hour = new javax.swing.JSpinner();
    jLabel5 = new javax.swing.JLabel();
    set_minute = new javax.swing.JSpinner();
    jLabel6 = new javax.swing.JLabel();
    set_second = new javax.swing.JSpinner();
    set = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    set_month = new javax.swing.JComboBox();
    tz = new javax.swing.JPanel();

    jToolBar1.setFloatable(false);
    jToolBar1.setRollover(true);

    back.setText("< Back");
    back.setFocusable(false);
    back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backActionPerformed(evt);
      }
    });
    jToolBar1.add(back);

    jLabel1.setText("Year");

    set_year.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 3000, 1));

    jLabel2.setText("Month");

    jLabel3.setText("Day");

    set_day.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1, 1));

    jLabel4.setText("Hour");

    set_hour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

    jLabel5.setText("Minute");

    set_minute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

    jLabel6.setText("Second");

    set_second.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

    set.setText("Set");
    set.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        setActionPerformed(evt);
      }
    });

    jLabel7.setText("(24 HR)");

    set_month.setModel(new DefaultComboBoxModel(months));

    tz.setBorder(javax.swing.BorderFactory.createTitledBorder("Timezone"));
    tz.setLayout(new java.awt.GridLayout(1, 1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel1)
              .addComponent(jLabel3))
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(set_year)
              .addComponent(set_day)
              .addComponent(set_month, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel6)
              .addComponent(jLabel5)
              .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(set_second)
              .addComponent(set_minute)
              .addComponent(set_hour))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
            .addComponent(set)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1)
              .addComponent(set_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(set_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(set_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(set_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel7)
              .addComponent(set))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(set_minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(set_second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(tz, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    ConfigApp.This.setPanel(new MainPanel());
  }//GEN-LAST:event_backActionPerformed

  private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed
    try {
      ShellProcess sp = new ShellProcess();
      sp.run(new String[]{"sudo", "date", "-s",
        String.format("%04d-%02d-%02d %02d:%02d:%02d"
          , (Integer) set_year.getValue(), set_month.getSelectedIndex()+1, (Integer) set_day.getValue()
          , (Integer) set_hour.getValue(), (Integer) set_minute.getValue(), (Integer) set_second.getValue())
        }, false);
      if (sp.getErrorLevel() != 0) throw new Exception("failed");
      tzPanel.applyTimeZone();
      ConfigApp.jbusClient.call("org.jflinux.jdesktop." + System.getenv("JID"), "timeAdjusted", "");
    } catch (Exception e) {
      JF.showError("Error", "Unable to set clock");
      JFLog.log(e);
      return;
    }
    JF.showError("Notice", "Clock set");
  }//GEN-LAST:event_setActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton back;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JButton set;
  private javax.swing.JSpinner set_day;
  private javax.swing.JSpinner set_hour;
  private javax.swing.JSpinner set_minute;
  private javax.swing.JComboBox set_month;
  private javax.swing.JSpinner set_second;
  private javax.swing.JSpinner set_year;
  private javax.swing.JPanel tz;
  // End of variables declaration//GEN-END:variables

  private static String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};

  private TimeZonePanel tzPanel;
}
