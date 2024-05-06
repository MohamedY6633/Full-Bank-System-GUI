import javax.swing.*;
public class GUI extends javax.swing.JFrame {
    public GUI() {
        initComponents();
        setResizable(false);
    }
    @SuppressWarnings("unchecked")                      
    private void initComponents() {

        loginasempolyee3 = new javax.swing.JButton();
        welcomepanel = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passlabel = new javax.swing.JLabel();
        passfield = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        loginasempolyee = new javax.swing.JButton();
        loginascustomer = new javax.swing.JButton();
        loginasempolyee2 = new javax.swing.JButton();
        signupacc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        loginasempolyee3.setText("Login as  Manger");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomepanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        welcomepanel.setText("       Welcome To our Bank ,Please Login ....");

        userlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        userlabel.setText("UserName :");

        userfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        userfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        passlabel.setText("PassWord :");

        passfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        passfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        submit.setText("Submit Data");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        loginasempolyee.setText("Login as  Employee");
        loginasempolyee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginasempolyeeActionPerformed(evt);
            }
        });

        loginascustomer.setText("Login as  Customer");
        loginascustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (evt.getSource()==loginascustomer) {
                    if(!(userfield.getText().equals("") )&& !(passfield.getText().equals(""))){
                        customerGUI c1 = new customerGUI();
                        c1.setVisible(true);
                        dispose();
                }
                }
            }
        });

        loginasempolyee2.setText("Login as  Manger");
        loginasempolyee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (evt.getSource()==loginasempolyee2) {
                    if(!(userfield.getText().equals("") )&& !(passfield.getText().equals(""))){
                        mangerGUI m1 = new mangerGUI();
                        m1.setVisible(true);
                        dispose();
                }
                }
            }
        });

        signupacc.setText("If you dont have an account , You can Login");
        signupacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupaccActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 8)); 
        jLabel1.setText("\"Copyright © M.Yahia\"");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("      Data Submitted Succesfully ");
        jLabel2.setVisible(false);
        timer = new Timer(300, e -> jLabel2.setVisible(false)); 
        timer.setRepeats(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginasempolyee)
                        .addGap(18, 18, 18)
                        .addComponent(loginascustomer)
                        .addGap(18, 18, 18)
                        .addComponent(loginasempolyee2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(signupacc, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginasempolyee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginascustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginasempolyee2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupacc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                     

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {    
        if(evt.getSource()==submit){
            String username = userfield.getText();
            String password = passfield.getText();
            if(userfield.getText().equals("") && passfield.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter your username and password", "Erorr", JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            p.setpassword(password);
            p.setusername(username);
            jLabel2.setVisible(true);
            timer.start();
        }
        }                              
    }                                      

    private void loginasempolyeeActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(evt.getSource() == loginasempolyee){
            if(!(userfield.getText().equals("") )&& !(passfield.getText().equals(""))){
                EmpolyeeGUI e = new EmpolyeeGUI();
                e.setVisible(true);
                dispose();
        }
    }                                               
    }
    private void loginascustomerActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(evt.getSource() == loginascustomer){
            
    }
    }                                               

    private void loginasempolyee2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void signupaccActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginascustomer;
    private javax.swing.JButton loginasempolyee;
    private javax.swing.JButton loginasempolyee2;
    private javax.swing.JButton loginasempolyee3;
    private javax.swing.JTextField passfield;
    private javax.swing.JLabel passlabel;
    private javax.swing.JButton signupacc;
    private javax.swing.JButton submit;
    private javax.swing.JTextField userfield;
    private javax.swing.JLabel userlabel;
    private javax.swing.JLabel welcomepanel;
    private Person p = new Person();
    private Timer timer;
    // End of variables declaration                   
}
