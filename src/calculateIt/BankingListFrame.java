/*
 * Denis Nisdanovic
 *
 * Created on Feb 22, 2014, 1:50:05 PM
 */
package calculateIt;

import java.awt.Color;

public class BankingListFrame extends javax.swing.JFrame {
    private javax.swing.JButton btnCalculateBalance;
    private javax.swing.JLabel lblDeposits;
    private javax.swing.JLabel lblPayments;
    private javax.swing.JLabel lblWithdrawals;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JTextField txtDeposits;
    private javax.swing.JTextField txtPayments;
    private javax.swing.JTextField txtWithdrawals;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JButton btnClearDeposits;
    private javax.swing.JButton btnClearPayments;
    private javax.swing.JButton btnClearWithdrawals;
    
    public BankingListFrame() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        initComponents();
    }

    @Override
    public boolean isResizable() {
        return false;
    }

    @Override
    public String getTitle() {
        return "Check it yourself";
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        this.setLocationByPlatform(true);
        
        lblTitle = new javax.swing.JLabel();
        lblAlert = new javax.swing.JLabel();

        lblDeposits = new javax.swing.JLabel();
        lblPayments = new javax.swing.JLabel();
        lblWithdrawals = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        
        txtDeposits = new javax.swing.JTextField();
        txtPayments = new javax.swing.JTextField();
        txtWithdrawals = new javax.swing.JTextField();
        
        txtBalance = new javax.swing.JTextField();
        txtBalance.setEditable(false);
        
        btnCalculateBalance = new javax.swing.JButton();
        btnClearDeposits = new javax.swing.JButton();
        btnClearPayments = new javax.swing.JButton();
        btnClearWithdrawals = new javax.swing.JButton();

        lblDeposits.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblDeposits.setText("Deposits:");

        lblPayments.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblPayments.setText("Payments:");

        lblWithdrawals.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWithdrawals.setText("Withdrawals:");

        lblBalance.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblBalance.setForeground(new java.awt.Color(0, 90, 0));
        lblBalance.setText("Balance:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18));
        lblTitle.setText("Banking Information");

        lblAlert.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblAlert.setForeground(Color.red);
        lblAlert.setText("");

        
        btnCalculateBalance.setText("Calculate");
        btnCalculateBalance.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBalance();
            }
        });

        btnClearDeposits.setText("Clear");
        btnClearDeposits.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeposits.setText("");
            }
        });
        
        btnClearPayments.setText("Clear");
        btnClearPayments.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayments.setText("");
            }
        });
        
        btnClearWithdrawals.setText("Clear");
        btnClearWithdrawals.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWithdrawals.setText("");
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                .addComponent(lblAlert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblWithdrawals)
                                                .addComponent(lblPayments)
                                                .addComponent(lblDeposits)
                                                .addComponent(lblBalance))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtWithdrawals)
                                                .addComponent(txtPayments, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDeposits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                                .addComponent(txtBalance))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnClearDeposits)
                                                .addComponent(btnClearPayments)
                                                .addComponent(btnClearWithdrawals)
                                                .addComponent(btnCalculateBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBalance)
                                .addComponent(txtBalance)
                                .addComponent(btnCalculateBalance))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPayments)
                                .addComponent(txtPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClearPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblWithdrawals)
                                .addComponent(txtWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClearWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                .addComponent(lblDeposits)
                                .addComponent(txtDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClearDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }
    
    public void calculateBalance() {
        lblAlert.setText("");
        
        double deposits = 0;
        double payments = 0;
        double withdrawals = 0;
        
        try {
            deposits = Double.parseDouble(txtDeposits.getText());
            payments = Double.parseDouble(txtPayments.getText());
            withdrawals = Double.parseDouble(txtWithdrawals.getText());
        } catch (NumberFormatException e){
            lblAlert.setText("Please ensure that all fields are numbers");
            return;
        }
        
        // old balance?
        double balance = deposits - payments - withdrawals;
        
        System.out.println("Balance: " + balance);
        txtBalance.setText("" + balance);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankingListFrame().setVisible(true);
            }
        }
        );
    }
}
