public class mangerGUI extends javax.swing.JFrame {
    public mangerGUI() {
        initComponents();
        setResizable(false);
    }
    

    @SuppressWarnings("unchecked")
        
    private void initComponents() {

        welcomelabel = new javax.swing.JLabel();
        addempolyee = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        empolyeenamefield = new javax.swing.JTextField();
        empolyeepasfield = new javax.swing.JTextField();
        empolyeename = new javax.swing.JLabel();
        empolyeepass = new javax.swing.JLabel();
        empolyeeusernamefield = new javax.swing.JTextField();
        empolyeeusername = new javax.swing.JLabel();
        submitempolyee = new javax.swing.JButton();
        changeempolyeepass = new javax.swing.JButton();
        credits = new javax.swing.JLabel();
        empolyeeindexfield = new javax.swing.JTextField();
        empolyeeindex = new javax.swing.JLabel();
        submitempolyeeremove = new javax.swing.JButton();
        submitempolyeeremove1 = new javax.swing.JButton();
        empolyeeindexfield1 = new javax.swing.JTextField();
        empolyeeindex1 = new javax.swing.JLabel();
        empolyeepasfield1 = new javax.swing.JTextField();
        empolyeepass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcomelabel.setText("Welcome Manger");

        addempolyee.setText("Add Empolyee");
        addempolyee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addempolyeeActionPerformed(evt);
            }
        });

        remove.setText("Remove Empolyee");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        empolyeenamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empolyeenamefieldActionPerformed(evt);
            }
        });

        empolyeepasfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empolyeepasfieldActionPerformed(evt);
            }
        });

        empolyeename.setText("Empolyee Name :");

        empolyeepass.setText("Empolyee Password:");

        empolyeeusernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empolyeeusernamefieldActionPerformed(evt);
            }
        });

        empolyeeusername.setText("Empolyee UserName:");

        submitempolyee.setText("Submit");
        submitempolyee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitempolyeeActionPerformed(evt);
            }
        });

        changeempolyeepass.setText("Change Empolyee Password");
        changeempolyeepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeempolyeepassActionPerformed(evt);
            }
        });

        credits.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        credits.setText("\"Copyright © M.Yahia\"");

        empolyeeindexfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empolyeeindexfieldActionPerformed(evt);
            }
        });

        empolyeeindex.setText("Empolyee index :");

        submitempolyeeremove.setText("Submit");
        submitempolyeeremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitempolyeeremoveActionPerformed(evt);
            }
        });

        submitempolyeeremove1.setText("Submit");
        submitempolyeeremove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitempolyeeremove1ActionPerformed(evt);
            }
        });

        empolyeeindexfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empolyeeindexfield1ActionPerformed(evt);
            }
        });

        empolyeeindex1.setText("Empolyee index :");

        empolyeepasfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empolyeepasfield1ActionPerformed(evt);
            }
        });

        empolyeepass1.setText("Empolyee New Password:");

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
                                .addComponent(addempolyee, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(remove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changeempolyeepass))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(empolyeeusernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(submitempolyeeremove, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empolyeenamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(empolyeename)
                                            .addComponent(empolyeeusername))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empolyeeindexfield, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(empolyeeindex)))
                                    .addComponent(submitempolyee, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empolyeepasfield, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empolyeepass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empolyeeindexfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empolyeeindex1)
                                    .addComponent(submitempolyeeremove1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empolyeepass1)
                                    .addComponent(empolyeepasfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(credits)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomelabel)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomelabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addempolyee)
                    .addComponent(remove)
                    .addComponent(changeempolyeepass))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(empolyeename)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(empolyeenamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(empolyeeindex)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(empolyeeindexfield))
                        .addComponent(empolyeeindex1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(empolyeeindexfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empolyeeusername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empolyeeusernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitempolyeeremove))
                        .addGap(7, 7, 7)
                        .addComponent(empolyeepass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empolyeepasfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitempolyee)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empolyeepass1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empolyeepasfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitempolyeeremove1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(credits)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>                        

    private void addempolyeeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void submitempolyeeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void submitempolyeeremoveActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void submitempolyeeremove1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void changeempolyeepassActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void empolyeenamefieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void empolyeeusernamefieldActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void empolyeepasfieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void empolyeeindexfieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void empolyeeindexfield1ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void empolyeepasfield1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    // Variables declaration - do not modify                     
    private javax.swing.JButton addempolyee;
    private javax.swing.JButton changeempolyeepass;
    private javax.swing.JLabel credits;
    private javax.swing.JLabel empolyeeindex;
    private javax.swing.JLabel empolyeeindex1;
    private javax.swing.JTextField empolyeeindexfield;
    private javax.swing.JTextField empolyeeindexfield1;
    private javax.swing.JLabel empolyeename;
    private javax.swing.JTextField empolyeenamefield;
    private javax.swing.JTextField empolyeepasfield;
    private javax.swing.JTextField empolyeepasfield1;
    private javax.swing.JLabel empolyeepass;
    private javax.swing.JLabel empolyeepass1;
    private javax.swing.JLabel empolyeeusername;
    private javax.swing.JTextField empolyeeusernamefield;
    private javax.swing.JButton remove;
    private javax.swing.JButton submitempolyee;
    private javax.swing.JButton submitempolyeeremove;
    private javax.swing.JButton submitempolyeeremove1;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration                   
}
