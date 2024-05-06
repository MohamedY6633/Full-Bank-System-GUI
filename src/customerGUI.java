import javax.swing.JOptionPane;

public class customerGUI extends javax.swing.JFrame {
    customer c = new customer();
    public customerGUI() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")                     
    private void initComponents() {

        customerlogin = new javax.swing.JLabel();
        credits = new javax.swing.JLabel();
        javax.swing.JLabel transactiontype = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        $ = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        calculateunterest = new javax.swing.JButton();
        calculateunterest1 = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        customerlogin.setText("Welcome Customer To Bank ");

        credits.setFont(new java.awt.Font("Segoe UI", 1, 8)); 
        credits.setText("\"Copyright © M.Yahia\"");

        transactiontype.setFont(new java.awt.Font("Segoe UI", 1, 13)); 
        transactiontype.setText("Enter a Value To a Desired Transaction Type");

        value.setFont(new java.awt.Font("SimSun", 1, 14)); 
        value.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        $.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        $.setText("$");

        withdraw.setText("Withdraw Funds");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            String x = value.getText(); double x1 = Double.parseDouble(x);
            if (c.getAccount_balance()==0 || c.getAccount_balance() < x1) {
                JOptionPane.showMessageDialog(null, "Withdraw FAILD", "Withdraw message", JOptionPane.INFORMATION_MESSAGE);}
            else {
                c. withdrawfunds (x1);
            JOptionPane.showMessageDialog(null, "Succesfully Withdrawed "+x1+" $"+" \n Your Account Balance is : "+c.getAccount_balance()+" $", "Withdraw message", JOptionPane.INFORMATION_MESSAGE);
            }}
        });

        deposit.setText("Deposit Funds");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String x = value.getText(); double x1 = Double.parseDouble(x);
                c. depositfunds(x1);
                JOptionPane.showMessageDialog(null, "Succesfully Deposited "+x1+" $"+" \n Your Account Balance is : "+c.getAccount_balance()+" $", "Withdraw message", JOptionPane.INFORMATION_MESSAGE);
                
            }
        });

        calculateunterest.setText("CalculateInterest");
        calculateunterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Your account balance is : "+c.calculateunterest()+" $", "Account Balance", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        calculateunterest1.setText("CheckAccountBalance");
        calculateunterest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Your account balance  is : "+c.getAccount_balance()+" $", "Account Balance", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!value.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Submitted Sucesssfully", "Data Submit", JOptionPane.INFORMATION_MESSAGE);
                    x = value.getText();
                    x1 = Double.parseDouble(x);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please Enter a Value", "Data Submit", JOptionPane.INFORMATION_MESSAGE);
                }
                

            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(credits))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(transactiontype)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(112, 112, 112)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deposit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculateunterest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculateunterest1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent($)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(customerlogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customerlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(transactiontype)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent($)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calculateunterest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calculateunterest1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(credits)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void calculateunterestActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void calculateunterest1ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    // Variables declaration - do not modify                     
    private javax.swing.JLabel $;
    private javax.swing.JButton calculateunterest;
    private javax.swing.JButton calculateunterest1;
    private javax.swing.JLabel credits;
    private javax.swing.JLabel customerlogin;
    private javax.swing.JButton deposit;
    private javax.swing.JButton submit;
    private javax.swing.JTextField value;
    private javax.swing.JButton withdraw;
    private String x ;
    private double x1 ;
    // End of variables declaration                   
}
