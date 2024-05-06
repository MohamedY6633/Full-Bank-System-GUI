import javax.swing.*;

public class EmpolyeeGUI extends javax.swing.JFrame {
    private Employee employee = new Employee();
    private customer c = new customer();
    private customer ee = new customer();

    public EmpolyeeGUI() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        employee.addCustomer(c);
        employee.addCustomer(ee);
        welcomelabel = new javax.swing.JLabel();
        passchange = new javax.swing.JButton();
        assignedcustomers = new javax.swing.JButton();
        oldpass = new javax.swing.JLabel();
        oldpassfield = new javax.swing.JTextField();
        newpass = new javax.swing.JLabel();
        newpassfield = new javax.swing.JTextField();
        submitpass = new javax.swing.JButton();
        empolyeetran = new javax.swing.JLabel();
        submittrans = new javax.swing.JButton();
        rejecttrans = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oldpassfield.setVisible(false);
        newpassfield.setVisible(false);
        submitpass.setVisible(false);
        submittrans.setVisible(false);
        rejecttrans.setVisible(false);


        welcomelabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        welcomelabel.setText("Welcome Empolyee To Bank ");
        passchange.setText("Tab Here To Change Password");
        passchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpass.setFont(new java.awt.Font("Segoe UI", 1, 14));
                oldpass.setText("New Password");
                oldpassfield.setFont(new java.awt.Font("Segoe UI", 1, 14));
                oldpassfield.setVisible(true);
                oldpassfield.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    }
                });
                newpass.setFont(new java.awt.Font("Segoe UI", 1, 14));
                newpass.setText("ReType - New Password");
                newpassfield.setFont(new java.awt.Font("Segoe UI", 1, 14));
                newpassfield.setVisible(true);
                submitpass.setVisible(true);
                submitpass.setText("Submit Password");
                submitpass.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if (oldpassfield.getText().equals(newpassfield.getText())) {
                            employee.setpassword(newpassfield.getText());
                            JOptionPane.showMessageDialog(null, "Password Changed Successfully");
                        } else {
                            JOptionPane.showMessageDialog(null, "Passwords Do Not Match");
                        }
                    }
                });
            }
        });
        assignedcustomers.setText("Tab Here To View Assigned Customers");
        assignedcustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String w = employee.waitingCustomersToString();
                        empolyeetran.setText(w);
                submittrans.setText("Submit Transaction");
                submittrans.setVisible(true);
                submittrans.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String w = employee.waitingCustomersToString();
                        empolyeetran.setText(w);
                        if (employee.isempty()) {
                            JOptionPane.showMessageDialog(null, "There is no Customers", "Empty", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            employee.deletecustomer();
                            JOptionPane.showMessageDialog(null, "Transaction Submitted Succesfully", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });

                rejecttrans.setText("Reject Transaction");
                rejecttrans.setVisible(true);
                rejecttrans.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String w = employee.waitingCustomersToString();
                        empolyeetran.setText(w);
                        if (employee.isempty()) {
                            JOptionPane.showMessageDialog(null, "There is no Customers", "Empty", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            employee.deletecustomer();
                            JOptionPane.showMessageDialog(null, "Transaction Faied", "Faild", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(welcomelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passchange, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldpass)
                            .addComponent(newpass)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oldpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assignedcustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empolyeetran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(submitpass, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(submittrans)
                        .addGap(18, 18, 18)
                        .addComponent(rejecttrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignedcustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passchange, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oldpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oldpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitpass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submittrans, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rejecttrans, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(empolyeetran, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }

    private javax.swing.JButton assignedcustomers;
    private javax.swing.JLabel empolyeetran;
    private javax.swing.JLabel newpass;
    private javax.swing.JTextField newpassfield;
    private javax.swing.JLabel oldpass;
    private javax.swing.JTextField oldpassfield;
    private javax.swing.JButton passchange;
    private javax.swing.JButton rejecttrans;
    private javax.swing.JButton submitpass;
    private javax.swing.JButton submittrans;
    private javax.swing.JLabel welcomelabel;
}
