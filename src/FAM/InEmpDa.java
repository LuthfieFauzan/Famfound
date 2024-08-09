package FAM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class InEmpDa extends javax.swing.JFrame {
int x;
    
    public InEmpDa() {
        initComponents();
        Action();
    }

    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost/fam?user=test&password=Flsr*TEq2UZs9LjY";
    
    public void Action(){
        try{
       Class.forName(driver);
       Connection con = DriverManager.getConnection(url);
       Statement Stet = (Statement) con.createStatement();
       ResultSet Act1 = Stet.executeQuery("Select ID_Dept from Department");
       while(Act1.next())
       {
         DeptID.addItem(Act1.getString("ID_Dept"));
       }
       ResultSet Act2 = Stet.executeQuery("Select ID_Branch from Branch");
       while(Act2.next())
       {
         BranchID.addItem(Act2.getString("ID_Branch"));
       }
       ResultSet Act3 = Stet.executeQuery("Select ID_Salary from Salary");
       while(Act3.next())
       {
         SalaryID.addItem(Act3.getString("ID_Salary"));
       }
       this.setVisible(false);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }   
       
       
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        PanelEmp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Married = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        Religion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        MaleG = new javax.swing.JRadioButton();
        FemaleG = new javax.swing.JRadioButton();
        Single = new javax.swing.JRadioButton();
        Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        dom = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Bsubmit = new javax.swing.JButton();
        BbackMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        BranchID = new javax.swing.JComboBox();
        SalaryID = new javax.swing.JComboBox();
        DeptID = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input Employee Data");

        PanelEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Religion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        Address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Address.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Marriage Status");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        buttonGroup1.add(Married);
        Married.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Married.setText("Married");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Department ID");

        Religion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Religion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Employee ID");

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        buttonGroup2.add(MaleG);
        MaleG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MaleG.setText("Male");

        buttonGroup2.add(FemaleG);
        FemaleG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FemaleG.setText("Female");

        buttonGroup1.add(Single);
        Single.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Single.setText("Single");
        Single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleActionPerformed(evt);
            }
        });

        Phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date Of Birth");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date of Marriage");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gender");

        Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Branch ID");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Married, org.jdesktop.beansbinding.ELProperty.create("${selected}"), dom, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Salary ID");

        Bsubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bsubmit.setText("Submit");
        Bsubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsubmitActionPerformed(evt);
            }
        });

        BbackMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BbackMenu.setText("Menu");
        BbackMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BbackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackMenuActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("View");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("Update");
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        BranchID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SalaryID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DeptID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelEmpLayout = new javax.swing.GroupLayout(PanelEmp);
        PanelEmp.setLayout(PanelEmpLayout);
        PanelEmpLayout.setHorizontalGroup(
            PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEmpLayout.createSequentialGroup()
                        .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelEmpLayout.createSequentialGroup()
                        .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEmpLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addGroup(PanelEmpLayout.createSequentialGroup()
                                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BbackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelEmpLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(Bsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEmpLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SalaryID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEmpLayout.createSequentialGroup()
                                            .addComponent(MaleG)
                                            .addGap(62, 62, 62)
                                            .addComponent(FemaleG))
                                        .addComponent(dob, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Address, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEmpLayout.createSequentialGroup()
                                            .addComponent(Married)
                                            .addGap(46, 46, 46)
                                            .addComponent(Single))
                                        .addComponent(dom, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Religion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BranchID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DeptID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(PanelEmpLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelEmpLayout.setVerticalGroup(
            PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleG)
                    .addComponent(FemaleG)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Married)
                    .addComponent(Single))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEmpLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Religion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BranchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalaryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BbackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Employee Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsubmitActionPerformed
    try{
       Class.forName(driver);
       Connection con = DriverManager.getConnection(url);
       String query ="insert into Employee (ID_Employee,Emp_Name,Emp_Address,Emp_DOB,Emp_Gender,Emp_pnum,Emp_MS,MS_Date,Emp_Relig,ID_Branch,ID_Dept,ID_Salary)values(?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement pst = con.prepareStatement(query);
       pst.setString(1,ID.getText());
       pst.setString(2, Name.getText());
       pst.setString(3, Address.getText());
       pst.setString(4, dob.getText());
       String Gender = "";
       if(MaleG.isSelected()){
       Gender="Male";
       }
       if(FemaleG.isSelected()){
       Gender="Female";
       }
       pst.setString(5,Gender); 
       pst.setString(6,Phone.getText());
       String Status ="";
        if(Married.isSelected()){
       Status="Married";
       }
       if(Single.isSelected()){
       Status="Single";
       }
       pst.setString(7,Status);
       pst.setString(8,dom.getText()); 
       pst.setString(9,Religion.getText());
       String BID = (String) BranchID.getSelectedItem();
       pst.setString(10, BID);
       String DPT = (String) DeptID.getSelectedItem();
       pst.setString(11, DPT);
       String SLY = (String) SalaryID.getSelectedItem();
       pst.setString(12, SLY);
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null,"Input Data Success");
       x=0;
        }
    catch(ClassNotFoundException | SQLException e){
        x = 1;
       JOptionPane.showMessageDialog(null, e);
       }
    finally{
    if(x==0){
    ID.setText(null);
    Name.setText(null);
    Address.setText(null);
    Phone.setText(null);
    dob.setText(null);
    dom.setText(null);
    Religion.setText(null);
    BranchID.setSelectedIndex(-1);
    DeptID.setSelectedIndex(-1);
    SalaryID.setSelectedIndex(-1);
    }
    }
    }//GEN-LAST:event_BsubmitActionPerformed

    private void BbackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackMenuActionPerformed
        Menu a = new Menu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BbackMenuActionPerformed

    private void SingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleActionPerformed
        // TODO add your handling code here:
        dom.setText("");
    }//GEN-LAST:event_SingleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewEmpData b = new ViewEmpData();
        b.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
       Class.forName(driver);
       Connection con = DriverManager.getConnection(url);
       String query ="Update Employee set ID_Employee,Emp_Name=? Emp_Address=? Emp_DOB=? Emp_Gender=? Emp_pnum=? Emp_MS=? MS_Date=? Emp_Relig=? ID_Branch=? ID_Dept=? ID_Salary=? Where ID_Employee=?";
       PreparedStatement pst = con.prepareStatement(query);
       pst.setString(1,ID.getText());
       pst.setString(2, Name.getText());
       pst.setString(3, Address.getText());
       pst.setString(4, dob.getText());
       String Gender = "";
       if(MaleG.isSelected()){
       Gender="Male";
       }
       if(FemaleG.isSelected()){
       Gender="Female";
       }
       pst.setString(5,Gender); 
       pst.setString(6,Phone.getText());
       String Status ="";
        if(Married.isSelected()){
       Status="Married";
       }
       if(Single.isSelected()){
       Status="Single";
       }
       pst.setString(7,Status);
       pst.setString(8,dom.getText()); 
       pst.setString(9,Religion.getText());
       String BID = (String) BranchID.getSelectedItem();
       pst.setString(10, BID);
       String DPT = (String) DeptID.getSelectedItem();
       pst.setString(11, DPT);
       String SLY = (String) SalaryID.getSelectedItem();
       pst.setString(12, SLY);
       
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null,"Update Data Success");
        }
    catch(ClassNotFoundException | SQLException e){
       JOptionPane.showMessageDialog(null, e);
       }
    finally{
    ID.setText(null);
    Name.setText(null);
    Address.setText(null);
    Phone.setText(null);
    dob.setText(null);
    dom.setText(null);
    Religion.setText(null);
    BranchID.setSelectedIndex(-1);
    DeptID.setSelectedIndex(-1);
    SalaryID.setSelectedIndex(-1);
    }
    }//GEN-LAST:event_updateActionPerformed

    
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
            java.util.logging.Logger.getLogger(InEmpDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InEmpDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InEmpDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InEmpDa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InEmpDa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Address;
    private javax.swing.JButton BbackMenu;
    public javax.swing.JComboBox BranchID;
    private javax.swing.JButton Bsubmit;
    public javax.swing.JComboBox DeptID;
    public javax.swing.JRadioButton FemaleG;
    public javax.swing.JTextField ID;
    public javax.swing.JRadioButton MaleG;
    public javax.swing.JRadioButton Married;
    public javax.swing.JTextField Name;
    private javax.swing.JPanel PanelEmp;
    public javax.swing.JTextField Phone;
    public javax.swing.JTextField Religion;
    public javax.swing.JComboBox SalaryID;
    public javax.swing.JRadioButton Single;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JTextField dob;
    public javax.swing.JTextField dom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton update;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
