
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus
 */
public class Main extends javax.swing.JFrame {
    

    /**
     * Creates new form NewJFrame2
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payroll System || Kelompok 4");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 240, -1));

        jButton3.setText("Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 240, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel2.setText("PAYROLL SYSTEM");

        jLabel1.setText("Kelompok 4");

        jLabel6.setText("Sistem Informasi 2020 B");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mutiara Vebriani || 20051214014");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tifanny Maulida Innayah || 20051214020");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fadhilah Shabuhalaika A. || 20051214080");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mohammad Fatihul Farras D. ||20051214102");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8)))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 360));

        jLabel3.setText("Employee Information");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel4.setText("Total Monthly Salary for Part All Employees");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jButton1.setText("Staff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jButton4.setText("Faculty");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jButton5.setText("Part Time");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel5.setText("Total Monthly Salary for Part Time Staff");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel11.setText("MENU");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Employee emp [] = new Employee[9];

		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapita", "Steven", "456", 'F', 7, 6, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

		emp [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "PhD", "Engineering", 3, Faculty.Level.FULL));
		emp [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "PhD","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

		emp [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
                
                double total_salary = 0.0;
                for (Employee emp1 : emp) {
                total_salary += emp1.monthlyEarning();
            }
		JOptionPane.showMessageDialog(null, "Total Monthly Salary for All Employees : " + "$" + total_salary + "\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Employee emp [] = new Employee[9];

        emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
        emp [1] = (new Staff("Zapita", "Steven", "456", 'F', 7, 6, 64, 35.00));
        emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

        emp [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "PhD", "Engineering", 3, Faculty.Level.FULL));
        emp [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "PhD","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
        emp [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

        emp [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
        emp [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
        emp [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
        double total_part_time = 0.0;

        for (Employee emp1 : emp) {
            if (emp1 instanceof Partime) {
                total_part_time += emp1.monthlyEarning();
            }
        }
        JOptionPane.showMessageDialog(null, "Total Monthly Salary for Part Time Staff : " + "$" + total_part_time + "\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Employee emp [] = new Employee[3];

		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapita", "Steven", "456", 'F', 7, 6, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));
 for (Employee emp1 : emp) {
                 JOptionPane.showMessageDialog(null, emp1 + "");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         Employee emp [] = new Employee[3];
        
        emp [0] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "PhD", "Engineering", 3, Faculty.Level.FULL));
		emp [1] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "PhD","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [2] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));
for (Employee emp1 : emp) {
                 JOptionPane.showMessageDialog(null, emp1 + "");
    }               
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Employee emp [] = new Employee[3];
        emp [0] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [1] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [2] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
                for (Employee emp1 : emp) {
                 JOptionPane.showMessageDialog(null, emp1 + "");
                
    }                      
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
