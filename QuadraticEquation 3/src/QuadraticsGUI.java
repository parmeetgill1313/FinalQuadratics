
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author satwindersingh
 */
public class QuadraticsGUI extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public QuadraticsGUI() {
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

        g1 = new javax.swing.JTextField();
        v1 = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        v3 = new javax.swing.JTextField();
        g2 = new javax.swing.JTextField();
        g3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        calculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        equation = new javax.swing.JComboBox<>();
        e1 = new javax.swing.JTextField();
        e2 = new javax.swing.JTextField();
        e3 = new javax.swing.JTextField();

        g1.setText("ax^2");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });

        v1.setText("a");
        v1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1ActionPerformed(evt);
            }
        });

        v2.setText("(x-p)^2");
        v2.setToolTipText("");

        v3.setText("q");

        g2.setText("bx");

        g3.setText("c");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 23, 3));
        jLabel1.setText("QUADRATIC EQUATION SOLVER");

        equation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vertex", "General" }));
        equation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationActionPerformed(evt);
            }
        });

        e3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addComponent(calculate)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed

    }//GEN-LAST:event_g1ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        NumberFormat df = new DecimalFormat("#0.000");
        double a = Double.parseDouble(e1.getText());
        double b = Double.parseDouble(e2.getText());
        double c = Double.parseDouble(e3.getText());

        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        Vertex v = new Vertex(a, b, c);

        PrintStream printStream = new PrintStream(new output(output));
        System.setOut(printStream);
        System.setErr(printStream);

        if (equation.getSelectedItem().toString().equalsIgnoreCase("General")) {
            e1.setText("");
            e2.setText("");
            e3.setText("");
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
            if (b < 0 && c < 0) {
                System.out.println("Equation: " + a + "x^2" + b + "x" + c);
            } else if (b > 0 && c < 0) {
                System.out.println("Equation: " + a + "x^2 + " + b + "x " + c);
            } else if (b < 0 && c > 0) {
                System.out.println("Equation: " + a + "x^2 " + b + "x + " + c);
            } else {
                System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c);
            }
            // calculate roots
            // first check a, so we don't divide by 0
            if (a == 0) {
                System.out.println("Not a quadratic equation");
            } // next check if disc < 0, using hasSolution()
            else if (quad.hasSolution() == false) {
                System.out.println("No real solutions");
            } // finally calculate and print solutions
            else {
                quad.compute1();
                double solution1 = quad.calculateSolution1();
                double solution2 = quad.calculateSolution2();

                System.out.println("Solution 1 = " + df.format(solution1)
                        + ", Solution 2 = " + df.format(solution2));
                //1, 3, 2      test
                //9, 0, -169   b = 0
                //4, 7, 0      c = 0
                //1.4, 4.3, 2  quad formala and decimals
                //4, 66, -34      large numbers

            }

            quad.VertexForm(a, b, c);

        } else {
            e1.setText("");
            e2.setText("");
            e3.setText("");
            v.VertexForm(a, b, c);
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v1ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    private void equationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationActionPerformed

    }//GEN-LAST:event_equationActionPerformed

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
            java.util.logging.Logger.getLogger(QuadraticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuadraticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuadraticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuadraticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuadraticsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JTextField e3;
    private javax.swing.JComboBox<String> equation;
    private javax.swing.JTextField g1;
    private javax.swing.JTextField g2;
    private javax.swing.JTextField g3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField v1;
    private javax.swing.JTextField v2;
    private javax.swing.JTextField v3;
    // End of variables declaration//GEN-END:variables
}